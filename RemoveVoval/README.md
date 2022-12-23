[ссылка на задачу](https://www.codewars.com/kata/5547929140907378f9000039/java)

### Мое решение:
```java
public class Kata {
  public static String shortcut(String input) {
    input = input.replaceAll("a", "");
    input = input.replaceAll("e", "");
    input = input.replaceAll("i", "");
    input = input.replaceAll("o", "");
    input = input.replaceAll("u", "");

    return input;   
  }
}
```

### Понравившееся решение:
```java
ublic class Kata {
  public static String shortcut(String input) {
    return input.replaceAll("(?)[aeiou]", "");   
  }
}
```

Регулярные выражения...