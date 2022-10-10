package SelniumDemo;

public class LongestSubstring1 {



    // Function to find largest sub
// string with same characters
    static int Substring(String s)
    {
        int ans = 1, temp = 1;

        // Traverse the string
        for (int i = 1; i < s.length(); i++)
        {
            // If character is same as
            // previous increment temp value
            if (s.charAt(i) == s.charAt(i - 1))
            {
                ++temp;
            }
            else
            {
                ans = Math.max(ans, temp);
                temp = 1;
            }
        }
        ans = Math.max(ans, temp);

        // Return the required answer
        return ans;
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "abckkkeff";

        // Function call
        System.out.println(Substring(s));
    }
}


