class Test
{
	public static void main (String[] args)
	{
		String s="chandrasekhar";
		s= new String("chandrasekhar");
		System.out.println("String length="+s.length());
		System.out.println("Character at 3rd position="+s.charAt(3));
		System.out.println("Substring"+s.substring(3));
		System.out.println("Substring="+s.substring(2,5));
		String s1="andra";
		String s2="sekhar";
		System.out.println("Concatenated string="+s1.concat(s2));
		String s4="Learn Share Learn";
		System.out.println("Index of Share"+s4.indexOf("Share"));
		System.out.println("Index of a="+s4.indexOf('a',3));
		Boolean out ="Chandra".equals("chandra");
		System.out.println("Checking Equality"+out);
		out="Geeks".equals("Chandra");
		System.out.println("Checking Equality"+out);
		out="Geeks".equalsIgnoreCase("cHAndra");
		System.out.println("Checking Equality"+out);
		String word1="ChaNDRAse";
		System.out.println("Changing to lower Case"+word1.toLowerCase());
		String word2="ChaNDRAse";
		System.out.println("Changing to UPPER Case"+word2.toUpperCase());
		String str1="fhandrasekhar";
		System.out.println("Original String"+str1);
		String str2="fhandrasekhar".replace('f','c') ;
		System.out.println("Replaced f with g->"+str2);
	}
}
