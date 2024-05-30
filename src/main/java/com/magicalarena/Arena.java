package com.magicalarena;

public class Arena {

    public void startBattle(Player playerA, Player playerB) {
        while (playerA.isAlive() && playerB.isAlive()) {
            if (playerA.getHealth() <= playerB.getHealth()) {
                attack(playerA, playerB);
            } else {
                attack(playerB, playerA);
            }
        }
        if (!playerA.isAlive()) {
            System.out.println("Player A has been defeated!");
        } else {
            System.out.println("Player B has been defeated!");
        }
    }

    private void attack(Player attacker, Player defender) {
        int attackRoll = attacker.rollDice();
        int defendRoll = defender.rollDice();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defendStrength = defender.getStrength() * defendRoll;

        int damage = Math.max(attackDamage - defendStrength, 0);
        defender.reduceHealth(damage);

        System.out.printf("%s attacks %s: Attack Roll: %d, Defend Roll: %d, Damage: %d\n",
                attacker, defender, attackRoll, defendRoll, damage);
        System.out.printf("Player A Health: %d, Player B Health: %d\n", playerA.getHealth(), playerB.getHealth());
    }
}
