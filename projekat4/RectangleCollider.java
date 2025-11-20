package projekat4;

public class RectangleCollider implements Collidable {
	double x, y, width, height;
	
	public RectangleCollider(double x, double y, double width, double height) {
        if (width <= 0 || height <= 0) throw new IllegalArgumentException("Dimenzije moraju biti veće od 0");
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean intersects(Collidable other) {
        if (other instanceof RectangleCollider) {
            RectangleCollider r = (RectangleCollider) other;
            return (this.x < r.x + r.width && this.x + this.width > r.x &&
                    this.y < r.y + r.height && this.y + this.height > r.y);
        } else if (other instanceof CircleCollider) {
            return other.intersects(this);
        }
        return false;
    }
@Override
public String toString() {
    return "RectCollider(" + x + "," + y + "," + width + "," + height + ")";
}
}
