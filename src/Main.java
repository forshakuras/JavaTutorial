import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Main {
    public static void main(String @NotNull [] args) {
        System.out.println(args[1]);
        //basic variables
        System.out.println("Hello world!");
        int foo = 2147483647; //4bytes or 32 bits
        long fooLong = 2147483648l; //8 bytes or 64bits
        char c = 'c';//2 bytes or 16 bits
        String bar = "My name is "; //char array
//        System.out.println(foo);
//        System.out.println(fooLong);
//        System.out.println(bar);
        int baa = 10;
        System.out.println(foo+baa);
        String baz = "5";
        System.out.println(baz+foo);
        System.out.println(baa+(long)foo);
        System.out.println(baa*foo);

//        System.out.println(bar + c);
//        boolean b = false;
//        System.out.println(b);
//        b = !b;
//        System.out.println(!b);
//        float d = 10.5f;
//        System.out.println(foo+d);
//
//        //conditionals
//        foo++; //same as foo=foo+1
//        if(foo>5) {
//            System.out.println("foo is greater than 5");
//        } else if (foo < 5) {
//            System.out.println("foo is less than 5");
//        } else {
//            System.out.println("foo is 5");
//        }
//
//        switch (foo) {
//            case 5:
//                System.out.println("foo is 5");
//                break;
//            case 4:
//                System.out.println("foo is 4");
//                break;
//            default:
//                System.out.println("foo is whatever");
//                break;
//        }
//
//        while(foo<100) {
//            foo++; // same as foo = foo+1 or foo+=1;
//        }
//        System.out.println(foo);
//
//        for(int i = 0; i<100;i++) {
//            if(i>90) {
//                System.out.println(i);
//            } else {
//                System.out.println(0);
//            }
//        }
//
//        while(foo<1000) {
//            if(foo>200) {
//                break;
//            } else {
//                foo++;
//                System.out.println(foo);
//            }
//        }
//
//        int[] arr = {1,2,3,4};
//        for(int i=0;i<arr.length;i++) {
//            System.out.println(arr.length);
//            System.out.println(arr[i]);
//        }
//        //operators
//        Random rand = new Random();
//        int x = rand.nextInt(10);
//        int y= rand.nextInt(10);
//        if(x>5||y>5) {
//            System.out.println("One of the numbers is greater than 5");
//        } else {
//            System.out.println("None of the numbers are greater than 5");
//        }
//        x=y;
//        System.out.println(x==y);
//        x=10;
//        System.out.println(x+5);
//        System.out.println(x);

    }

}