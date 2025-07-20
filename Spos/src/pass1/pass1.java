package pass1;

public class pass1 {
	    public static void main(String args[]) {
	        int c = 0;
	        String[][] symbolTable = {
	            {" ", "START", "101", " "}, 
	            {" ", "MOVER", "BREG", " "}, 
	            {"AGAIN", "MULT", "BREG", "TERM"}, 
	            {" ", "MOVER", "CREG", "TERM"}, 
	            {" ", "ADD", "CREG", "N"}, 
	            {" ", "MOVEM", "CREG", "TERM"}, 
	            {"N", "DS", "2", " "}, 
	            {"RESULT", "DS", "2", " "}, 
	            {"ONE", "DC", "1", " "}, 
	            {"TERM", "DC", "1", " "}, 
	            {" ", "END", " ", " "}
	        };

	        System.out.println("\n\t********SYMBOL TABLE********");
	        System.out.println("\t____________________________");

	        // Print symbol table
	        for (int i = 0; i < symbolTable.length; i++) {
	            for (int j = 0; j < symbolTable[i].length; j++) {
	                System.out.print("\t" + symbolTable[i][j]);
	            }
	            System.out.print("\n");
	        }
	        System.out.print("\n\n");

	        // Count non-empty symbol entries
	        for (int k = 0; k < symbolTable.length; k++) {
	            if (!symbolTable[k][0].equals(" ")) { // Corrected string comparison
	                c += 1;
	            }
	        }
	        System.out.println("Number of symbols: " + c);
	    }
	}



