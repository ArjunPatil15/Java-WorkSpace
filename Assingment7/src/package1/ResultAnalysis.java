package package1;

public class ResultAnalysis {
	public static void main(String[] args) {
		int[][]marks= {
				{88,78,85,67,53},
				{76,35,78,77,98},
				{93,89,69,99,81}
		};

		System.out.println("Total marks of each student :");
		int total;
		for(int r=0;r<3;r++) {		
			System.out.print("\nStudent " + (r+1) + " :");
			total=0;
			for(int c=0;c<5;c++) {
				total = total + marks[r][c];
			}
			System.out.println(total);
		}

		System.out.println("\nAvg of each sub is :");
		for(int c=0;c<5;c++) {		
			System.out.print("\nSubject " + (c+1) + " :");
			total=0;
			for(int r=0;r<3;r++) {
				total = total + marks[r][c];
			}
			System.out.println(total/3);
		}
	}
}
