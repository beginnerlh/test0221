/*
 * 
 ����һ����������������Ƿ�Ϊ����λ�������������仰˵���������Ķ����������ڵ�����λ��������ȡ�

ʾ�� 1:
����: 5
���: True
����:
5�Ķ���������: 101

ʾ�� 2:
����: 7
���: False
����:
7�Ķ���������: 111

ʾ�� 3:
����: 11
���: False
����:
11�Ķ���������: 1011

 ʾ�� 4:
����: 10
���: True
����:
10�Ķ���������: 1010

����һ��ֻ����Сд��ĸ����������letters ��һ��Ŀ����ĸ target��Ѱ���������������Ŀ����ĸ�����С��ĸ��
��������ĸ��˳����ѭ���ġ��ٸ����ӣ����Ŀ����ĸtarget = 'z' ������������Ϊ letters = ['a', 'b']����𰸷��� 'a'��

ʾ��:
����:
letters = ["c", "f", "j"]
target = "a"
���: "c"

����:
letters = ["c", "f", "j"]
target = "c"
���: "f"

����:
letters = ["c", "f", "j"]
target = "d"
���: "f"

����:
letters = ["c", "f", "j"]
target = "g"
���: "j"

����:
letters = ["c", "f", "j"]
target = "j"
���: "c"

����:
letters = ["c", "f", "j"]
target = "k"
���: "c"

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

