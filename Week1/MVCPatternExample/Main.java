package MVCPatternExample;

public class Main {
    public static void main(String[] args) {
        Student model = new Student("Hemnath", 42);
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
    }
}
