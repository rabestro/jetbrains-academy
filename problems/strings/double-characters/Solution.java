public class Solution {
	public static void main(String[] args) {
		System.out.println(
		    new java.util.Scanner(System.in)
		        .nextLine()
		        .replaceAll("(.)", "$1$1")
		);
	}
}
