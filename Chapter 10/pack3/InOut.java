package pack3;

import Pack1.Interface1;
import pack2.Out;

public class InOut extends Out{
	Interface1 out(){
		return new Out.In();
	}
}
