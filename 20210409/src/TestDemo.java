import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MZJ
 * Date: 2021-04-10
 * Time: 11:53
 */
public class TestDemo {
    /**
     * 创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
     * 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
     */
    public static int max2(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int max3(int a, int b, int c) {
        int max = max2(a,b);
        return max > c ? max : c;
    }

    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int ret = max3(a,b,c);
        System.out.println(ret);
    }


    /**
     * 求斐波那契数列的第n项。(迭代实现)
     */
    public static int fib(int n) {
        int a = 1;
        int b = 1;
        int c = 1;
        while (n > 2) {
            c = a + b;
            a = b;
            b = c;
            n--;
        }
        return c;
    }

    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = fib(n);
        System.out.println(ret);
    }

    /**
     * 有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
     */
    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,3,4};
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret ^= array[i];
        }
        System.out.println(ret);
    }

    public static void frequency(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("只出现一次的数字是："+a[i]);
            }
        }
    }

    public static void main4(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4};
        frequency(arr);
    }

    public static void func(int a) {
        a = 200;
        System.out.println("a改成了："+a);//200
    }

    public static void main3(String[] args) {
        int a = 10;
        func(a);
        System.out.println("a等于："+a);//10
    }

    /**
     * 计算 1! + 2! + 3! + 4! + 5!
     * @param n
     * @return
     */
    public static int fac(int n) {
        int flag = 1;
        for(int i = 1; i <= n; i++) {
         flag *= i;
        }
        return flag;
    }

    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = fac(n);
        System.out.println(ret);
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += fac(i);
        }
        System.out.println(sum);
    }
    /**
     * 求 1-n 之间的和
     * @param n
     * @return
     */
    public static int add(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = add(n);
        System.out.println(ret);
    }

}
