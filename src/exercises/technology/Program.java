package exercises.technology;

import static org.junit.Assert.*;
import exercises.technology.Computer;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;

import org.junit.runner.manipulation.Orderable;
import org.junit.runners.MethodSorters;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Program {

//    Laptop laptop1 = new Laptop("laptop1", 500, 4);
//    SmartPhone phone1 = new SmartPhone("Phone1", 250, 1);

    @Test

    public void aTestPCId() {
        Computer pc1 = new Computer("pc1", 200, 6);
        assertEquals(1, pc1.getId());
    }

    @Test
    public void testName() {
        Computer pc1 = new Computer("pc1", 200, 6);
        assertEquals("pc1", pc1.getName());
    }

    @Test
    public void testStorage() {
        Computer pc1 = new Computer("pc1", 200, 6);
        assertEquals(200, pc1.getStorage());
    }

    @Test
    public void storageAboveZero() {
        Computer pc1 = new Computer("pc1", 200, 6);
        assertTrue(pc1.getStorage() > 0);
    }

    @Test
    public void portsAboveZero() {
        Computer pc1 = new Computer("pc1", 200, 6);
        assertTrue(pc1.getPorts() > 0);
    }


}

//    @Test
//    public void testPhoneName(){assertEquals("Phone1", phone1.getName() );}
//
//    @Test
//    public void testPhoneBatter(){assertEquals(80, phone1.getBatterylife());}
//
//    @Test
//    public void testPhonePortability(){assertTrue(phone1.portable().equals("This device is portable."));}
//
//    @Test
//    public void testLaptopName(){assertEquals("laptop1", laptop1.getName());}
//
//    @Test
//    public void testLaptopBattery(){assertEquals(48, laptop1.getBatterylife());}
//
//    @Test
//    public void testLaptopPortability(){assertTrue(laptop1.portable().equals("This device is portable."));}
//
//}
