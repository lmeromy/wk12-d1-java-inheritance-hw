package staff;

public abstract class Employee {

    private String name;
    private int NInum;
    private int salary;

    // EXTENSIONS:
//    Prevent a negative value for the raiseSalary method.
//    Allow the user to change the Employees name and prevent a null value from being entered.
//    Override the payBonus in director to return 2% of their salary.

    public Employee(String name, int NInum, int salary) {
        this.name = name;
        this.NInum = NInum;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        if(name != null){
            this.name = name;
        }
    }

    public int getNInum() {
        return NInum;
    }

    public int getSalary() {
        return salary;
    }


    public void raiseSalary(double number) {
        if(number > 0) {
            this.salary = this.salary + (int) number;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;  //converts automatically to a double since
        // double is a "higher" type and the conversion is implicit
    }
}


//    Employee will have a name, NI number and salary.
//        Create Getters for all properties.
//        Add a method named raiseSalary with takes in a parameter of type double to increment the salary.
//        Add a method called payBonus which returns 1% of the employees salary.