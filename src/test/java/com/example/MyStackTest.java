package com.example;

public class MyStackTest {

	public static void main(String[] args) {
		
		MyStack<Integer> stack = new MyStack<>();

		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println(stack.pop());  // 30
		System.out.println(stack.peek()); // 20
		System.out.println(stack.size()); // 2
		
		stack.printStack();
		
		stack.contains(10);
		stack.contains(30);
	}
}

/*1️⃣ ? extends Number – Wildcard
       List<? extends Number>
       ┌─────────────┐
       │             │
  Could be any subtype: 
  List<Integer>, List<Double>, List<Float> etc.
       │             │
       └─────────────┘
       
You **can read** elements as Number:
Number n = list.get(0); ✅

You **cannot write** elements:
list.add(10); ❌  (unknown subtype)


Key: The actual type is unknown to the compiler.

2️⃣ <T extends Number> – Type Parameter
Method declares: <T extends Number>
List<T> list

Example:
T = Integer → List<Integer>
T = Double  → List<Double>

Inside method, compiler knows T:
T first = list.get(0); ✅
list.add(someT); ✅  (if type matches T)


Key: The type T is named, so you can refer to it inside the method.

Works for multiple lists of the same type:

public static <T extends Number> boolean sameType(List<T> a, List<T> b) { ... }

⚡ Summary Table
Feature	? extends Number	<T extends Number>
Type known inside method?	No	Yes (T)
Can read?	✅ As Number	✅ As T
Can write?	❌	✅ As T
Good for?	Simple read-only operations	Need named type or multiple lists of same type

💡 Memory tip:

Wildcard = anonymous, unknown type → read-only safe

Type parameter = named type → read/write safe, more flexible
*/
