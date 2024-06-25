package service;

import java.util.List;

import dao.OfficialDAO;
import dao.OfficialDAOImpl;
import model.Official;

public class OfficialServiceImpl implements OfficialService 
{
	OfficialDAO officialDAO = new OfficialDAOImpl();

	@Override
	public List<Official> getAllOfficials() 
	{
		return officialDAO.getAllOfficials();
	}

	@Override
	public Official getOfficialById(int officialId) 
	{
		return officialDAO.getOfficialById(officialId);
	}

	@Override
	public boolean addOfficial(Official official) 
	{
		return officialDAO.addOfficial(official);
	}

	@Override
	public boolean updateOfficial(Official official) 
	{
		return officialDAO.updateOfficial(official);
	}

	@Override
	public boolean deleteOfficial(int officialId) 
	{
		return officialDAO.deleteOfficial(officialId);
	}

	@Override
	public Official findOfficial(int id, String password) 
	{
		return officialDAO.findOfficial(id, password);
	}
	
	

}
