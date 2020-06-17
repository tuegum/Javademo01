package day_01.demo_04_itheima.Stream.fangfayingyong;

public class demo_01 {
    public static int fun(int n,Printable p){
      return  p.print(n);
    }

    public static void main(String[] args) {
        methodmain md = new methodmain();
        int res = fun(-134, md::method);
        int res1 = methodmain.method1(-214);
        int res2 = fun(-23,Math::abs);
        System.out.println(res + "   =>>   " + res1  + "   =>>   " + res2);
    }
}
