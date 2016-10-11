import java.util.*;

public class Rockola {
	private Playlist coleccion;
	private Vector<ElementoAudio> playlists;
	
	public Rockola () {
		coleccion = new Playlist("Coleccion");
		playlists = new Vector<ElementoAudio>();
	}
	
	public void addAColeccion (ElementoAudio track) {
		coleccion.agregarAPlaylist(track);
	}
	
	public void crearPlayList (ElementoAudio lista) {
		playlists.add(lista);
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
	public void imprimirColeccion () {
		System.out.println(coleccion.toString());
	}
	
	public void imprimirPlaylist (ElementoAudio e) {
		System.out.println(e.toString());
	}
	
	public void imprimirCantidadPistas (ElementoAudio lista) {
		if (playlists.contains(lista))
		System.out.println("La Playlist "+lista.getTitulo()+" tiene "+lista.cantPistas()+" canciones");
		else 
		System.out.println("La Playlist no se encuentra en la biblioteca");
	}
}
