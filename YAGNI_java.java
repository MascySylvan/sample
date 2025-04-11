public class User {
    private String name;
    private String email;

    // Adding this method just in case we need to log user in the future
    public void logActivity() {
        // Not needed now, but added anyway
        System.out.println("User activity logged");
    }
}

--------------------------------------------------------------------

  public class User {
    private String name;
    private String email;
    // Only necessary fields and methods
}

