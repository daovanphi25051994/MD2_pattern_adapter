import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter implements CollectionOperations {
    @Override
    public int findMax(Set<Integer> numbers) {
        CollectionUtils collectionUtils = new CollectionUtils();
        List<Integer> copyList = new ArrayList<>();
        for (Integer number : numbers){
            copyList.add(number);
        }
        return collectionUtils.findMax(copyList);
    }
}
