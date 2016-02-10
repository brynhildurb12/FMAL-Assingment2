package Assignment2;

public class Token {
	String lexeme;
	TokenCode tCode;
	
	enum TokenCode { 
		ID(""), 
		ASSIGN("="), 
		SEMICOL(";"), 
		INT(""), 
		PLUS("+"), 
		MINUS("-"),
		MULT("*"), 
		LPAREN("{"), 
		RPAREN("}"), 
		PRINT("print"), 
		END("end"), 
		ERROR("ERROR") 
		
	}

}
