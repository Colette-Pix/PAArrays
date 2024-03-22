import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task1();
        Task2(new int[]{13,5,7,68,3});
        Task3();
        Task5();
        Task6();
        Task7(new int[]{0, 1, 2, 3, 4});
        Task8(new int[]{0, 1, 2, 3, 4});
        Task9(new int[]{4,2,9,13,1});
        Task10();
        Task11();
    }
    public static void Task1(){
        int[] ints = new int[]{1,2,3};

        for (int i:ints){
            System.out.println(i);
        }
    }

    public static void Task2(int[] ints){
        int middle = ints.length/2;
        System.out.println(ints[middle]);
    }

    public static void Task3(){
        String s[] = new String[]{"red","blue","yellow"};
        System.out.println(s.length);
        String[] shadowClone = s.clone();
        System.out.println(Arrays.toString(shadowClone));
    }

    public static void Task4(){
        int[] array = {0,1,2,3,4};
        System.out.println(array[0]);
        System.out.println(array[array.length-1]);
        //these will throw an error since there is no memory allocated to index 5 of the array
        System.out.println(array.length);
        array[5]=5;
    }

    public static void Task5(){
        int[] array = new int[5];
       for(int i = 0; i < array.length; i++){
           array[i]=i;
       }
    }

    public static void Task6(){
        int[] array = new int[5];
        for(int i = 0; i < array.length; i++){
            array[i]=2*i;
        }
    }

    public static void Task7(int array[]) {
        int middle = array.length/2;
        for (int i = 0; i < array.length; i++) {
            if (i != middle) {
                System.out.println(array[i]);
            }
        }
    }

    public static void Task8(int[] array) {
        int middle = array.length/2;
        int temp = array[0];
        array[0]=array[middle];
        array[middle]=array[0];
    }

    public static void Task9(int[] array){
        int[] sorted= new int[array.length];
        for (int j = 1; j < array.length;j++) {
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
        }

    }

    public static void Task10(){
        String[] array = {"" + 1, "s", "string", "purple","" + 2.01};
        for (int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void Task11(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");
        String[] fav= new String[sc.nextInt()];
        sc.nextLine();
        System.out.println("What are a few of your favorite things?");
        for (int i = 0; i < fav.length; i++){
            fav[i]=sc.nextLine();
        }
        System.out.println("These are a few of your favorite things:");
        for (String s:fav){
            System.out.println(s);
        }

    }

}