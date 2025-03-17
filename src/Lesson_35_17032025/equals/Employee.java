package Lesson_35_17032025.equals;

public class Employee {
    private String ferstName;
    private String lastName;
    private String dateOfBirth;

    public Employee(String ferstName, String lastName, String dateOfBirth) {
        this.ferstName = ferstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ferstName='" + ferstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    // propisivayu etogo(this) obiekta s drugim.
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true; // peremennie ssilayutsya na odin i totzhe obiekt
        if (!(obj instanceof Employee)) return false; // proverka na vozmozhnost k Employee
        Employee employee = (Employee) obj;

        return ferstName.equals(employee.ferstName) && lastName.equals(employee.lastName)
                && dateOfBirth.equals(employee.dateOfBirth);
    }


    public String getFerstName() {
        return ferstName;
    }

    public void setFerstName(String ferstName) {
        this.ferstName = ferstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
