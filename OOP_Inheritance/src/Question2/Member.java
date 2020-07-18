package Question2;

public class Member {
    String name;
    int age;
    String phoneNumber;
    double salary;

    public Member(String name, int age, String phoneNumber, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    void  PrintSalary(){
        System.out.println("salary is :" + getSalary());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
