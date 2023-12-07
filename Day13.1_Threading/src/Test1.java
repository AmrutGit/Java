
public class Test1 {
	static {
		System.out.println("----static----");
	}

	public static void add() throws InterruptedException {
		System.out.println("---Addition-----");
		Thread.sleep(10000);
	}

	public static void subs()throws InterruptedException  {
		System.out.println("---Substractio-----");
		Thread.sleep(10000);
	}

	public static void div()throws InterruptedException  {
		System.out.println("---Div-----");
		Thread.sleep(10000);
	}

	public static void multi()throws InterruptedException  {
		System.out.println("---Multi-----");
		Thread.sleep(10000);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("-----main----");

		add();// 10 sec

		subs();// 10 sec
		div(); // 10 sec
		multi();// 10 sec
		System.out.println("---main end------");

	}

}
