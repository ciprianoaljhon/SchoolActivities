class TriPrism<T extends Number>{
	private T length, base, height;
	public void setLength(T length) {
		this.length = length;
	}
	public void setBase(T base) {
		this.base = base;
	}
	public void setHeight(T height) {
		this.height = height;
	}
	public T getLength() {
		return length;
	}
	public T getBase() {
		return base;
	}
	public T getHeight() {
		return height;
	}
	public double calc() {
		double _length = length.doubleValue(), _height = height.doubleValue(), _base = base.doubleValue();
		return _length * (0.5 * _base * _height);
	}
}
 
public class TriPrismDemo {
	public static void main(String[] args) {
		// 10 Task Performance 1 - ARG
		
		TriPrism<Integer> tp1 = new TriPrism<>();
		tp1.setLength(10);
		tp1.setBase(7);
		tp1.setHeight(5);
		
		TriPrism<Double> tp2 = new TriPrism<>();
		tp2.setLength(9.10);
		tp2.setBase(6.25);
		tp2.setHeight(4.20);
		
		System.out.println("Triangular Prism 1");
		display(tp1);
		System.out.println("Triangular Prism 2");
		display(tp2);
	}
	public static <T> void display(TriPrism<?> triPrism) {
		double volume = triPrism.calc();
		Number length = triPrism.getLength(), base = triPrism.getBase(), height = triPrism.getHeight();
		System.out.println("Length: " + length + "\nBase: " + base + "\nHeight: " + height);
		System.out.println("The volume of the triangular prism is " + volume + ".\n");
	}
}
