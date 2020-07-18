package Question2;

public class Manager extends  Member {
    private String specialization;
    private String department;

    public Manager(String name, int age, String phoneNumber, double salary, String specialization, String department) {
        super(name, age, phoneNumber, salary);
        this.specialization = specialization;
        this.department = department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
