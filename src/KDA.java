
public class KDA {

	private int kills;
	private int deaths;
	private int assists;
	
	public KDA()
	{
		kills=0;
		deaths=0;
		assists=0;
	}
	
	public void addKill()
	{
		kills++;
	}
	
	public void addDeath()
	{
		deaths++;
	}
	
	public void addAssist()
	{
		assists++;
	}
	
	public int getKills()
	{
		return kills;
	}
	
	public int getDeaths()
	{
		return deaths;
	}
	
	public int getAssists()
	{
		return assists;
	}
	
}
