package day0830;

class User implements Cloneable{
	private String name;
	
	public void setName(String name) {
		this.name=name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class Clone3 {

	public static void main(String[] args) {
		User user = new User();
		user.setName("green");
		User copy = user;
		
		System.out.println(user.hashCode());
		System.out.println(copy.hashCode());
		System.out.println(user.equals(copy));
		
		User user2 = new User();
		user2.setName("blue");
	
		
		System.out.println(user2.hashCode());
		System.out.println(copy.hashCode());
		System.out.println(user2.equals(copy));
		
		try {
			User copy2 = (User)user2.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
}
