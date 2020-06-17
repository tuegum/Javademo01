package day_01.demo_02_Stream.BufferedInputSream;
/*
父类方法：
*  int available() 返回下一次对此输入流调用的方法可以不受阻塞地从此输入流读取（或跳过）的估计剩余字节数。
 void close() 关闭此输入流并释放与此流关联的所有系统资源。
 void mark(int readlimit) 在输入流中的当前位置上作标记。
 boolean markSupported() 测试此输入流是否支持 mark 和 reset 方法。
 int read() 从此输入流中读取下一个数据字节。
 int read(byte[] b) 从此输入流中将 byte.length 个字节的数据读入一个 byte 数组中。
 int read(byte[] b, int off, int len) 从此输入流中将 len 个字节的数据读入一个 byte 数组中。
 void reset() 将此流重新定位到对此输入流最后调用 mark 方法时的位置。
 long skip(long n) 跳过和丢弃此输入流中数据的 n 个字节。
 构造方法：
 BufferedInputStream(InputStream in) 创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
BufferedInputStream(InputStream in, int size)  创建具有指定缓冲区大小的 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
* */


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream_demo_01 {
    public static void main(String[] args) throws IOException {
        show_01();
    }

    private static void show_01() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\\\Users\\\\hp\\\\IdeaProjects\\\\JAVA\\\\src\\\\day_01\\\\demo_02_Stream\\BufferedOutputString\\1.txt"),1024*15);
        byte[] bytes = new byte[3];
        bis.read(bytes);
        int len = 0;
        while ((len = bis.read(bytes)) != -1){
            System.out.print( new String(bytes,0,len));
        }
        System.out.println(len);
    }
}
