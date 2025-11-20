package projekat4;

public class Test {

	public static void main(String[] args) {
		 Player p = new Player("peTar petrovic", 10, 10, new RectangleCollider(10, 10, 32, 32), 100);
         MeleeEnemy e1 = new MeleeEnemy(15, 15, new RectangleCollider(15, 15, 32, 32), 20, 50);
	     BossEnemy e2 = new BossEnemy(200, 200, new CircleCollider(200, 200, 30), 25, 100);
	  
	     Game g = new Game(p);

	}

}
