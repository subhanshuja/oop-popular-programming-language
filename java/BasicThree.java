import java.util.Scanner;

public class BasicTwo {

    public static void main(String []args) {

        int valueInteger;
        float valueFloat;
        double valueDouble;
        char valueChar;
        String valueString="";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Array base on Data Type \n");
        System.out.print("Input size of array \n");
        int sizeArray = scanner.nextInt();

        int[] valueIntegerArray = new int[sizeArray];
        float[] valueFloatArray = new float[sizeArray];
        double[] valueDoubleArray = new double[sizeArray];
        char[] valueCharArray = new char[sizeArray];
        String[] valueStringArray = new String[sizeArray];
        
        System.out.printf("Size Array:  %d \n", sizeArray);

        System.out.print("---Variable Data Type: Inside Array of Integer---- \n");        
        for (int index = 0; index < sizeArray; index++) {
           System.out.printf("Input Integer inside Array [%d]: ",index);
           valueIntegerArray[index] = scanner.nextInt();
        }
        System.out.print("------------------------------------------------- \n");

        System.out.print("---Variable Data Type: Inside Array of Float---- \n");        
        for (int index = 0; index < sizeArray; index++) {
           System.out.printf("Input Float inside Array [%d]: ",index);
           valueFloatArray[index] = scanner.nextFloat();
        }
        System.out.print("------------------------------------------------- \n");

        System.out.print("---Variable Data Type: Inside Array of Double---- \n");        
        for (int index = 0; index < sizeArray; index++) {
           System.out.printf("Input Double inside Array [%d]: ",index);
           valueDoubleArray[index] = scanner.nextDouble();
        }
        System.out.print("------------------------------------------------- \n");

        System.out.print("---Variable Data Type: Inside Array of String---- \n");        
        for (int index = 0; index < sizeArray; index++) {
           System.out.printf("Input String inside Array [%d]: ",index);
           valueStringArray[index] = scanner.next();
        }
        System.out.print("------------------------------------------------- \n");

        System.out.print("---Variable Data Type: Inside Array of Char---- \n");        
        for (int index = 0; index < sizeArray; index++) {
           System.out.printf("Input Integer inside Array [%d]: ",index);
           valueCharArray[index] = scanner.next().charAt(0);
        }
        System.out.print("------------------------------------------------- \n");

        System.out.print("-------Show Data Type: Array of Integer------- \n");
        for (int index = 0; index < valueStringArray.length; index++) {
           System.out.printf("Integer:  %s \n",valueIntegerArray[index]);
        }
        System.out.print("--------------------------------------------- \n");

        System.out.print("-------Show Data Type: Array of String------- \n");
        for (int index = 0; index < valueStringArray.length; index++) {
           System.out.printf("String:  %s \n",valueStringArray[index]);
        }
        System.out.print("--------------------------------------------- \n");

        System.out.print("-------Show Data Type: Array of Char------- \n");
        for (int index = 0; index < valueCharArray.length; index++) {
           System.out.printf("Char:  %s \n",valueCharArray[index]);
        }
        System.out.print("--------------------------------------------- \n");

        System.out.print("-------Show Data Type: Array of Float------- \n");
        for (int index = 0; index < valueFloatArray.length; index++) {
           System.out.printf("Float:  %s \n",valueFloatArray[index]);
        }
        System.out.print("--------------------------------------------- \n");

        System.out.print("-------Show Data Type: Array of Double------- \n");
        for (int index = 0; index < valueDoubleArray.length; index++) {
           System.out.printf("Double:  %s \n",valueDoubleArray[index]);
        }
        System.out.print("--------------------------------------------- \n");

    }
}
