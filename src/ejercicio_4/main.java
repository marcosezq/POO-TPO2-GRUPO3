package ejercicio_4;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		
		// Creo personajes. Poder y escudo al azar
		Personaje personaje1 = new Personaje("El personaje 1", 100, Personaje.obtenerPoderAleatorio(), Personaje.obtenerEscudoAleatorio());
		Personaje personaje2 = new Personaje("El personaje 2", 100, Personaje.obtenerPoderAleatorio(), Personaje.obtenerEscudoAleatorio());

		System.out.println(personaje1.getNombre() + " tiene el poder " + personaje1.atacar()+ " y escudo " + personaje1.getEscudo());
		System.out.println(personaje2.getNombre() + " tiene el poder " + personaje2.atacar()+ " y escudo " + personaje2.getEscudo());
		
		// Pelea
		int round = 1;
		while (round <= 5 && personaje1.estaVivo() && personaje2.estaVivo()) {
			System.out.println("\n Round: "+ round);
			personaje2.recibirAtaque(personaje1.atacar());
			if (!personaje2.estaVivo()) break;
			personaje1.recibirAtaque(personaje2.atacar());
			if (!personaje2.estaVivo()) break;
			round++;
		}
		
		// Quién gana?
		System.out.println("\n Resultado de la pelea: ");
		if (personaje1.getVidas() > personaje2.getVidas()) {
			System.out.println("El ganador de la batalla fue: "+ personaje1.getNombre());			
		} else if (personaje2.getVidas() > personaje1.getVidas()) {
			System.out.println("El ganador de la batalla fue: "+ personaje2.getNombre());		
		} else {
			System.out.println("El resultado final fue un empate.");
		}
	}
}
