@Configuration
@ComponentScan(basePackages = "com.studentmanagement")
public class AppConfig {

    @Bean
    public SessionFactory sessionFactory() {
        return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }

    @Bean
    public StudentDAO studentDAO() {
        return new StudentDAO();
    }

    @Bean
    public FeeService feeService() {
        return new FeeService();
    }
}

