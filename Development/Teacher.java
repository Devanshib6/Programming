public class Teacher{ 
     
    public int teacherId; 
    private String teacherName; 
    private String address; 
    private String workingType; 
    private String employmentStatus; 
    private int workingHours; 
     
    public Teacher(int teacherId,String teacherName,String address,String 
        workingType, String employmentStatus){ 
            this.teacherId = teacherId; 
            this.teacherName = teacherName; 
            this.address= address; 
            this.workingType= workingType; 
            this.employmentStatus = employmentStatus; 
             
        } 
      
    public int getTeacherID(){ 
         return this.teacherId; 
    } 
    public String getTeacherName(){ 
        return this.teacherName; 
    } 
    public String getAddress(){ 
        return this.address; 
    } 
    public String getWorkingType(){ 
        return this.workingType; 
    } 
    public String getEmploymentStatus(){ 
        return this.employmentStatus; 
    } 
    public int getWorkingHours(){ 
        return this.workingHours; 
    } 
     
    public void setWorkingHours(int workingHours){ 
        this.workingHours=workingHours; 
    } 
     
    public void display(){ 
        System.out.println("TeacherId: " + teacherId); 
        System.out.println("TeacherName: " + teacherName); 
        System.out.println("Address: " +  address); 
        System.out.println("WorkingType: " + workingType); 
        System.out.println("EmploymentStatus: " + employmentStatus); 
        if(workingHours !=0){ 
            System.out.println("Working hours: " + workingHours); 
        } 
        else{ 
            System.out.println("Working Hours:  Not assigned "); 
        } 
             
        } 
    } 