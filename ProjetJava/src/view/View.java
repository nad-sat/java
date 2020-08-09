package view;


	import java.util.Observable;
	import java.util.Observer;

	import javax.swing.JFrame;

	import controller.Controller;
	import model.Joueur;

	public class View extends JFrame implements Observer {

		private Joueur model;
		protected Controller controller;

		public View(Joueur model, Controller controller) {

			this.model = model;
			this.controller = controller;
			model.addObserver(this);
		}

		/**
		 * @return the model
		 */
		public Joueur getModel() {
			return model;
		}

		/**
		 * @param model the model to set
		 */
		public void setModel(Joueur model) {
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
