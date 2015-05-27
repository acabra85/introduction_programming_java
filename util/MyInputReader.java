package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

/**
 * @author acabra
 * @version 2015-05-26
 */
public class MyInputReader {

    private BufferedReader reader;
	
	public MyInputReader () {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

    public final int readInt(final Optional msg) throws IOException, NumberFormatException {
        if(msg.isPresent()){
            System.out.print(msg.get());
        }
		String input = "";
		try {
			input = reader.readLine().trim();
			return Integer.parseInt(input);
		} catch (NumberFormatException nfe) {
			throw new NumberFormatException("The input not a valid int :" + input);
		}
    }

    public final double readDouble(final Optional msg) throws IOException, NumberFormatException {
        if(msg.isPresent()){
            System.out.print(msg.get());
        }
		String input = "";
		try {
			input = reader.readLine().trim();
			return Double.parseDouble(input);
		} catch (NumberFormatException nfe) {
			throw new NumberFormatException("The input not a valid double :" + input);
		}
			
    }

    public final String readString(final Optional msg) throws IOException {
        if(msg.isPresent()){
            System.out.print(msg.get());
        }
        return reader.readLine().trim();
    }

    public final void close() {
        try{
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: unable to close the reader");
        }
    }
}
