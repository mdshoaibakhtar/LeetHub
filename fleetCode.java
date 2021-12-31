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

package code.Leet;
public class fleetCode
{
    static int []decompress(int []nums)
    {
        int res[] = new int[nums.length];
        for(int i=0;i< nums.length;i++)
        {

        }

        return res;
    }
    public static void main(String[] args) {
        int []nums = {1,2,3,4};
        decompress(nums);
    }
}
















