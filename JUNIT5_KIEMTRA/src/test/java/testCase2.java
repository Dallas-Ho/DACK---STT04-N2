import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class testCase2 {
    public testCase2(){
    }


    public void testcheckName1(){
        Case2 case01 = new Case2();
        String result = case01.checkName("Vi1");
        Assertions.assertAll(result);

    }

    @Test
    public void testcheckName2(){
        Case2 case02 = new Case2();
        String result = case02.checkName(" ");
        Assertions.assertAll(result);
    }

    @Test
    public void testcheckName3(){
        Case2 case03 = new Case2();
        String result = case03.checkName("Vi!");
        Assertions.assertEquals(false, Boolean.parseBoolean(result));
    }

    @Test
    public void testcheckName4(){
        Case2 case04 = new Case2();
        String result = case04.checkName("Vi");
        assertAll(result);
    }
}
