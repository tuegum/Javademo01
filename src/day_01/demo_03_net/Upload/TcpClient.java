package day_01.demo_03_net.Upload;

import java.io.*;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        File file_read = new File("D:\\tuegum\\interest\\japanese\\novel");
        fun_client(file_read);
    }

    private static void fun_client(File file_read) throws IOException {
        if (!file_read.isDirectory()){
            Socket socket = new Socket("127.0.0.1",8888);
            FileInputStream fis = new FileInputStream(file_read);
            OutputStream os = socket.getOutputStream();
            System.out.println("开始上传文件！");
            int len = 0;
            byte[] bytes = new byte[1024*10];
            while ((len = fis.read(bytes))!= -1){
                os.write(bytes,0,len);
            }
            InputStream is = socket.getInputStream();
            while ((len = is.read(bytes))!= -1){
                System.out.println(file_read.getName());
                System.out.println(new String(bytes,0,len));
            }
            fis.close();
            socket.close();
        }else {
            String[] list = file_read.list();
            for (String s : list) {
                File isFile = new File(file_read.getAbsolutePath() + File.separator + s);
                fun_client(isFile);
            }
        }

    }
}
