public class Report {

    public String generateReport() {
        // Generates report content
        return "Report content";
    }

    public void saveToFile(String content) {
        // Saves report content to a file
        System.out.println("Saving to file: " + content);
    }

    public void sendByEmail(String content) {
        // Sends the report via email
        System.out.println("Sending email: " + content);
    }
}
