package homeWork15_06fb24;

import java.util.*;

public class ListUtilsImpl implements ListUtils {
    @Override
    public List <String> asList (String... strings) throws IllegalArgumentException {
        for (String string : strings) if (string == null) return null;

        return new LinkedList <>(Arrays.asList(strings));
    }

    @Override
    public List <Double> sortedList (List <Double> data) throws IllegalArgumentException {
        for (Double datum : data) if (datum == null) return null;

        List<Double> result = new ArrayList <>(data);
        Collections.sort(result);
        Collections.reverse(result);

        return result;
    }
}
