package logisticsTest;


import logistics.Logistics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogisticsTest {
    @Test
    public void estThatIfCollectionRateIsLessThan50() {
        Logistics logistics = new Logistics();
        assertEquals(45000, Logistics.calculateWage(80));
    }

    @Test
    public void testThatIfCollectionRateIsLessThan59() {
        Logistics logistics = new Logistics();
        assertEquals(16000, Logistics.calculateWage(55));


    }
    @Test
    public void testThatIfCollectionRateIsLessThan69 (){
        Logistics logistics = new Logistics();
        assertEquals(45000, logistics.calculateWage(80));

    }
}



