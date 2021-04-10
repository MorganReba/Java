import java.io.IOException;
import java.util.Random;
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
     * 编写代码模拟三次密码输入的场景。
     * 最多能输入三次密码
     * 密码正确，提示“登录成功”
     * 密码错误，可以重新输入，最多输入三次。三次均错，则提示退出程序
     * @param args
     */
    public static void main24(String[] args) {
        String password = "123456";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入密码：");
        int count = 3;

        for(int i = 0; i < 3; i++) {
            String input = scanner.nextLine();
            if(input.equals(password)) {
                System.out.println("输入正确！");
                break;
            }else {
                count--;
                System.out.println("输入错误，请重新输入，还有" + count + "次机会");
            }
        }
        //输入错误三次
        if(count == 0) {
            System.out.println("三次输入都错误，退出程序");
        }
    }

    /**
     * 获取一个数二进制序列中所有的偶数位和奇数位，分别输出二进制序列
     * @param args
     */
    public static void main23(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //打印奇数位
        System.out.println("奇数位是：");
        for(int i = 30; i >= 0; i -= 2) {
            System.out.print(((num >> i) & 1) + " ");
        }
        System.out.println();

        //打印偶数位
        System.out.println("偶数位是：");
        for(int i = 31; i >= 1; i -= 2) {
            System.out.print(((num >> i) & 1) + " ");
        }

    }

    /**
     * 求一个整数，在内存当中存储时，二进制 1 的个数。
     * @param args
     */
    public static void main22(String[] args) {
        int count = 0;
        int n = 11;
        while(n != 0) {
            if((n & 1) != 0) {
                count++;
            }
            n = n >>> 1;
        }
        System.out.println(count);
    }

    public static void main25(String[] args) {
        int count = 0;
        int n = 11;
        while (n != 0) {
            count++;
            n = n & (n-1);
        }
        System.out.println(count);
    }

    /**
     * 求出0～999之间的所有“水仙花数”并输出。
     * “水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身
     * 如；153＝1＋5＋3?，则153是一个“水仙花数“。
     *难度up:求 0~任意数 自幂
     * @param args
     */
    public static void main21(String[] args) {
        for(int i = 0; i < 999999; i++) {
           //1.求位数
            int count = 0;//123
            int tmp = i;
            while(tmp != 0) {
                count++;//1 2 3
                tmp /= 10;//12 1 0
            }
            //count = 3;i = 0;
            tmp = i;
            int sum = 0;
            //2.求tmp的每一位
            while(tmp != 0) {
                sum += Math.pow(tmp%10,count);
                tmp /= 10;
            }
            if(sum == i) {
                System.out.println("这就是我想要的数字"+i);
            }
        }
    }
    /**
     * 完成猜数字游戏
     * 用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。
     * @param args
     */
    public static void main20(String[] args) {
        //Random random = new Random(50);//随机写一个数，每次生成的结果相同
        Random random = new Random();//由系统随机生成数字
        Scanner scanner = new Scanner(System.in);
        //int ran = random.nextInt(100);//[0-100)
        int ran = random.nextInt(100) + 1;//[0-101)

        while(true) {
            System.out.println("请输入猜测的数字（1-100）：");
            int num = scanner.nextInt();
            if(num < ran) {
                System.out.println("猜小了");
            }else if(num > ran) {
                System.out.println("猜大了");
            }else {
                System.out.println("猜对了！");
                break;
            }
        }
    }

    /**
     * 输出n*n的乘法口诀表，n由用户输入。
     * @param args
     */
    public static void main19(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");
                //System.out.printf("%d*%d=%-3d", i,j,i*j);
            }
            System.out.println();
        }
    }
    /**
     * 输出一个整数的每一位，如：123的每一位是 1 ， 2 ， 3
     * @param args
     */
    public static void main18(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n != 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }

    /**
     * 求两个正整数的最大公约数
     * 辗转相除法
     * @param args
     */
    public static void main17(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while(a % b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        System.out.println(b);
    }

    /**
     * 计算 1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
     * @param args
     */
    public static void main16(String[] args) {
        double sum = 0.0;
        int flag = 1;
        for(int i = 1; i <= 100; i++) {
            sum += flag*(1.0/i);
            flag = -flag;
        }
        System.out.println(sum);
    }

    /**
     * 输入:5
     * 输出:复制
     *   *   *
     *    * *
     *     *
     *    * *
     *   *   *
     * @param args
     */
    public static void main15(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(i == j || i == n-j-1) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    /**
     * 处理循环读入的问题
     * @param args
     */
    public static void main14(String[] args) {
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

