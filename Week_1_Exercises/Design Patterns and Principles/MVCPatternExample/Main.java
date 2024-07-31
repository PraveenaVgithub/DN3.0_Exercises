package MVCPatternExample;

public class Main {
    public static void main(String[] args) {
        // Create a Student model
        Student student = new Student("John Doe", 123, 90);

        // Create a StudentView instance
        StudentView view = new StudentView();

        // Create a StudentController instance
        StudentController controller = new StudentController(student, view);

        // Display initial Student details
        System.out.println("Initial Student Details:");
        controller.displayStudentDetails();

        // Update Student details using the controller
        controller.updateStudentName("Jane Doe");
        controller.updateStudentId(456);
        controller.updateStudentGrade(95);

        // Display updated Student details
        System.out.println("\nUpdated Student Details:");
        controller.displayStudentDetails();
    }
}