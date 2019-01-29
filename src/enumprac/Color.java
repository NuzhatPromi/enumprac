package enumprac;

public enum Color {
	RED, 
	GREEN, 
	BLUE,
	BLACK,
	WHITE;
	
	private Color() 
    { 
        System.out.println("Constructor called for : " + 
        this.toString()); 
    } 
  
    // Only concrete (not abstract) methods allowed 
    public void colorInfo() 
    { 
        System.out.println("Universal Color"); 
    } 
}