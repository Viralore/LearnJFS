package dao;

import java.util.List;

import model.Official;

public interface OfficialDAO 
{
	List<Official> getAllOfficials();

    Official getOfficialById(int officialId);

    boolean addOfficial(Official official);
    boolean updateOfficial(Official official);
    boolean deleteOfficial(int officialId);
    
    Official findOfficial(int id,String password);
}
