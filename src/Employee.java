public class Employee {
    private String surname;
    private String name;
    private String age;
    private String gender;
    private String education;
    private String position;
    private String department;

    @Override
    public String toString() {
        return "Employee{" +
                "surname= " + surname + '\'' +
                ", name = " + name + '\'' +
                ", age = " + age +
                ", gender = " + gender + '\'' +
                ", education= " + education + '\'' +
                ", position = " + position + '\'' +
                ", department = " + department + '\'' +
                '}';
    }

    public Employee(String surname, String name, String age, String gender, String education, String position, String department) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.education = education;
        this.position = position;
        this.department = department;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String sex) {
        this.gender = gender;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}