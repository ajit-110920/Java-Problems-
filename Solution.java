class Solution 
{
	static boolean isPalindrome(String s)
	{
		String str = s.replaceAll("\\W", "");
		String clean = str.toLowerCase();
		char[] letters = clean.toCharArray();
		
		int left = 0;
		int right = letters.length - 1;
		while(left < right)
		{
			if(letters[left] != letters[right])
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args)
	{
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}
}