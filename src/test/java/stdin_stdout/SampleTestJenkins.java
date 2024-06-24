package stdin_stdout;

import org.testng.annotations.Test;

public class SampleTestJenkins {

    @Test
    public void printMultiples(){
        BufferedReaderForLoop.printMultiples(12);
    }

    @Test
    public void printDay(){
        DateAndTime.findDay(7, 25, 2013);
    }
}
