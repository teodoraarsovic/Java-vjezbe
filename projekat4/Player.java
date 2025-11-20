package projekat4;

class Player extends GameObject {
	private String name;
    private int health;
    
    public Player(String name, double x, double y, Collidable collider, int health) {
        super(x, y, collider);
        setName(name);
        setHealth(health);
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Ime ne može biti prazno");
        String[] parts = name.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String p : parts) {
            sb.append(Character.toUpperCase(p.charAt(0))).append(p.substring(1)).append(" ");
        }
        this.name = sb.toString().trim();
    }
    public void setHealth(int health) {
        if (health < 0 || health > 100) throw new IllegalArgumentException("Health mora biti 0-100");
        this.health = health;
    }

    public void decreaseHealth(int dmg) {
        health = Math.max(0, health - dmg);
    }

    public int getHealth() { return health; }

    @Override
    public String getDisplayName() {
        return "Player[" + name + "] HP=" + health;
    }
    @Override
    public String toString() {
        return getDisplayName() + " Pos(" + x + "," + y + ") " + collider;
    }
}

