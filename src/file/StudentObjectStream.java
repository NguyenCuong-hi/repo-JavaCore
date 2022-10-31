package file;



import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class StudentObjectStream extends ObjectOutputStream {
    StudentObjectStream() throws IOException {
        super();
    }
    StudentObjectStream(OutputStream outputStream) throws IOException {
        super(outputStream);

    }

public void writeStreamHeader()
{

}

}
