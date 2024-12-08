package LibraryManagement_Labs2;

public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;

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

    private String generateUniqueId(){
        return "";
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
