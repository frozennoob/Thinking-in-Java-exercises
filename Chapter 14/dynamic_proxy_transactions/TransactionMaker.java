package dynamic_proxy_transactions;

import java.io.*;
import java.util.regex.*;

public class TransactionMaker implements Transaction {
	String fileName;
	TransactionMaker(String fn){fileName = fn;}
	public void save(String transact) {
		try(FileWriter writer = new FileWriter(fileName, true))
        {
           // запись всей строки
            writer.write(transact + System.lineSeparator());
            // запись по символам
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 

	}

}
