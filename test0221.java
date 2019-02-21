/*
 * 
 给定一个正整数，检查他是否为交替位二进制数：换句话说，就是他的二进制数相邻的两个位数永不相等。

示例 1:
输入: 5
输出: True
解释:
5的二进制数是: 101

示例 2:
输入: 7
输出: False
解释:
7的二进制数是: 111

示例 3:
输入: 11
输出: False
解释:
11的二进制数是: 1011

 示例 4:
输入: 10
输出: True
解释:
10的二进制数是: 1010

给定一个只包含小写字母的有序数组letters 和一个目标字母 target，寻找有序数组里面比目标字母大的最小字母。
数组里字母的顺序是循环的。举个例子，如果目标字母target = 'z' 并且有序数组为 letters = ['a', 'b']，则答案返回 'a'。

示例:
输入:
letters = ["c", "f", "j"]
target = "a"
输出: "c"

输入:
letters = ["c", "f", "j"]
target = "c"
输出: "f"

输入:
letters = ["c", "f", "j"]
target = "d"
输出: "f"

输入:
letters = ["c", "f", "j"]
target = "g"
输出: "j"

输入:
letters = ["c", "f", "j"]
target = "j"
输出: "c"

输入:
letters = ["c", "f", "j"]
target = "k"
输出: "c"

*/
package lianxi0221;

public class test0221 {
	public static void main(String[] args) {
		Solution S = new Solution();
		/*int n = 5;
		boolean a = S.hasAlternatingBits(n);
		System.out.println(a);*/
		char[] letters = new char[] {'c', 'f', 'j'};
		char target = 'd';
		char a = S.nextGreatestLetter(letters, target);
		System.out.println(a);
		}

}

/*class Solution {
    public boolean hasAlternatingBits(int n) {
        int a = n&1;
        n>>=1;
        while(n>0)
        {
            if((n&1)==a)
            {
                return false;
            }
            a=n&1;
            n>>=1;
        }
        return true;
    }
}*/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i = 0;i < letters.length; i++)
        {
            if(target<letters[i])
            {
                return letters[i];
            }
        }
        return letters[0];
    }
}

