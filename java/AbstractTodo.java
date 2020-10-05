
abstract class AbstractTodo {
    
    int idTodo;
    String title;
    
    abstract void listItem();
    public abstract void showTodoList();

    public AbstractTodo(int idTodo, String title) {
        this.idTodo = idTodo;
        this.title = title;
    }

    public int getIdTodo() {
        return idTodo;
    }

    public String getTitle() {
        return title;
    }

}