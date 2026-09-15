package Domain;

public class User {
    private int id;
    private String name;
    private String email;
    private int mobileNum;
    private Roles role;


    public User(int id, String name, String email, int mobileNum, Roles role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNum = mobileNum;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(int mobileNum) {
        this.mobileNum = mobileNum;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}
