package package2;

import package1.A;

class C extends A{
//	System.out.println(pub); //ok
//	System.out.println(pro); //ok
//	System.out.println(def); // 에러. 같은 패키지내에서만 가능
//	System.out.println(pri); // 에러. 같은 클래스에서만 가능
}
