// Write a program to print the Lucas sequence for the given number.

// Note: a = 0, b=0, c=1 are the 1st three terms. All other terms in the 
// Lucas sequence are generated by the sum of their 3 most recent predecessors. 
// Write a program to generate the first n terms of a Lucas Sequence.

// Input format
// The input contains an integer n.

// Output format
// The output prints the 'n' terms of the Lucas Sequence, separated by a single space.

// There are no leading or trailing spaces in the output.

// Sample testcases
// Input 1
// 5
// Output 1
// 0 0 1 1 2 

import java.util.Scanner;

class Code6 {
    public static void main(String args[]) {
        int num;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        int thirdlast = 0;
        int secondlast = 0;
        int last = 1;
        int current = 0;
        System.out.print(thirdlast + " " + secondlast + " " + last + " ");
        for (int i = 3; i < num; i++) {
            current = last + secondlast + thirdlast;
            System.out.print(current + " ");
            int temp = last;
            last = current;
            thirdlast = secondlast;
            secondlast = temp;
        }
        s.close();
    }
}