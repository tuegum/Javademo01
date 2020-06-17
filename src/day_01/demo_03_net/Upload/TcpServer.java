package day_01.demo_03_net.Upload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        File file_write = new File("D:\\tuegum\\interest\\japanese\\TcpServer");
        if (!file_write.exists()){
            file_write.mkdirs();
        }
        fun_server(file_write);
    }

    private static void fun_server(File file_write) throws IOException {
        if (!file_write.isDirectory()){
            ServerSocket serverSocket = new ServerSocket(8888);
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
            FileOutputStream fis = new FileOutputStream(file_write);
            int len = 0;
            byte[] bytes = new byte[1024*10];
            while ((len = is.read(bytes))!= -1){
                fis.write(bytes,0,len);
            }
            System.out.println("上传成功！");
            fis.close();
            socket.close();
            serverSocket.close();
        }else{
            file_write.mkdirs();
            File file_read = new File("D:\\tuegum\\interest\\japanese\\novel");
            String[] list = file_read.list();
            for (String s : list) {
                File copyfile = new File(file_read.getAbsolutePath() + File.separator + s);
                fun_server(copyfile);
            }
        }
    }
}
