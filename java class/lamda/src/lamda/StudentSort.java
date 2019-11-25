package lamda;

import java.util.Comparator;

public interface StudentSort {

	Comparator<Student> comId=(o1,o2)->{ if(o1.id>o2.id) { return 1; } else
		  if(o1.id<o2.id) { return -1; } else { return 0; } };
		 
		
		
		  Comparator<Student> comPer=(o1,o2)->{ if(o1.per>o2.per) { return 1; } else
		  if(o1.per<o2.per) { return -1; } else { return 0; } };
		 
		
		Comparator<Student> comName=(o1,o2)-> o1.name.compareTo(o2.name);
}
