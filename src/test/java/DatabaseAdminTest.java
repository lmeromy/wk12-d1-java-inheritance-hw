import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin dbAdmin;

    @Before
    public void setup(){
        dbAdmin = new DatabaseAdmin("Max", 1232, 70000);
    }

    @Test
    public void canGetName(){
        assertEquals("Max", dbAdmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(1232, dbAdmin.getNInum());
    }

    @Test
    public void canGetSalary(){
        assertEquals(70000, dbAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        dbAdmin.raiseSalary(5000);
        assertEquals(75000, dbAdmin.getSalary());
    }

    @Test
    public void canSeePayBonus(){
        assertEquals(700, dbAdmin.payBonus(), 0.01);
    }
}
