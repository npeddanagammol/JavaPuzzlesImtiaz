package practice_programs.strings;

public class StringPractice {

	public static void main(String[] args) {
		String song = "a singer singing a song on mother nature. He is a singer from malasia ";
		int lastIndex = song.lastIndexOf("singer");
		System.out.println(lastIndex);
		
		int index = song.indexOf("singer");
		System.out.println(index);
	}
}
