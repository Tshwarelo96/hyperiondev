import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class sayNumberTest {
    SayNumber sn = new SayNumber();

    @Test
    void outputZero(){
        assertEquals("zero",sn.sayNumber(0));
    }

    @Test
    void outputGreaterThanZero(){
        assertEquals("eight",sn.sayNumber(8));
    }

    @Test
    void outputGreaterThanTen(){
        assertEquals("twelve",sn.sayNumber(12));
    }


}
