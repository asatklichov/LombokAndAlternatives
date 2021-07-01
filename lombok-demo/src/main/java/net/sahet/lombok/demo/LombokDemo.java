package net.sahet.lombok.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

public class LombokDemo {
	public static void main(String[] args) {
		Krtecek krtecek = new Krtecek("Krtecek", 12);
		System.out.println(krtecek);
		
		//System.out.println(MyEnum);
		//System.out.println(MyEnum.VALUE_A);
	}

}

@Data
@AllArgsConstructor
class Krtecek {
	private String name;	
	private int age;
}
