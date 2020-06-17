package day_01.demo_02_Stream.Code;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
OutputStreamWriter:把字符转换为字节：可使用指定的charset将要写入流中的字节编码为字符

构造方法摘要
OutputStreamWriter(OutputStream out) 创建使用默认字符编码的 OutputStreamWriter。
OutputStreamWriter(OutputStream out, Charset cs) 创建使用给定字符集的 OutputStreamWriter。
OutputStreamWriter(OutputStream out, CharsetEncoder enc) 创建使用给定字符集编码器的 OutputStreamWriter。
OutputStreamWriter(OutputStream out, String charsetName)  创建使用指定字符集的 OutputStreamWriter。
  方法摘要
 void close()  关闭此流，但要先刷新它。
 void flush()   刷新该流的缓冲。
 String getEncoding()   返回此流使用的字符编码的名称。
 void write(char[] cbuf, int off, int len)  写入字符数组的某一部分。
 void write(int c)  写入单个字符。
 void write(String str, int off, int len)  写入字符串的某一部分。
* */
public class OutoutStreamWriter_demo {
    public static void main(String[] args) throws IOException {
      write_utf_8();
      write_gbk_8();
    }

    private static void write_gbk_8() throws IOException {
        OutputStreamWriter gbk = new OutputStreamWriter(new FileOutputStream("D:\\gbk.txt"), "gbk");
        for (int i = 0; i < 10; i++) {
            gbk.write("能否大嫂哈佛i啊时候");
            gbk.write("\r\n");
        }
        gbk.close();
    }

    private static void write_utf_8() throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\utf-8.txt");
        OutputStreamWriter utf = new OutputStreamWriter(fos, "utf-8");
        for (int i = 0; i < 10; i++) {
            utf.write("我不知道你在说什么");
            utf.write("\r\n");
        }
        utf.flush();
        utf.close();
    }

}
