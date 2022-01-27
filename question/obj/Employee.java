package com.test.question.obj;

public class Employee {

	private String name;
    private String department;
    private String position;
    private String tel;
    
    private Employee boss;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		
		
		if(name.length()>=2&&name.length()<=5) {
			for(int i=0;i<name.length();i++) {
				char c = name.charAt(i);
				if(c>='가'&&c<='힣') {
					
				}
			}
		}
		this.name = name;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		if(department.equals("영업부")||department.equals("기획부")||department.equals("총무부")||department.equals("개발부")||department.equals("홍보부")) {
			this.department = department;
			}
		//}else {
		//	System.out.println("부서를 다시 입력해주세요.");
		//	return;
		//}
		
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		if(!(position.equals("부장") || position.equals("과장") ||
				position.equals("대리") || position.equals("사원"))) {
			return;
		}//유효성 검사
		this.position = position;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		if(tel.substring(0,3).equals("010")&&tel.substring(3,4).equals("-")&&tel.substring(8,9).equals("-")) {
			this.tel = tel;
			}
		
		//}else {
		//	System.out.println("핸드폰 번호를 다시 입력해주세요.");
		//	return;
		//}
			
	}

	public Employee getBoss() {
		return this.boss;
	}

	public void setBoss(Employee boss) {
		
		
		if(boss==null) {
			return;
		}else if (this.department.equals(boss.getDepartment()))
		this.boss=boss;	
			
	}
    
    
    public void info() {
    	String temp="";
		
    	temp+="["+this.name+"]\n";
    	temp+="-부서: " +this.department+"\n";
		temp+="-직위: " +this.position+"\n";
		temp+="-연락처: " +this.tel+"\n";
		temp+="직속상사: ";
		
		System.out.print(temp);
    	
		if(this.boss == null) {
			System.out.println("없음\n");
		} else {
			System.out.printf("%s(%s %s)\n\n", this.boss.name, this.boss.department, this.boss.position);
		}
    	
    	
    }
    
    
    
    
    
    
    
    
}

