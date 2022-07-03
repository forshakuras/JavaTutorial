public class Assignment {
    public static void main(String[] args) {
        System.out.println("Hello World");
//        fizzbuzz(1, 15);
//        calculate(10, 10, "add"); //should print 20
//        calculate(10, 10, "minus"); //should print 0
//        calculate(10, 10, "multiply"); //should print 100
//        calculate(11, 10, "divide"); //should print 1 remainder 1 or 1.1
//        //should print factorial is 120 largest is 5 smallest is 1
//        summationOrFactorial(new int[]{1, 2, 3, 4, 5}, "factorial");
//        //should print summation is 15 largest is 6 smallest is 0
//        summationOrFactorial(new int[]{0, 2, 3, 4, 6}, "summation");
        /*
        should print
          1
         1 1
        1 2 1
       1 3 3 1
         */
        pascalTriangle(4);
    }

    /*

    then print out fizz if divisible by 3, buzz if divisible by 5 and fizzbuzz if divisible by 3 and 5
    from 1 for each number up to the random number
    i.e if firstnum is 1 and second num is 15 the result should be
    1
    2
    fizz (because divisible by 3)
    4
    buzz (because divisible by 5)
    5
    fizz
    7
    8
    fizz
    10
    11
    fizz
    13
    14
    fizzbuzz (because 15 divisible by 3 and 5)

    hint: google "modulo operator java"
    */
    public static void fizzbuzz(int firstNum, int secondNum) {
        for (int i = firstNum; i <= secondNum; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");

            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    /*
    create a calculate method where given 2 numbers
    and a string for an operation (i.e "add", "subtract", "multiply", "divide") it will return
    the correct value. You can assume that the numbers will always be valid and there won't be stuff like
    4/0 etc.
    i.e calculate(1,5,"add") should print out "1 plus 5 is equal to 6"
    Note: for division need to print out correct decimal or remainder or both even
    hint: google "java int to double conversion"
    */
    public static void calculate(int firstNum, int secondNum, String operation) {
        double result;
        if (operation == "add") {
            result = firstNum + secondNum;
            System.out.println(firstNum + " plus " + secondNum + " is equal to " + result);
        } else if (operation == "minus") {
            result = firstNum - secondNum;
            System.out.println(firstNum + " minus " + secondNum + " is equal to " + result);
        } else if (operation == "multiply") {
            result = firstNum * secondNum;
            System.out.println(firstNum + " multiply " + secondNum + " is equal to " + result);
        } else if (operation == "divide") {
            double firstNumdecimal = firstNum;
            double secondNumdecimal = secondNum;
            result = firstNumdecimal / secondNumdecimal;

            System.out.println(firstNum + " divide " + secondNum + " is equal to " + result);
        } else {
            System.out.println("wrong operation");
        }

    }

    /*
    create a method that takes in an intArr and a string operation that's either "summation" or
    "factorial" return the result of the array and also print out the smallest and largest number
    i.e summationOrFactorial([1,2,3,4,5], "summation") should print
    "summation is equal to 15"
    "smallest number is 1 and largest number is 5"
    hint google "java min/max int"
     */
    public static void summationOrFactorial(int[] numArr, String operation) {
        int smallest = numArr[0];
        int largest = numArr[0];
        int sum = 0;
        int factorial = 1;
        if (operation == "summation") {
            for (int i = 0; i < numArr.length; i++) {
                sum = sum + numArr[i];


            }
            System.out.println("the sum is  " + sum);
        } else if (operation == "factorial") {
            for (int i = 0; i < numArr.length; i++) {
                factorial = factorial * numArr[i];

            }
            System.out.println("the factorial is  " + factorial);
        } else {
            System.out.println("wrong operation");
        }

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] < smallest) {
                smallest = numArr[i];
            }

            if (numArr[i] > largest) {
                largest = numArr[i];
            }


        }
        System.out.println("the smallest is  " + smallest);
        System.out.println("the largest is  " + largest);
    }

    /*
    Given the number n print out n number of rows of pascals triangle
    i.e pascalTriangle(3)
       1
      1 1
     1 2 1
     hint: use 2d int array
     */
    public static void pascalTriangle(int rows) {
        int[][] arr = new int[rows][(rows * 2) - 1];
        arr[0][arr[0].length / 2] = 1;
        int startingPoint = (arr[0].length / 2) - 1;
        int endingPoint = (arr[0].length / 2) + 1;
        //
        if (rows > 1) {
            for (int i = 1; i < arr.length; i++) {
                //i=3
                for (int j = startingPoint; j <= endingPoint; j += 2) {
                    // if (if j is index 0 or j is the last element of the array set to 1
                    if (j == 0 || j == arr[i].length - 1) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j + 1];
                    }
                }
                endingPoint = endingPoint + 1;
                startingPoint = startingPoint - 1;

                // other wise take the previous and next element of the row above+
                // and add the 2 numbers together to get the current num`ber
            }
        }
        for(int i=arr.length-1;i>=0;i--) {
            for(int j=0;j<arr[i].length;j++) {
                if(arr[i][j]==0) {
                    System.out.print(" ");
                }else {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println("");
        }
    }
    //print down here

//        for(
//    int i = 0;
//    i<arr.length;i++)
//
//    {
//        for (int j = 0; j < arr[i].length; j++) {
//            System.out.print(arr[i][j]);
//        }
//        System.out.println("");
//    }
//        int[] arr;
//        for (int i = 0; i < rows; i++) {
//            arr =[1];
//            for (int j = 0; j < i; j++) {
//                arr.push(arr[i - 1][j - 1] + arr[i - 1][j])
//
//            }
//        }
}

