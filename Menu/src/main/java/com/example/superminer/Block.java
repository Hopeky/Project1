package com.example.superminer;

public class Block {
    public int health;

    public Block(int health)
    {
        this.health = health;
    }

    public void TakeDamage(int damage)
    {
        health -= damage;
    }


}
