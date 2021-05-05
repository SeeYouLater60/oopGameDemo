package Abstract;

import Entities.Campaign;
import Entities.Gamers;
import Entities.Games;

public abstract class  BaseGamesManager implements IGamesService {

	@Override
	public void selling(Gamers gamer,Games game) {
		System.out.println(game.getName()+ " Oyunu Satýn Aldýnýz "+gamer.getUsername());
	}
	
	
	public void selling(Gamers gamer,Games game,Campaign campaign) {
		System.out.println(game.getName()+" oyununu % "+campaign.getDiscount()+" indirim ile aldýnýz :"+gamer.getUsername());
	}
}
