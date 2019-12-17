package by.savitskaya.model;

public class Client {

    private Integer id;
    private String firstName;
    private String lastName;
    private String age;
    private String nameCompany;

    public Client() {
    }

    public Client(String firstName, String lastName, String age, String nameCompany) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nameCompany = nameCompany;
    }

    public Client(Integer id, String firstName, String lastName, String age, String nameCompany) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nameCompany = nameCompany;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (nameCompany != null ? nameCompany.hashCode() : 0);
        return result;
    }
}
