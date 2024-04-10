package ma.xproce.inventoryservice.Dao.Services;

import ma.xproce.inventoryservice.Dao.entities.Creator;

import java.util.List;

public interface CreatorManager {
    public Creator addCreator(Creator creator);
    public boolean deleteCreator(Creator creator);
    public boolean deleteCreatorbyId(Integer id);
    public Creator updateCreator(Creator creator);
    public List<Creator> getAllCreator();

    Creator getCreatorById(Long id);
}
