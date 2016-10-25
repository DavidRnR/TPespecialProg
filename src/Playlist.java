import java.util.*;

public class Playlist extends ElementoAudio {
	private Vector<ElementoAudio> pistas;

	public Playlist (String _nombre) {
		titulo = _nombre;
		pistas = new Vector<ElementoAudio>();
	}


	public void agregarAPlaylist(ElementoAudio p1) {
		pistas.add(p1);
	}

	public void removePista(ElementoAudio track) {
		pistas.remove(track);
	}

	public void moverPista (ElementoAudio p1, int pos) {
		int posp1 = getPos(p1);
		pistas.remove(posp1);
		pistas.add(pos, p1);
	}

	private int getPos (ElementoAudio p1) {
		for (int i = 0; i<pistas.size(); i++) {
			if (pistas.elementAt(i).equals(p1))
				return i;
		}
	
		return -1;
	}
	
	@Override
	public int getDuracion() {
		int segundos=0;

		for(int i=0;i<pistas.size();i++) {
			segundos += pistas.elementAt(i).getDuracion();
		}
		return segundos;
	}
	
	@Override
	public int cantPistas () {
		int cant=0;
		for(int i=0;i<pistas.size();i++) {
			cant+= pistas.elementAt(i).cantPistas();		
		}
		return cant;
	}
	
	@Override
	public Vector<ElementoAudio> buscar (Condicion cond) {
		Vector<ElementoAudio> resultado = new Vector<ElementoAudio>();
		
		for (int i = 0; i < pistas.size(); i++) {
			ElementoAudio elm = pistas.elementAt(i);
			Vector<ElementoAudio> elmAux = elm.buscar(cond);
			resultado.addAll(elmAux);
		}
		return resultado;
	}

	public String toString () {
		String info="";
		for(int i=0;i<pistas.size();i++) {
			info += pistas.elementAt(i).toString();
		}
		return info;
	}

}
