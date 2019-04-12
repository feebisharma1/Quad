package supplementary;
 public class Quad {
	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;
		double[][] arrd = {{1,3,9},{1,-13,36},{1,2,-6}};		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				switch(j) {
				case 0:
					a = arrd[i][j];
					break;
				case 1:
					b = arrd[i][j];
					break;
				case 2:
					c = arrd[i][j];
					break;
				}
			}
				double insq = (b * b) - (4 * a * c);
				if (a == 0) {
					System.out.println("It goes to infinity");
				}
				else {
						if (insq >= 0) {
							double rootin = Math.sqrt(insq);
							double P1 = (- b + rootin) / (2 * a);
							double P2 = (- b - rootin) / (2 * a);
							System.out.println (P1 + " " + P2);
							
						}
						else {
							System.out.println("Error in number");
						}
					}
				
		}	
	}
}
 
