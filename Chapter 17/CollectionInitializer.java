import java.util.*;
import net.mindview.util.*;

public class CollectionInitializer {
	public static Collection init(String filename){
		return new TextFile(filename, " ");
	}
}
