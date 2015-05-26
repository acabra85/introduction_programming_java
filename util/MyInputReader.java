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

    public final int readInt(final Optional msg) throws IOException {
        if(msg.isPresent()){
            System.out.print(msg.get());
        }
        return Integer.parseInt(reader.readLine().trim());
    }

    public final double readDouble(final Optional msg) throws IOException {
        if(msg.isPresent()){
            System.out.print(msg.get());
        }
        return Double.parseDouble(reader.readLine().trim());
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
	
	
	public static void main() {
        MyInputReader myInputReader = new MyInputReader();
        System.out.println("#Testing read Double ");
        try{
            double value_double = myInputReader.readDouble(Optional.of("Enter double:"));
            System.out.println("I read the double -> " + value_double);
        } catch (IOException ioe) {

        }
        try{
            int value_int = myInputReader.readInt(Optional.of("Enter double:"));
            System.out.println("I read the int -> " + value_int);
        } catch (IOException ioe) {

        }
        try{
            String value_string = myInputReader.readString(Optional.of("Enter double:"));
            System.out.println("I read the string -> " + value_string);
        } catch (IOException ioe) {

        }
        myInputReader.close();
    }
}
