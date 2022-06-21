package JavaUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	public Student(int id, String name, int height, int weight) {
		super();
		this.id = id;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	int id;
	String name;
	int height;
	int weight;
	
}

public class StreamMain {
	
	public static void main(String args[]) {
		Student Student1= new Student(100,"sazia",5,40);
		Student Student2= new Student(200,"lalitha",4,50);
		Student Student3= new Student(300,"nazia",6,60);
		Student Student4= new Student(400,"sulthana",5,70);
		List<Student> studentList=Arrays.asList(Student1,Student2,Student3,Student4);
		for(Student s:studentList) {
			System.out.println(s);
			
		}
		List<Student> studentOutput= studentList.stream().filter(s->s.height>=5).collect(Collectors.toList());
		studentOutput.forEach(System.out::println);
		

}
}