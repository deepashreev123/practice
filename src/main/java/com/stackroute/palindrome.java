package com.stackroute;

public class palindrome {
        public int checkPalindrome()
        {
            int number=12134;
            int reminder, reverse=0, temp, sum=0;

            temp=number;

            while(temp>0)
            {
                reminder=temp%10;
                reverse=(reverse*10)+reminder;
                temp=temp/10;
            }

            if(number==reverse)
            {
                System.out.println("Number is Palindrome");

                while (number > 0)
                {
                    reminder = number % 10;
                    if (reminder % 2 == 0)
                    {
                        sum = sum + reminder;
                    }
                    number = number / 10;
                }

                if (sum > 25)
                {
                    System.out.println("and the sum of even numbers is greater than 25 ");
                }
                else
                {
                    System.out.println("and the sum of even numbers is less than 25 ");
                }
            }
            return 1;
        }
    }

