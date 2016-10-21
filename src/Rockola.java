import java.util.*;

public class Rockola {
	private ElementoAudio coleccion;  
	
	public Rockola () {
		coleccion = new Playlist("Colección");
	}
	
	public void agregarAColeccion (ElementoAudio elm) {
		((Playlist)coleccion).agregarAPlaylist(elm);
	}
	
	public void agregarAPlayList (ElementoAudio lista,ElementoAudio track) {
		((Playlist)lista).agregarAPlaylist(track);
	}
	
	public void moverPista (ElementoAudio lista, ElementoAudio track, int pos) {
		((Playlist)lista).moverPista(track, pos);
	}
	//**************************************Buscar**********************************************
	public Vector<ElementoAudio> buscar (Condicion cond) {
		return coleccion.buscar(cond);
	}
	//**************************************Imprimir**********************************************
	public String imprimirColeccion () {
		return coleccion.toString();
	}
	
	public String imprimirCantidadPistasColeccion () {
		return imprimirCantidadPistas(coleccion);
	}
	
	public String imprimirElemento(ElementoAudio elm) {
		return elm.toString();
	}
	
	public String imprimirCantidadPistas (ElementoAudio lista) {
		return ("La Playlist "+lista.getTitulo()+" tiene "+lista.cantPistas()+" pistas");
	}
	
	public int getDuracion (ElementoAudio elm) {
		return elm.getDuracion();
	}
}
