import java.util.List;
import java.util.Objects;

public class MatchCount {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int i = -1;
        switch(ruleKey) {
            case "type" -> i = 0;
            case "color" -> i = 1;
            case "name" -> i = 2;
        }
        for(int j = 0; j < items.size(); j++) {
            if (Objects.equals(items.get(i).get(j), ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
