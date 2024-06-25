package model;

public class Official 
{
    private String name;
    private String password;
    private String role;
    private int officialID;

    public Official(String name, String password, String role) 
    {
        this.name = name;
        this.password = password;
        this.role = role;
    }
    
    public Official(String name, String password) 
    {
        this.name = name;
        this.password = password;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getRole() 
    {
        return role;
    }

    public void setRole(String role) 
    {
        this.role = role;
    }
    
    
    public void setOfficialID(int officialID) 
    {
		this.officialID = officialID;
	}

	public int getOfficialID() 
    {
		return officialID;
	}

	@Override
    public String toString() 
    {
        return "Official{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", officialID=" + officialID +
                '}';
    }

}
