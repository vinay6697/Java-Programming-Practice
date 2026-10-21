package collectionFramework.set.treeSet.treeset_assignment;

public class Movie implements Comparable<Movie>{
	String name;
	int year;
	double rating;
	
	Movie(String name,int year,double rating)
	{
		this.name=name;
		this.year=year;
		this.rating=rating;
	}
	
	public String toString()
	{
		return year+" "+name+"\t"+rating;
	}

	@Override
	public int compareTo(Movie m) {
		if(this.year!=m.year)
			return this.year-m.year;
		else
			return this.name.compareTo(m.name);
	}

}
