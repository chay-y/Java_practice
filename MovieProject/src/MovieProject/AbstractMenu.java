package MovieProject;

import java.util.Scanner;

public abstract class AbstractMenu implements Menu {

	protected String menuText;
	protected Menu prevMenu;
	
	protected static final Scanner scan = new Scanner(System.in);
	 
	public AbstractMenu(String menuText, Menu prevMenu) {
		this.menuText=menuText;
		this.prevMenu=prevMenu;
	}
	
	public void print() {
		System.out.println("\n"+menuText);
	}
	
	public void setPrevMenu() {
		this.prevMenu=prevMenu;
	}
}
