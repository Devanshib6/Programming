public class Tutor extends Teacher{ 
     
    private double salary; 
    private String specialization; 
    private String academicQualification; 
    private int performanceIndex; 
    private boolean isCertified; 
     
    public Tutor(int teacherId,String teacherName,String address,String 
    workingType,String employmentStatus,int workingHours,double salary, 
    String specialization,String academicQualification,int performanceIndex 
    ){ 
         
         
        super(teacherId,teacherName,address,workingType,employmentStatus); 
        super.setWorkingHours(workingHours); 
          
         this.salary = salary; 
         this.specialization= specialization; 
         this.academicQualification = academicQualification; 
         this.performanceIndex= performanceIndex; 
         this.isCertified=false; 
         
    } 
     
    public double getSalary(){ 
        return this.salary;    
    } 
    public String getSpecialization(){ 
        return this.specialization; 
    } 
    public String getAcademicQualification(){ 
        return this.academicQualification; 
    } 
    public int getPerformanceIndex(){ 
        return this.performanceIndex; 
    } 
    public boolean getIsCertified(){ 
        return this.isCertified; 
    } 
     
    public void setSalary(double salary){ 
        this.salary=salary; 
    } 
     
     
    public void setSalary(double salary,int performanceIndex){ 
        //Check condition for appraisal 
        if (performanceIndex > 5 & getWorkingHours() > 20 ) 
         { 
             double appraisal = 0; 
             if (performanceIndex >= 5 & performanceIndex <=7){ 
                 appraisal = 0.05; 
             } else if (performanceIndex >= 8 & performanceIndex <= 9 ){ 
                appraisal = 0.1; 
             } else if (performanceIndex >= 10){ 
                 appraisal = 0.2; 
             } 
             double SalaryWithAppraisal = salary + (appraisal * salary); 
             this.salary = SalaryWithAppraisal; 
             this.isCertified = true; 
            }   else { 
                System.out.println("Salary cannot be approved. Tutor has not been certified yet. "); 
            } 
         } 
          
         
         
     
     
      
      
    public void removeTutor(){ 
    if (!isCertified) { 
        // set attributes to zero 
        System.out.print("Tutor has been removed");
        this.salary= 0; 
        this.specialization = "" ; 
        this.academicQualification="" ; 
        this.performanceIndex=0; 
         
        this.isCertified = false; 
    } 
} 
 
public void display(){ 
     
    if (this.isCertified==true) { 
        super.display();}
        else{
        // Call the display method in the superclass  
        super.display(); 
        System.out.println("Salary: " + salary); 
        System.out.println("Specialization: "+ specialization); 
        System.out.println("Academic Qualification: " + academicQualification); 
        System.out.println("Performance Index:" + performanceIndex); 
    } 
     
     
  } 
}            