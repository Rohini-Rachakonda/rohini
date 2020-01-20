package cog;

public class Shapes {
	int shapeId;
	String shapeName;
	@Override
	public String toString() {
		return "Shapes [shapeId=" + shapeId + ", shapeName=" + shapeName + "]";
	}
	public Shapes(int shapeId, String shapeName) {
		super();
		this.shapeId = shapeId;
		this.shapeName = shapeName;
	}
	public int getShapeId() {
		return shapeId;
	}
	public void setShapeId(int shapeId) {
		this.shapeId = shapeId;
	}
	public String getShapeName() {
		return shapeName;
	}
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	double area(){
		return 1.00;
	}

}
class Rectangle1 extends Shapes{
	int rectangle_length,rectangle_width;

	@Override
	public String toString() {
		return "Rectangle [rectangle_length=" + rectangle_length + ", rectangle_width=" + rectangle_width + ", shapeId="
				+ shapeId + ", shapeName=" + shapeName + "]";
	}

	public Rectangle1(int shapeId, String shapeName, int rectangle_length, int rectangle_width) {
		super(shapeId, shapeName);
		this.rectangle_length = rectangle_length;
		this.rectangle_width = rectangle_width;
	}

	public int getRectangle_length() {
		return rectangle_length;
	}

	public void setRectangle_length(int rectangle_length) {
		this.rectangle_length = rectangle_length;
	}

	public int getRectangle_width() {
		return rectangle_width;
	}

	public void setRectangle_width(int rectangle_width) {
		this.rectangle_width = rectangle_width;
	}
	double area()
	{
		return rectangle_length*rectangle_width;
	}
}
	class Square extends Shapes{
		int length;

		public int getLength() {
			return length;
		}

		public void setLength(int length) {
			this.length = length;
		}

		public Square(int shapeId, String shapeName, int length) {
			super(shapeId, shapeName);
			this.length = length;
		}

		@Override
		public String toString() {
			return "Square [length=" + length + ", shapeId=" + shapeId + ", shapeName=" + shapeName + "]";
		}
		double area()
		{
			return length*length;
		}
	}
	class Circle extends Shapes{
		int radius;

		public int getRadius() {
			return radius;
		}

		public void setRadius(int radius) {
			this.radius = radius;
		}

		public Circle(int shapeId, String shapeName, int radius) {
			super(shapeId, shapeName);
			this.radius = radius;
		}

		@Override
		public String toString() {
			return "Circle [radius=" + radius + ", shapeId=" + shapeId + ", shapeName=" + shapeName + "]";
		}
		double area(){
			System.out.println(super.area());
			return 3.14*radius*radius;
		}
		
	}
