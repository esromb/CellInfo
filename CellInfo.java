
public class CellInfo {

	
	public static void main(String[] args) {
		System.out.println(cellInfo(2));
	}
	
	public static String cellInfo(int n) {
//	      		A          B      C ……….              Z.    AA     AB            AZ     BA                         zz
//	      1     1          2      3                   26    27     28            52     53       			      702
//	      2    703                                   728    729                          			             1404 
		int row = n/703;
		boolean leftside = n <= (row * 702) + 26;
		StringBuilder builder = new StringBuilder();
		if (leftside) {
			builder.append((char) ((int) 'A' +  n-1 -(row * 702)));
		} else {
			n = n - (row * 702);
			
			if ((n - 26) % 26 != 0) {
				builder.append((char) ((int) 'A' +  (n-26)/26));
				n = (n - 26) % 26;
				builder.append((char) ((int) 'A' +  n -1));
			} else {
				builder.append((char) ((int) 'A' +  (n-26)/26 - 1));
				n =  (n-26)/ 26;
				builder.append((char) ((int) 'A' +  n -1));
			}

		}
		return String.valueOf(row +1) + builder.toString();
	}
}
