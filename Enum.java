package com;
import java.util.Scanner; 
// An Enum class
enum Day
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;
}
public class Enum
{
    Day day;
  
    // Constructor
    public Enum(Day day)
    {
        this.day = day;
    }
  
    // Prints a line about Day using switch
    public void dayIsLike()
    {
        switch (day)
        {
        case MONDAY:
            System.out.println("Mondays are ok.");
            break;
        case FRIDAY:
            System.out.println("Fridays are better.");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Weekends are best.");
            break;
        default:
            System.out.println("Midweek days are so-so.");
            break;
        }
    }
    public static void main(String[] args)
    {
        String str = "MONDAY";
        Enum t1 = new Enum(Day.valueOf(str));
        t1.dayIsLike();
    }
}