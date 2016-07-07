package pl.vlad.fbird;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vlad on 03.07.2016.
 */
public class DarkColumnTest {
    @Test
    public void dark() throws Exception {
        DarkColumn column1=new DarkColumn();
        column1.randHeight();
        int i = column1.getH();
        assertTrue(i>0 && i<200);
    }

    @Test
    public void regular() throws Exception {
        RegularColumn column2=new RegularColumn();
        column2.randHeight();
        int i = column2.getH();
        assertTrue(i>0 && i<200);
    }

    @Test
    public void light() throws Exception {
        LightColumn column3=new LightColumn();
        column3.randHeight();
        int i = column3.getH();
        assertTrue(i>0 && i<200);
    }

}