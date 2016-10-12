import java.util.Vector;

public class PistaAudio extends ElementoAudio {
	private String artista , album, genero, comentario;
	private int ID,year; 

	public PistaAudio (int _id,String _titulo,int _duracion,String _artista, String _album, int _year, String _gen) {
		ID = _id;
		titulo = _titulo;
		duracion = _duracion;
		artista = _artista;
		album = _album;
		year = _year;
		genero = _gen;
		comentario = "";
	}
	//***************SET atributos**********************
	public void setID (int _id) {
		ID = _id;
	}			

	public void setDuracion (int _dur) {
		duracion = _dur;
	}

	public void setYear (int _year) {
		year = _year;
	}

	public void setTitulo (String _titulo) {
		titulo = _titulo;
	}

	public void setArtista (String _artista) {
		artista = _artista;
	}

	public void setAlbum (String _album) {
		album = _album;
	}

	public void setGenero (String _genero) {
		genero = _genero;
	}

	public void setComentario (String _coment) {
		comentario = _coment;
	}
	//***************GET atributos**********************
	public int getID () {
		return ID;
	}

	public int getDuracion () {
		return duracion;
	}

	public int getYear () {
		return year;
	}

	public String getArtista() {
		return artista;
	}
	public String getAlbum() {
		return album;
	}
	public String getGenero() {
		return genero;
	}
	public String getComentario() {
		return comentario;
	}

	//*******************************************

	public int cantPistas () {
		return 1;
	}

	public Vector<ElementoAudio> buscar (Condicion cond) {
		Vector<ElementoAudio> resultado = new Vector<ElementoAudio>();

		if(cond.cumple(this)) 
			resultado.add(this);

		return resultado;
	}

	public String toString () {
		return ("\nID: "+ID+"\nTitulo: "+titulo+"\nDuración: "+duracion+"seg"+"\nArtista: "+artista+"\nAlbum: "+album+"\nAño: "+year+"\nGénero: "+genero+"\nComentario: "+comentario+"\n");
	}
}
