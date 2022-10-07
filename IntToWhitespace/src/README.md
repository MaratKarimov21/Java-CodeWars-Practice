[ссылка на задачу](https://www.codewars.com/kata/55b350026cc02ac1a7000032/java)

### Понравившееся решение:
```java
public class Kata {

  public static String whitespaceNumber(final int n) {
      return
        (n < 0 ? "\t" : " ")
        + (n == 0 ? "" : Integer.toBinaryString(Math.abs(n)).replaceAll("1", "\t").replaceAll("0", " "))
        + "\n";
  }

}
```

Почти как у меня