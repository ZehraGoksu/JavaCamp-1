package JavaCampHomework1;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1, "Engin", "Demiro�");
		Instructor instructor2 = new Instructor(2, "Engin", "Demiro�2");
		Instructor instructor3 = new Instructor();
		instructor3.id = 3;
		instructor3.name = "Engin";
		instructor3.surName = "Demiro�3";
		
		Instructor[] instructors = {instructor1, instructor2, instructor3 };
		for(Instructor instructor: instructors) {
			System.out.println("E�itmen Ad-Soyad : " + instructor.name + " " + instructor.surName);
		}
		
		Category category1 = new Category(1, "Programlama", 3);
		Category category2 = new Category();
		category2.id = 2;
		category2.categoryName = "Veritaban�";
        category2.numberOfCourses = 5;
        
        Category[] categories = {category1, category2};
        for( Category category: categories) {
        	System.out.println("Kategoriler : " + category.categoryName);
        	System.out.println("Kategorideki kurs say�s� : " + category.numberOfCourses);
        }
        
        CategoryManager categoryManager = new CategoryManager();
        categoryManager.Add(category2);
        categoryManager.Delete(category1);
	}

}
