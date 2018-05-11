package easy.solution020;

public class Solution {
	public Boolean isValid(String s) {
		if (s == null || "".equals(s)) {
			return true;
		}
		if (s.length() % 2 != 0) {
			return false;
		}
		java.util.Stack<Byte> stack = new java.util.Stack<>();
		java.util.Map<Byte, Integer> map = new java.util.HashMap<>();
		byte a = 123;
		byte b = 91;
		byte c = 40;
		map.put(a, 2);
		map.put(b, 2);
		map.put(c, 1);
		byte[] bytes = s.getBytes();
		for (int i = 0; i < s.length(); i++) {
			if(!stack.isEmpty()&&map.containsKey(stack.peek())&&stack.peek() + map.get(stack.peek()) == bytes[i]) {
					stack.pop();
			} else {
				stack.push(bytes[i]);
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		Boolean valid = new Solution().isValid("{}[]()");
		System.out.println(valid);
	}
}
