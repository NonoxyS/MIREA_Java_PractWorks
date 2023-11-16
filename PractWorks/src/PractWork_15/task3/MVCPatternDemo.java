package PractWork_15.task3;

public class MVCPatternDemo {
    public static void main(String[] args) {
        User model = new User();
        UserView view = new UserView();
        UserController controller = new UserController(model, view);
    }
}
