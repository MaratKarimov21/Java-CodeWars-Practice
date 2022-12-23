### Task 8 kyu

[Task link](https://www.codewars.com/kata/5a023c426975981341000014/)

You are given two interior angles (in degrees) of a triangle.

Write a function to return the 3rd.

Note: only positive integers will be tested.


### My solution

```Java

public class ThirdAngle {

    public static int otherAngle(int angle1, int angle2) {
        return 180 - (angle1 + angle2);
    }
}

```

### Favourite solution from code-wars

```Java

public class ThirdAngle {
    public static int otherAngle(int angle1, int angle2) {
        int angle3 = 180 - (angle1 + angle2);
        if(angle1 <= 0 || angle2 <= 0) throw new IllegalArgumentException("angle must be positive");

        return angle3;
    }
}

```

I was scrolling code wars to find solution atleast a little bit different from mine

