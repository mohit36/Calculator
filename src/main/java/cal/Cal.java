/**
 * 
 */
package cal;

/**
 * @author Mohpiya
 *
 */
import java.util.Scanner;
class calculating {
   private double number1, number2;

  
   public void setAdd(double num1, double num2) {
      this.number1 = num1;
      this.number2 = num2;
   }
   public void setMul(double num1, double num2) {

      this.number1 = num1;
      this.number2 = num2;
   }
   public void setSub(double num1, double num2) {

      this.number1 = num1;
      this.number2 = num2;
   }
   public void setDiv(double num1, double num2) {

      this.number1 = num1;
      this.number2 = num2;
   }
   public void setMod(double num1, double num2) {

      this.number1 = num1;
      this.number2 = num2;
   }

   public double getAdd() {

      return number1 + number2;
   }
   public double getMul() {

      return number1 * number2;
   }
   public double getSub() {

      return number1 - number2;
   }
   public double getDiv() {

      return number1 / number2;
   }
   public double getMod() {

      return number1 % number2;
   }
}

public class Cal {

   /**
    * @param args
    */
  

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      // TODO Auto-generated method stub
      double num1, num2;
      calculating cl = new calculating();
      int choice;
      do {

         Scanner sc = new Scanner(System.in);
         System.out.println("*************************************************************");
         System.out.println("*              SELECT THE OPTION TO COUNTINUE               *");
         System.out.println("* 1.ADDITION                                                *");
         System.out.println("* 2.SUBSCRATION                                             *");
         System.out.println("* 3.MULTIPLICATION                                          *");
         System.out.println("* 4.DEVISION                                                *");
         System.out.println("* 5.MODULER                                                 *");
         System.out.println("* 0.EXIT                                                    *");
         System.out.println("*************************************************************");
         System.out.println("ENTER YOUR CHOICE HERE:\t");
         choice = sc.nextInt();
         switch (choice) {
         case 1:

            System.out.println("Enter number 1:\t");
            num1 = sc.nextDouble();

            System.out.println("Enter number 2:\t");
            num2 = sc.nextDouble();
            cl.setAdd(num1, num2);

            System.out.println("The result for the addition is:\t" + cl.getAdd());
            break;
         case 2:

            System.out.println("Enter number 1:\t");
            num1 = sc.nextDouble();

            System.out.println("Enter number 2:\t");
            num2 = sc.nextDouble();
            cl.setSub(num1, num2);

            System.out.println("The result for the Subtrcration is:\t" + cl.getSub());
            break;
         case 3:
           
            System.out.println("Enter number 1:\t");
            num1 = sc.nextDouble();

            System.out.println("Enter number 2:\t");
            num2 = sc.nextDouble();
            cl.setMul(num1, num2);

            System.out.println("The result for the Multiplication is:\t" + cl.getMul());
            break;
         case 4:

            do {
               System.out.println("Enter number 1:\t");
               num1 = sc.nextDouble();
               if (num1 == 0) {
                  System.out.println("NUMBER CANNOT BE A ZERO(0) PLEASE TRY AGAIN");
               }
            } while (num1 == 0);
            
            do {
               System.out.println("Enter number 2:\t");
               num2 = sc.nextDouble();
               if (num2 == 0) {
                  System.out.println("NUMBER CANNOT BE A ZERO(0) PLEASE TRY AGAIN");
               }
            } while (num2 == 0);
            cl.setDiv(num1, num2);
            System.out.println("The result for the Divison is:\t" + cl.getDiv());
            break;
         case 5:

            System.out.println("Enter number 1:\t");
            num1 = sc.nextDouble();
            System.out.println("Enter number 2:\t");
            num2 = sc.nextDouble();
            cl.setMod(num1, num2);
            System.out.println("The result for the Modular is:\t" + cl.getMod());
            break;
         case 0:

            break;

         default:
           
            System.out.println("Incorrect choice please try again");
            break;
         }

      } while (choice != 0);
     
      System.out.println("See you again!");

   }

}