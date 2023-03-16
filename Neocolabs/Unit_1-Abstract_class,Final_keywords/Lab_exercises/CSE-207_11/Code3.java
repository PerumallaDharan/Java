// A Java interface can only contain method signatures 
// and fields. The interface can be used to achieve 
// polymorphism. In this problem, you will practice your 
// knowledge on interfaces.

// You are given an interface AdvancedArithmetic which 
// contains a method signature int divisor_sum(int n). 
// You need to write a class called MyCalculator which 
// implements the interface.

// divisorSum function just takes an integer as input 
// and return the sum of all its divisors. For example 
// divisors of 6 are 1, 2, 3 and 6, so divisor_sum 
// should return 12. The value of n will be at most 1000.

// Read the partially completed code in the editor and 
// complete it. You just need to write the MyCalculator 
// class only. Your class shouldn't be public.

// Input format
// 6

// Output format
// I implemented: AdvancedArithmetic
// 12

// Sample testcases
// Input 1
// 5
// Output 1
// I implemented: AdvancedArithmetic
// 6

import java.util.*;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}

class Code3 {
    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(calc);

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(calc.divisorSum(num));

        scan.close();
    }

    static void ImplementedInterfaceNames(Object obj) {
        Class[] theInterfaces = obj.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
