// Concern: Data
public class User {
    private String name;
    public User(String name) { this.name = name; }
    public String getName() { return name; }
}

// Concern: Business Logic
public class UserService {
    public boolean isValid(User user) {
        return user.getName() != null && !user.getName().isEmpty();
    }
}

// Concern: Presentation
public class UserPrinter {
    public void print(User user) {
        System.out.println("User: " + user.getName());
    }
}

// Main runner
public class Main {
    public static void main(String[] args) {
        User user = new User("Alice");
        UserService service = new UserService();
        UserPrinter printer = new UserPrinter();

        if (service.isValid(user)) {
            printer.print(user);
        }
    }
}
