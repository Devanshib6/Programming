    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    import java.awt.Image.*;
    import java.util.ArrayList;
    
    public class TeacherGUI extends JFrame{
        private JFrame jframe1;
        private JFrame jframe2;
        private JFrame jframe3;
        private JLabel label;
        private JLabel label2;
        private JLabel label3;
        private JPanel panel;
        private ImageIcon backgroundImage;
        ArrayList <Teacher> teacher= new  ArrayList<>();
        
        public TeacherGUI(){
            jframe1 = new JFrame();
            jframe1.setTitle("TEACHER MANAGEMENT SYSTEM");
            jframe1.setVisible(true);
            jframe1.setSize(1500,1500);
            jframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ArrayList<Teacher> teacherList = new ArrayList<>();
            backgroundImage = new ImageIcon("welcome26.png");
            
            panel = new JPanel(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    g.drawImage(backgroundImage.getImage(), 10,40,650,700, this);
                }};
                panel.setLayout(null);
                jframe1.add(panel);
                panel.setVisible(true);
                panel.setBackground(Color.yellow);
                
                JLabel labelOne = new JLabel("TEACHER MANAGEMENT SYSTEM");
                labelOne.setBounds(780,300,600,50);
                labelOne.setFont(new Font("SERIF", Font.BOLD, 32));
                labelOne.setForeground(Color.DARK_GRAY);
                panel.add(labelOne);
                
                JButton buttonOne = new JButton("Lecturer");
                buttonOne.setBounds(700,710,150,70);
                buttonOne.setFont(new Font("SERIF", Font.BOLD, 24));
                buttonOne.setForeground(Color.WHITE);
                buttonOne.setBackground(Color.DARK_GRAY);
                panel.add(buttonOne);
            
            JButton buttonTwo = new JButton("Tutor");
            buttonTwo.setBounds(1030,710,150,70);
            buttonTwo.setFont(new Font("SERIF", Font.BOLD, 24)); 
            buttonTwo.setForeground(Color.WHITE);                  
            buttonTwo.setBackground(Color.DARK_GRAY);                
            panel.add(buttonTwo);
            
            JButton buttonThree = new JButton("Exit");
            buttonThree.setBounds(1350,710,150,70);
            buttonThree.setFont(new Font("SERIF", Font.BOLD, 24)); 
            buttonThree.setForeground(Color.WHITE);
            buttonThree.setBackground(Color.DARK_GRAY);                
            panel.add(buttonThree);
            
            buttonOne.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    lecturer();
                }
            });
            
            buttonTwo.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    tutor();
                }
            });
            
            buttonThree.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                   JOptionPane.showMessageDialog(jframe1, "Are you sure that you want to exit?");
                   jframe1.setVisible(false); 
                }
            });
        }
        
        public void lecturer()
        {
            jframe2 = new JFrame();
            jframe2.setTitle("LECTURER");
            jframe2.setVisible(true);
            jframe2.setSize(1000,1000);
            jframe2.setLayout(null);
            jframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            jframe2.getContentPane().setBackground(Color.orange);
            
            JLabel labelOne = new JLabel("Teacher ID");
            jframe2.add(labelOne);
            labelOne.setBounds(500,120,500,50);
            labelOne.setFont(new Font("SERIF", Font.BOLD, 24)); 
            labelOne.setForeground(Color.DARK_GRAY);      
        
            JLabel labelTwo= new JLabel("Teacher Name");
            labelTwo.setFont(new Font("SERIF", Font.BOLD, 24)); 
            labelTwo.setForeground(Color.DARK_GRAY);      
            jframe2.add(labelTwo);
            labelTwo.setBounds(500,175,500,50);
        
            JLabel labelThree = new JLabel("Address");
            jframe2.add(labelThree);
            labelThree.setBounds(500,230,500,50);
            labelThree.setFont(new Font("SERIF", Font.BOLD, 24)); 
            labelThree.setForeground(Color.DARK_GRAY);   
            
            JLabel labelFour = new JLabel("Working Type");
            jframe2.add(labelFour);
            labelFour.setBounds(500,285,500,50);
             labelFour.setForeground(Color.DARK_GRAY);   
             labelFour.setFont(new Font("SERIF", Font.BOLD, 24));
            
            JLabel labelFive = new JLabel("Employment Status");
            jframe2.add(labelFive);
            labelFive .setBounds(500,340,500,50);
            labelFive .setForeground(Color.DARK_GRAY);   
            labelFive .setFont(new Font("SERIF", Font.BOLD, 24)); 
            
            JLabel labelSix= new JLabel("Graded Score");
            jframe2.add(labelSix);
            labelSix.setBounds(500,395,500,50);
            labelSix.setForeground(Color.DARK_GRAY);   
            labelSix.setFont(new Font("SERIF", Font.BOLD, 24));
            
            JLabel labelSeven = new JLabel("Years Of Experience");
            jframe2.add(labelSeven);
            labelSeven.setBounds(500,450,500,50);
            labelSeven.setForeground(Color.DARK_GRAY);   
            labelSeven.setFont(new Font("SERIF", Font.BOLD, 24)); 
            
            JLabel labelEight = new JLabel("Department");
            jframe2.add(labelEight);
            labelEight.setBounds(500,505,500,50);
            labelEight.setForeground(Color.DARK_GRAY);   
            labelEight.setFont(new Font("SERIF", Font.BOLD, 24)); 
            
            JLabel labelNine = new JLabel("LECTURER");
            jframe2.add(labelNine);
            labelNine.setBounds(600,40,600,50);
            labelNine.setFont(new Font("SERIF", Font.BOLD, 32)); 
            labelNine.setForeground(Color.DARK_GRAY);  
            
            JButton buttonOne = new JButton("Add");
            jframe2.add(buttonOne);
            buttonOne.setBounds(500,570,90,40);
            buttonOne.setFont(new Font("SERIF", Font.BOLD, 24)); 
            buttonOne.setForeground(Color.WHITE);
            buttonOne.setBackground(Color.DARK_GRAY);  
            
            JButton buttonTwo = new JButton("Clear");
            jframe2.add(buttonTwo);
            buttonTwo.setBounds(600,570,90,40);
             buttonTwo.setFont(new Font("SERIF", Font.BOLD, 24)); 
             buttonTwo.setForeground(Color.WHITE);
             buttonTwo.setBackground(Color.DARK_GRAY);      
            
            JButton buttonThree = new JButton("Display");
            jframe2.add(buttonThree);
            buttonThree.setBounds(700,570,170,40);
            buttonThree.setFont(new Font("SERIF", Font.BOLD, 24)); 
            buttonThree.setForeground(Color.WHITE);
            buttonThree.setBackground(Color.DARK_GRAY);      
            
            JButton buttonFour = new JButton("Grade Assignment");
            jframe2.add(buttonFour);
            buttonFour.setBounds(880,570,250,40);
            buttonFour.setFont(new Font("SERIF", Font.BOLD, 24)); 
            buttonFour.setForeground(Color.WHITE);
            buttonFour.setBackground(Color.DARK_GRAY);      
            
            JButton buttonFive= new JButton("Back");
            jframe2.add(buttonFive);
            buttonFive.setBounds(10,710,100,70);
            buttonFive.setFont(new Font("SERIF", Font.BOLD, 24));
            buttonFive.setForeground(Color.WHITE);
            buttonFive.setBackground(Color.DARK_GRAY);                
            
            JButton buttonSix = new JButton("Next");
            jframe2.add(buttonSix);
            buttonSix.setBounds(1420,710,100,70);
            buttonSix.setFont(new Font("SERIF", Font.BOLD, 24)); 
            buttonSix.setForeground(Color.WHITE);
            buttonSix.setBackground(Color.DARK_GRAY);                
            
            JTextField f1 = new JTextField();
            jframe2.add(f1);
            f1.setBounds(740,120,140,50);
            
            JTextField f2 = new JTextField();
            jframe2.add(f2);
            f2.setBounds(740,175,140,50);
            
            JTextField f3 = new JTextField();
            jframe2.add(f3);
            f3.setBounds(740,230,140,50);
            
            JTextField f4 = new JTextField();
            jframe2.add(f4);
            f4.setBounds(740,285,140,50);
            
            JTextField f5 = new JTextField();
            jframe2.add(f5);
            f5.setBounds(740,340,140,50);
            
            JTextField f6 = new JTextField();
            jframe2.add(f6);
            f6.setBounds(740,395,140,50);
            
            JTextField f7 = new JTextField();
            jframe2.add(f7);
            f7.setBounds(740,450,140,50);
            
            JTextField f8 = new JTextField();
            jframe2.add(f8);
            f8.setBounds(740,505,140,50);
            
            buttonOne.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    String teacherIdTi = f1.getText();
                    String teacherName = f2.getText();
                    String address = f3.getText();
                    String workingType = f4.getText();
                    String employmentStatus = f5.getText();
                    String gradedScoreGs = f6.getText();
                    String yearsOfExperienceYoe = f7.getText();
                    String department = f8.getText();
    
            if (teacherIdTi.isEmpty() || teacherName.isEmpty() || address.isEmpty() || workingType.isEmpty() ||
                    employmentStatus.isEmpty() || gradedScoreGs.isEmpty() || yearsOfExperienceYoe.isEmpty() || department.isEmpty()) {
                JOptionPane.showMessageDialog(jframe2, "Please fill in all the required information.");
            } else {
                try {
                    int teacherId = Integer.parseInt(teacherIdTi);
                    int gradedScore = Integer.parseInt(gradedScoreGs);
                    int yearsOfExperience = Integer.parseInt(yearsOfExperienceYoe);
                    int workingHours = 0;
                    Lecturer lecturer;
                    boolean isAdded = false;
    
                    if (teacher.isEmpty()) {
                        teacher.add(new Lecturer(department, yearsOfExperience, teacherId, teacherName, address, workingType, employmentStatus, workingHours));
                        JOptionPane.showMessageDialog(jframe2, "Lecturer added successfully");
                    } else {
                        for (Teacher teacher : teacher) {
                            if (teacher instanceof Lecturer) {
                                lecturer = (Lecturer) teacher;
                                if (lecturer.getTeacherID() == teacherId) {
                                    JOptionPane.showMessageDialog(jframe2, "ID already exists");
                                    isAdded = true;
                                    break;
                                }
                            }
                        }
    
                        if (!isAdded) {
                            teacher.add(new Lecturer(department, yearsOfExperience, teacherId, teacherName, address, workingType, employmentStatus, workingHours));
                            JOptionPane.showMessageDialog(jframe2, "Lecturer added successfully");
                        }
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(jframe2, "Invalid Input!! Please provide numeric value");
                }
            }
        }
    });
            
          buttonTwo.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    f1.setText("");
                    f2.setText("");
                    f3.setText("");
                    f4.setText("");
                    f5.setText("");
                    f6.setText("");
                    f7.setText("");
                    f8.setText("");
                }
            });
           
            buttonThree.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                  JTextArea displayTextArea = new JTextArea(); 
                  displayTextArea.setEditable(false); 
                  for(Teacher teacher: teacher)
                  {
                      if (teacher instanceof Lecturer)
                      {
                          Lecturer lecturer = (Lecturer) teacher; 
                          displayTextArea.append("Teacher Id is : " + lecturer.getTeacherID()+ "\n"); 
                          displayTextArea.append("Teacher Name is: " + lecturer.getTeacherName()+"\n");
                          displayTextArea.append("Address is: " + lecturer.getAddress()+"\n");
                          displayTextArea.append("Working Type is" + lecturer.getWorkingType() + "\n");
                          displayTextArea.append("Employment Status is " + lecturer.getEmploymentStatus()+"\n");
                          displayTextArea.append("Graded Score is " + lecturer.getGradedScore() + "\n");
                          displayTextArea.append("Years of experience is" + lecturer.getYearsOfExperience() + "\n");
                          displayTextArea.append("Department is" + lecturer.getDepartment() + "\n");  
                          displayTextArea.append("\n");
                      } else if (teacher instanceof Tutor)
                      {
                          Tutor tutor = (Tutor) teacher;
                          displayTextArea.append("Teacher Id is : " + tutor.getTeacherID()+ "\n");
                          displayTextArea.append("Teacher Name is: " + tutor.getTeacherName()+"\n");
                          displayTextArea.append("Address is: " + tutor.getAddress()+"\n");
                          displayTextArea.append("Salary is " + tutor.getSalary()+"\n");
                          displayTextArea.append("Working Type is" + tutor.getWorkingType() + "\n");
                          displayTextArea.append("Employment Status is " + tutor.getWorkingType()+"\n");
                          displayTextArea.append("Specialization is " + tutor.getSpecialization() + "\n");
                         displayTextArea.append("Academic Qualification is" + tutor.getAcademicQualification()+ "\n" );
                         displayTextArea.append("Performance Index is" + tutor.getPerformanceIndex() + "\n");
                         displayTextArea.append("\n");
                        }
                      JScrollPane scrollPane = new JScrollPane(displayTextArea); 
                      scrollPane.setSize(new Dimension(600, 400));
                     JOptionPane.showMessageDialog(null, scrollPane, "Teacher Information", JOptionPane.INFORMATION_MESSAGE);
                     
                  }
                }
            });
            
            
    buttonFour.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int enteredTeacherId;
        try {
          enteredTeacherId = Integer.parseInt(f1.getText());
        } catch (NumberFormatException ae) {
          JOptionPane.showMessageDialog(jframe2, "Please enter a valid Teacher ID.");
          return;
        }
    
        Lecturer foundLecturer = null;
        for (Teacher teacher : teacher) {
          if (teacher instanceof Lecturer) {
            Lecturer lecturer = (Lecturer) teacher;
            if (lecturer.getTeacherID() == enteredTeacherId) {
              foundLecturer = lecturer;
              break;
            }
          }
        }
    
        if (foundLecturer == null) {
          JOptionPane.showMessageDialog(jframe2, "No lecturer found with the entered Teacher ID.");
          return;
        }
    
        String newGradeScore = JOptionPane.showInputDialog(jframe2, "Enter new graded score:");
        if (newGradeScore == null) {
          return; 
        }
    
        try {
          int gradeScore = Integer.parseInt(newGradeScore);
          foundLecturer.setgradedScore(gradeScore);
          JOptionPane.showMessageDialog(jframe2, "Grade Score updated successfully!");
        } catch (NumberFormatException ex) {
          JOptionPane.showMessageDialog(jframe2, "Invalid input! Please enter a valid number.");
        }
      }
    });
    
          
               buttonFive.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                firstframe();   
                }
            });
            
            
            buttonSix.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                tutor();   
                }
            });
            
        }
         
            
    
    
         
        public void tutor(){
            
            jframe3 = new JFrame();
            jframe3.setTitle("TUTOR");
            jframe3.setVisible(true);
            jframe3.setSize(1000,1000);
            jframe3.setLayout(null);
            jframe3.getContentPane().setBackground(Color.orange);
            
            
            
           
            JLabel labelOne = new JLabel("Teacher Id");
            jframe3.add(labelOne);
            labelOne.setBounds(500,120,500,50);
            labelOne.setFont(new Font("SERIF", Font.BOLD, 24)); 
            labelOne.setForeground(Color.DARK_GRAY);      
            
            
            JLabel labelTwo= new JLabel("Teacher Name");
            jframe3.add(labelTwo);
            labelTwo.setBounds(500,175,500,50);
            labelTwo.setFont(new Font("SERIF", Font.BOLD, 24)); 
            labelTwo.setForeground(Color.DARK_GRAY);      
            
            
            
            
            JLabel labelThree = new JLabel("Address");
            jframe3.add(labelThree);
            labelThree.setBounds(500,230,500,50);
            labelThree.setFont(new Font("SERIF", Font.BOLD, 24)); 
            labelThree.setForeground(Color.DARK_GRAY);      
            
            
            
            JLabel labelFour = new JLabel("Working Type");
            jframe3.add(labelFour);
            labelFour.setBounds(500,285,500,50);
            labelFour.setFont(new Font("SERIF", Font.BOLD, 24)); 
            labelFour.setForeground(Color.DARK_GRAY);      
            
            
            
            JLabel labelFive = new JLabel("Salary");
            jframe3.add(labelFive);
            labelFive.setBounds(500,340,500,50);
            labelFive.setFont(new Font("SERIF", Font.BOLD, 24)); 
            labelFive.setForeground(Color.DARK_GRAY);      
            
            
            
            JLabel labelSix = new JLabel("Employment Status");
            jframe3.add(labelSix);
            labelSix.setBounds(500,395,500,50);
            labelSix.setFont(new Font("SERIF", Font.BOLD, 24)); 
            labelSix.setForeground(Color.DARK_GRAY);      
            
            
            JLabel labelSeven = new JLabel("Specialization");
            jframe3.add(labelSeven);
            labelSeven.setBounds(500,450,500,50);
            labelSeven.setFont(new Font("SERIF", Font.BOLD, 24)); 
            labelSeven.setForeground(Color.DARK_GRAY);      
            
            
            JLabel labelEight = new JLabel("Academic Qualification");
            jframe3.add(labelEight);
            labelEight.setBounds(500,505,500,50);
            labelEight.setFont(new Font("SERIF", Font.BOLD, 24)); 
            labelEight.setForeground(Color.DARK_GRAY);      
            
            
            
            JLabel labelNine= new JLabel("Performance Index");
            jframe3.add(labelNine);
            labelNine.setBounds(500,560,500,50);
            labelNine.setFont(new Font("SERIF", Font.BOLD, 24)); 
            labelNine.setForeground(Color.DARK_GRAY);      
            
            
            
            JLabel labelTen = new JLabel("Working Hours");
            jframe3.add(labelTen);
            labelTen.setBounds(500,615,500,50);
            labelTen.setFont(new Font("SERIF", Font.BOLD, 24)); 
            labelTen.setForeground(Color.DARK_GRAY);      
            
            
            JLabel labelEleven = new JLabel("TUTOR");
            jframe3.add(labelEleven);
            labelEleven.setBounds(600,40,600,50);
            labelEleven.setFont(new Font("SERIF", Font.BOLD, 32)); 
            labelEleven.setForeground(Color.DARK_GRAY);  
            
            
            
            
            
            JButton buttonOne = new JButton("Add");
            jframe3.add(buttonOne);
            buttonOne.setBounds(500,690,90,40);
            buttonOne.setFont(new Font("SERIF", Font.BOLD, 24)); 
            buttonOne.setForeground(Color.WHITE);
            buttonOne.setBackground(Color.DARK_GRAY);      
            
            
            JButton buttonTwo= new JButton("Clear");
            jframe3.add(buttonTwo);
            buttonTwo.setBounds(600,690,90,40);
            buttonTwo.setFont(new Font("SERIF", Font.BOLD, 24)); 
            buttonTwo.setForeground(Color.WHITE);
            buttonTwo.setBackground(Color.DARK_GRAY); 
            
            JButton buttonThree = new JButton("Display");
            jframe3.add(buttonThree);
            buttonThree.setBounds(700,690,170,40);
            buttonThree.setFont(new Font("SERIF", Font.BOLD, 24)); 
            buttonThree.setForeground(Color.WHITE);
            buttonThree.setBackground(Color.DARK_GRAY);      
            
            
            
            JButton buttonFour = new JButton("Set Salary");
            jframe3.add(buttonFour);
            buttonFour.setBounds(880,690,180,40);
            buttonFour.setFont(new Font("SERIF", Font.BOLD, 24)); 
            buttonFour.setForeground(Color.WHITE);
            buttonFour.setBackground(Color.DARK_GRAY);    
            
            
            JButton buttonFive = new JButton("Remove");
            jframe3.add(buttonFive);
            buttonFive.setBounds(1070,690,150,40);
            buttonFive.setFont(new Font("SERIF", Font.BOLD, 24)); 
            buttonFive.setForeground(Color.WHITE);
            buttonFive.setBackground(Color.DARK_GRAY);    
            
            JButton buttonSix = new JButton("Exit");
            jframe3.add(buttonSix);
            buttonSix.setBounds(1420,710,100,70);
            buttonSix.setFont(new Font("SERIF", Font.BOLD, 24));
            buttonSix.setForeground(Color.WHITE);
            buttonSix.setBackground(Color.DARK_GRAY);  
            
            JButton buttonSeven = new JButton("Back");
            jframe3.add(buttonSeven);
            buttonSeven.setBounds(10,710,100,70);
            buttonSeven.setFont(new Font("SERIF", Font.BOLD, 24)); 
            buttonSeven.setForeground(Color.WHITE);
            buttonSeven.setBackground(Color.DARK_GRAY);                
            
    
            
            
            
            JTextField f1 = new JTextField();
            jframe3.add(f1);
            f1.setBounds(740,120,140,50);
            
            
            JTextField f2 = new JTextField();
            jframe3.add(f2);
            f2.setBounds(740,175,140,50);
            
            JTextField f3 = new JTextField();
            jframe3.add(f3);
            f3.setBounds(740,230,140,50);
            
            
            JTextField f4 = new JTextField();
            jframe3.add(f4);
            f4.setBounds(740,285,140,50);
            
            
            JTextField f5 = new JTextField();
            jframe3.add(f5);
            f5.setBounds(740,340,140,50);
            
            
            
            JTextField f6 = new JTextField();
            jframe3.add(f6);
            f6.setBounds(740,395,140,50);
            
            JTextField f7 = new JTextField();
            jframe3.add(f7);
            f7.setBounds(740,450,140,50);
            
            JTextField f8 = new JTextField();
            jframe3.add(f8);
            f8.setBounds(740,505,140,50);
            
            
            JTextField f9 = new JTextField();
            jframe3.add(f9);
            f9.setBounds(740,560,140,50);
            
            
            JTextField f10 = new JTextField();
            jframe3.add(f10);
            f10.setBounds(740,615,140,50);
            
            
            buttonOne.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String teacherIdTi = f1.getText();
            String teacherName = f2.getText();
            String address = f3.getText();
            String workingType = f4.getText();
            String employmentStatus = f5.getText();
            String salarySl = f6.getText();
            String specialization = f7.getText();
            String academicQualification = f8.getText();
            String performanceIndexPi = f9.getText();
            String workingHoursWh = f10.getText();
    
            if (teacherIdTi.isEmpty() || teacherName.isEmpty() || address.isEmpty() || workingType.isEmpty() ||
                    employmentStatus.isEmpty() || salarySl.isEmpty() || specialization.isEmpty() || academicQualification.isEmpty() || workingHoursWh.isEmpty()) {
                JOptionPane.showMessageDialog(jframe3, "Please fill in all the required information.");
            } else {
                try {
                    int teacherId = Integer.parseInt(teacherIdTi);
                    int performanceIndex = Integer.parseInt(performanceIndexPi);
                    int workingHours = Integer.parseInt(workingHoursWh);
                    double salary = Double.parseDouble(salarySl);
    
                    boolean foundDuplicate = false;
                    for (Teacher teacher : teacher) {
                        if (teacher instanceof Tutor && ((Tutor) teacher).getTeacherID() == teacherId) {
                            foundDuplicate = true;
                            break;
                        }
                    }
    
                    if (!foundDuplicate) {
                        teacher.add(new Tutor(teacherId, teacherName, address, workingType, employmentStatus, workingHours, salary, specialization, academicQualification, performanceIndex));
                        JOptionPane.showMessageDialog(jframe3, "Tutor added successfully");
                    } else {
                        JOptionPane.showMessageDialog(jframe3, "A Tutor with the same ID already exists");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(jframe3, "Invalid Input!! Please provide numeric value");
                }
            }
        }
    });
    
            
             buttonTwo.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                  f1.setText("");
                    f2.setText("");
                    f3.setText("");
                    f4.setText("");
                    f5.setText("");
                    f6.setText("");
                    f7.setText("");
                    f8.setText("");
                    f9.setText("");
                    f10.setText("");
    
                }
            });
            
            
             buttonThree.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                   JTextArea displayTextArea = new JTextArea();
                  displayTextArea.setEditable(false);
                  for(Teacher teacher: teacher){
                      if (teacher instanceof Lecturer){
                          Lecturer lecturer = (Lecturer) teacher;
                          displayTextArea.append("Teacher Id is : " + lecturer.getTeacherID()+ "\n");
                          displayTextArea.append("Teacher Name is: " + lecturer.getTeacherName()+"\n");
                          displayTextArea.append("Address is: " + lecturer.getAddress()+"\n");
                          displayTextArea.append("Working Type is" + lecturer.getWorkingType() + "\n");
                          displayTextArea.append("Employment Status is " + lecturer.getWorkingType()+"\n");
                          displayTextArea.append("Graded Score is " + lecturer.getGradedScore() + "\n");
                          displayTextArea.append("Years of experience is" + lecturer.getYearsOfExperience() + "\n");
                          displayTextArea.append("Department is" + lecturer.getDepartment() + "\n");  
                          displayTextArea.append("\n");
                      } else if (teacher instanceof Tutor){
                          Tutor tutor = (Tutor) teacher;
                          displayTextArea.append("Teacher Id is : " + tutor.getTeacherID()+ "\n");
                          displayTextArea.append("Teacher Name is: " + tutor.getTeacherName()+"\n");
                          displayTextArea.append("Address is: " + tutor.getAddress()+"\n");
                          displayTextArea.append("Salary is " + tutor.getSalary()+"\n");
                          displayTextArea.append("Working Type is" + tutor.getWorkingType() + "\n");
                          displayTextArea.append("Employment Status is " + tutor.getWorkingType()+"\n");
                          displayTextArea.append("Specialization is " + tutor.getSpecialization() + "\n");
                         displayTextArea.append("Academic Qualification is" + tutor.getAcademicQualification()+ "\n" );
                         displayTextArea.append("Performance Index is" + tutor.getPerformanceIndex() + "\n");
                         displayTextArea.append("\n");
                         }
                      JScrollPane scrollPane = new JScrollPane(displayTextArea);
                      scrollPane.setSize(new Dimension(600, 400));
                     JOptionPane.showMessageDialog(null, scrollPane, "Teacher Information", JOptionPane.INFORMATION_MESSAGE);
                     
                  }
                }  
                
            });
            
            
      buttonFour.addActionListener(new ActionListener() { // Change buttonFour to the button you assigned for setSalary
      public void actionPerformed(ActionEvent e) {
        int enteredTeacherId;
        try {
          enteredTeacherId = Integer.parseInt(f1.getText());
        } catch (NumberFormatException ae) {
          JOptionPane.showMessageDialog(jframe3, "Please enter a valid Teacher ID.");
          return;
        }
    
        Tutor foundTutor = null;
        for (Teacher teacher : teacher) {
          if (teacher instanceof Tutor) {
            Tutor tutor = (Tutor) teacher;
            if (tutor.getTeacherID() == enteredTeacherId) {
              foundTutor = tutor;
              break;
            }
          }
        }
    
        if (foundTutor == null) {
          JOptionPane.showMessageDialog(jframe3, "No tutor found with the entered Teacher ID.");
          return;
        }
    
        String newSalary = JOptionPane.showInputDialog(jframe3, "Enter new salary:");
        if (newSalary == null) {
          return; // User canceled the input dialog
        }
    
        try {
          double salary = Double.parseDouble(newSalary);
          foundTutor.setSalary(salary);
          JOptionPane.showMessageDialog(jframe3, "Salary updated successfully!");
        } catch (NumberFormatException ex) {
          JOptionPane.showMessageDialog(jframe3, "Invalid input! Please enter a valid number.");
        }
      }
    });
       
            
            
             
             buttonFive.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    int enteredTeacherId;
            try {
                enteredTeacherId = Integer.parseInt(f1.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(jframe3, "Please enter a valid Teacher ID.");
                return;
            }
    
            
            Tutor foundTutor = null;
            for (Teacher teacher : teacher) {
                if (teacher instanceof Tutor) {
                    Tutor tutor = (Tutor) teacher;
                    if (tutor.getTeacherID() == enteredTeacherId) {
                        foundTutor = tutor;
                        break;
                    }
                }
            }
    
            
            if (foundTutor == null) {
                JOptionPane.showMessageDialog(jframe3, "No tutor found with the entered Teacher ID.");
                return;
            }
    
            
            teacher.remove(foundTutor);
    
            
            JOptionPane.showMessageDialog(jframe3, "Tutor removed successfully.");
                }
            });
            
            
             buttonSix.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                   JOptionPane.showMessageDialog(jframe3, "Are you sure that you want to exit?");
                   jframe3.setVisible(false);
                   
                }
            });
            
            
             buttonSeven.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                  lecturer(); 
                }
            });
        }
        
        public void firstframe(){
           
            jframe1 = new JFrame();
            jframe1.setTitle("TEACHER MANAGEMENT SYSTEM");
            jframe1.setVisible(true);
            jframe1.setSize(1500,1500);
            jframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            
            
           
            backgroundImage = new ImageIcon("welcome.jpg");
            panel = new JPanel(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    
                    g.drawImage(backgroundImage.getImage(), 10,40,650,700, this);
                }
            };
            
            panel.setLayout(null);
            
            jframe1.add(panel);
            panel.setVisible(true);
            
            panel.setBackground(Color.orange);
            
            
            
            
            
            
            JLabel labelOne = new JLabel("TEACHER MANAGEMENT SYSTEM");
            labelOne.setBounds(780,300,600,50);
            labelOne.setFont(new Font("SERIF", Font.BOLD, 32)); 
            labelOne.setForeground(Color.DARK_GRAY);                 
            panel.add(labelOne);
            
            
            JButton buttonOne = new JButton("Lecturer");
            buttonOne.setBounds(700,710,150,70);
            buttonOne.setFont(new Font("SERIF", Font.BOLD, 24));
            buttonOne.setForeground(Color.WHITE);   
            buttonOne.setBackground(Color.DARK_GRAY);
            panel.add(buttonOne);
            
            JButton buttonTwo = new JButton("Tutor");
            buttonTwo.setBounds(1030,710,150,70);
            buttonTwo.setFont(new Font("SERIF", Font.BOLD, 24)); 
            buttonTwo.setForeground(Color.WHITE);                  
            buttonTwo.setBackground(Color.DARK_GRAY);                
            panel.add(buttonTwo);
            
            
            JButton buttonThree = new JButton("Exit");
            buttonThree.setBounds(1350,710,100,70);
            buttonThree.setFont(new Font("SERIF", Font.BOLD, 24)); 
            buttonThree.setForeground(Color.WHITE);
            buttonThree.setBackground(Color.DARK_GRAY);                
            panel.add(buttonThree);
            
            
    
            
            buttonOne.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    lecturer(); 
                }
            });
            
            
             
            buttonTwo.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    tutor();
                }
            });
             
            buttonThree.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                   JOptionPane.showMessageDialog(jframe1, "Are you sure that you want to exit?");
                   jframe1.setVisible(false); 
                }
            });   
        }
            
        public static void main(String[] args){
            SwingUtilities.invokeLater(() ->{
                TeacherGUI gui = new TeacherGUI();
                gui.setVisible(true);
            });
             
            
        
    } }
       
     