package shapes;

/**
 * 用类制造对象，shapes画图
 */
public class MyPic {
	public static void main(String[] args) 
	{
		Picture pic = new Picture(960,1000);
		Circle c1 = new Circle(480,300,100);
		Line l1 = new Line(280,200,680,200);
		Rectangle r1 = new Rectangle(400,50,160,150);
		Circle c2 = new Circle(440,265,15);
		Circle c3 = new Circle(520,265,15);
		Line l2 = new Line(480,290,480,310);
		Rectangle r2 = new Rectangle(460,330,40,40);
		Triangle t1 = new Triangle(480,400,320,500,640,500);
		Rectangle r3 = new Rectangle(400,500,160,200);
		Rectangle r4 = new Rectangle(410,700,40,80);
		Rectangle r5 = new Rectangle(510,700,40,80);
		pic.add(c1);
		pic.add(l1);
		pic.add(r1);
		pic.add(c2);
		pic.add(c3);
		pic.add(l2);
		pic.add(r2);
		pic.add(t1);
		pic.add(r3);
		pic.add(r4);
		pic.add(r5);
		pic.draw();
	}
}
