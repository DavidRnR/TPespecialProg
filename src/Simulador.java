import java.util.*;

public class Simulador {
	public static void main(String[] args) {

		ElementoAudio elTiempoNoPara = new PistaAudio(1,"El Tiempo no Para",311,"Bersuit Vergarabat","De la cabeza",2002,"Rock Nacional");
		ElementoAudio miCaramelo = new PistaAudio(2,"Mi caramelo",290,"Bersuit Vegarabat","De la cabeza",2002,"Rock Nacional");
		ElementoAudio partyRockAnthem = new PistaAudio(3,"Party Rock Anthem",408,"LMFO","Sorry for Party Rocking",2011,"Electro Pop");
		ElementoAudio sorryForPartyRocking = new PistaAudio(4,"Sorry for Party Rocking",421,"LMFO","Sorry for Party Rocking",2011,"Electro Pop");
		ElementoAudio fixYou = new PistaAudio(5,"Fix You",255,"Coldplay","X&Y",2005,"Rock alternativo");
		ElementoAudio speedOfSound = new PistaAudio(6,"Speed of Sound",455,"Coldplay","X&Y",2005,"Rock alternativo");
		ElementoAudio vivaLaVida = new PistaAudio(7,"Viva la Vida",320,"Coldplay","Viva la vida",2008,"Rock alternativo");
		ElementoAudio withofWhitoutYou = new PistaAudio(8,"With of whitout you",360,"U2","The Joshua Tree",1987,"Rock");
		ElementoAudio vertigo = new PistaAudio(9,"Vertigo",355,"U2","How to Dismantle an Atomic Bomb",2004,"Rock");
		ElementoAudio cityofBlindingLights = new PistaAudio(10,"City of Blinding Lights",284,"U2","How to Dismantle an Atomic Bomb",2004,"Rock");
		ElementoAudio alaLuzdelaLuna = new PistaAudio(11,"A la luz de la luna",438,"El Indio Solari","Pajaritos, bravos muchachitos",2013,"Rock Nacional");
		ElementoAudio yoCanibal = new PistaAudio(12,"Yo canibal",258,"Patricio Rey y sus redonditos de ricota","Lobo suelto, cordero atado",1993,"Rock Nacional");
		ElementoAudio paradise = new PistaAudio(13,"Paradise",365,"Coldplay","X&Y",2011,"Rock alternativo");
		
		ElementoAudio rockola = new Playlist("Rockola");
		
		((Playlist) rockola).agregarAPlaylist(elTiempoNoPara);
		((Playlist) rockola).agregarAPlaylist(miCaramelo);
		((Playlist) rockola).agregarAPlaylist(partyRockAnthem);
		((Playlist) rockola).agregarAPlaylist(sorryForPartyRocking);
		((Playlist) rockola).agregarAPlaylist(fixYou);
		((Playlist) rockola).agregarAPlaylist(speedOfSound);
		((Playlist) rockola).agregarAPlaylist(vivaLaVida);
		((Playlist) rockola).agregarAPlaylist(withofWhitoutYou);
		((Playlist) rockola).agregarAPlaylist(vertigo);
		((Playlist) rockola).agregarAPlaylist(cityofBlindingLights);
		((Playlist) rockola).agregarAPlaylist(alaLuzdelaLuna);
		((Playlist) rockola).agregarAPlaylist(yoCanibal);
		
		ElementoAudio lista1 = new Playlist("Clasicos de rock");
		ElementoAudio lista2 = new Playlist("Lo mejor");
		ElementoAudio lista3 = new Playlist("Coldplay");
		ElementoAudio lista4 = new Playlist("El Indio");
		//ElementoAudio lista5 = new Playlist("Variadito");
		//ElementoAudio lista6 = new Playlist("Variadito2");
		
		((Playlist) rockola).agregarAPlaylist(lista1);
		((Playlist) rockola).agregarAPlaylist(lista2);
		((Playlist) rockola).agregarAPlaylist(lista3);
		((Playlist) rockola).agregarAPlaylist(lista4);
		

		((Playlist) lista1).agregarAPlaylist(elTiempoNoPara);
		((Playlist) lista1).agregarAPlaylist(withofWhitoutYou);
		((Playlist) lista1).agregarAPlaylist(vertigo);
		((Playlist) lista1).agregarAPlaylist(cityofBlindingLights);
		((Playlist) lista1).agregarAPlaylist(yoCanibal);
		
		((Playlist) lista2).agregarAPlaylist(partyRockAnthem);
		((Playlist) lista2).agregarAPlaylist(sorryForPartyRocking);
		((Playlist) lista2).agregarAPlaylist(vivaLaVida);
		((Playlist) lista2).agregarAPlaylist(yoCanibal);
	    
		((Playlist) lista3).agregarAPlaylist(fixYou);
	    ((Playlist) lista3).agregarAPlaylist(speedOfSound);
	    ((Playlist) lista3).agregarAPlaylist(vivaLaVida);
	    
	    ((Playlist) lista4).agregarAPlaylist(alaLuzdelaLuna);
	    ((Playlist) lista4).agregarAPlaylist(yoCanibal);
	    
		
		Condicion c1 = new CondicionDuracion(400);
		Condicion c2 = new CondicionNombre("verti");
		Condicion c3 = new CondicionArtista("colplay");
		Condicion c4 = new CondicionGenero("rock");
		Condicion cFechaMayor = new CondicionMayorYear(2006);
		Condicion c6 = new CondicionNot(c3);
		Condicion c5 = new CondicionAnd(c4,cFechaMayor);
		Condicion c7 = new CondicionAnd(c4,c3);
		Condicion c10 = new CondicionOr(c5,c7);
		
		
		Vector<ElementoAudio> v1 = rockola.buscar(c10);
		
		for (int i = 0; i < v1.size(); i++) {
			System.out.println(v1.elementAt(i).toString());
		}
		System.out.println("********************************************************************");
		//System.out.println(rockola.toString());
		System.out.println("********************************************************************");
	//	System.out.println(rockola.cantPistas());
				System.out.println("********************************************************************");
		//System.out.println("Duración "+rockola.getDuracion()+"seg");
		((Playlist) rockola).agregarAPlaylist(paradise);
		
		
	}
}
