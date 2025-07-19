public class Lecturer extends Teacher{ 
     
    private String department; 
    private int yearsOfExperience; 
    private int gradedScore; 
    private boolean hasGraded; 
      
    public Lecturer(String department,int yearsOfExperience,int teacherId, 
    String teacherName,String address,String workingType,String  
    employmentStatus,int workingHours){ 
      
    super(teacherId,teacherName,address,workingType,employmentStatus); 
    super.setWorkingHours(workingHours);
    this.department = department; 
    this.yearsOfExperience = yearsOfExperience; 
    this.gradedScore=0; 
    this.hasGraded=false; 
} 
 
     
     
     
    public String getDepartment(){ 
        return this.department; 
    } 
    public int getYearsOfExperience(){ 
        return this.yearsOfExperience; 
    } 
    public int getGradedScore(){ 
        return this.gradedScore; 
    } 
    public boolean getHasGraded(){ 
        return this.hasGraded; 
    } 
    //creating mutator 
    public void setgradedScore(int gradedScore){ 
        this.gradedScore=gradedScore; 
    } 
     
  
    public void gradeAssignment(int gradedScore, String department,int yearsOfExperience) 
    { 
        if(yearsOfExperience >= 5 & this.department.equals(department)) 
        {  
            if (gradedScore >=70){ 
                System.out.print("Grade A"); 
            } else if (gradedScore >= 60){ 
                System.out.print("Grade B"); 
            } else if (gradedScore >= 50){ 
            System.out.print("Grade C");  
            } else if (gradedScore >= 40){ 
                System.out.print("Grade D");  
            } else{ 
                System.out.print("Grade E"); ; 
            } 
             
            hasGraded = true; 
        }  
        else {
            System.out.println("Unable to grade assignment.");
        }
             
        } 
     
            
              
             
            public void display(){ 
                 
                super.display(); 
                 
                System.out.println("Department: " + department); 
                System.out.println("YearsOfExperience: " + yearsOfExperience); 
                if (this.hasGraded==true){ 
                    System.out.println("Graded Score: " + gradedScore); 
                     
                } else { 
                    System.out.println("Graded Score: Not avaliable" ); 
                } 
                 
            } 
             
             
                 
                 
            }