[ссылка на задачу](https://www.codewars.com/kata/583203e6eb35d7980400002a/java)

### Понравившееся решение:
```java
import java.util.*;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
    return (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();   
  }
}
```

Это можно было сделать так просто... facepalm