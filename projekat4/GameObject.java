package projekat4;

abstract class GameObject {
    protected double x, y;
    protected Collidable collider;

    public GameObject(double x, double y, Collidable collider) {
        this.x = x;
        this.y = y;
        this.collider = collider;
    }

    public Collidable getCollider() { return collider; }

    public abstract String getDisplayName();
}