package item;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Boots extends SuperObject{

	public OBJ_Boots() {
		name = "Boots";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/items/shoes1.png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
	}
}
