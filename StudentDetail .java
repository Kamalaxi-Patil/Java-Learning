 import java.io.*; 
        class StudentDetail 
            { 
               int Roll,hindi,eng; 
               String NameID; 
               StudentDetail(int p, String q, int r, int s) 
                   { 
                      Roll = p; 
                      NameID=q; 
                      hindi=r; 
                      eng=s; 
                   } 
                       void ShowData() 
                        { 
                           System.out.println("Roll Number : "+Roll); 
                           System.out.println("Students Name : "+NameID); 
                           System.out.println("Hindi Marks : "+hindi); 
                           System.out.println("English Marks : "+eng); 
                        } 
            } 
                   class StudentDetail 
                     { 
                        public static void main(String args[]) throws IOException 
                            { 
                                BufferedReader Br =new BufferedReader(new InputStreamReader(System.in)); 
                                String read,Name; 
                                int RollNumber,Hindi,English; 
                                System.out.println("Enter Class Roll Number : "); 
                                read=Br.readLine(); 
                                RollNumber = Integer.parseInt(read); 
                                System.out.println("Enter Name of the Student : "); 
                                Name=Br.readLine(); 
                                System.out.println("Enter Hindi Marks : "); 
                                read=Br.readLine(); 
                                Hindi=Integer.parseInt(read); 
                                System.out.println("Enter English Marks : "); 
                                read=Br.readLine(); 
                                English=Integer.parseInt(read); 
                                StudentDetail std= new StudentDetail(RollNumber,Name,Hindi,English); 
                                System.out.println("Details of the Student Entered are :"); 
                                std.ShowData(); 
                           } 
                    } 