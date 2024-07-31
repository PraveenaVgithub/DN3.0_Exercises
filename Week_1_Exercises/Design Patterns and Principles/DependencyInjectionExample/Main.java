package DependencyInjectionExample;

public class Main {
    public static void main(String[] args) {
        // Create a CustomerRepository instance
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Create a CustomerService instance with the repository
        CustomerService service = new CustomerService(repository);

        // Use the service to find a customer
        int customerId = 1;
        Customer customer = service.findCustomerById(customerId);

        if (customer != null) {
            System.out.println("Customer found:");
            System.out.println("ID: " + customer.getId());
            System.out.println("Name: " + customer.getName());
            System.out.println("Email: " + customer.getEmail());
        } else {
            System.out.println("Customer not found with ID: " + customerId);
        }
    }
}