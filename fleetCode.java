/*package code.Leet;
public class fleetCode
{
    static int []buildArray(int []nums)  // 1920
    {
        int []ans = new int[nums.length];
        for(int i:nums)
        {
            ans[i] = nums[nums[i]];
        }

        for (int i:ans)
        {
            System.out.print(i+" ");
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int []nums = {5,0,1,2,3,4};
        int n = nums.length;
        for (int i:nums)
        {
            System.out.print(i+" ");
        }
        System.out.println("");
//        buildArray(nums);
    }
}
package code.Leet;
public class fleetCode
{
    static int findvalue(String[] operations)
    {
        int val = 0;
        for (int i=0;i<operations.length;i++)
        {
            if (operations[i].charAt(1) == '+')
            {
                val++;
            }
            else
                val--;
        }
        return val;
    }
    public static void main(String[] args)
    {
        String[] operations ={"x++","++x","--x","x++"};
        findvalue(operations);
    }
}

package code.Leet;
public class fleetCode
{
    static String page(String address)//1008
    {
        return address.replace(".","[.]");
    }
    public static void main(String[] args)
    {
     String address ="1.1.1.1";
        System.out.println(page(address));

    }
}

package code.Leet;
import java.util.Arrays;
public class fleetCode
{
    static int maxWealth(int [][]acc)
    {
        int maximum=0;

        int min = 0;
        for(int i=0;i< acc.length;i++)
        {
            int sum =0;
            for (int j=0;j<acc[i].length;j++)
            {
                sum = sum + acc[i][j];
            }
            if(maximum < sum)
            {
                maximum = sum;
            }
        }
         return maximum;
    }
    public static void main(String[] args) {
        int [][]acc ={{1,2,3},
                      {4,5,6},{11,55,44}};
        maxWealth(acc);
    }
}

package code.Leet;//1470
public class fleetCode
{
    static int[] shuffle(int []nums,int n)
    {
        int res[] = new int[nums.length];
        for(int i=0,j=n;i<n && j<2*n;i++,j++)
        {
            res[i] = nums[i];
            res[j] = nums[j];
        }

        System.out.println(res[2]);
        return res;
    }
    public static void main(String[] args)
    {
        int []nums ={2,5,1,3,4,7};
        int n = 3;
        shuffle(nums,n);

    }
}
package code.Leet;
public class fleetCode
{

    static boolean kidsWith(int []candies,int extraCandies)
    {
        boolean res[] = new boolean[candies.length];
        for(int i=0;i<candies.length;i++)
        {
            for (int j=i;j<candies.length;j++)
            {
                if(candies[i]+extraCandies > candies[j])
                {
                    res[i] = true;
                }
                else
                {
                    res[i] = false;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []candies = {2,3,5,1,3};
        int extraCandies = 3;
        kidsWith(candies,extraCandies);
    }
}

package code.Leet;
public class fleetCode
{
    static int numberOfpair(int []nums)//1512
    {
        int pair =0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i] == nums[j])
                {
                    System.out.println(i +" & "+j);
                    pair++;
                }
            }
        }
        System.out.println(pair);



        return pair;
    }
    public static void main(String[] args) {
        int []nums = {1,1,1,1};
        numberOfpair(nums);

    }
}
 //1365
package code.Leet;
public class fleetCode
{
    static int []smallerNumber(int []nums)
    {
        int smaller[] = new int[nums.length];

        for(int i=0;i<nums.length;i++)      //8,1,2,2,3
        {
            int plus = 0;
            for(int j=0;j< nums.length;j++)
            {
                if(nums[i] > nums[j])
                {
                    plus++;
                }
            }
            smaller[i] = plus;
        }

        for(int i:smaller)
        {
            System.out.print(i+" ");
        }


        return smaller;
    }
    public static void main(String[] args) {
        int []nums = {8,1,2,2,3};
        smallerNumber(nums);

    }
}

package code.Leet;
public class fleetCode
{

    static int result(int num) //253
    {
        int res = 0;
        int rem = 0;
        int sum = 0;
        int pro = 1;

        while(num != 0)
        {
            rem = num % 10;
            num /= 10;
            sum = sum + rem;
            pro = pro * rem;
        }
        res = pro - sum;
        System.out.println(res);
        return res;
    }
    public static void main(String[] args) {
        int nums = 234;
        result(nums);

    }
}
package code.Leet;
public class fleetCode
{
    static int numberStep(int n)
    {
        int step = 0;
        int div = 0;
        while(n != 0)
        {
            if(n % 2==0)
            {
                n = n / 2;
                step++;
            }
            else
            {
                n = n-1;
                step++;
            }
        }
        System.out.println(step);
        return step;
    }
    public static void main(String[] args) {
        int n = 14;
        numberStep(n);
    }
}
package code.Leet;
public class fleetCode
{
    static int []targetArray(int nums[],int indicex[])
            // 1389
    {
        int res[] = new int[nums.length];
        for(int i=0;i< nums.length;i++)
        {
//            nums[i] = nums[indicex[i]];
//            System.out.print(nums[i]+" ");

            res[indicex[i]] = nums[i];
            System.out.print(res[indicex[i]]+" ");
        }

        return res;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,0};
        int indicex[] = {0,1,2,3,0};
        targetArray(nums,indicex);
    }
}
package code.Leet;
public class fleetCode
{
//    static String Goal(String command)
//    {
//    }
    public static void main(String[] args)
    {
        String command = "G()(al)";
        System.out.println(command.length());

    }
}

package code.Leet;//1470
public class fleetCode
{
    static int[] shuffle(int []nums,int n)
    {
        int res[] = new int[nums.length];
        for(int i=0,j=n;i<n && j<2*n;i++,j++)
        {
            res[i] = nums[i];
            res[j] = nums[j];
        }

        System.out.println(res[2]);
        return res;
    }
    public static void main(String[] args)
    {
        int []nums ={2,5,1,3,4,7};
        int n = 3;
        shuffle(nums,n);

    }
}
package code.Leet;
import java.util.Arrays;
public class fleetCode {
    static int []sortedArr(int arr[],int target)
    {
        int []sort = new int[arr.length];
        int min = 0;
        for(int i=0;i<arr.length;i++)      //8,2,3,4,5
        {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        return sort;
    }
    public static void main(String[] args) {
        int []arr = {8,2,3,4,5};
        int target = 2;
        sortedArr(arr,target);
    }
}


package code.Leet;
public class fleetCode
{
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
//        System.out.println(stones);
        char []jew = jewels.toCharArray();
        char []st = stones.toCharArray();
        int count =0;
        for(int i=0;i<jewels.length();i++)
        {
            for(int  j=0;j<st.length;j++)
            {
                if(jew[i] == st[i])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
package code.Leet;  //1528
public class fleetCode
{
    static String shuffle(String s,int []indices)
    {

        char ch[] = s.toCharArray();
        char []ne = new char[ch.length];
        int n = s.length();
        for(int i=0;i<n;i++)
        {
//            System.out.print(ch[indices[i]]+" ");
            ne[i] = ch[indices[i]];
        }

        String p = new String(ne);
        System.out.println(p);
        return p;
    }
    public static void main(String[] args)
    {
        String s = "codeleet";
        int []indices = {4,5,6,7,0,2,1,3};
        shuffle(s,indices);
    }
}

package code.Leet;
public class fleetCode
{

    static <List> Boolean kidsWith(int []candies,int extraCandies)
    {
        boolean res[] = new boolean[candies.length];
        for(int i=0;i<candies.length;i++)
        {
            for (int j=i;j<candies.length;j++)
            {
                if(candies[i]+extraCandies > candies[j])
                {
                    res[i] = true;
                }
                else
                {
                    res[i] = false;
                }
            }
        }
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
        return false;
    }
    public static void main(String[] args) {
        int []candies = {2,3,5,1,3};
        int extraCandies = 3;
        kidsWith(candies,extraCandies);
    }
}
package code.Leet;
import java.util.ArrayList;
import java.util.Scanner;
public class fleetCode
{
    static ArrayList<Integer> list(int []arr)
    {
        ArrayList<Integer> brr = new ArrayList(10);
        for(int i:arr)
        {
            System.out.println(i);
        }
        return brr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList(10);
        arr.add(10);
        arr.add(20);
        arr.add(786);
//        System.out.println(arr);

        list(arr);

    }
}
package code.Leet;
public class fleetCode
{
    static int []shuffle(int []arr,int []indices)
    {
        int []res  =new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {

            res[indices[i]] = arr[i];
        }

        for(int i:res)
        {
            System.out.print(i+" ");
        }

        return res;
    }
    public static void main(String[] args)
    {
        int []arr = {1,2,3,4,5};
        int []indices = {4,3,1,0,1};
        shuffle(arr,indices);
    }
}
//1431
package code.Leet;
import java.util.ArrayList;
import java.util.Scanner;
public class fleetCode
{

    static ArrayList<Boolean> KidsWithcandies(int []candies,int extraCandies)
    {
        ArrayList<Boolean> mylist = new ArrayList<>(candies.length);
        for(int i=0;i<candies.length;i++)               //2, 3, 5, 1, 3
        {
            int t=0;
            int f=0;
            int sum = candies[i]+extraCandies; //5
            for(int j=0;j<candies.length;j++)
            {
                if(sum>= candies[j])
                {
                    t++;
                }
                else
                {
                    f++;
                }
            }
            if(f > 0)
            {
                mylist.add(false);
            }
            else
            {
                mylist.add(true);
            }
        }
        System.out.println(mylist);
        return mylist;
    }
    public static void main(String[] args)
    {
        int []candies = {2,3,5,1,3};
        int extraCandies = 3;
        KidsWithcandies(candies,extraCandies);
    }
}

//Q.1389
package code.Leet;
public class fleetCode
{

    static int []createtargetArray(int nums[],int n)
    {
        int target[] = new int[nums.length];
        int inde = 3;
        for(int i= n-1;i>=inde;i--)
        {
//            System.out.println(nums[i]);
                nums[i-1] = nums[i];
        }
        nums[inde] = 786;
        for(int i:target)
        {
            System.out.print(i+" ");
        }


        return target;
    }
    public static void main(String[] args) {
        int []nums = {0,1,2,3,4};
        int []index = {0,1,2,2,1};
        int n = 6;
        createtargetArray(nums,n);

    }
}
package code.Leet;
public class fleetCode
{
    static int mostWord(String[] sentence)
    {
        int word=0;
        int max = 0;
        for(int i=0;i<sentence.length;i++)
        {
            word = 0;
            char ch[] = sentence[i].toCharArray();
            for(int j=0;j< ch.length-1;j++)
            {
               if(ch[j+1] == ' ')
               {
                   word++;
               }
            }
            if(word+1 > max)
            {
                max = word+1;
            }
            else
            {
                max = max;
            }
        }
        System.out.println(max);
        return word;
    }
    public static void main(String[] args)
    {
        String sentences[] = {"my name is mdshoaib","mera naam mdshoaib","md md md md md md md"};
        mostWord(sentences);

    }
}
package code.Leet;
public class fleetCode
{
    static int numsJewelsinStone(String jewels,String stones)
    {
        int count = 0 ;
        for(int i=0;i<jewels.length();i++)
        {
//            count = 0;
            char []ch = jewels.toCharArray();
            int val = ch[i];
            for(int j=0;j<stones.length();j++)
            {
                char st[] = stones.toCharArray();
                int stval = st[j];
                if(val == stval)
                {
                    count++;
                }
            }
//            System.out.println(count);
        }
        System.out.println(count);




        return count;

    }
    public static void main(String[] args)
    {
        String jewels = "aaaBBBabBBBb";
        String stones = "aaBB";
        numsJewelsinStone(jewels,stones);
    }
}*/
/*Happy New Year 2022*/
//Que - 1313 Decompress Run-Length Encoded List
/*
package code.Leet;

import java.util.ArrayList;
import java.util.List;

public class fleetCode
{
    static void decompress(int []nums)
    {
        int []res = new int[nums.length];
        List<Integer> dec = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(i % 2 != 0)
            {
                int k = nums[i-1];
                for(int j=0;j<k;j++)
                {
                    res[i-1] = nums[i];
                    System.out.print(res[i-1]+" ");
                }
                k=0;
            }
        }
    }
    public static void main(String[] args)
    {
     System.out.println("Happy new Year 2022");
     int []nums = {3,3,4,2};
     decompress(nums);
    }
}
//Que - 2089
package code.Leet;
import java.util.ArrayList;
import java.util.List;
public class fleetCode
{
   static void sorting(int []nums,int target)
   {
       int []res = new int[nums.length];
       List<Integer> targetArr = new ArrayList<>();
       for(int i=1;i< nums.length-1;i++)            //1,2,5,2,3
       {
           if(nums[i-1] > nums[i])
           {
               //swap
               int temp = 0;
               temp = nums[i-1];
               nums[i-1] = nums[i];
               nums[i] = temp;

               res[i] = nums[i];
           }
           else
           {
               res[i] = nums[i];
           }

       }
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i] == target)
           {
               targetArr.add(i);
           }
       }

       System.out.print(targetArr);
   }


    public static void main(String[] args)
    {
        int []nums = {1,2,5,2,3};
        int target = 2;
        sorting(nums,target);
    }
}
package code.Leet;
public class fleetCode
{
    static void shift(int []arr,int index,int elem,int n)   //1, 2, 4, 5, 6, 8
    {
        for(int i=n-1;i>=index;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[index] = elem;
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }

    static int []targetArr(int arr[],int []ind)
    {
        int []result = new int[arr.length];
        boolean []chek = new boolean[arr.length];
        boolean check = false;
        for(int i=0;i<arr.length;i++)
        {
            result[ind[i]] = arr[i];
        }


        for(int i:result)
        {
            System.out.print(i+" ");
        }



        return result;
    }
    public static void main(String[] args)
    {
//        int []arr = {1,2,4,5,6,8};
//        int n = arr.length;
//        int index = 2;
//        int elem = 9;
//        shift(arr,index,elem,n);

        int []arr = {1,2,3,5};
        int []ind = {2,0,1,0};
        targetArr(arr,ind);

    }
}
package code.Leet;

import java.util.Arrays;

public class fleetCode
{
    public static void main(String[] args)
    {
        int []arr = {9,8,5,1,6,2};
        int target = 2;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++)
        {
            if(target == arr[i])
            {
                System.out.println("\n"+i);
            }
        }
    }
}
package code.Leet;
public class fleetCode
{
    static void concat(String []word1,String []word2)
    {

        String neword1 = "";
        String neword2 = "";

        if(word1.length == word2.length)
        {
            for (int i=0;i< word1.length;i++)
            {
                     neword1 = neword1+word1[i];
                     neword2 = neword2+word2[i];
            }
            System.out.println(neword1);
            System.out.println(neword2);

            System.out.println(neword1.equals(neword2));
        }
    }
    public static void main(String[] args) {
        String []word1 = {"a","bc"};
        String []word2 = {"ab","c"};

        concat(word1,word2);

    }
}
package code.Leet;
import java.util.Arrays;
public class fleetCode
{

    static void maxPro(int []nums)
    {
        int maxpro = 0;
        int pro1 = 0;
        int pro2 = 0;

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
            if(i == 0)
            {
                pro1 = nums[i]*nums[i+1];
            }
            if(i== nums.length-2)
            {
                pro2 = nums[nums.length-1]*nums[nums.length-2];
            }
        }

        maxpro = pro2-pro1;
        System.out.println(maxpro);
    }
    public static void main(String[] args) {
        int []nums = {4,2,5,9,7,4,8};
        maxPro(nums);
    }
}
package code.Leet;
public class fleetCode
{
    static boolean check(String newword)
    {
        char []ch =newword.toCharArray();
        int i = 0;
        int j = newword.length()-1;
        boolean flag = false;
        int countf = 0;
        int countt = 0;

        while(i<j)
        {
            int diff = ch[i]-ch[j];
            if(diff != 0)
            {
                countf++;
                break;
            }
            else
            {
                countt++;
            }
            i++;
            j--;
        }
//        System.out.println(countf);
//        System.out.println(countt);
        if(countf < countt){
            flag = true;
        }
        if(countf > countt)
        {
            flag = false;
        }

        return flag;
    }
    static void plaindrome(String[] words)
    {
        String str = "";
        for(int i=0;i<words.length;i++)
        {
            if(check(words[i]) == true)
            {
                str = words[i].toString();
                break;
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        String[] words = {"abla","adka","bpbb","raceecar"};
        plaindrome(words);
//        System.out.println(check("racecar"));

    }
}

package code.Leet;
public class fleetCode
{
    static boolean compare(String newword,String s)
    {
        char []p = newword.toCharArray();
        char []q = s.toCharArray();
        int len = newword.length();
        int c = 0;

        for(int i=0;i<q.length;i++)
        {
            for(int j=0;j<p.length;j++)
            {
                if(q[i] == p[j])
                {
                    c++;
                }
            }
        }

//        if(c == len)
//        {
//            System.out.println("Equal");
//        }
        return (c==len);
    }
    static void countConsistent(String s,String[] word)
    {
        int count =0;
        for(int i=0;i<word.length;i++)
        {
            if(compare(word[i], s))
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String s = "cad";
        String[] word = {"cc","acd","b","ba","bac","bad","ac","d"};
        countConsistent(s,word);
    }
}
package code.Leet;

import java.util.Arrays;

public class fleetCode
{
    static void truncate(String str,int k)
    {
        String []splited = str.split(" ");
        String trun = "";
        for(int i=0;i<k;i++)
        {
            trun = trun + splited[i]+" ";
        }
        System.out.println(trun);
    }
    public static void main(String[] args) {
        String str = "Hello how are you baby";
        int k = 4;
        truncate(str,k);
    }
}

package code.Leet;
public class fleetCode
{
    static void traversal(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void shift(int []arr,int ele,int ind)
    {
        for(int i=arr.length-1;i>ind;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[ind] = ele;
    }

    static void targetArr(int []arr,int []index)
    {
        int []res = new int[arr.length];
        boolean[] check = new boolean[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(check[index[i]] == false)
            {
                res[index[i]] = arr[i];
                check[index[i]] = true;
            }
            else
            {
                for(int k=i;k>=index[i];k--)
                {
                    res[k] = res[k-1];
                }
                res[index[i]] = arr[i];
            }
        }
        traversal(res);
    }
    public static void main(String[] args)
    {
        int []arr =   {1,2,3,4,5};
        int []index = {1,1,0,1,2};
        int ele = 5;
        int ind = 0;
        traversal(arr);
        targetArr(arr,index);
    }
}
//Coun Good Triplets
package code.Leet;
public class fleetCode
{
    static void coutnGoodTriplets(int []arr,int a,int b,int c)
    {
        int sum= 0;
        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(Math.abs(arr[i]-arr[j]) <=a && Math.abs(arr[j]-arr[k]) <=b && Math.abs(arr[i]-arr[k])<=c)
                    {
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args)
    {
        int []arr = {3,0,1,1,9,7};
        int a = 7;
        int b = 2;
        int c = 3;
        coutnGoodTriplets(arr,a,b,c);
    }
}
package code.Leet;
public class fleetCode
{
    static void traverse(int [][]img)
    {
        for(int i=0;i<img.length;i++)
        {
            for (int j = 0; j < img.length; j++)
            {
                System.out.print(img[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void invert(int [][]img)
    {
        int [][]invert = new int[img.length][img.length];
        for(int i=0;i<img.length;i++)
        {
            for (int j = 0; j < img.length; j++)
            {
                if(img[i][j] == 0)
                {
                    invert[i][j] = 1;
                }
                else if(img[i][j] == 1)
                {
                    invert[i][j] = 0;
                }
            }
        }
        traverse(invert);
    }


    static void reverse(int [][]img)
    {
        int [][]rev = new int[img.length][img.length];
        for(int i=0;i<img.length;i++)
        {
            for (int j=img.length-1,k=0;j>=0 && k<img.length;j--,k++)
            {
                rev[i][k] = img[i][j];
            }
            System.out.println();
        }
        invert(rev);
    }

    public static void main(String[] args)
    {
        int [][]img = {{1,1,0},{1,0,1},{0,0,0}};
        traverse(img);
        System.out.println();
        reverse(img);
//        invert(img);
    }
}
package code.Leet;
public class fleetCode
{
    static void splitting(String str)
    {
        String update  = "";
        int ind = 0;
        char []ch = str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(i < str.length()-1)
            {
                update = update + ch[i];
            }
            else
            {
                ind = Character.getNumericValue(ch[i]);
            }
        }
        System.out.println(update);
        System.out.println(ind);
    }




    static void splitThechar(String s)
    {
        String []str = s.split(" ");
        String []updatedString = new String[str.length];
        int []strIndex = new int[str.length];
        String update  = "";
        String itsFinalString = "";
        String finalS[] = new String[str.length];
        for(int i=0;i<str.length;i++)
        {
            update  = "";
            char []ch = str[i].toCharArray();
            for(int j=0;j<str[i].length();j++)
            {
                if(j < str[i].length()-1)
                {
                    update = update + ch[j];
                }
                else
                {
                    strIndex[i] = Character.getNumericValue(ch[j]);
                }
            }
            updatedString[i] = update;
        }

           for(int i=0;i<updatedString.length;i++)
           {
               finalS[strIndex[i]-1] = updatedString[i];
           }
           for(int i=0;i< strIndex.length;i++)
           {
                 if(i < strIndex.length-1)
                 {
                     itsFinalString += finalS[i] +" ";
                 }
                 else
                 {
                     itsFinalString += finalS[i];
                 }
           }
        System.out.println(itsFinalString);
    }
    public static void main(String[] args)
    {
        String s = "my1 akhtar6 md4 is3 shoaib5 name2";
        splitThechar(s);
    }
}

package code.Leet;
import java.util.Arrays;
public class fleetCode
{
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        if (a == b)
            return a;

        if (a > b)
        {
            return gcd(a - b, b);
        }
        return gcd(a, b-a);
    }

    static void greatestCd(int []arr)
    {
        int a = 0;
        int b = 0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(i == 0)
            {
                a = arr[i];
            }
            if(i == arr.length-1)
            {
                b= arr[i];
            }
        }
        System.out.println(gcd(a,b));
    }
    public static void main(String []args)
    {
        int arr[] = {2,4,15,3,6};
        greatestCd(arr);

    }
}


//        Question No. 1486
//        Input: n = 5, start = 0
//        Output: 8
//        Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
//        Where "^" corresponds to bitwise XOR operator.

package code.Leet;
public class fleetCode
{
    static void xorBitwise(int n,int start)
    {
        int []arr = new int[n];
        int ans = 0;
        for(int i =0;i<n;i++)
        {
            if(i == 0)
            {
                arr[i] = start;
            }
            else
            {
                arr[i] = start+2;
                start += 2;
            }
        }
        for (int i=1;i<arr.length;i++)
        {
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int n = 5,start = 0;
        xorBitwise(n,start);
    }
}
//Q. sum of diagonal of the square matrix
package code.Leet;
public class fleetCode
{
    static void  traverseOfmatrix(int [][]matrix)
    {
        for(int i=0;i< matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void  sumOfmatrix(int [][]matrix)
    {
        System.out.println("Diagonals");
        int diagonals = 0;
        for(int i=0;i< matrix.length;i++)
        {
            for(int j=i;j<=i;j++)
            {
                System.out.print(matrix[i][j]+" ");
                diagonals = diagonals + matrix[i][j];
            }
        }
        System.out.println();
        int mid = 0;
        for(int i= 0;i< matrix.length;i++)
        {
            for(int j= matrix.length-1-i;j>matrix.length-2-i;j--)
            {
                if(matrix.length % 2 == 1)
                {
                     mid = matrix.length/2;
                    if(i != mid && j != mid)
                    {
                        System.out.print(matrix[i][j]+" ");
                        diagonals = diagonals + matrix[i][j];
                    }
                }

                else
                {
                    System.out.print(matrix[i][j]+" ");
                    diagonals = diagonals + matrix[i][j];
                }
            }
        }
        System.out.println("\nSum of Diagonals will be "+diagonals);
    }
    public static void main(String[] args)
    {
        int [][]matrix = {{4,1,2,3,4,9},{4,1,2,3,4,5},{5,4,4,5,7,7},{8,5,5,1,0,7},{8,9,5,1,0,5},{8,9,5,1,0,4}};
        traverseOfmatrix(matrix);
        sumOfmatrix(matrix);
    }
}
package code.Leet;
import java.util.Arrays;
public class fleetCode
{
    static void mergeSort(int []a,int []b)
    {
        int []c = new int[a.length+b.length];
        int i=0;int j=0;int k=0;
        while(i<a.length)
        {
            c[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length)
        {
            c[k] = b[j];
            j++;k++;
        }

        Arrays.sort(c);
        for (int p:c )
        {
            System.out.println(p);
        }
    }
    public static void main(String[] args) {
        int []a = {7,2,6};
        int []b = {3,4};
        mergeSort(a,b);
    }
}*/
/*
//Q.2K
package code.Leet;
public class fleetCode
{
    static String rev(String word,int ind)
    {
        char arr[] = word.toCharArray();
        String str = "";
        for(int i=ind;i>=0;i--)
        {
            str= str+arr[i];
        }
        return str;
    }

    static void revPre(String word,char ch)
    {
        char arr[] = word.toCharArray();
        String str = "";
        boolean check = false;
        for(int i=0;i<word.length();i++)
        {
            if(arr[i] == ch && check == false)
            {
               str =  rev(word,i);
                check = true;
            }
            else
            {
                str = str + arr[i];
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args)
    {
        String word = "xyxzxe";
        char ch = 'd';
        revPre(word,ch);
    }
}
//Q944
package code.Leet;
public class fleetCode
{
    static boolean checkSortRec(String s)
    {
        char ch[] = s.toCharArray();
        boolean status = false;
        for(int i=s.length()-1;i>0;i--)
        {
            if((int)ch[i-1] > (int)ch[i])
            {
                status = true;
            }
            else
            {
                status = false;
                break;
            }
        }
        return status;
    }

    static boolean checkSort(String s)
    {
        char ch[] = s.toCharArray();
        boolean status = false;
        for(int i=1;i<s.length();i++)
        {
            if((int)ch[i-1] < (int)ch[i])
            {
                status = true;
            }
            else
            {
                status = false;
                break;
            }
        }
        if(!status)
        {
        if(checkSortRec(s))
        {
            status = true;
        }
        }
        return status;
    }

    static void delete(String []str)
    {
        int count =0;
        for(int i=0;i<str.length;i++)
        {
            if(!checkSort(str[i]))
            {
                count++;
            }

        }
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        String []str = {"cba","wvu","tsr"};
        delete(str);
    }
}
//1748
package code.Leet;
public class fleetCode
{
    static void uniqueSum(int []arr)
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i != j && arr[i] == arr[j])
                {
                    sum = sum  + arr[i];
                }
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args)
    {
        int []arr = {1,2,3,2,3};
        uniqueSum(arr);
    }
}
//1450
package code.Leet;
public class fleetCode
{
    static void HomeWork(int []startTime, int []endTime,int queryTime)
    {
        int count = 0;
        for(int i=0;i< startTime.length;i++)
        {
            if(startTime[i] > queryTime || endTime[i] > queryTime)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int []startTime = {1,2,3};
        int []endTime = {3,2,7};
        int queryTime = 4;
        HomeWork(startTime,endTime,queryTime);
    }
}
//Q.1323
package code.Leet;
public class fleetCode
{
    static void arrange(int num)
    {
        int []res = new int[4];
        for(int i= res.length-1;i>=0;i--)
        {
            //packing the integer in the array
            res[i] = num % 10;
            num /= 10;
        }
        //traversal
        for(int i:res)
        {
            System.out.print(i+" ");
        }

        for(int i=0;i<res.length;i++)
        {
            if(res[i] != 9)
            {
                res[i] = 9;
                break;
            }
        }

        System.out.println();
        for(int i:res)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        //arr int to integer
        int h = 1000;
        int number = 0;
        for(int i=0;i<res.length;i++)
        {
            number = res[i]*h+number;
            h /= 10;
        }
        System.out.println(number);
    }
    public static void main(String[] args)
    {
        int num = 9669;       //9969
        arrange(num);
    }
}
//2119
package code.Leet;
public class fleetCode
{
    static void isSameAfter(int nums)
    {
        int n1 = nums;
        int rem = 0;
        int rev = 0;
        while(nums > 0)
        {
            rem = nums % 10;
            rev = rev * 10 + rem;
            nums /= 10;
        }

        int remainder = 0;
        int reverse = 0;
        while(rev>0)
        {
            remainder = rev % 10;
            reverse = reverse*10+remainder;
            rev /= 10;
        }

        if(n1 == reverse)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

    }
    public static void main(String[] args)
    {
       int nums = 78960;
       isSameAfter(nums);
    }
}
*/












