import java.util.Date;

public class AuditLog {

    private String logId;
    private String eventType;
    private Date eventTime;
    private String userId;
    private String details;

    public AuditLog() {
    }

    public void createLog() {
        // placeholder method
        System.out.println("Log created");
    }
}
