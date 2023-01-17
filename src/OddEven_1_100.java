/*
In this section we will how to find odd and even from 1-100
_______________________________________________________________
Question : Write a program to find odd and even program from 1-100
______________________________________________________________________
 */

public class OddEven_1_100 {
    public static void main(String[] args) {
        int i ;
        for (i = 1; i < 100; i++)
            if (i % 2 == 0)
                System.out.print(" " + i);
        else
                System.out.println(" " + i);
    }
}
