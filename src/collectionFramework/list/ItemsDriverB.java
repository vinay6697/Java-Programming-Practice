package collectionFramework.list;

import java.util.ArrayList;

public class ItemsDriverB {
	public static void main(String[] args) {
		ArrayList<Items> items=new ArrayList<>();
		items.add(new Items(101,"milk",25,3.9));
		items.add(new Items(102,"bread",40,4.5));
		items.add(new Items(103,"butter",55.65,3.5));
		
		for(int i=0;i<items.size();i++)
		{
			Items item=(Items)items.get(i);
			if(item.getRating()>3.5)
			{
				System.out.println("Item id is\t:"+item.getItemId());
				System.out.println("Item name is\t:"+item.getName());
				System.out.println("Item cost is\t:"+item.getCost());
				System.out.println("Item rating is\t:"+item.getRating());
				System.out.println("-----------------------------------------");
			}
		}
	}

}
