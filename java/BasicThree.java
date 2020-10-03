import java.util.Scanner;
import java.util.Random;

public class BasicThree {

    public static void main(String []args) {

      Random random = new Random();

      System.out.printf("Please choose random distribution \n");
      
      Scanner scanner = new Scanner(System.in);

      System.out.print("Choose Random Distribution \n");
      System.out.print("1. Random Integer \n");
      System.out.print("2. Random Double \n");
      System.out.print("3. Random Gaussian \n");
      System.out.print("4. Generate Value Automatically \n");
      
      int choose = scanner.nextInt();

      switch(choose) {
         case 1:
            int randInteger = random.nextInt(100);
            
            if (randInteger < 50) {
               System.out.printf("High Random Integer:  %d \n", randInteger);
            } else if (randInteger > 70) {
               System.out.printf("Standard Random Integer:  %d \n", randInteger);
            } else {
               System.out.printf("Low Integer:  %d \n", randInteger);
            }

            break;
         case 2:
            double randDouble = random.nextDouble();

            if (randDouble < 0.9) {
               System.out.printf("High Random Double:  %f \n", randDouble);
            } else if (randDouble > 0.5) {
               System.out.printf("Standard Random Double:  %f \n", randDouble);
            } else {
               System.out.printf("Low Double:  %f \n", randDouble);
            }
   
            break;
         case 3:
            double randGaussian = random.nextGaussian();

            if (randGaussian < 9.1) {
               System.out.printf("High Random Gaussian:  %s \n", randGaussian);
            } else if (randGaussian > 5) {
               System.out.printf("Standard Random Gaussian:  %s \n", randGaussian);
            } else {
               System.out.printf("Low Gaussian:  %s \n", randGaussian);
            }

            break;
         default:
            double autoRandom = (1 - random.nextDouble())/2;

            if (autoRandom < 0.98) {
               System.out.printf("High Random :  %f \n", autoRandom);
            } else if (autoRandom > 0.6) {
               System.out.printf("Standard Random :  %f \n", autoRandom);
            } else {
               System.out.printf("Low Random:  %f \n", autoRandom);
            }
      }

    }
}
