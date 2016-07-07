package pl.vlad.fbird;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

/**
 * Created by Vlad on 03.07.2016.
 */
public class ColumnFactoryTest {
    private static ColumnFactory factory;

    @BeforeClass
    public static void runT(){
        factory = new ColumnFactory();
    }

    @Rule
    public Timeout time = new Timeout(1000);



    @Test
    public void buildColumnTestNULL() throws Exception {
        assertNull(factory.buildColumn(""));

    }

    @Test
    public void buildColumnTestDark() throws Exception {


        assertNotNull(factory.buildColumn("DARK"));
    }

    @Test
    public void buildColumnTestRegular() throws Exception {


        assertNotNull(factory.buildColumn("REGULAR"));
    }

    @Test
    public void buildColumnTestLight() throws Exception {

        assertNotNull(factory.buildColumn("LIGHT"));
    }

}