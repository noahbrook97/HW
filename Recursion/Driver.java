public class Driver{

    public static void main(String [] args) {
	recursion a = new recursion();

	//	System.out.println(a.fibItr(5));
	System.out.println("hailLen 7: " + a.hailLen(7));
	System.out.println("hailLen 8: " + a.hailLen(8));
	System.out.println("haiLen 9: " + a.hailLen(9));
	System.out.println("hailLen 10: " + a.hailLen(10));
	System.out.println("hailLen 11: " + a.hailLen(11));
	System.out.println("hailLen 12: " + a.hailLen(12) + "\n");

	System.out.println("longestHail(4) should be 3: " + a.longestHail(4));
	System.out.println("longestHail(7) should be : " + a.longestHail(7));
	System.out.println("longestHail(8) should be : " + a.longestHail(8));
	System.out.println("longestHail(11) should be : " + a.longestHail(11));
	System.out.println("longestHail(12) should be : " + a.longestHail(12));
	
    

    }
}