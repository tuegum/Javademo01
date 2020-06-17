package day_01.demo_02_Stream.BUfferedReader;

import java.io.*;

/*
构造方法摘要
BufferedReader_demo(Reader in) 创建一个使用默认大小输入缓冲区的缓冲字符输入流。
BufferedReader_demo(Reader in, int sz) 创建一个使用指定大小输入缓冲区的缓冲字符输入流。
方法摘要
 void close() 关闭该流并释放与之关联的所有资源。
 void mark(int readAheadLimit) 标记流中的当前位置。
 boolean markSupported() 判断此流是否支持 mark() 操作（它一定支持）。
 int read()  读取单个字符。
 int read(char[] cbuf, int off, int len) 将字符读入数组的某一部分。
 String readLine() 读取一个文本行。
 boolean ready()  判断此流是否已准备好被读取。
 void reset() 将流重置到最新的标记。
 long skip(long n)  跳过字符。
* */
public class BufferedReader_demo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter
                ("C:\\\\Users\\\\hp\\\\IdeaProjects\\\\JAVA\\\\src\\\\day_01\\\\demo_02_Stream\\BufferedReader\\1.txt"));

        BufferedReader br = new BufferedReader(new FileReader
                ("C:\\\\Users\\\\hp\\\\IdeaProjects\\\\JAVA\\\\src\\\\day_01\\\\demo_02_Stream\\BufferedWriter\\1.txt"));
        char[] chars = new char[3];
        int ch = 0;
        while ((ch = br.read(chars)) != -1){
            bw.write(chars,0,ch);
            System.out.println(chars);
        }
        br.close();
        bw.close();
    }
}
