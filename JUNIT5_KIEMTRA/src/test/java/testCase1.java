import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class testCase1 {
    public testCase1(){
    }


    public void testcheckSurname1(){
        Case1 case01 = new Case1();
        String result = case01.checkSurname("Ho1");
        Assertions.assertAll(result);

    }

    @Test
    public void testcheckSurname2(){
        Case1 case02 = new Case1();
        String result = case02.checkSurname(" ");
        Assertions.assertAll(result);
    }

    @Test
    public void testcheckSurname3(){
        Case1 case03 = new Case1();
        String result = case03.checkSurname("ho!");
        Assertions.assertEquals(false, Boolean.parseBoolean(result));
    }

    @Test
    public void testcheckSurname4(){
        Case1 case04 = new Case1();
        String result = case04.checkSurname("Ho");
        assertAll(result);
    }
}
