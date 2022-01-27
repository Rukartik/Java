import java.util.*;
public class MapBook implements Comparable 
{
	int bid;
	String title;
	String author;
	
	MapBook(int bid, String title, String author)
	{
		this.bid = bid;
		this.title = title;
		this.author = author;
	}
	
	public int compareTo(Object o)
	{
		MapBook b =(MapBook) o;
		return this.bid-b.bid;
	}
	
	public String toString()
	{
		return "Book id : " + bid + "  " + "Book Title :" + title + "  " + author;
		
	}
}
	
class Author
{
	String name;
	int house_no;
	String address;
	
	Author(String name, int house_no, String address)
	{
		this.name = name;
		this.house_no = house_no;
		this.address = address;
	}
	
	public String toString()
	{
		return "Author's Name : " + name + "  " + "Address: " +address;
	}
	
	public static void main(String[] args)
	{
		TreeMap<MapBook, Author> a = new TreeMap();

		a.put(((new MapBook (101, "Q HILLA DALA NAA..", "GAUTAM AMBANI"))),(new Author("ELON GATES", 69, "MARS \n")));

		a.put(((new MapBook (102, "CHAL CHAL APNE BAAP KO MAAT SIKA", "MUKESH AADANI"))),(new Author("BILL MASK", 404, "ADDRESS NOT FOUND!\n")));

		a.put(((new MapBook (103, "AA RAHOO MAI", "RAKESH THUN-THUN WALA"))),(new Author("JEFF TAKLAI", 500, "USA\n")));
	
		System.out.println(a);
	
	}
}

	


