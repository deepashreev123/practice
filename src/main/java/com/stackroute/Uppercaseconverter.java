package com.stackroute;

public class Uppercaseconverter{
    String name="deepa";
    public String uppercaseConversion(){
                String upper=name.toUpperCase();
                return upper;
            }
            public boolean checkNull()
            {
                if(name.equals(" "))
                {
                    System.out.println("Enter Some Input: ");
                    return false;
                }
                else
                {
                    return true;
                }
            }

        }


