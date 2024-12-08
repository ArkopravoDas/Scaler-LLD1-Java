package LibraryManagement_Labs2;

public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers = 0;

    User(){
        userId = generateUniqueId();
    }

    User(String name, String contactInfo){
        userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    User(User other){
        this.name = other.name;
        this.contactInfo = other.contactInfo;
        this.userId = generateUniqueId();
    }

    public abstract void displayDashboard();

    public abstract boolean canBorrowBooks();

    public String getUserId() {
        return userId;
    }

    private final String generateUniqueId(){
        totalUsers++;
        return "Users-" + totalUsers;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
