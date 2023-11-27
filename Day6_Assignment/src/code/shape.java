package code;

public abstract class shape {
	private int x = 0;
	private int y = 0;

	public abstract double area();

	public String toString() {
		return this.x + " " + this.y+" ";
	}

}
