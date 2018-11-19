package management;

public class Director extends Manager{

    private int budget;

    public Director(String name, int NInum, int salary, String deptName, int budget) {
        super(name, NInum, salary, deptName);
        this.budget  = budget;
    }

    public int getBudget() {
        return budget;
    }

    public double payBonus(){
        return super.getSalary() * 0.02;
    }
}
