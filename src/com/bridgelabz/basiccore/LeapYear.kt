package com.bridgelabz.basiccore
/***********************************************************************************************************************
 * Author   : Pramila Mangesh Tawari
 * Purpose  : Program to check whether the Year is Leap Year or Not
 * Date     : 25/02/2020
 *
 **********************************************************************************************************************/
    fun main(args : Array<String>)
    {
        println("Enter the Year to check whether it is a leap or not")
        var year = Integer.valueOf(readLine())
        leapYear(year)
    }

    fun leapYear(year : Int)
    {
        var leap : Boolean = false

        var length = year.toString().length

            if (year % 4 == 0 || year % 400 == 0)// ||year%100!=0 ||year%10!=0)
            {
                leap = true;
            } else if (year % 100 == 0 || year % 10 == 0) {
                leap = false;
            }

        if (length == 4)
             {
                if (leap)
                {
                    println("$year is a Leap Year")
                }
                else
                {
                    println("$year is not a Leap Year")
                }
        }
        else
            System.out.println("Enter 4 digit year..Enter again");
            var year = Integer.valueOf(readLine())
            leapYear(year);
    }
