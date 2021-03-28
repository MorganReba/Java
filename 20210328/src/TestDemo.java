
public class TestDemo {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        int b = 20;
        System.out.println(b);
        long c = 10L;
        System.out.println(c);
        //a:10 b:20
        //1.字符串拼接任何变量，都会变成字符串，此时+是拼接的意思
        System.out.println("a:"+a+" b:"+b);
        System.out.println("a:"+a+b);//a:1020
        //2.如果前面不是首先出现的字符串，那么先要运算的
        System.out.println(a+b+"haha!");//30haha!

        int n = Integer.MAX_VALUE;
        System.out.println(n);
    }
}
