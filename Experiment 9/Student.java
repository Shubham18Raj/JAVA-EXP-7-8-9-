@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    private double balance;

    // Getters, Setters, Constructors
}

