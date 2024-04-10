package ma.xproce.inventoryservice;

import ma.xproce.inventoryservice.Dao.entities.Creator;
import ma.xproce.inventoryservice.Dao.entities.Vedio;
import ma.xproce.inventoryservice.Dao.repsoitories.VedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication  implements CommandLineRunner {
    @Autowired
    private VedioRepository vedioRepository;
    public static void main(String[] args) {

        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        Vedio vedio = new Vedio();
        vedio.setName("Anonyme");
        vedio.setDescription("Drama");
        vedio.setUrl("www.vedio.com");
        vedio.setDatePublication(new Date());
        vedioRepository.saveAll(List.of(vedio));

    }
}
