package day_01.demo_02_Stream.BufferedSort;

import java.io.*;
import java.util.HashMap;

public class Demo_01 {
    public static void main(String[] args) throws IOException {
        //创建一个HashMap集合对象，可以存取每行文本"1,2,3,4···",Value的文本
        HashMap<String, String> mHm = new HashMap<>();

        BufferedReader mBr = new BufferedReader(new FileReader
                ("C:\\\\Users\\\\hp\\\\IdeaProjects\\\\JAVA\\\\src\\\\day_01\\\\demo_02_Stream\\BufferedSort\\in.txt"));
        BufferedWriter mBw = new BufferedWriter(new FileWriter
                ("C:\\\\Users\\\\hp\\\\IdeaProjects\\\\JAVA\\\\src\\\\day_01\\\\demo_02_Stream\\BufferedSort\\out.txt"));

        //使用字符缓冲输入流中的方法readline，逐行读取文本
        String line;
        while ((line = mBr.readLine()) != null) {
            //对读取的文本进行切割，获取行中的序列和文本内容
            String[] arr = line.split("\\.");
            mHm.put(arr[0], arr[1]);
        }
        for (String key : mHm.keySet()) {
            String value = mHm.get(key);
            line = key + "." + value;
            mBw.write(line);
            mBw.newLine();//写换行
//            mBw.write("\r\n");
        }
        mBr.close();
        mBw.close();
    }
}
