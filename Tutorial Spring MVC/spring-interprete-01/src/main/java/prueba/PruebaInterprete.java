package prueba;

import beans.InterpreteEspanol;
import beans.Traductor;

public class PruebaInterprete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traductor traductor = new Traductor();
		InterpreteEspanol interprete = new InterpreteEspanol();
		// El Interprete se inyecta manualmente
		// Y solamente puede recibir un interprete en Español
		// NO un Interprete en Inglés u otros idiomas
		
		traductor.setInterpreteEspanol(interprete);
		traductor.setNombre("Luis Carrasco");
		traductor.hablar();
	}

}
