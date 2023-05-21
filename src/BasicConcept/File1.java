package BasicConcept;

public class File1 {
	int A = 10;
	int B = 20;

	void m1() {
		System.out.println(" Temp m1");
	}

	void m2() {
		System.out.println(" Temp m2");
	}

	public static void main(String[] args) {
		File1 temp2 = new File1();
		System.out.println(temp2.A);
		System.out.println(temp2.B);
		// System.out.println(temp2.C);
		// temp2.m1();
		temp2.m2();
		// temp2.m3();
	}
}
