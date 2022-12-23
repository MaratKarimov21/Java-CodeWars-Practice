### Task 7 kyu

[Task link](https://www.codewars.com/kata/6391fe3f322221003db3bad6)

You are given an input (n) which represents the amount of lines you are given, your job is to figure out what is the maximum amount of perpendicular bisectors you can make using these lines.

Note: A perpendicular bisector is one that forms a 90 degree angle

n will always be greater than or equal to 0



### My solution

```Java

public class Perpendicular {
    public static int maxBisectors(int n) {
        if (n%2==0){
            return (n/2)*(n/2);
        }
        else {
            return (((n-1)/2)*((n-1)/2)+n/2);
        }
    }
}

```

### Favourite solution from code-wars

```Java

public class Perpendicular {
    public static int maxBisectors(int n) {
        return Math.max(n/2,n-n/2) * Math.min(n/2,n-n/2);
    }
}

```

Nice solution, I guess it's the easiest one.

