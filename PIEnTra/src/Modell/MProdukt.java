package Modell;

/**
 * 
 */
public class MProdukt 
{
	private int produktID;
    private String bezeichnung;
    private String beschreibung;
    private String version;

    /**
     * Default constructor
     */
    public MProdukt() {
    }

	public int getProduktID() {
		return produktID;
	}

	public void setProduktID(int produktID) {
		this.produktID = produktID;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}