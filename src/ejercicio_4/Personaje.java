package ejercicio_4;
import java.util.Random;

// Clase Personaje
class Personaje {
	private String nombre;
	private int vidas;
	private SuperPoder poder;
	private EscudoProtector escudo;
	
	public Personaje(String nombre, int vidas, SuperPoder poder, EscudoProtector escudo) {
		this.nombre = nombre;
		this.vidas = vidas;
		this.poder = poder;
		this.escudo = escudo;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int getVidas() {
		return vidas;
	}
	
	public EscudoProtector getEscudo() {
		return escudo;
	}
	
	public void recibirAtaque(int danio) {
		int danioReducido = danio - (danio * escudo.getPorcentajeDefensa() / 100);
		vidas = vidas - danioReducido;
		if (vidas < 0) vidas = 0;
        System.out.println(nombre + " recibe " + danioReducido + " de danio. Vidas restantes: " + vidas);
	}
	
	public int atacar() {
		return poder.getNivelDanio();
	}
	
	public boolean estaVivo() {
		return vidas > 0;
	}
	
	public static SuperPoder obtenerPoderAleatorio() {
		SuperPoder[] poderes = SuperPoder.values();
		return poderes[new Random().nextInt(poderes.length)];
	}
	
	public static EscudoProtector obtenerEscudoAleatorio() {
		EscudoProtector[] escudos = EscudoProtector.values();
		return escudos[new Random().nextInt(escudos.length)];
	}
}
