package Abstract;

import Entities.Gamers;

public abstract class BaseGamerManager implements IGamerService{

	@Override
	public void signUp(Gamers gamer) {
		System.out.println("Kayýt Olundu teþekkürler:"+gamer.getUsername());
		
	}

	@Override
	public void update(Gamers gamer) {
		System.out.println("Kayýt Güncellendi teþekkürler:"+gamer.getUsername());
		
	}

	@Override
	public void delete(Gamers gamer) {
		System.out.println("Kayýt Silindi hoþçakalýnýz:"+gamer.getUsername());
		
	}

}
