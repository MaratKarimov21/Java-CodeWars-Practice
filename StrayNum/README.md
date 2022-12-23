### Task 7 kyu

[Task link](https://www.codewars.com/kata/57f609022f4d534f05000024)

You are given an odd-length array of integers, in which all of them are the same, except for one single number.

Complete the method which accepts such an array, and returns that single different number.

The input array will always be valid! (odd-length >= 3)
Examples

[1, 1, 2] ==> 2
[17, 17, 3, 17, 17, 17, 17] ==> 3




### My solution

```Java

class Solution {
    static int stray(int[] numbers) {
        int x = numbers[0];
        int y = numbers[1];
        for(int z:numbers){
            if(z!=x || z!=y){
                return z;
            }
        }
        return 0;
    }
}

```

### Favourite solution from code-wars

```Java
class Solution {
    static int stray(int[] numbers) {

        int [] arr = numbers;
        int count = 0;
        
        for( int i :arr) {
            count ^= i;
            System.out.println(count);
        }

        return count;
    }
}

```

New syntax idea with array, interesting!

# Have a nice day!