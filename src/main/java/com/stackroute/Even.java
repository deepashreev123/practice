package com.stackroute;


public class Even
{
    int num;

    public String checkEven(int num)
    {
        if(num<20 || num>30)
        {
            return "enter valid integer value between 20 and 30";
        }
        if(num >= 20 && num <= 30)
        {
            if(num % 2 == 0)
            {
                return "Jerry";
            }
        }
        return "Tom";
    }

    public String checkRange()
    {
        if(num<20 || num>30)
        {
            return "False";
        }
        else
        {
            return "True";
        }
    }


    public static class Addition
    {

       /*     public static void main(String arng[]){
                Scanner data = new Scanner(System.in);
                int num1, num2;
                System.out.println("Enter 1st number");
                num1 = data.nextInt();
                System.out.println("Enter 2nd number");
                num2 = data.nextInt();

                sum(num1,num2);

            }
    */
            public static int sum(int x,int y)
            {

                int sum=0;
                sum=x+y;
               /* System.out.println("Sum of 2 number:"+sum);*/

                return sum;
            }
        }
}