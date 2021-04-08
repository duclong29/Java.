package exe4;

class Employee {
    private int ID;
    private String fistName;
    private String lastName;
    private int salary;

    public Employee (int ID, String fistName, String lastName, int salary) {
        this.ID = ID;
        this.fistName = fistName;
        this.lastName = lastName;
        this.salary =salary;
    }
    public int getID () {
        return ID;
    }
    public String getFistName () {
        return fistName;
    }
    public String getLastName () {
        return lastName;
    }
    public String getName () {
        return fistName + " " + lastName;
    }
    public int getSalary () {
        return salary;
    }
    public void setSalary (int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary () {
        return salary * 12;
    }
    public int raiseSalary (int percent) {
        salary = salary + salary * percent / 100;
        return salary;
    }
    public String toString () {
        return ID + ", " + fistName + " " + lastName + ", " + salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee(1, "long", "chu duc", 20000);
        System.out.println(e.getID());
        System.out.println(e.getFistName());
        System.out.println(e.getLastName());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
        e.setSalary(300000);
        System.out.println("SetSalary : " + e.getSalary());
        System.out.println("AnnualSalary : " + e.getAnnualSalary());
        System.out.println("RaiseSalary : " + e.raiseSalary(4));
        System.out.println(e);



    }

}
