// Find Even or Odd Number ?

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");

        int Number =sc.nextInt();
        if((Number%2)==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }

    }

}

// find negative and postive numbers ?

// import java.util.Scanner;

// public class Array
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number:");

//         int Number =sc.nextInt();
//         if(Number>0)
//         {
//             System.out.println("Number is positive");
//         }
//         else if(Number==0)
//         {
//            System.out.println("Number is NUll");
//         }
//         else
//         {
//             System.out.println("Number is Negative");
//         }

//     }
// }

// find the sum of first Natural Numbers ? or  find the sum of Natural Number?

// import java.util.Scanner;
// public class Array
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number: ");

//         int Number = sc.nextInt();
//         // int sum=0;

//         // for(int i=1;i<=Number;i++)
//         // {
//         //     sum=sum+i;
//         // }
//         // System.out.println("sum of natural number  is " + sum);
//         System.out.println(Number *(Number+1)/2);
//     }
// }

// find the sum of Number between given range ?

// import java.util.Scanner;
// public class Array
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number1 and Number2: ");
//         int Number1 = sc.nextInt();
//         int Number2 = sc.nextInt();
//         int sum =0;

//         // for(int i=Number1;i<=Number2;i++)
//         // {
//         //     sum = sum+i;
//         // }
//         // System.out.println("Sum of Number between range is " +sum );

//         System.out.println(Number2*(Number2+1)/2 - Number1*(Number1+1)/2);

//     }
// }

// // Write a program to find the largest of two numbers?
// import java.util.Scanner;
// public class array
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter N1 and N2");
//         int N1 = sc.nextInt();
//         int N2 = sc.nextInt();
//         int temp;

//         // if(N1>N2)
//         // {
//         //     System.out.println("N1 is greater than N2");
//         // }
//         // else
//         // {
//         //     System.out.println("N2 is greater than N1");
//         // }
//         if(N1==N2)
//         {
//             System.out.println("Both are Equal Numbers ");
//         }
//         else
//         {

//             temp = N1>N2?N1:N2;
//             System.out.println(temp + " is greater Number");
//         }
//     }
// }

// // find Greatest of the Three numbers?

// import java.util.Scanner;
// public class Array
// {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of a,b and c: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         if(a>b)
//         {
//             System.out.println(a + "is greater Number ");
//         }
//         else
//         {
//             if(b>c)
//             {
//                 System.out.println(b + " is greater Number");
//             }
//             else
//             {
//                 System.out.println(c + " is greater Number");
//             }
//         }
//     }
// }

// //find the Year is Leap Year Or Not?
// import java.util.Scanner;
// public class Array
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Year: ");
//         int Year = sc.nextInt();

//         if(Year%400==0)
//         {
//             System.out.println(Year +" is Leap Year");
//         }
//         else if(Year%4==0 && Year%100!=0)
//         {
//             System.out.println(Year +" is Leap Year");
//         }
//         else 
//         {
//              System.out.println(Year + " is Not a Leap Year");
//         }
//     }
// }

// // find Number is Prime Number or Not?
// import java.util.Scanner;
// public class Array
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter The N :");
//         int N = sc.nextInt(), count=0;

//         for(int i=2;i<N;i++)
//         {
//             if(N%i==0)
//             {
//                 count=count+1;
//             }
//         }
//         if(count>0)
//             System.out.println(N +" is Not Prime Number");
//         else
//             System.out.println(N +" is Prime Number");
//     }
// }

// // Prime number within a given range?
// import java.util.Scanner;
// public class Array
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the limit: ");
//         int N1= sc.nextInt();
//         int N2= sc.nextInt(), count=0;

//         for(int i=N1;i<=N2;i++)
//         {
//             for(int j=2;j<i;j++)
//             {
//                 if(i%j==0)
//                 {
//                     count=count+1;
//                 }
//             }
//             if(count==0)
//             {
//                 System.out.println(i);
//             }
//             else
//             {
//                 count=0;
//             }
//         }
//     }
// }

