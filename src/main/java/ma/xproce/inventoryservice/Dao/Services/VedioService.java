package ma.xproce.inventoryservice.Dao.Services;

import ma.xproce.inventoryservice.Dao.entities.Vedio;
import ma.xproce.inventoryservice.Dao.repsoitories.VedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VedioService implements VedioManager{
    @Autowired
    private VedioRepository vedioRepository;
    @Override
    public Vedio addVedio(Vedio vedio) {
        try {
            return vedioRepository.save(vedio);
        }catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }

    @Override
    public boolean deleteVedio(Vedio vedio) {
        return false;
    }

    @Override
    public boolean deleteVediobyId(Integer id) {
        return false;
    }

    @Override
    public Vedio updateCreator(Vedio vedio) {
        return null;
    }

    @Override
    public List<Vedio> getAllVedio() {
        return vedioRepository.findAll();
    }

    @Override
    public Vedio getVedioById(Integer id) {
        return null;
    }
}
