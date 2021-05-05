package Abstract;

import Entities.Gamers;

public abstract class BaseGamerManager implements IGamerService{

	@Override
	public void signUp(Gamers gamer) {
		System.out.println("Kay�t Olundu te�ekk�rler:"+gamer.getUsername());
		
	}

	@Override
	public void update(Gamers gamer) {
		System.out.println("Kay�t G�ncellendi te�ekk�rler:"+gamer.getUsername());
		
	}

	@Override
	public void delete(Gamers gamer) {
		System.out.println("Kay�t Silindi ho��akal�n�z:"+gamer.getUsername());
		
	}

}
