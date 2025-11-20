package projekat4;

class Enemy extends GameObject implements Attacker{
	protected int damage;
    protected int health;

    public Enemy(double x, double y, Collidable collider, int damage, int health) {
        super(x, y, collider);
        setDamage(damage);
        setHealth(health);
    }

    public void setDamage(int dmg) {
        if (dmg < 0 || dmg > 100) throw new IllegalArgumentException("DMG mora biti 0-100");
        this.damage = dmg;
    }
    public void setHealth(int h) {
        if (h < 0 || h > 100) throw new IllegalArgumentException("HP mora biti 0-100");
        this.health = h;
    }

    @Override
    public int getEffectiveDamage() {
        return damage;
    }

    @Override
    public String getDisplayName() {
        return "Enemy DMG=" + damage + " HP=" + health;
    }

    @Override
    public String toString() {
        return getDisplayName() + " Pos(" + x + "," + y + ") " + collider;
    }
}

class MeleeEnemy extends Enemy {
    public MeleeEnemy(double x, double y, Collidable collider, int dmg, int hp) {
        super(x, y, collider, dmg, hp);
    }

    @Override
    public String toString() {
        return "Melee" + super.toString();
    }
}

class BossEnemy extends Enemy {
    public BossEnemy(double x, double y, Collidable collider, int dmg, int hp) {
        super(x, y, collider, dmg, hp);
    }

    @Override
    public int getEffectiveDamage() {
        return damage * 2;
    }
    @Override
    public String toString() {
        return "Boss" + super.toString();
    }
}

