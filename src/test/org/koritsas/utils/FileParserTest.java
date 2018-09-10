package org.koritsas.utils;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.Arrays;
import java.util.Vector;

public class FileParserTest {

    private FileParser mParser_comma;
    private FileParser mParser_space;
    private FileParser mParser_tab;
    @Before
    public void setUp() throws Exception {

        mParser_comma = new FileParser(new File("C:/Users/koritsas.il/IdeaProjects/Skeddxf/src/test/org/koritsas/utils/pxyzd_comma.TXT"),",");
        mParser_space = new FileParser(new File("C:/Users/koritsas.il/IdeaProjects/Skeddxf/src/test/org/koritsas/utils/pxyzd_space.TXT")," ");
        mParser_tab = new FileParser(new File("C:/Users/koritsas.il/IdeaProjects/Skeddxf/src/test/org/koritsas/utils/pxyzd_tab.TXT"),"\\t");
    }

    @After
    public void tearDown() throws Exception {

        mParser_comma = null;
    }

    @Test
    public void getPointVector() {

        Vector<Vector<String>> vector = new Vector<>();

        String[] a0 = {"T3","506076.3820","4557894.1910","173.5347",};
        String[] a1 = {"M1","506047.5933","4557883.7063","173.4038",};
        String[] a2 = {"1","506049.2475","4557884.5733","173.4019","KT"};
        String[] a3 = {"2","506048.2146","4557880.6669","173.3944","KT"};

        vector.add(new Vector<String>(Arrays.asList(a0)));
        vector.add(new Vector<String>(Arrays.asList(a1)));
        vector.add(new Vector<String>(Arrays.asList(a2)));
        vector.add(new Vector<String>(Arrays.asList(a3)));

        Assert.assertEquals(vector, mParser_comma.getDataVector());

        Assert.assertEquals(vector, mParser_space.getDataVector());


        System.out.println("Data");

        System.out.println(mParser_tab.getDataVector().toArray());

        Assert.assertEquals(vector,mParser_tab.getDataVector());

    }

    @Test
    public void getPoints() {
    }

    @Test
    public void getDataVector() {
    }
}