
/**
 * This program tells a little bit about me.
 * 
 * @author Kevin Gaber
 * @version August 20, 2018
 */
public class introduction
{
    public static void main(String[] args)
    {
        // here are some facts about me
        System.out.println("I was born in Greenville.");
        System.out.println("I went to JLmann.");
        System.out.println("Go Patriots!");
        System.out.println("My brother, Chris, is 18.");
        System.out.println("I like to run and play games.");
        
        // create variables and store values in them
        String name = "Kevin";
        int birthYear = 2002;
        int currentYear = 2018;
        
        //What happens here?
        System.out.println("currentYear - birthYear");
        System.out.println(currentYear - birthYear);
        
        // Do some arithmetic
        int age = currentYear - birthYear;
        
        // Concatenate literal strings with variables
        System.out.println("My name is " + name + ", and I am " + age + " years old.");
        
        /* You may notice that the age calculation is only correct if you've already had
         * your bithday this year. We can fix that using a boolean variable and some
         * conditional logic.
         */
         
        
         // Change this value to false if you havent't had your bithday yet this year
         boolean hadBirthday = true;
         
         // Conditionally, subtract one from the age if the birthday hasn't occured yet 
         if (hadBirthday == false) {
             age-= 1;
    }
        // This output should always be correct
    System.out.println("My name is " + name + ", and I am " + age + " years old.");
      }
      
    
    }