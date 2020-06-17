package day_01.demo_03_net.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(5555);
        Socket acp = ss.accept();
        System.out.println(ss.getLocalSocketAddress() + "   ||  " + ss.getInetAddress());
        InputStream gis = acp.getInputStream();
        byte[] bytes = new byte[1024*10];
        int len = gis.read(bytes);
        System.out.println(new String(bytes,0,len));
        OutputStream gos = acp.getOutputStream();
        gos.write("你好，收到谢谢！".getBytes());

        acp.close();
        ss.close();
    }
}
