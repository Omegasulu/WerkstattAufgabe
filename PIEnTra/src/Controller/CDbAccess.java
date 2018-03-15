package Controller;

import Controller.SuperController;
import Modell.MProdukt;
import Modell.MKunde;
import Modell.MOrt;
import Modell.MTrainer;
import Modell.MKunde;
import Modell.MAdresse;

/** Erstellt von Nils Winkel, zuk�nftige Datenbank Implementierung! Hashmap Implementierung*/

public class CDbAccess {

	private static CDbAccess instance;
	
	private CDbAccess() {
		
	}


	/** Singelton Pattern */
    public static CDbAccess getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CDbAccess();
    	}
    	return instance;
    }
    
    
    /** Erstellung der Produkt-Objekte (Beispieldaten) */
    MProdukt produkt_GWW = new MProdukt(1, "Grundlagen Warenwirtschaft (K�rzel GWW)", "Systematisch werden Sie in die Funktionalit�t der Software eingewiesen. Sie lernen mit Kunden-, Lieferanten- und Artikelverwaltung zu arbeiten und erfahren, wie Sie das Programm nutzen. Sie sind Einsteiger in das Programm und haben bislang wenig Erfahrung mit der Anwendung des Programms gesammelt. Nun m�chten Sie den sicheren Umgang mit der Software erlernen. Zielgruppe: Einsteiger Voraussetzungen: Keine Inhalte: Verwalten von Stammdaten (Einrichtung und Pflege von Stammdaten, Verwalten von Warengruppen und Artikeldaten, Preispflege, Benutzer- und Rechteverwaltung, Arbeiten mit St�cklistenartikeln) Dauer: 2-5 Tage Teilnehmer: 6-10 Methoden: Vortrag, Vorf�hrung und praktische �bungen Anforderungen: MyERP Version 2.01 Server Edition, Beamer, MyERP Version 2.01, Windows Client", "1.0");
    MProdukt produkt_EWW = new MProdukt(2, "Erweiterte Grundlagen Warenwirtschaft (K�rzel GWW", "Systematisch werden Sie in die erweiterte Funktionalit�t der Software eingewiesen. Sie lernen mit den Funktionen der Auftragsbearbeitung zu arbeiten. Sie sind Anwender und haben Erfahrung mit dem Programm gesammelt. Zielgruppe: Anwender Voraussetzungen: GWW Inhalte: Auftragsbearbeitung (Erstellung von Angeboten, Lieferscheinen). Arbeiten mit/ohne Lagerhaltung, Inventur und Preispflege, Grundlagen des Mahnwesens und des Zahlungseingangs, Sammel-/Abschlagsrechnungen, Arbeiten mit der Projektverwaltung, Preis�nderungen und Kalkulation, Inventur/-auswertungen. Dauer: 2-5 Tage Teilnehmer: 6-10 Methoden: Vortrag, Vorf�hrung und praktische �bungen Anforderungen: MyERP Version 2.01 Server Edition, Beamer, MyERP Version 2.01, Windows Client", "2.0");
    MProdukt produkt_WWP = new MProdukt(3, "Produkt Warenwirtschaft Pro (K�rzel WWP)", "Systematisch werden Sie in die effiziente Anwendung der Software eingewiesen. Sie vertiefen Ihre Kenntnisse der Kunden-, Lieferanten- und Artikelverwaltung sowie die Auftragsbearbeitung. Sie liefern die Daten f�r eine professionelle Angebotserstellung. Sie erstellen Auswertungen und optimieren die Software f�r Ihr Unternehmen. Zielgruppe: Erfahrene Anwender Voraussetzungen: EWW Inhalte: Vertiefung der Inhalte aus GWW und EWW. Auswertungen (Aufbereitung der Daten f�r die Buchhaltung, Datentransfer, Druck von Listen und Berichten, Berichtszentrale konfigurieren). Dauer: 5-10 Tage Teilnehmer: 6-10 Methoden: Vortrag, Vorf�hrung und praktische �bungen Anforderungen: MyERP Version 2.01 Server Edition, Beamer, MyERP Version 2.01, Windows Client", "3.0");
    
    
    /** Erstellung der Ort-Objekte (Beispieldaten) WA=Wallau HO=Hofheim Nue=N�rnberg */
    //Wallau
    MOrt ort_WA01 = new MOrt(1, "Gesch�ftsstelle Wallau", "Geb�ude A", 1, "01");
    MOrt ort_WA02 = new MOrt(2, "Gesch�ftsstelle Wallau", "Geb�ude A", 1, "02");
    //Hofheim
    MOrt ort_HO01 = new MOrt(3, "Gesch�ftsstelle Hofheim", "Geb�ude K", 2, "01");
    MOrt ort_HO02 = new MOrt(4, "Gesch�ftsstelle Hofheim", "Geb�ude K", 2, "02");
    //N�rnberg
    MOrt ort_NUE01 = new MOrt(5, "Gesch�ftsstelle N�rnberg", "Geb�ude L", 1, "03");
    MOrt ort_NUE02 = new MOrt(6, "Gesch�ftsstelle N�rnberg", "Geb�ude L", 3, "01");
    
    
    /** Erstellung der Trainer-Objekte (Beispieldaten) */
    MTrainer trainer_LP = new MTrainer(1, "Lukas", "Poodolski", "Produkte GWW, EWW");
    MTrainer trainer_RK = new MTrainer(2, "Roland", "Kaiser", "Produkt GWW");
    MTrainer trainer_RS = new MTrainer(3, "Ralf", "Siehgel", "Produkte GWW, EWW, WWP");
    MTrainer trainer_KL = new MTrainer(4, "Karl", "Lager-Feld", "EWW") ;
    MTrainer trainer_HK = new MTrainer(5, "Heidi", "Kluhm", "Produkt WWP");
    MTrainer trainer_SI = new MTrainer(6, "Swanja", "Ikeah", "Produkt WWP");
    
    
    /** Erstellung der Adress-Objekte (Beispieldaten) */
    MAdresse adresse_Aeron = new MAdresse(1, "Rainer-Kausing-Stra�e 4", "Hessen", "Hochheim/Main", 65239);
    MAdresse adresse_Agosini = new MAdresse(2, "Kanzlereistra�e 17", "Baden-W�rttemberg", "Pforzheim", 75175);
    MAdresse adresse_Eton = new MAdresse(3, "Hardterring 8", "Baden-W�rttemberg", "Stockach", 78333);
    
    
    /** Erstellung der Kunden-Objekte (Beispieldaten) */
    MKunde kunde_Aeron = new MKunde(1, "Aeron Pumpen GmbH", "Heinrich Klaist", adresse_Aeron.getAdressID(), "+49 6146 6939", "Pharmaindustrie", adresse_Aeron.getBundesland(), "info@aeronpump-it.de");
    MKunde kunde_Agosini = new MKunde(2, "Agosini", "Maria Jung", adresse_Agosini.getAdressID(), "+49 7231 9611", "Edelmetallverarbeitung", adresse_Agosini.getBundesland(), "info@agosini.de");
    MKunde kunde_Eton = new MKunde(3, "ETONGRUPPE", "Dietmar Bohlen", adresse_Eton.getAdressID(), "+49 7771 8191", "Automobilzulieferer", adresse_Eton.getBundesland(), "info@etongruppe.com");
    
    
    
    
}