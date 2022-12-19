package item;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Key extends SuperObject {

	public OBJ_Key() {
		name = "Key";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/items/key1.png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
