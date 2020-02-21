package h_useful;

public class ObjectClass {
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectClass other = (ObjectClass) obj;
		if (a != other.a)
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}
	
	int a = 10;
	String b = "abc";
	
	ObjectClass(int a, String b){
		this.a = a;
		this.b = b;
	}

	//equals를 오버라이딩 해줘서 변수를 비교할 수 있게 됨
	public static void main(String[] args) {
		
		ObjectClass oc = new ObjectClass(10, "abc");
		ObjectClass oc2 = new ObjectClass(20, "def");
		ObjectClass oc3 = new ObjectClass(10,"abc");
			System.out.println(oc.equals(oc2));
		System.out.println(oc.equals(oc3));
		
	}

	@Override
	public String toString() {
		return "리턴하고 싶은 내용";
	}
}
