package homeWork15_06fb24;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListUtilsImpl implements ListUtils {
    @Override
    public List <String> asList (String... strings) throws IllegalArgumentException {
        for (String string : strings) if (string == null) return null;

        return new LinkedList <>(Arrays.asList(strings));
    }

    @Override
    public List <Double> sortedList (List <Double> data) throws IllegalArgumentException {
        for (Double datum : data) if (datum == null) return null;

        /*LinkedList<Double> result = new LinkedList <>();

        for (int i = 0; i < data.size(); i++) {
            Double buffer = data.get(i);
            for (int j = i; j < data.size(); j++) {
                if (buffer > data.get(j)) {
                    buffer = data.get(j);
                }
            }
            result.add(buffer);
        }*/

        return null;
    }
}
