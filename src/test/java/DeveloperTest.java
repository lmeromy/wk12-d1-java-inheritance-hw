import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer dev;

    @Before
    public void setup(){
        dev = new Developer("Zoe", 1233, 80000);
    }

//NOTE: Extensions are tested in here! Except for the Director extension. See below

    @Test
    public void canGetName(){
        assertEquals("Zoe", dev.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(1233, dev.getNInum());
    }

    @Test
    public void canGetSalary(){
        assertEquals(80000, dev.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        dev.raiseSalary(5000);
        assertEquals(85000, dev.getSalary());
    }

    @Test
    public void canSeePayBonus(){
        assertEquals(800, dev.payBonus(), 0.01);
    }

//    Extensions tested

    @Test
    public void cannotRaiseSalary_Negative(){
        dev.raiseSalary(-1000);
        assertEquals(80000, dev.getSalary());
    }

    @Test
    public void canChangeEmployeeName(){
         dev.changeName("Audrey");
         assertEquals("Audrey", dev.getName());
    }

    @Test
    public void cannotChangeNameToNull(){
        dev.changeName(null);
        assertEquals("Zoe", dev.getName());
    }
}
