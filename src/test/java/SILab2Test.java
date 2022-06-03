import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SILab2Test {

    private List<String> createList(String... elems)
    {
        return new ArrayList<>(Arrays.asList(elems));
    }
    @Test
    void everyStatementTest(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("#");
        list.add("2");
        list.add("1");
        list.add("2");
        list.add("#");
        list.add("#");
        list.add("2");
        list.add("#");

        List<String> Listt = new ArrayList<>();
        Listt.add("0");
        Listt.add("#");
        Listt.add("0");
        Listt.add("0");
        Listt.add("0");
        Listt.add("#");
        Listt.add("#");
        Listt.add("0");
        Listt.add("#");


        assertEquals(list, SILab2.function(Listt));

        List<String> exeptionList = new ArrayList<>();
        list.add("0");
        list.add("#");
        list.add("0");


        assertThrows(IllegalArgumentException.class, () -> SILab2.function(exeptionList));

        List<String> exeptionList2 = new ArrayList<>();



        assertThrows(IllegalArgumentException.class, () -> SILab2.function(exeptionList2));
    }

    @Test
    void everyPathTest(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("#");
        list.add("2");
        list.add("1");
        list.add("2");
        list.add("#");
        list.add("#");
        list.add("2");
        list.add("#");

        List<String> Listt = new ArrayList<>();
        Listt.add("0");
        Listt.add("#");
        Listt.add("0");
        Listt.add("0");
        Listt.add("0");
        Listt.add("#");
        Listt.add("#");
        Listt.add("0");
        Listt.add("#");


        assertEquals(list, SILab2.function(Listt));

        List<String> exeptionList = new ArrayList<>();
        list.add("0");
        list.add("#");
        list.add("0");


        assertThrows(IllegalArgumentException.class, () -> SILab2.function(exeptionList));

        List<String> exeptionList2 = new ArrayList<>();



        assertThrows(IllegalArgumentException.class, () -> SILab2.function(exeptionList2));

    }




}