import java.util.Scanner;
import java.util.Arrays;

public class BasicFive {

    String title;
    String[] item;
    String[] tag;

    public BasicFive(String title, String[] item, String[] tag) {
        this.title = title;
        this.item = item;
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public String[] getItem() {
        return item;
    }

    public String[] getTag() {
        return tag;
    }

    public void showTodoList() {
        System.out.printf("title: %s \n",this.getTitle());
        System.out.printf("tag: %s \n",Arrays.toString(this.getTag()));
        for (int index = 0; index < getItem().length; index++) {
          System.out.printf("item [%d]: %s \n",index, this.getItem()[index]);
        }
    }
    
    public static void main(String []args) {
      
      Scanner scanner = new Scanner(System.in);
      int sizeItem;
      int sizeTag;
      String title;
      BasicFive todolist = null;

      System.out.print("Create todolist \n");
      
      System.out.print("input count of item \n");
      sizeItem = scanner.nextInt();

      System.out.print("input count of tag \n");
      sizeTag = scanner.nextInt();
      
      String[] itemArray = new String[sizeItem];
      String[] tagArray = new String[sizeTag]; 

      System.out.print("insert title:");
      title = scanner.next();

      System.out.println("insert item:");
      for (int index = 0; index < sizeItem; index++) {
        itemArray[index] = scanner.next();
      }

      System.out.println("insert tag:");
      for (int index = 0; index < sizeTag; index++) {
        tagArray[index] = scanner.next();
      } 

      todolist = new BasicFive(title, itemArray, tagArray);

      todolist.showTodoList();
    }
}
