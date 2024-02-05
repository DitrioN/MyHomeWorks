package homeWork14_02fb24;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;

public class CollectionUtils implements ICollectionUtils {

    @Override
    public Collection <Integer> union (Collection <Integer> a, Collection <Integer> b) throws NullPointerException {
        if (checkNull(a , b)) {
            Collection<Integer> result = new LinkedList<>();
            result.addAll(a);
            result.addAll(b);
            return result;
        } else {
            return null;
        }
    }

    @Override
    public Collection <Integer> intersection (Collection <Integer> a, Collection <Integer> b) throws NullPointerException {
        if (checkNull(a , b)) {
            Collection<Integer> result = new LinkedList<>();
            for (Integer integer : a) {
                for (Integer integer1 : b) {
                    if (integer.equals(integer1))
                        result.add(integer);
                }
            }
            return result;
        } else {
            return null;
        }
    }

    @Override
    public Set <Integer> unionWithoutDuplicate (Collection <Integer> a, Collection <Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Set <Integer> intersectionWithoutDuplicate (Collection <Integer> a, Collection <Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Collection <Integer> difference (Collection <Integer> a, Collection <Integer> b) throws NullPointerException {
        return null;
    }

    private boolean checkNull (Collection <Integer> a, Collection <Integer> b) {
        return a != null && b != null;
    }
}
