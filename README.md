# 剑指Offer笔试题4

*题目来源：*[牛客网](http://www.nowcoder.com/ta/coding-interviews?page=1)

### 题目一 和为S的连续正数序列

**描述:**  
小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!  
输出描述:输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest4/blob/master/src/FindSum2S.java)  

* 定义两个数,start和end(分别为1和2);
* 定义currSum为从start到end序列的和;
* 先固定start,该变end的值;end增加,直到currSum>=sum改变start值换下一个循环;
* 循环结束后,输出所有的序列;


### 题目二 和为S两个数字

**描述:**  
输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。  
输出描述:值小的那个先输出  

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest4/blob/master/src/FindNumbersWithSum.java)  

 * 取递增序列中第一个数start和最后一个数end;
 * 如果start与end的和小于sum,start加一;
 * 如果start与end的和大于sum,end减一;
 * 如果start与end的和与sum相同,计算乘积; 如果乘积小于上一个相加等于sum的序列,则清除原序列,添加新序列,否则不变;
 * 循环结束标志:start>end; 输出记录的序列;
 
### 题目三 字符串左旋转

**描述:**  
汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest4/blob/master/src/LeftRotate.java)  
解法一: 通过java实现字符串切割和拼接,这种做法可以,但是比较low;
解法二: 举例:abcXYZdef  
 先将字符串分割成两部分,abc和XYZdef.  
 分别将abc和XYZdef反转得到字符串"cbafedZYX",再将所得到的字符串整体反转得到XYZdefabc;
 
### 题目四 翻转单词顺序列

**描述:**  
牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest4/blob/master/src/SentenceReverse.java)  
解题分为两步:第一步：反转整个句子；第二步，按照空格，反转单词；  
思路很简单,这里用到上一题的字符串反转的函数

### 题目五 圆圈中最后剩下的数(约瑟夫环)

**描述:**  
每年六一儿童节,NowCoder都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。HF作为NowCoder的资深元老,自然也准备了一些小游戏。其中,有个游戏是这样的:首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。每次喊到m的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,可以不用表演,并且拿到NowCoder名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。请你试着想下,哪个小朋友会得到这份礼品呢？

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest4/blob/master/src/LastRemaining.java)  
虽然链表在Java中很少用,但是这里定义了一个循环链表,使用循环链表解题比数组在运算速度上快2~3倍;  

* 定义一个循环链表,将总数添加到循环链表中;
* 循环遍历链表,删除第m个结点;
* 直到最后一个结点,返回该结点值;

### 题目六 求1+2+3+...+n

**描述:**  
求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest4/blob/master/src/Sum.java)  
只能用递归的方法;  
* 让当n==0的时候终止继续递归,返回sum值为0; ,当n>0的时候继续执行递归;

### 题目七 不用加减乘除做加法

**描述:**  
写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest4/blob/master/src/Add.java)  

### 题目八 字符串转换为整数

**描述:**  
将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest4/blob/master/src/String2IntTest.java)  

 * 先看符号位,然后从高位依次到低位进行ASCII码值的匹配;

### 题目九 数组中重复的数字

**描述:**  
在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是重复的数字2或者3。

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest4/blob/master/src/Duplicate.java)  

 * 将数组进行快排;
 * 遍历数组,看相邻的两个数是否相等;
 
### 题目十 构建乘积数组

**描述:**  
给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest4/blob/master/src/Multiply.java)  
文字描述比较难懂.看代码容易些:

 * 计算前i-1个元素的乘积，及后n-i个元素的乘积, 分别保存在两个数组中;
 * 计算B[i]的值;
 
### 题目十一 表示数值的字符串

**描述:**  
请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。  

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest4/blob/master/src/IsNumber.java)  
代码给出的方法比较讨巧,使用了java的库函数,以后有更好的方法继续更新;

### 题目十二 字符流中第一个不重复的字符

**描述:**  
请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。   
输出描述:如果当前字符流没有存在出现一次的字符，返回#字符。  

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest4/blob/master/src/FirstApperanceOnce.java)  
将char一个一个存入list中,如果有重复,则删除元素,无重复则在list中添加元素;

### 题目十三 链表中环的入口结点

**描述:**  
一个链表中包含环，请找出该链表的环的入口结点。

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest4/blob/master/src/EnteryOfLoop.java)  
解法一:使用两个相邻的指针,断开每次的之前的节点,当前面的指针指向null时,后面的指针即为环的入口结点;
解法二:使用ArrayList,遍历链表,将每个Node都存入List,如果list中存在该结点,则该节点为环中的入口;

### 题目十四 删除链表中重复的结点

**描述:**  
在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5  

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest4/blob/master/src/DeleteDuplication.java)  
定义一个新的链表,让新链表头结点的下一个结点指向该链表的头结点;
定义两个新结点,分别为新的链表的头头结点和原链表的头结点;
在两个新结点中执行重复元素的覆盖赋值;
返回新链表头结点.next;