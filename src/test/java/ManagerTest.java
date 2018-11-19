import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void setup(){
        manager = new Manager("Leah", 1234, 150000, "Software Engineering");
    }

    @Test
    public void canGetName(){
        assertEquals("Leah", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(1234, manager.getNInum());
    }

    @Test
    public void canGetSalary(){
        assertEquals(150000, manager.getSalary());
    }

    @Test
    public void canGetDept(){
        assertEquals("Software Engineering", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(10000);
        assertEquals(160000, manager.getSalary());
    }

    @Test
    public void canSeePayBonus(){
        assertEquals(1500, manager.payBonus(), 0.01);
    }


}
