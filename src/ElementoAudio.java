import java.util.Vector;

public abstract class ElementoAudio {
	String titulo;
	int duracion;

	public String getTitulo () {
		return titulo;
	}
	
	public abstract int cantPistas ();
	public abstract int getDuracion();
	public abstract Vector<ElementoAudio> buscar (Condicion cond);


}