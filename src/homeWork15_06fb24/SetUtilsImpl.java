package homeWork15_06fb24;

import java.util.*;
import java.util.stream.Collectors;

public class SetUtilsImpl implements SetUtils {
    @Override
    public SortedSet <String> orderedSet (Collection <Integer> collection1, Set <String> set2) throws NullPointerException {
        return null;
    }

    @Override
    public Set <Integer> customOrderSet (int val1, int val2, int val3, int val4, int val5) {
        TreeSet<Integer> result = new TreeSet <>();
        result.add(val1);
        result.add(val2);
        result.add(val3);
        result.add(val4);
        result.add(val5);

        return result;
    }
}
