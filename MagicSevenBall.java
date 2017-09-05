public class MagicSevenBall
{
	public static void main( String [] args )
	{
	String a="Stay together", b="Take a break", c="Break up", d="Wait another day", e="Try an open relationship", f="Talk it out", g= "Lay in bed and cry";
	int prediction;
	
	prediction = 1 + (int)( 7*Math.random() );
	
		if (prediction == 1) {
			System.out.println( a );
		}
		else if (prediction == 2) {
			System.out.println( b );
		}
		else if (prediction == 3) {
			System.out.println( c );
		}
		else if (prediction == 4) {
			System.out.println( d );
		}
		else if (prediction == 5) {
			System.out.println( e );
		}
		else if (prediction == 6) {
			System.out.println( f );
		}
		else {
		System.out.println( g);
		}
	}
}
		