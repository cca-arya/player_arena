package com.magicalarena;

public class Player {
    private int health;
    private int strength;
    private int attack;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    public void reduceHealth(int damage) {
        this.health = Math.max(this.health - damage, 0);
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
}
