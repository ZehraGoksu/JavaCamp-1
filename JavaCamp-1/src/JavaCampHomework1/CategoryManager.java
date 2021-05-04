package JavaCampHomework1;

public class CategoryManager {

	public void Add(Category category) {
		System.out.println("Yeni kategori '" + category.categoryName + "' baþarýyla eklendi.");
	}
	
	public void Delete(Category category) {
		System.out.println("'" + category.categoryName + "' kategorisi baþarýyla silindi.");
	}
}
