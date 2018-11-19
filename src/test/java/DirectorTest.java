import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//    Add a private property to store a double value budget.
//    Create a constructor for Director that includes the parameters needed for Manager and the budget parameter.
//    Create a getter method for this property.
//    Test all methods.

public class DirectorTest {

    Director director;

    @Before
    public void setup(){
        director = new Director("Yael", 1235, 180000, "Finance", 800000000);
    }

    @Test
    public void canGetName(){
        assertEquals("Yael", director.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(1235, director.getNInum());
    }

    @Test
    public void canGetSalary(){
        assertEquals(180000, director.getSalary());
    }

    @Test
    public void canGetDept(){
        assertEquals("Finance", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10000);
        assertEquals(190000, director.getSalary());
    }

    @Test
    public void canSeePayBonus(){
        assertEquals(1800, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(800000000, director.getBudget());
    }

//    Extension:
    @Test
    public void payBonusIsTwoPercent(){
        assertEquals(3600, director.payBonus(), 0.01);
    }


}
