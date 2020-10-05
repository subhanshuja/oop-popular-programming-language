import java.util.Scanner;
import java.util.Random;

class IntermediateThree {

    private static int checkLengthTitle(String title) {
      return title.length();
    }

    public static void main(String []args) {

      Scanner scanner = new Scanner(System.in);
      int sizeItem;
      int sizeTag;
      String title;
      String status;
      Todo todoList = null;

      Random random = new Random();
      int genIdTodo = random.nextInt(3);

      System.out.print("Create todolist \n");
      
      System.out.print("input count of item \n");
      sizeItem = scanner.nextInt();

      System.out.print("input count of tag \n");
      sizeTag = scanner.nextInt();
      
      String[] itemArray = new String[sizeItem];
      String[] tagArray = new String[sizeTag]; 

      do { 
        System.out.print("insert title:");
        title = scanner.next();

        if (checkLengthTitle(title) > 7) {
          condition = true;
        } else {
          System.out.println("title should be more than 7 character");
        }
      }while(!condition);

      System.out.println("insert item:");
      for (int index = 0; index < sizeItem; index++) {
        itemArray[index] = scanner.next();
      }

      System.out.println("insert tag:");
      for (int index = 0; index < sizeTag; index++) {
        tagArray[index] = scanner.next();
      } 

      System.out.print("insert status:");
      status = scanner.next();

      todoList = new Todo(genIdTodo, title, itemArray, tagArray, status);

      todoList.showTodoList();
    }
}
