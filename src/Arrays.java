import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr = new int[5];
        Random rand = new Random();
        for(int i=0;i<arr.length;i++) {
            arr[i] = rand.nextInt(100);
            System.out.println(arr[i]);
        }
        char[] cArr = new char[5];
        for(int i=0;i<cArr.length;i++) {
            cArr[i] = (char)(rand.nextInt(26) + 'a');
            System.out.println(cArr[i]);
        }
        System.out.println(new String(cArr));

        //2d arrays
        int[][] arr2D = new int[5][5];
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                arr2D[i][j] = rand.nextInt(100);
            }
        }
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                System.out.println(arr2D[i][j]);
            }
        }
    }
}
