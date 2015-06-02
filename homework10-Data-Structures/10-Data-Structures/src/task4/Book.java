package task4;

public abstract class Book {
	private String name;
	private String autor;
	private int pages;
	
	public Book(String name, String autor,int pages) {
		this.name =name;
		this.autor = autor;
		this.pages = pages;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

}
