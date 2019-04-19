
public class Territory {
	private int territoryNumber;
	private String territoryName;
	public Territory(int territoryNumber, String territoryName)
	{
		this.territoryNumber=territoryNumber;
		this.territoryName=territoryName;
	}
	
	//returns the assigned number of a territory
	public int getTerritoryNumber()
	{
		return territoryNumber;
	}
	
	//returns the assigned name of a territory
	public String getTerritoryName()
	{
		return territoryName;
	}
	
	//sets a number for a territory
	public void setTerritoryNumber(int number)
	{
		this.territoryNumber=number;
	}
	
	//sets a name for a territory
	public void setTerritoryName(String name)
	{
		this.territoryName=name;
	}
}
