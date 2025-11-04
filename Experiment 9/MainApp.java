public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        StudentDAO studentDAO = context.getBean(StudentDAO.class);
        FeeService feeService = context.getBean(FeeService.class);

        // Add new student
        Course course = new Course();
        course.setCourseName("Java Development");
        course.setDuration("6 Months");

        Student student = new Student();
        student.setName("Alice");
        student.setCourse(course);
        student.setBalance(10000);

        studentDAO.saveStudent(student);

        // Process payment
        feeService.processPayment(student.getStudentId(), 2000);

        context.close();
    }
}

