package vjezbe;

import java.util.InputMismatchException;

public class GameObject {
	private int x, y;
	private int width, height;

	public GameObject(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}	
	
	public boolean intersects(GameObject other) {
	        return this.x < other.x + other.width  &&
	               this.x + this.width > other.x   &&
	               this.y < other.y + other.height &&
	               this.y + this.height > other.y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x > 0)
			this.x = x;
		else
			throw new InputMismatchException("Pogresan unos");

	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y > 0)
			this.y = y;
		else
			throw new InputMismatchException("Pogresan unos");
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if (width > 0)
			this.width = width;
		else
			throw new InputMismatchException("Pogresan unos");

	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if (height > 0)
			this.height = height;
		else
			throw new InputMismatchException("Pogresan unos");

	}

	public String toString() {
		return "GameObject [x=" + x + "," + y + ") " + width + "x" + height "];
	}
	
}



    class Player extends GameObject {
    	private String name;
    	private int health;
		public Player(int x, int y, int width, int height, String name, int health) {
			super(x, y, width, height);
			this.name = name;
			this.health = health;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			if (name == null)
				System.out.println("Pogresan unos");
		else 
			this.name = name;
		}
		public int getHealth() {
			return health;
		}
		public void setHealth(int health) {
			this.health = health;
		}
		public String toString() {
			return "Player [name=" + name + ", health=" + health + "]";
		}
    	
    }
    
    
    class Enemy extends GameObject {
    	private String type;
    	private int damage;
    	private int health;
		public Enemy(int x, int y, int width, int height, String type, int damage, int health) {
			super(x, y, width, height);
			this.type = type;
			this.damage = damage;
			this.health = health;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getDamage() {
			return damage;
		}
		public void setDamage(int damage) {
			this.damage = damage;
		}
		public int getHealth() {
			return health;
		}
		public void setHealth(int health) {
			this.health = health;
		}
		public String toString() {
			return "Enemy [type=" + type + ", damage=" + damage + ", health=" + health + "]";
		}
    }