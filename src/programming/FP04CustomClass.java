package programming;

import java.util.List;
import java.util.function.Predicate;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return String.format("Course [name=%s, category=%s, reviewScore=%s, noOfStudents=%s]", name, category,
				reviewScore, noOfStudents);
	}
}

public class FP04CustomClass {
	public static void main(String args[]) {
		List<Course> courses = 
				List.of(
						new Course("Spring", "Framework", 98, 20000),
						new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
						new Course("Microservices", "Microservices", 96, 25000),
						new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
						new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
						new Course("Kubernetes", "Cloud", 91, 20000)
						);
		
		//allMatch, noneMatch, anyMatch}
		System.out.println(
		courses.stream().allMatch(reviewScoreGreaterThan95Predicate())
		);
	}

	private static Predicate<Course> reviewScoreGreaterThan95Predicate() {
		return course -> course.getReviewScore() > 90;
	}
}
