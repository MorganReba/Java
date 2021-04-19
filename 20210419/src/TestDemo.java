import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:数组总结
 * User: MZJ
 * Date: 2021-04-19
 * Time: 9:17
 */
public class TestDemo {
    /**
     * 数组拷贝
     * 1.for循环
     * 2.Arrays.copyOf()
     * 3.System.arraycopy()
     * 4.array.clone()
     */
    public static void mainCopy4(String[] args) {
        int[] array = {1,2,3,4};
        int[] copy = array.clone();
        System.out.println(Arrays.toString(copy));
    }

    public static void mainCopy3(String[] args) {
        int[] array = {1,2,3,4};
        int[] copy = new int[array.length];
        System.arraycopy(array,0,copy,0,array.length);
        System.out.println(Arrays.toString(copy));
    }


    public static void mainCopy2(String[] args) {
        int[] array = {1,2,3,4};
        int[] copy = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(copy));

        int[] ret = Arrays.copyOfRange(array,0,3);
        System.out.println(Arrays.toString(ret));

    }

    public static void mainCopy1(String[] args) {
        int[] array = {1,2,3,4};
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        System.out.println(Arrays.toString(copy));
    }



    /**
     * 冒泡排序
     */
    public static void bubbleSort(int[] array) {
        boolean flg = false;

        //i-趟数
        for (int i = 0; i < array.length-1; i++) {
            flg = false;
            //j-下标每次比上一次-1
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if (flg = false) {
                break;
            }
        }
    }

    public static void main11(String[] args) {
        int[] array = {10,5,2,12,6};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 数组的逆置
     */
    public static void reverse(int[] array) {
        int i = 0;
        int j = array.length-1;
        while (i < j) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            i++;
            j--;
        }
    }

    public static void main10(String[] args) {
        int[] array = {1,2,3,4,5};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }


    /**
     * 检察数组的有序性(升序)
     */
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main9(String[] args) {
        int[] array = {1,2,4,6};
        System.out.println(isSorted(array));
    }

    /**
     * 求数组中元素的平均值
     */
    public static double avg(int[] array) {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/array.length;
    }

    public static void main8(String[] args) {
        int[] array = {70,6,1};
        System.out.println(avg(array));
    }


    /**
     * 找数组中的最大元素
     */
    public static int max(int[] array) {
        int max = array[0];//注意
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main7(String[] args) {
        int[] array = {1,9,3,6,2};
        System.out.println(max(array));
    }


    /**
     * 自己写方法实现数组转换字符串
     */
    public static String toString(int[] array) {
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if (i != array.length-1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }

    public static void main6(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(toString(array));
    }


    /**
     *理解数组传参
     */
    public static void change(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            array[i] = array[i] * 2;
        }
    }

    public static void print(int[] array) {
        for (int x:array) {
            System.out.print(x + " ");
        }
    }

    public static void swap(int[] array, int[] array2) {
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
                tmp = array[i];
                array[i] = array2[i];
                array2[i] = tmp;
        }
    }

    public static void main5(String[] args) {
        int[] array = {1,2,3,4};
        int[] array2 = {6,7,8,9};
        //交换前
        System.out.println("array:"+ Arrays.toString(array));
        System.out.println("array2:"+ Arrays.toString(array2));
        //交换后
        swap(array,array2);
        System.out.println("array:"+ Arrays.toString(array));
        System.out.println("array2:"+ Arrays.toString(array2));
    }

    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5};
        //修改前
        print(array);
        System.out.println();
        //修改后
        change(array);
        print(array);

    }




    /**
     * 遍历数组
     * 1.for循环
     * 2.foreach
     * 3.Arrays.toString()
     */
    public static void main3(String[] args) {
        int[] array = {3,2,1,5};
        System.out.println(Arrays.toString(array));
    }

    public static void main2(String[] args) {
        int[] array = {3,2,1,5};
        for (int x:array) {
            System.out.print(x +" ");
        }
    }


    public static void main1(String[] args) {
        int[] array = {3,2,1,5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
