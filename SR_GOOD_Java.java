public class ReportGenerator {
    public String generate() {
        return "Report content";
    }
}

public class FileSaver {
    public void save(String content) {
        System.out.println("Saving to file: " + content);
    }
}

public class EmailSender {
    public void send(String content) {
        System.out.println("Sending email: " + content);
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        ReportGenerator generator = new ReportGenerator();
        String report = generator.generate();

        FileSaver saver = new FileSaver();
        saver.save(report);

        EmailSender sender = new EmailSender();
        sender.send(report);
    }
}
