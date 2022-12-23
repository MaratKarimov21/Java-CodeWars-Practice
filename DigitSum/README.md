### Task 6 kyu

[Task link](https://www.codewars.com/kata/541c8630095125aba6000c00)

Digital root is the recursive sum of all the digits in a number.

Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.

### My solution

```Java

public class DRoot {
    public static int digital_root(int n) {
        return (n - 1) % 9 + 1;
    }
}

```

### Favourite solution from code-wars

```Java

    public class DRoot {
        public static int digital_root(int n) {
            int sum = 0;
            do {
                char[] array = ("" + n).toCharArray();
                sum = 0;
                for(char c : array) sum += Integer.valueOf("" + c);
                n = sum;
            } while(sum >= 10);
            return sum;
        }
    }

```

USING CHAR HERE? 
