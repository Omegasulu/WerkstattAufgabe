package Modell;

/**
 * 
 */
public class MManagaementAssistent
{
    private int mitarbeiterID;
    private String name;
    private String vorname;

    
    /**
     * Default constructor
     */
    public MManagaementAssistent() 
    {
    	
    }


	public int getMitarbeiterID() {
		return mitarbeiterID;
	}


	public void setMitarbeiterID(int mitarbeiterID) {
		this.mitarbeiterID = mitarbeiterID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getVorname() {
		return vorname;
	}


	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
}