@Service
public class FeeService {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void processPayment(int studentId, double amount) {
        Session session = sessionFactory.getCurrentSession();
        Student student = session.get(Student.class, studentId);

        if (student != null && student.getBalance() >= amount) {
            student.setBalance(student.getBalance() - amount);

            Payment payment = new Payment(student, amount, new Date());
            session.save(payment);
        } else {
            throw new RuntimeException("Insufficient balance or invalid student!");
        }
    }

    @Transactional
    public void refundPayment(int studentId, double amount) {
        Session session = sessionFactory.getCurrentSession();
        Student student = session.get(Student.class, studentId);
        student.setBalance(student.getBalance() + amount);
    }
}

