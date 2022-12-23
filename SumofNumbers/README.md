### Task 7 kyu

[Task link](https://www.codewars.com/kata/55f2b110f61eb01779000053)

Given two integers a and b, which can be positive or negative, find the sum of all the integers between and including them and return it. If the two numbers are equal return a or b.

Note: a and b are not ordered!
Examples (a, b) --> output (explanation)

(1, 0) --> 1 (1 + 0 = 1)
(1, 2) --> 3 (1 + 2 = 3)
(0, 1) --> 1 (0 + 1 = 1)
(1, 1) --> 1 (1 since both are same)
(-1, 0) --> -1 (-1 + 0 = -1)
(-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)


### My solution

```Java

import java.lang.Math  ;
public class Sum
{
    public int GetSum(int a, int b){
        int sum = 0;
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        for (int i = min; i <= max;i++ ){
            sum+=i;
        }
        return sum;
    }
}

```

### Favourite solution from code-wars

```Java
class Solution {
    public class Sum {
        public int GetSum(int a, int b) {
            return (a + b) * (Math.abs(a - b) + 1) / 2;
        }
    }
}

```

I love maths solution, this is one of this