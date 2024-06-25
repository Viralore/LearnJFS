package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Official;

public class OfficialDAOImpl implements OfficialDAO 
{
	
	private static Map<Integer,Official> map = new HashMap<>();
	
	static
	{
		map.put(1123,new Official("Aman","pass","Manager"));
	}

	@Override
	public List<Official> getAllOfficials() 
	{
		return new ArrayList<>(map.values());
	}

	@Override
	public Official getOfficialById(int officialId) 
	{
		return map.get(officialId);
	}

	@Override
	public boolean addOfficial(Official official) 
	{
		int officialId = official.getOfficialID();
		
		if(map.containsKey(officialId)) return false;
		else
		{
			map.put(officialId, official);
			return true;
		}
	}

	@Override
	public boolean updateOfficial(Official official) 
	{
		int officialId = official.getOfficialID();
		
		if(map.containsKey(officialId))
		{
			map.put(officialId,official);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteOfficial(int officialId) 
	{
		if(map.containsKey(officialId))
		{
			map.remove(officialId);
			return true;
		}
		return false;
	}

	@Override
	public Official findOfficial(int id, String password) 
	{
		for(Official official : map.values())
		{
			if(official.getOfficialID() == id && official.getPassword().equals(password)) return official;
		}
		return null;
	}
	
	
	
}
