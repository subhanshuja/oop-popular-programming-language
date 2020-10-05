import java.util.Arrays;

class TodoList {

    String title;
    String[] item;
    String[] tag;

    public TodoList(String title, String[] item, String[] tag) {
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
}
