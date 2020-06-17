package day_01.demo_02_Stream.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
构造方法摘要
BufferedWriter_demo(Writer out)创建一个使用默认大小输出缓冲区的缓冲字符输出流。
BufferedWriter_demo(Writer out, int sz)创建一个使用给定大小输出缓冲区的新缓冲字符输出流。
方法摘要
 void close() 关闭此流，但要先刷新它。
 void flush() 刷新该流的缓冲。
 void newLine()  写入一个行分隔符。
 void write(char[] cbuf, int off, int len) 写入字符数组的某一部分。
 void write(int c) 写入单个字符。
 void write(String s, int off, int len)  写入字符串的某一部分。
* */
public class BufferedWriter_demo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter
                ("D:\\2.txt"));

        for (int i = 0; i < 10; i++) {
            bw.write("你好");
            bw.write("\r\n");
        }
        bw.flush();
        bw.close();
    }
}
