import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculatorTest {
     Calculator calc=new Calculator();
    @BeforeEach
    void setUp() {

        System.out.println("@@CalcuatorTest.setUp #12: setUp");
        calc.setTotal(0);
    }
    //Annoation
    @AfterEach
    void tearDown() {
        System.out.println("@@CalcuatorTest.tearDown #19:calc.getTotal()="+calc.getTotal());
        System.out.println("@@CalcuatorTest.tearDown #19:tearDown");
    }

    @Test
    void add() {
        calc.add(100);
        calc.add(200);
        calc.add(300);
        Assertions.assertEquals(600,calc.getTotal());
    }

    @Test
    void subtract() {
        calc.setTotal(1000);
        calc.subtract(100);
        calc.subtract(200);

        Assertions.assertEquals(700,calc.getTotal());
    }
}