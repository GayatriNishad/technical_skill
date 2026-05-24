// you have a string denoted as A transform the string you should follow the following operation 
// 1. identyfy the first occurenc of conseutive identical pair of char within a string
// 2. remove this pair identical characters from the string
// 3. repeat the step 1 ans 2 until there are no. more oair of consectuve identical pair of characters
// 4. the final result will be the transform string

// A = "abcddcfg" , "abccfg" , "abfg"



// import java.util.Scanner;
// public class StringTransform{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         String str=
//     }
// }

import java.util.Scanner;
public class balanceParantheses
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        int count=0;
        
        for(int i=0;i<A.length();i++)
        {
            if(A)
            {
                count++;
            }
        }
        if(count%2==0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
        
    }
}
