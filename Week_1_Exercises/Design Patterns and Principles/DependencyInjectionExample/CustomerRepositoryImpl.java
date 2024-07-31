package DependencyInjectionExample;
import java.util.*;


public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<Integer, Customer> customers = new HashMap<>();

    public CustomerRepositoryImpl() {
        // Initialize customers map for demonstration purposes
        customers.put(1, new Customer(1, "John Doe", "john.doe@example.com"));
        customers.put(2, new Customer(2, "Jane Doe", "jane.doe@example.com"));
    }

    @Override
    public Customer findCustomerById(int id) {
        return customers.get(id);
    }
}