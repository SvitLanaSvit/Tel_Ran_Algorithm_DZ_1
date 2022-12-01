import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    //1) Вычислить сложность следующих алгоритмов
    //Time Complexity O(1) * O(n) + O(1) = O(n)
    //Space Complexity O(1)
    static void test1(int n)
    {
        if (n==1)                      //O(1)
            return;
        for (int i=1; i<=n; i++)       //O(n)
            for (int j=1; j<=n; j++){  //O(1)
                System.out.println("*");
                break;
            }
    }

    //Time Complexity O(n) * O(n) + O(1) = O(n^2)
    //Space Complexity O(1)
    static void test2(int n)
    {
        if (n==1)                     //O(1)
            return;
        for (int i=1; i<=n; i++)     //O(n)
            for (int j=1; j<=n; j++) //O(n)
                System.out.println("*");
    }

    //Time Complexity O(n) * O(n) = O(n^2)
    //Space Complexity O(1)
    static void test3(int n)
    {
        int a = 0;
        for (int i = 0; i < n; i++)     //O(n)
            for (int j = n; j > i; j--) //O(n)
                a = a + i + j;

    }

    //Time Complexity O(n) * O(log n) = O(n * log n)
    //Space Complexity O(1)
    static void test4(int n)
    {
        int i, j, a = 0;
        for (i = n/2; i <=n; i++)      //O(n)
            for (j = 2; j <=n; j=j*2)  //O(log n)
                a=a+n/2;

    }

    //2) Find the element that appears once in a sorted array
    //Given a sorted array in which all elements occur twice (one after the other) and one element appears only once.
    //Простое решение состоит в обходе массива слева направо. Поскольку массив отсортирован, мы легко можем найти
    // нужный элемент.

    //Time Complexity O(log n)
    static int test(int[] arr){
        int i = 0;
        if(arr.length == 0)
            return -1;

        if(arr.length == 1)
             return arr[0];

        while(i < arr.length - 1){
            if(arr[i] != arr[i + 1]){
                return arr[i];
            }
            i += 2;
        }
        return arr[i];
    }

    //3)Задачки со звёздочкой - вычислить сложность в лучшем и худшем случае.
    //(N / 2^x )< 1 OR  2^x > N
    //Time Complexity O(1) if (n == 1)
    //Time Complexity O(log n) if (n > 2)
    //Time Complexity O(n) if (n == 2)

    static void test5(int n)
    {
        int a = 0, i = n;
        while (i > 0) {
            a += i;
            i /= 2;
        }
    }

    //Time Complexity O(1) if (a - b == 1 || b - a == 1)
    //Time Complexity O(n) if (a - b == n || b - a == n)
    static void method(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
    }

    //Time Complexity O(1) * O(1) * O(n) = O(n) if (n == 2)
    //Time Complexity O(n) * O(n) * O(log n) = O(n^2 * log n) if (n > 2)
    static void method2(int n) {
        for (int i = 0; i < n / 2; i++) { System.out.println("1");             //O(n)
            for (int j = 1; j + n / 2 <= n; j++) {                             //O(n)
                System.out.println("2");
                for (int k = 1; k <= n; k = k * 2) {                           //O(log n) 2^k = n log2(k) = n
                    System.out.println("I am expert!");
                }
            }
        }
    }
    //i=0, j=1, k=1
    //i=0, j=1, k=2
    //i=0, j=1, k=4
    //i=0, j=1, k=8
    //i=0, j=1, k=16


    //Time Complexity O(1) * O(1) = O(1) if (n == 1)
    //Time Complexity O(n) * O(n) = O(n^2) if (n > 2)
    static void method3(int n) {
        for (int i = 1; i <= n; i++) {               //O(n)
            for (int j = 1; j <= n; j = j + i) {     //O(n)
                System.out.println("I am expert!");
            }
        }
    }
}
