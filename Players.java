package TTT;

public class Players {
    
	String name;
	char symbol;
	
	public Players(String name, char symbol) {
		super();
		this.name = name;
		this.symbol = symbol;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSymbol() {
		return symbol;
	}
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	
	
}
