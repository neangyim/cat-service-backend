package co.simplon;

import co.simplon.dao.ProduitRepository;
import co.simplon.entitie.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private ProduitRepository produitRepository;
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		restConfiguration.exposeIdsFor(Produit.class);
	produitRepository.save(new Produit(null,"ordinateur Lx 45",6000,3));
		produitRepository.save(new Produit(null,"ordinateur Lx 45",670,10));
		produitRepository.save(new Produit(null,"télévision",1700,20));
		produitRepository.save(new Produit(null,"smart Phone Sumsung",600,15));
		produitRepository.save(new Produit(null,"imprimente hp",7050,40));
		produitRepository.save(new Produit(null,"casque",70,50));
		produitRepository.save(new Produit(null,"chargeur",17,20));
		produitRepository.save(new Produit(null,"usb",1000,15));
		produitRepository.save(new Produit(null,"disqe",700,40));
		produitRepository.save(new Produit(null,"courie",670,10));
		produitRepository.save(new Produit(null,"casque bluetooth",700,20));
		produitRepository.save(new Produit(null,"proteste écran phone",6100,15));
		produitRepository.save(new Produit(null,"proteste écran ordi",7200,40));
		produitRepository.save(new Produit(null,"ordinateur Lx 45",670,10));
		produitRepository.save(new Produit(null,"télévision",1700,20));
		produitRepository.save(new Produit(null,"smart Phone",600,15));
		produitRepository.save(new Produit(null,"imprimente",700,40));
		produitRepository.save(new Produit(null,"casque",70,50));
		produitRepository.save(new Produit(null,"chargeur",17,20));
		produitRepository.save(new Produit(null,"usb",100,15));
		produitRepository.save(new Produit(null,"disqe",700,40));
		produitRepository.save(new Produit(null,"sourie",670,10));
		produitRepository.save(new Produit(null,"casque bluetooth",700,20));
		produitRepository.save(new Produit(null,"proteste écran phone",600,15));
		produitRepository.save(new Produit(null,"mpremente hp",700,40));
		produitRepository.save(new Produit(null,"usb",100,15));
		produitRepository.save(new Produit(null,"disqe",700,40));
		produitRepository.save(new Produit(null,"sourie",670,10));
		produitRepository.save(new Produit(null,"casque bluetooth",700,20));
		produitRepository.save(new Produit(null,"proteste écran phone",600,15));
		produitRepository.save(new Produit(null,"impremente hp",700,40));
		produitRepository.save(new Produit(null,"usb",100,15));
		produitRepository.save(new Produit(null,"disqe",700,40));
		produitRepository.save(new Produit(null,"sourie",670,10));
		produitRepository.save(new Produit(null,"casque bluetooth",700,20));
		produitRepository.save(new Produit(null,"proteste écran phone",600,15));
		produitRepository.save(new Produit(null,"impremente hp",700,40));
		produitRepository.save(new Produit(null,"usb",100,15));
		produitRepository.save(new Produit(null,"disqe",700,40));
		produitRepository.save(new Produit(null,"sourie",670,10));
		produitRepository.save(new Produit(null,"casque bluetooth",700,20));
		produitRepository.save(new Produit(null,"proteste écran phone",600,15));
		produitRepository.save(new Produit(null,"impremente hp",700,40));


		produitRepository.findAll().forEach(p->{
			System.out.println(p.toString());
		});
	}
}
