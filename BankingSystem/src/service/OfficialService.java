package service;

import model.Official;
import java.util.List;

public interface OfficialService 
{
	List<Official> getAllOfficials();

    Official getOfficialById(int officialId);

    boolean addOfficial(Official official);
    boolean updateOfficial(Official official);
    boolean deleteOfficial(int officialId);
    
    Official findOfficial(int id,String password);

}
