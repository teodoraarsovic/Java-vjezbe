package projekat4;

public class CircleCollider implements Collidable{
	 double x, y, radius;
	 
	 public CircleCollider(double x, double y, double radius) {
	        if (radius <= 0) throw new IllegalArgumentException("Poluprečnik mora biti veći od 0");
	        this.x = x;
	        this.y = y;
	        this.radius = radius;
	    }

@Override
public boolean intersects(Collidable other) {
    if (other instanceof CircleCollider) {
        CircleCollider c = (CircleCollider) other;
        double dx = this.x - c.x;
        double dy = this.y - c.y;
        double dist = Math.sqrt(dx * dx + dy * dy);
        return dist < this.radius + c.radius;
    } else if (other instanceof RectangleCollider) {
        RectangleCollider r = (RectangleCollider) other;
        double closestX = clamp(this.x, r.x, r.x + r.width);
        double closestY = clamp(this.y, r.y, r.y + r.height);
        double dx = this.x - closestX;
        double dy = this.y - closestY;
        return (dx * dx + dy * dy) < (this.radius * this.radius);
    }
    return false;
}

private double clamp(double val, double min, double max) {
    return Math.max(min, Math.min(max, val));
}
@Override
public String toString() {
    return "CircleCollider(" + x + "," + y + ",r=" + radius + ")";
}
}