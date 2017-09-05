public class MagicSevenBall{

	public static void main( String [] args ){
	int prediction;
	
	prediction = 1 + (int)( 7*Math.random() );
	
		if (prediction == 1) {
			System.out.println( "Stay together" );
		}
		else if (prediction == 2) {
			System.out.println( "Take a break" );
		}
		else if (prediction == 3) {
			System.out.println( "Break up" );
		}
		else if (prediction == 4) {
			System.out.println( "Wait another day );
		}
		else if (prediction == 5) {
			System.out.println( "Try an open relationship" );
		}
		else if (prediction == 6) {
			System.out.println( "Talk it out" );
		}
		else {
		System.out.println( "Lay in bed and cry" );
		}
	}
}
		