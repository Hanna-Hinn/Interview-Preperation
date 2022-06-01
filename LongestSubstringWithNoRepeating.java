//Given a string s, find the length of the longest substring without repeating characters.
class LongestSubstringWithNoRepeating {
    public int lengthOfLongestSubstring(String str) {
    
        if (!str.equals("") && !str.equals(null)){
        int i;
        int n = str.length();
        int st = 0;
        int currlen = 0;
        int maxlen = 0;
     
   
        int start = 0;
        
        HashMap<Character,Integer> pos = new HashMap<Character,Integer>();
        pos.put(str.charAt(0), 0);
     
        for (i = 1; i < n; i++)
        {
            if (!pos.containsKey(str.charAt(i)))
            {
                pos.put(str.charAt(i), i);
            }
            else
            {
                if (pos.get(str.charAt(i)) >= st)
                {
                    currlen = i - st;
                    if (maxlen < currlen)
                    {
                    maxlen = currlen;
                    start = st;
                    }
                    st = pos.get(str.charAt(i)) + 1;
                }
                pos.replace(str.charAt(i), i);
            }
        }
        if (maxlen < i - st)
        {
            maxlen = i - st;
            start = st;
        }
        return maxlen;
        } else {
            return 0;
        }
        
    }
}
