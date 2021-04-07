import java.io.IOException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MZJ
 * Date: 2021-04-06
 * Time: 19:52
 */
public class TestDemo {
    /**
     * 处理循环读入的问题
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            System.out.println("每输入1次，就执行1次: "+a);
        }
    }

    /**
     * 从键盘输入
     * main12
     * 1.啰嗦
     * 2.只能读一个字符
     * @param args
     */
    public static void main13(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        //String name = scanner.next();//遇到空格结束
        String name = scanner.nextLine();//读一行
        System.out.println(name);

        System.out.println("年龄：");
        int age = scanner.nextInt();
        System.out.println(age);

        System.out.println("价格：");
        double price = scanner.nextDouble();
        System.out.println(price);

        System.out.println("请输入成绩：");
        char score = scanner.next().charAt(0);//接收字符，charAt()提取字符串的第一个字符
        System.out.println(score);

        //建议：请把字符串放在最前面
    }

    public static void main12(String[] args) {
        System.out.println("Enter a Char:");
        char i = 0;//异常(错误)
        //System.in 键盘
        try {
            i = (char) System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("your char is :"+i);
    }

    /**
     * 输出到控制台
     * @param args
     */
    public static void main11(String[] args) {
        System.out.println(10);//输出换行
        System.out.print(20);//输出不换行
        System.out.printf("%d\n", 30);//同C语言
    }

    /**
     * 计算 1! + 2! + 3! + 4! + 5! 用 for循环
     * @param args
     */
    public static void main10(String[] args) {
        int i = 1;
        int num = 5;
        int sum = 0;
        for(i = 1; i <= num; i++) {
            int j = 1;
            int fac = 1;
            for(j = 1; j <= i; j++) {
                fac = fac*j;
            }
            sum = sum+fac;
        }
        System.out.println(sum);
    }

    /**
     * 求 1-100 之间，既能被 3 整除，也能被 5 整除的数
     * 要使用 break 或 continue
     * @param args
     */
    public static void main9(String[] args) {
        int i = 1;
        while(i <= 100) {
            if(i % 3 != 0) {
                i++;
                continue;
            }
            if(i % 5 != 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
    //优化
    public static void main8(String[] args) {
        int i = 1;
        for(i = 1; i <= 100; i++) {
            if(i % 15 != 0){
                continue;
            }
            System.out.println(i);
        }
    }

    /**
     * continue:跳过这次循环，立刻进入下次循环
     * @param args
     */
    public static void main7(String[] args) {
        int num = 100;
        while (num <= 200) {
            if (num % 3 != 0) {
                num++; // 这里的 ++ 不要忘记! 否则会死循环.
                continue;
            }
            System.out.println("找到了 3 的倍数, 为:" + num);
            num++;
        }
    }

    /**
     * break:终止所有循环
     * @param args
     */
    public static void main6(String[] args) {
        int n = 100;
        while (n <= 200) {
            if (n % 3 == 0) {
                System.out.println("找到了 3 的倍数, 为:" + n);
                break;
            }
            n++;
        }
    }

    /**
     * 计算 1! + 2! + 3! + 4! + 5!
     * @param args
     */
    public static void main5(String[] args) {
        int i = 1;
        int n = 5;
        int sum = 0;
        while(i <= n) {
            int j = 1;
            int fac = 1;
            while(j <= i) {
                fac = fac*j;
                j++;
            }
            sum = sum+fac;
            i++;
        }
        System.out.println(sum);//153
    }

    /**
     * 计算 5 的阶乘
     * @param args
     */
    public static void main4(String[] args) {
        int i = 1;
        int fac = 1;
        while(i <= 5) {
            fac *= i;
            i++;
        }
        System.out.println(fac);
    }

    /**
     * 求 1-100 之间偶数的和和奇数的和
     * @param args
     */
    public static void main3(String[] args) {
        int i = 2;
        int sumEve = 0;//偶数
        int sumOdd = 0;//奇数
        while(i <= 100) {
            sumEve += i;
            i += 2;
        }
        System.out.println("偶数："+sumEve);
       i = 1;
        while(i <= 100) {
            sumOdd += i;
            i += 2;
        }
        System.out.println("奇数："+sumOdd);
    }

    /**
     * 计算 1-100 的和
     * @param args
     */
    public static void main2(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    /**
     * 打印 1-10 的数
     * @param args
     */
    public static void main1(String[] args) {
        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}