// // Sum of digits of a Number in Java ?

// import java.util.Scanner;
// public class Array
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the N ");
//         int N=sc.nextInt(), Sum=0;

//         while(N!=0)
//         {
//             int R=N%10;
//             Sum=Sum+R;
//             N=N/10;
//         }
//         System.out.println("Sum of Number is " + Sum);
//     }
// }

// // Find Reverse of a number ?
// import java.util.Scanner;
// public class Array
// {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the Num: ");
//         int Num = sc.nextInt();
//         int Rev=0,Rem;
//         while(Num!=0)
//         {
//             Rem=Num%10;
//             Rev=Rev*10+Rem;
//             Num= Num/10;
//         }
//         System.out.println("Reverse of Number is "+ Rev);
//     }
// }

// // Find Palindrome numbers ?
// import java.util.Scanner;
// public class Array
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Num");
//         int Num = sc.nextInt();
//         int Palindrome=Num, Rem,Rev=0;

//         while(Num!=0)
//         {
//            Rem=Num%10;
//            Rev=Rev*10+Rem;
//            Num=Num/10;
//         }
//         if(Palindrome==Rev)
//             System.out.println("Num is Palinedrome");
//         else
//             System.out.println("Num is Not Palinedrome");
//     }
// }

// // //Check whether or Not the Number is an Armstrong Number in Java?
// import java.util.Scanner;
// public class Array
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Num:");
//         int Num = sc.nextInt();
//         int temp = Num;
//         int rem, sum=0;

//         while(Num>0)
//         {
//            rem = Num%10;
//            Num = Num/10;
//            sum = sum+rem*rem*rem; 
//         }
//         if(temp==sum)
//             System.out.println("Its an Armstrong Number");
//         else
//             System.out.println("Its Not Armstrong Number");    
//     }
// }

// // Armstrong 2nd rule?
// import java.util.Scanner;
// public class Array
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a Num: ");
//         int Num= sc.nextInt();
//         int len=0;
//         int t1=Num;

//         while(t1!=0)
//         {
//             len=len+1;
//             t1=t1/10;
//         }

//         int t2=Num;
//         int arm=0, rem;
//         while(t2!=0)
//         {
//             int mul=1;
//             rem= t2%10;
//             for(int i=1;i<=len;i++)
//             {
//                 mul=mul*rem;
//             }
//             arm=arm+mul;
//             t2=t2/10;
//         }
//         if(arm==Num)
//             System.out.println("Its an Armstrong Number");
//         else
//             System.out.println("Its Not an Armstrong Number");
//     }
//}

// //Armstrong number in a given range?
// import java.util.Scanner;
// public class Array
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Num: ");
//         int N1= sc.nextInt();
//         int N2 = sc.nextInt();
//         findArmstrong(N1,N2);

//     }
//     static void findArmstrong(int a, int b)
//     {
//         for(int i=a;a<=b;i++)
//         {
//             int Num=i;
//             int sum=0;
//             while(Num!=0)
//             {
//                 int rem = Num%10;
//                 sum = sum +(rem*rem*rem);
//                 Num = Num/10;
//             }
//             if(sum==i)
//                System.out.println(sum);
//         }
//     }
// }

// //Find the Fibonacci Series up to Nth Term in Java?

// import java.util.Scanner;
// public class Array
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Num: ");
//         int Num = sc.nextInt();
//         int a=0, b=1;
//         System.out.print(a+ " , " + b+ " , ");
//         int nextTerm;

//         for(int i=2;i<Num;i++)
//         {
//             nextTerm = a+b;
//             a = b;
//             b = nextTerm;
//             System.out.print(nextTerm + " , ");
//         }
//     }
// }

// //Find the Fibonacci Series up to Nth Term in Java?
// import java.util.Scanner;
// public class Array
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Num: ");
//         int Num = sc.nextInt();
//         int a=0, b=1;

