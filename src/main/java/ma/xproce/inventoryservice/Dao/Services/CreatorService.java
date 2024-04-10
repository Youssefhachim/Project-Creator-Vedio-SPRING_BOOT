package ma.xproce.inventoryservice.Dao.Services;

import ma.xproce.inventoryservice.Dao.entities.Creator;
import ma.xproce.inventoryservice.Dao.repsoitories.CreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CreatorService implements CreatorManager{
    @Autowired
    private CreatorRepository creatorRepository;
    @Override
    public Creator addCreator(Creator creator) {
        try {
            return creatorRepository.save(creator);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            return null;
        }
    }

    @Override
    public boolean deleteCreator(Creator creator) {
        return false;
    }

    @Override
    public boolean deleteCreatorbyId(Integer id) {
        return false;
    }

    @Override
    public Creator updateCreator(Creator creator) {
        return null;
    }

    @Override
    public List<Creator> getAllCreator() {
        return creatorRepository.findAll();
    }

    @Override
    public Creator getCreatorById(Long id) {
        return creatorRepository.findById(id).get();
    }
}
