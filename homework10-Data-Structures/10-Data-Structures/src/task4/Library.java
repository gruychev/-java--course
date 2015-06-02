package task4;

public abstract class Library {
	
		private String name;
		private String autor;
		private int collection;
		
		public Library(String name, String autor,int collection) {
			this.name =name;
			this.autor = autor;
			this.collection = collection;
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
		public int getCollection() {
			return collection;
		}
		public void setCollection(int collection) {
			this.collection = collection;
		}
	
}
