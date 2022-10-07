[ссылка на задачу](https://www.codewars.com/kata/580a4734d6df748060000045/java)

### Понравившееся решение:
```java
import java.util.stream.IntStream;

class Solution {

    public static String isSortedAndHow(int[] array) {
        if(IntStream.range(0, array.length-1).allMatch(i -> array[i] <= array[i+1]))
            return "yes, ascending";

        if(IntStream.range(0, array.length-1).allMatch(i -> array[i] >= array[i+1]))
            return "yes, descending";

        return "no";
    }

}
```

Тут использовали непонятный IntStream