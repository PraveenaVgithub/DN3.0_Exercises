package DependencyInjectionExample;
public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer findCustomerById(int id) {
        return repository.findCustomerById(id);
    }
}
