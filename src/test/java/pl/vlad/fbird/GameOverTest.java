package pl.vlad.fbird;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vlad on 03.07.2016.
 */
public class GameOverTest {
    @Test
    public void check() throws Exception {
        GameOver game = new GameOver();
        assertFalse(game.check());

    }

}