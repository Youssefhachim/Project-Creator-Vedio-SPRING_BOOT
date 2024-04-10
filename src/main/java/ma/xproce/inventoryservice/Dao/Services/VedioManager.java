package ma.xproce.inventoryservice.Dao.Services;

import ma.xproce.inventoryservice.Dao.entities.Vedio;

import java.util.List;

public interface VedioManager {

    public Vedio addVedio(Vedio vedio);
    public boolean deleteVedio(Vedio vedio);
    public boolean deleteVediobyId(Integer id);
    public Vedio updateCreator(Vedio vedio);
    public List<Vedio> getAllVedio();
    public Vedio getVedioById(Integer id);
}
