### Task 7 kyu

[Task link](https://www.codewars.com/kata/5a03b3f6a1c9040084001765/)

Find the total sum of internal angles (in degrees) in an n-sided simple polygon. N will be greater than 2.


### My solution

```Java

public class AngleSum {
    public static int sumOfAngles(int n) {
        return (n - 2)*180;
    }
}

```

### Favourite solution from code-wars

```Java

public class AngleSum {
    public static int sumOfAngles(int n) {
        int sum = 0;
        while(n >= 3)
        {
            sum += 180;
            n--;
        }
        return sum;
    }
}

```

...
