import java.time.LocalDate;

import Abstract.BaseCampaignManager;
import Abstract.BaseGamerManager;
import Abstract.BaseGamesManager;
import Concrete.CampaignManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Concrete.GamesManager;
import Entities.Gamers;
import Entities.Games;
import Entities.Campaign;

public class Main {

	public static void main(String[] args) {
		
		Gamers gamer1 = new Gamers(21312,"Tolga","Yaradanakul","SeeYouLater",LocalDate.of(1997, 02, 21),"12345678900");
		Gamers gamer2 = new Gamers(123,"Bilgehan","Yaradanakul","Davae064",LocalDate.of(2004, 03, 12),"1234455674");
		Campaign campaign = new Campaign(23141,"Hafta Sonu Çýlgýnlýðý",25);
		Games game1 = new Games(1234,"Arazgajan 3 ",23,"2 kiþilik");
		
		
		
		BaseGamerManager baseGamerManager = new GamerManager(new GamerCheckManager());
		baseGamerManager.signUp(gamer1);
		System.out.println("---------------------");
		baseGamerManager.delete(gamer2);
		System.out.println("---------------------");
		baseGamerManager.update(gamer1);
		System.out.println("---------------------");
		
		
		BaseGamesManager baseGamesManager= new GamesManager();
		baseGamesManager.selling(gamer2, game1);
		
		
		BaseCampaignManager baseCampaignManager = new CampaignManager();
		baseCampaignManager.addCampaign(campaign);
		baseCampaignManager.deleteCampaign(campaign);
		baseCampaignManager.updateCampaign(campaign);
		System.out.println("------------------------------------------");
		
		baseGamesManager.selling(gamer2, game1, campaign);
	}

}
