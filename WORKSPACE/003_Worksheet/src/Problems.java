
public class Problems {
	public Problems (int problemNum) {
		switch (problemNum) {
			case 1:
				problem1();
				break;
			case 2:
				problem2();
				break;
			case 3:
				problem3();
				break;
			case 4:
				problem4();
				break;
			case 5:
				problem5();
				break;
			case 6:
				problem6();
				break;
			case 7:
				problem7();
				break;
			case 8:
				problem8();
				break;
			case 9:
				problem9();
				break;
			case 10:
				problem10();
				break;
			case 11:
				problem11();
				break;
			case 12:
				problem12();
				break;
			case 13:
				problem13();
				break;
			case 14:
				problem14();
				break;
			case 15:
				problem15();
				break;
			default:
				System.out.println("ERROR: Problem entered does not exist.");
				break;
				
		}
	}
	
	public void problem1 () {
		for (int i = -3; i < 19; i+=3) {
			System.out.println(i + " ");
		}
	}
	public void problem2 () {
		for (int j = 17; j > -2; j-=2) {
			System.out.println(j + " ");
		}
	}
	public void problem3 () {
		for (int x = 20; x < 50; x+=3) {
			System.out.println(x + " ");
		}
	}
	public void problem4 () {
		for (int m = 37; m > 0; m-=4) {
			System.out.println(m + " ");
		}
	}
	public void problem5 () {
		int total = 0;
		for (int s = 1; s < 19; s++) {
			total += s;
		}
		System.out.println(total);
	}
	public void problem6 () {
		int x = -2;
		while (x < 9) {
			x++;
			System.out.println(x + " ");
		}
	}
	public void problem7 () {
		int m = 1; int total = 0;
		while (m < 9) {
			total += m;
			m++;
		}
		System.out.println(total);
	}
	public void problem8 () {
		int z = 2; int sum = 0;
		while (z < 12) {
			z++;
			sum += z;
		}
		System.out.println(sum);
	}
	public void problem9 () {
		int k = 5;
		String s = "";
		while (k > 0) {
			s = k + " " + s;
			k--;
		}
		System.out.println(s);
	}
	public void problem10 () {
		int b = 3;
		String list = "";
		while (b < 10) {
			b += 2;
			if (b % 2 == 1) {
				list = b + " " + list;
			}
		}
	}
	public void problem11 () {
		int a = 30;
		if (a < 10) {
			System.out.println("aplus");
		}
		else if (a > 10) {
			System.out.println("compsci");
		}
	}
	public void problem12 () {
		int b = 4;
		
		if  (b < 2) {
			System.out.println("fun");
		}
		else if (b < 4) {
			System.out.println("jump");
		}
		else if (b < 8) {
			System.out.println("three");
		}
	}
	public void problem13 () {
		int c = 5; int d = 8;
		
		if (c < 10 && d > 10) {
			System.out.println("aplus");
		}
		System.out.println("compsci");
	}
	public void problem14 () {
		int e = 7; int f = 3;
		if (e > 5 || f > 10) {
			System.out.println("aplus");
		}
		else if (e > 2) {
			System.out.println("compsci");
		}
	}
	public void problem15 () {
		int g = 10;
		
		if (g < 10) {
			if (g > 0) {
				System.out.println("fun");
			}
			else if (g > 5) {
				System.out.println("jump");
			}
		}
		else if (g >= 10) {
			if (g > 15) {
				System.out.println("three");
			}
			else if (g < 15) {
				System.out.println("four");
			}
		}
	}
}
