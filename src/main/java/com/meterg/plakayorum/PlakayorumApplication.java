package com.meterg.plakayorum;

import com.meterg.plakayorum.entity.Plaka;
import com.meterg.plakayorum.entity.Yorum;
import com.meterg.plakayorum.service.PlakaService;
import com.meterg.plakayorum.service.YorumService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PlakayorumApplication {

    private PlakaService plakaService;
    private YorumService yorumService;

    PlakayorumApplication(PlakaService plakaService, YorumService yorumService) {
        this.plakaService = plakaService;
        this.yorumService = yorumService;
    }

    public static void main(String[] args) {
        SpringApplication.run(PlakayorumApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return (args) -> {
            insertDummyData();
        };
    }

    private void insertDummyData() {
        Plaka plaka = new Plaka();
        plaka.setNo("06XX0001");
        plakaService.save(plaka);

        plaka = new Plaka();
        plaka.setNo("34XY0001");
        plakaService.save(plaka);

        Yorum yorum = new Yorum();
        yorum.setPlakaId(1L);
        yorum.setDurum((short) 1);
        yorum.setIcerik("Yorum 1. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        yorumService.save(yorum);

        yorum = new Yorum();
        yorum.setPlakaId(1L);
        yorum.setDurum((short) 1);
        yorum.setIcerik("Yorum 2. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        yorumService.save(yorum);

        yorum = new Yorum();
        yorum.setPlakaId(1L);
        yorum.setDurum((short) 1);
        yorum.setIcerik("Yorum 3. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        yorumService.save(yorum);

        yorum = new Yorum();
        yorum.setPlakaId(1L);
        yorum.setDurum((short) 1);
        yorum.setIcerik("Yorum 4. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        yorumService.save(yorum);

        yorum = new Yorum();
        yorum.setPlakaId(1L);
        yorum.setDurum((short) 1);
        yorum.setIcerik("Yorum 5. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        yorumService.save(yorum);

        yorum = new Yorum();
        yorum.setPlakaId(1L);
        yorum.setDurum((short) 1);
        yorum.setIcerik("Yorum 6. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        yorumService.save(yorum);

        yorum = new Yorum();
        yorum.setPlakaId(1L);
        yorum.setDurum((short) 1);
        yorum.setIcerik("Yorum 7. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        yorumService.save(yorum);

        yorum = new Yorum();
        yorum.setPlakaId(1L);
        yorum.setDurum((short) 1);
        yorum.setIcerik("Yorum 8. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        yorumService.save(yorum);

        yorum = new Yorum();
        yorum.setPlakaId(1L);
        yorum.setDurum((short) 1);
        yorum.setIcerik("Yorum 9. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        yorumService.save(yorum);

        yorum = new Yorum();
        yorum.setPlakaId(1L);
        yorum.setDurum((short) 1);
        yorum.setIcerik("Yorum 10. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        yorumService.save(yorum);
    }

}
