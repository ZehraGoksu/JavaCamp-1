package JavaCampHomework1;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroð");
		Instructor instructor2 = new Instructor(2, "Engin", "Demiroð2");
		Instructor instructor3 = new Instructor();
		instructor3.id = 3;
		instructor3.name = "Engin";
		instructor3.surName = "Demiroð3";
		
		Instructor[] instructors = {instructor1, instructor2, instructor3 };
		for(Instructor instructor: instructors) {
			System.out.println("Eðitmen Ad-Soyad : " + instructor.name + " " + instructor.surName);
		}
		
		Category category1 = new Category(1, "Programlama", 3);
		Category category2 = new Category();
		category2.id = 2;
		category2.categoryName = "Veritabaný";
        category2.numberOfCourses = 5;
        
        Category[] categories = {category1, category2};
        for( Category category: categories) {
        	System.out.println("Kategoriler : " + category.categoryName);
        	System.out.println("Kategorideki kurs sayýsý : " + category.numberOfCourses);
        }
        
        CategoryManager categoryManager = new CategoryManager();
        categoryManager.Add(category2);
        categoryManager.Delete(category1);
	}

}
