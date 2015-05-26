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

    private static BufferedReader reader;

    public final int readInteger(final Optional msg) throws IOException {
        if(msg.isPresent()){
            System.out.print(msg.get());
        }
        return Integer.parseInt(getReader().readLine().trim());
    }

    public final double readDouble(final Optional msg) throws IOException {
        if(msg.isPresent()){
            System.out.print(msg.get());
        }
        return Double.parseDouble(getReader().readLine().trim());
    }

    public final String readString(final Optional msg) throws IOException {
        if(msg.isPresent()){
            System.out.print(msg.get());
        }
        return getReader().readLine().trim();
    }

    private final static BufferedReader getReader() {
        if(reader == null)
            reader = new BufferedReader(new InputStreamReader(System.in));
        return reader;
    }

    public final void close() {
        try{
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: unable to close the reader");
        }
    }
}
