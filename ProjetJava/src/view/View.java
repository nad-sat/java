package view;


	import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import controller.Controller;
import model.JoueurCarte;

	public class View extends JFrame implements Observer {

		private JoueurCarte model;
		protected Controller controller;

		public View(JoueurCarte model, Controller controller) {

			this.model = model;
			this.controller = controller;
			model.addObserver(this);
		}

		/**
		 * @return the model
		 */
		public JoueurCarte getModel() {
			return model;
		}

		/**
		 * @param model the model to set
		 */
		public void setModel(JoueurCarte model) {
			this.model = model;
		}

		/**
		 * @return the controller
		 */
		public Controller getController() {
			return controller;
		}

		/**
		 * @param controller the controller to set
		 */
		public void setController(Controller controller) {
			this.controller = controller;
		}

		@Override
		public void update(Observable o, Object arg) {
			// TODO Auto-generated method stub
			
		}


}
