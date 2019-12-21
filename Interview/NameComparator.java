package Interview;

import java.util.Comparator;
  class NameComparator implements Comparator<Student>{

	public int compare(Student  s1, Student  s2) {
		// TODO Auto-generated method stub
		return s1.name.compareTo(s2.name); 
	}
	

}
