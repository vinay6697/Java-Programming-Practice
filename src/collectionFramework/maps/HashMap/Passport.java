package collectionFramework.maps.HashMap;

import java.util.Objects;

public class Passport {
	String name;
	String pid;
	
	public Passport(String name, String pid) {
		this.name = name;
		this.pid = pid;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, pid);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passport other = (Passport) obj;
		return Objects.equals(name, other.name) && Objects.equals(pid, other.pid);
	}
}
