package com.magicalarena;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArenaTest {

    @Test
    public void testBattle() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        Arena arena = new Arena();
        arena.startBattle(playerA, playerB);

        assertTrue(playerA.getHealth() == 0 || playerB.getHealth() == 0);
    }
}
