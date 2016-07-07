package pl.vlad.fbird;

import jdk.nashorn.internal.ir.annotations.*;
import org.junit.Rule;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

/**
 * Created by Vlad on 03.07.2016.
 */



public class BirdTest {

    @Rule
    public Timeout time = new Timeout(1000);

    @org.junit.Test
    public void getX() throws Exception {
        Bird bird = new Bird();
        assertNotNull(bird);
        assertEquals(100,bird.getX());

    }

}