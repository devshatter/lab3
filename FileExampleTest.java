import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.*;

public class FileExampleTest {
    @Test
    public void fileTest() throws IOException {
        File file = new File("/FileExampleFiles/folder1/text2.txt");
        List<File> list = FileExample.getFiles(file);
        assertEquals(new File("/FileExampleFiles/folder1/text2.txt"), list.get(0));
    }

    @Test
    public void directoryTest() throws IOException {
        File file = new File("./FileExampleFiles");
        List<File> list = FileExample.getFiles(file);
        System.out.println(file.isDirectory());
        for (int i = 0; i < list.size(); i ++) {
            System.out.println(list.get(i).getPath());
        }
        
    }
}
