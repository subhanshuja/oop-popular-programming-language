import java.util.Arrays;

class TodoListStatus extends TodoList {

    String status;

    public TodoListStatus(String title, String[] item, String[] tag, String status) {
        super(title, item, tag);
        this.title = title;
        this.item = item;
        this.tag = tag;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void showTodoList() {
        System.out.printf("title: %s \n",this.getTitle());
        System.out.printf("tag: %s \n",Arrays.toString(this.getTag()));
        for (int index = 0; index < getItem().length; index++) {
          System.out.printf("item [%d]: %s \n",index, this.getItem()[index]);
        }
        System.out.printf("status: %s \n",this.getStatus());
    }
}
