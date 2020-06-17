package day_01.demo_03_net.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCP_Client {
    public static void main(String[] args) throws IOException {
        Socket sc = new Socket("127.0.0.1", 5555);
        OutputStream gos = sc.getOutputStream();
        gos.write("你好，我是客户端".getBytes());
        InputStream gis = sc.getInputStream();
        byte[] bytes = new byte[1024*10];
        int len = gis.read(bytes);
        System.out.println(new String(bytes,0,len));
        sc.close();
    }
}

