package Home_Inheritance.CodingQ2;

/*
 * TODO 1: Provide an abstract class, NotificationService, with the following attributes
 * and methods.
 *
 * Attributes:
 * 		- message: String
 * 		Also provide getters and setters for it.
 *
 * Methods:
 * 		+ sendNotification(): String (make this method public and abstract)
 *
 * Constructor:
 * 		+ NotificationService (message: String)
 *
 */
public abstract class NotificationService {
    private String message;

    public NotificationService(String message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public abstract String sendNotification();
}

