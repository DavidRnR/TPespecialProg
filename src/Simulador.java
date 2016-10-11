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

		
		Rockola r = new Rockola();
		
		r.addAColeccion(elTiempoNoPara);
		r.addAColeccion(miCaramelo);
		r.addAColeccion(partyRockAnthem);
		r.addAColeccion(sorryForPartyRocking);
		r.addAColeccion(fixYou);
		r.addAColeccion(speedOfSound);
		r.addAColeccion(vivaLaVida);
		r.addAColeccion(withofWhitoutYou);
		r.addAColeccion(vertigo);
		r.addAColeccion(cityofBlindingLights);
		r.addAColeccion(alaLuzdelaLuna);
		r.addAColeccion(yoCanibal);
		
		ElementoAudio lista1 = new Playlist("Clasicos de rock");
		ElementoAudio lista2 = new Playlist("Lo mejor");
		ElementoAudio lista3 = new Playlist("Coldplay");
		ElementoAudio lista4 = new Playlist("El Indio");
		ElementoAudio lista5 = new Playlist("Variadito");
		ElementoAudio lista6 = new Playlist("Variadito2");
		
		r.crearPlayList(lista1);
		r.crearPlayList(lista2);
		r.crearPlayList(lista3);
		r.crearPlayList(lista4);
		r.crearPlayList(lista5);

		r.agregarAPlayList(lista1,elTiempoNoPara);
		r.agregarAPlayList(lista1,withofWhitoutYou);
		r.agregarAPlayList(lista1,vertigo);
		r.agregarAPlayList(lista1,cityofBlindingLights);
		r.agregarAPlayList(lista1,yoCanibal);
		
	    r.agregarAPlayList(lista2, partyRockAnthem);
	    r.agregarAPlayList(lista2, sorryForPartyRocking);
	    r.agregarAPlayList(lista2, vivaLaVida);
	    r.agregarAPlayList(lista2, yoCanibal);
	    
	    r.agregarAPlayList(lista3, fixYou);
	    r.agregarAPlayList(lista3, speedOfSound);
	    r.agregarAPlayList(lista3, vivaLaVida);
	    
	    r.agregarAPlayList(lista4, alaLuzdelaLuna);
	    r.agregarAPlayList(lista4, yoCanibal);
	    
	    r.agregarAPlayList(lista5, lista3);
	    r.agregarAPlayList(lista5, lista4);
		
		

		System.out.println("********************************************************************");
		
		Condicion c1 = new CondicionDuracion(300);
		Condicion c2 = new CondicionNombre("vertigo");
		Condicion c3 = new CondicionArtista("u2");
		Condicion c4 = new CondicionAnd(c1,c3);
		Condicion c5 = new CondicionGenero("rock alternativo");
		
		Vector<ElementoAudio> v1 = r.buscar(c5);
		
		for (int i = 0; i < v1.size(); i++) {
			System.out.println(v1.elementAt(i).toString());
		}
	}
}
