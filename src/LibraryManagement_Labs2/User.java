package LibraryManagement_Labs2;

public class User {
    private String userId;
    private String name;
    private String contactInfo;

    public String getUserId() {
        return userId;
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
