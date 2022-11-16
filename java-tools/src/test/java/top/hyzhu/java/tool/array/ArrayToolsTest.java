package top.hyzhu.java.tool.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayToolsTest {

    @Test
    public void getMax() {
        int [] array =new int[]{1,2,3,4,5,6,7,8,9,10};

        assertArrayEquals(10,ArrayTools.getMax(array));
        }

    private void assertArrayEquals(int i, int max) {
    }


}

