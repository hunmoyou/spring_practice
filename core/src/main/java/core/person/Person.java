package core.person;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString 
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor //모든 파라미터 생성자
@EqualsAndHashCode
 // @data 위에 모두 한번에 생성 .. 그러나 실무에 쓰이지 않는다.
public class Person {
	
	private String nickname;	
	private String address;	
	private int age;
	
	
	
}
