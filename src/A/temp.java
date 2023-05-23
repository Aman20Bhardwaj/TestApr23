package A;

public class temp {
	int A = 10;
	int B = 20;

	void m1() {
		System.out.println(" Temp m1");
	}

	void m2() {
		System.out.println(" Temp m2");
	}

	public static void main(String[] args) {
		temp temp2 = new temp();
		System.out.println(temp2.A);
		System.out.println(temp2.B);
		// System.out.println(temp2.C);
		temp2.m1();
		System.out.println("change m1 to line update");
		// temp2.m3();
//		added line 1
//		added line 2
//		added line 4
//		added line 5
//		added line 6

	}
}
