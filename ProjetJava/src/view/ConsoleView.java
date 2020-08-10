package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.Controller;
import model.Joueur;

public class ConsoleView extends View {
	private Scanner scanner;

	public ConsoleView(Joueur model, Controller controller) {
		super(model, controller);
		scanner = new Scanner(System.in);
		new Thread(new ReadInput()).start();
	}
	
	public class ReadInput implements Runnable {

		@Override
		public void run() {
			while(true) {
				try {
					String c=scanner.next();
					// selection de carte 
					switch(c){
						case "select":
							int carte = scanner.nextInt();
							controller.commandSelection(carte);
					}
				}
				catch(InputMismatchException e) {
					
				}
			}
			
		}
		

	}
}

