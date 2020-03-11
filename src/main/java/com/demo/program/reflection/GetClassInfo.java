package com.demo.program.reflection;

public class GetClassInfo {

	public static void main(String[] args) {

		Class<GetClassInfo> cls = GetClassInfo.class;
		System.out.println("Class :: " + cls);
		
		System.out.println("--------------------------------------------------------- ");
		
		try {
			@SuppressWarnings("unchecked")
			Class<GetClassInfo> clsNew = (Class<GetClassInfo>) Class
						.forName("com.demo.program.reflection.GetClassInfo");
			System.out.println("Class New :: " + clsNew);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}


// ---------------------------------------------------------------
// Output 
// ---------------------------------------------------------------
// Class :: class com.demo.program.reflection.GetClassInfo
// --------------------------------------------------------- 
// Class New :: class com.demo.program.reflection.GetClassInfo
