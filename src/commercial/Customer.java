package commercial;

public class Customer {
	private String name ;
	private int reliancJioShares;
	private int tataSteelShares;
	private int arvindTextileShares;
	
	public Customer() {
		
	}
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%-15s %-20d %-20d %-20d\n", name, reliancJioShares, tataSteelShares, arvindTextileShares));
		
		return sb.toString();
	}
	public Customer(String name)
	{
		this.name =name;
	}
		// for name 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getReliancJioShares() {
		return reliancJioShares;
	}
	public void setReliancJioShares(int reliancJioShares) {
		this.reliancJioShares = reliancJioShares;
	}
	public int getTataSteelShares() {
		return tataSteelShares;
	}
	public void setTataSteelShares(int tataSteelShares) {
		this.tataSteelShares = tataSteelShares;
	}
	public int getArvindTextileShares() {
		return arvindTextileShares;
	}
	public void setArvindTextileShares(int arvindTextileShares) {
		this.arvindTextileShares = arvindTextileShares;
	}
}
