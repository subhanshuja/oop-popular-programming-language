import java.util.Scanner;
import java.util.Random;

public class BasicFour {

    static Random random = new Random();

    static int initRandomInteger(int parameter) {
        return random.nextInt(parameter);
    }

    static double initRandomDouble() {
        return random.nextDouble();
    }

    static double initRandomGaussian() {
        return random.nextGaussian();
    }

    static double initAutoRandom() {
        return (1 - random.nextDouble())/2;
    }

    static void showRandomInteger() {
        int randInteger = initRandomInteger(100);
        
        if (randInteger < 50) {
            System.out.printf("High Random Integer:  %d \n", randInteger);
        } else if (randInteger > 70) {
            System.out.printf("Standard Random Integer:  %d \n", randInteger);
        } else {
            System.out.printf("Low Random Integer:  %d \n", randInteger);
        }
    }

    static void showRandomDouble() {
        double randDouble = initRandomDouble();

        if (randDouble < 0.9) {
            System.out.printf("High Random Double:  %f \n",randDouble);
        } else if (randDouble > 0.5) {
            System.out.printf("Standard Random Double:  %f \n",randDouble);
        } else {
            System.out.printf("Low Random Double:  %f \n",randDouble);
        }
    }

    static void showRandomGaussian() {
        double randGaussian = initRandomGaussian();

        if (randGaussian < 9.1) {
            System.out.printf("High Random Gaussian:  %s \n",randGaussian);
        } else if (randGaussian > 5) {
            System.out.printf("Standard Random Gaussian:  %s \n",randGaussian);
        } else {
            System.out.printf("Low Random Gaussian:  %s \n",randGaussian);
        }
    }

    static void showAutoRandom() {
        double autoRandom = initAutoRandom();

        if (autoRandom < 0.98) {
            System.out.printf("High Random :  %f \n",autoRandom);
        } else if (autoRandom > 0.6) {
            System.out.printf("Standard Random :  %f \n",autoRandom);
        } else {
            System.out.printf("Low Random:  %f \n",autoRandom);
        }
    }

    public static void main(String []args) {

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
            showRandomInteger();
            break;
        case 2:
            showRandomDouble();
            break;
        case 3:
            showRandomGaussian();
            break;
        default:
            showAutoRandom();
            break;
      }

    }
}
