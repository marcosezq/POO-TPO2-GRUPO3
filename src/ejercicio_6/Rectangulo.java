package ejercicio_6;

public class Rectangulo extends figura {

	private int ancho;
	private int largo;
	
	public Rectangulo(int ancho, int largo) {
		super();
		this.ancho = ancho;
		this.largo = largo;
	}
	
	@Override
	public void calculararea() {
		double area=ancho*largo;
		System.out.println("Area del rectangulo:"+area);
	}
	@Override
	public void mostrarDescripcion(){
		System.out.println("Soy un rectangulo");
	}
}
