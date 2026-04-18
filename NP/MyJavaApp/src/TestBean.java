public class TestBean {
    public static void main(String[] args) {
        // Create an instance of the Bean
        StudentBean student = new StudentBean();

        // Setting values using Setters
        student.setId(101);
        student.setName("Abiskar");

        // Retrieving values using Getters
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
    }
}