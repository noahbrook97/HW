public class recursion {

    public String lastName() {
	return "Brook";
    }
    public String firstName() {
	return "Noah";
    }

    //Determine how many times hailn runs                                                          
    public static int hailLen(int n) {
        int counter = 1;
        while(n != 1) {
            if (n % 2 == 0) {
                counter++;
                n = n / 2;
            }
            else {
                counter++;
                n = n * 3 + 1;
            }
        }
        return counter;
    }

    /*longestHail(n): what starting value from 1 to n generates the longest length sequence.       
      examples: longestHail(1) : 1                               
                longestHail(2) : 2                                                                 
                longestHail(3) : 3        
                longestHail(4) : 3                                                                                
                longestHail(5) : 3                                     
                longestHail(6) : 6 */
    public static int longestHail(int n) {
	return longestHail(1, 1, n);
    }

    public static int longestHail(int noob, int winner, int n) {
	if (hailLen(noob) > hailLen(winner)) 
	    winner = noob;
	
	if (noob == n) 
	    return winner;
	else
	    return longestHail(noob + 1, winner, n);
    }
       
    public static int fibItr(int n) {
	if (n == 0)
	    return 0;
	if (n == 1)
	    return 1;
	else 
	    return fibhelp(0, 1, n-2);
    }

    public static int fibhelp(int a,int b,int n){
	if(n == 0)
	    return a+ b;
	else
	    return fibhelp(b, a + b, n -1);
    }

    public recursion() {
    }

}//end class recursion