//         System.out.print(a+ " , " + b+ " , ");
//         int nextTerm;

//         for(int i=2;i<Num;i++)
//         {
//             nextTerm = a+b;
//             a = b;
//             b = nextTerm;
//             System.out.print(nextTerm + " , ");
//         }
//     }
// }

// //Factorial of a Number in Java ?

// import java.util.Scanner;
// public class Array
// {
//     static int factorial(int n)
//     {
//           int res =1;
//           for(int i=2;i<=n;i++)
//             res= res*i;
//           return res;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Num");
//         int Num = sc.nextInt();
//         System.out.println("Factorial of Num " + Num + " is " + factorial(Num));
//     }
// }

// // Find the Power of a Number in Java Language?
// import java.util.Scanner;
// import java.lang.Math;
// public class Array{
//     static int pow(int a, int b) {
//         if (b != 0)
//             return a * pow(a, b - 1);
//         else
//             return 1;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int res = pow(a, b);
//         System.out.println(res);
//     }
// }
// import java.util.Scanner;
// public class Array{
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a base and power: ");
//         double base = sc.nextInt();
//         double power  = sc.nextInt();
//         double res = Math.pow(base,power);

//         System.out.println("The " + power + "of " + base + "is " + res);

//     }
// }

// Second method???????????
// // public class Array
// //  {
// //  	public static void main(String[] args) {
	    
// //  	double base = 3;
// //      double expo1 = 2;
     
// //      double res1;
    
// //      // calculates the power
// //      res1 = Math.pow(base, expo1);
// //  	System.out.println(base + " ^ " + expo1 + " = " + res1 );
// //  	}
// //  }

// // Factor of a number ??
// import java.util.Scanner;
// public class Array{
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a num: ");
//         int num = sc.nextInt();

//         for(int i=1;i<=num;i++)
//         {
//             if(num%i==0)
//             {
//                 System.out.println(i+ " ");
//             }
//         }
//     }
// }

// //Prime Factors of a number in Java?

// import java.util.Scanner;
// public class Array
// {
//     public static void main(String args[])
//     {
//          Scanner sc = new Scanner(System.in);
//          System.out.println("Enter a num :");
//          int num = sc.nextInt();

//          for(int i=2;i<=num;i++)
//          {
//             while(num%i==0)
//             {
//                 num = num/i;
//                 System.out.println(i+ " ");
//             }
//          }
//     }
// }

// // check number is strong number or Not a strong number ?
// import java.util.Scanner;
// public class Array
// {
//     public static int factorial(int n)
//     {
//         int f=1;
//         for(int i=1;i<=n;i++)
        
//             f=f*i;
//         return f;
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a Number:");
//         int n = sc.nextInt();
//         int sum=0, temp=n;
//         while(n!=0)
//         {
//             int r= n%10;
//             sum=sum+factorial(r);
//             n=n/10;
//         }
    
//     if(temp==sum)
//         System.out.println("Strong Number.");
//     else
//         System.out.println("Not a Strong Number.");
//     }
// }

// //Check Whether or Not the Number is a Perfect Number?
// import java.util.Scanner;
// public class Array
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt(), sum=0, n1=n;
//         for(int i=1;i<n1;i++)
//         {
//             if(n1%i==0)
//             {
//                 sum=sum+i;
//             }
//         }
//         if(sum==n)
//         {
//             System.out.println(n+" Perefect Number.");
//         }
//         else
//         {
//             System.out.println(n+" Not a Perfect Number.");
//         }
//     }
// }

// //Perfect Square?

// import java.util.Scanner;
// public class Array
// {
//     /**
//      * @param args
//      */
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();
//         int flag=0;
//         for(int i=1;i<=n;i++)
//         {
//             if(n==i*i)
//             { 
//               flag=1;
//               break;
//             }
//         }
//         if(flag==1)
//            System.out.println("Perfect Square");
//         else
//            System.out.println("Not a perfect Square");

//     }
// }

