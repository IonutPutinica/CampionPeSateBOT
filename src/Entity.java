
public class Entity {
	private String nameOfEntity;
	private int numberOfControlledTerritories=1;
	public Entity(String nameOfEntity, int numberOfControlledTerritories)
	{
		this.nameOfEntity=nameOfEntity;
		this.numberOfControlledTerritories=numberOfControlledTerritories;
	}
	
	//returns the name of the entity
	public String getNameOfEntity()
	{
		return nameOfEntity;
	}
	
	//returns the number of controlled territories of an entity
	public int getNumberOfControlledTerritories()
	{
		return numberOfControlledTerritories;
	}
	
	//allows to change the name of the entity
	public void setNameOfEntity(String name)
	{
		this.nameOfEntity=name;
	}
	
	public void setNumberOfControllerTerritories(int number)
	{
		this.numberOfControlledTerritories=numberOfControlledTerritories=number;
	}
	
	
}
