import java.util.Arrays;

class Todo extends AbstractTodo {

    String[] item;
    String[] tag;
    String status;

    public Todo(int id, String title, String[] item, String[] tag, String status) {
        super(id, title);
        this.item = item;
        this.tag = tag;
        this.status = status;
    }

    public String[] getItem() {
        return item;
    }

    public String[] getTag() {
        return tag;
    }

    public String getStatus() {
        return status;
    }

    @Override
    void listItem() {
        for (int index = 0; index < getItem().length; index++) {
          System.out.printf("item [%d]: %s \n",index, this.getItem()[index]);
        }
    }

    @Override
    public void showTodoList() {
        System.out.printf("id: %s \n",super.idTodo);
        System.out.printf("title: %s \n",super.title);
        System.out.printf("tag: %s \n",Arrays.toString(this.getTag()));
        this.listItem();
    }

}