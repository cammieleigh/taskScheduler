import java.util.*;


public class Main {

  static public Scanner scanner = new Scanner(System.in);
    
      static void createTask(LinkedHashMap<Float, String> taskMap){

    System.out.println("Enter task");    
    String task = scanner.nextLine();  // Read user input



      System.out.println("Enter date");
      Float date = scanner.nextFloat();
      scanner.nextLine();
  

       taskMap.put(date, task);
      }

      static void viewDate(LinkedHashMap<Float, String> taskMap){
        
         System.out.println("What date would you like to look at?");
         Float selectedDate = scanner.nextFloat();
         scanner.nextLine();
      

         for (Float i : taskMap.keySet()){
          
          
            if(i.equals(selectedDate) ){
              System.out.println(taskMap.get(i));
            }
         }
         }
         static void editTask(LinkedHashMap<Float, String> taskMap){
          for (Float i : taskMap.keySet()){
            int x = 0;
            x++;
              System.out.println(x + " " + taskMap.get(i));

              
              }
              
              System.out.println("Choose a task to edit");
              int selected = scanner.nextInt();
              scanner.nextLine();
              
              Float currentKey = 0.0f;
              String currentTask = "";
              int index = 0;
              for(Float c : taskMap.keySet())
              {
                index++;
                if(index == selected){
                  currentKey = c;
                  currentTask = taskMap.get(c);

              }

             
              System.out.println("Do you want to change the task, or the date?");
              String changeType = scanner.nextLine();
            

              if(changeType.equals("T") || changeType.equals("t")){
                
              System.out.println("Insert edited task");
              String taskEdit = scanner.nextLine();
             
              taskMap.put(currentKey, taskEdit);
              }
              else if(changeType.equals("D")||changeType.equals("d")){
                
              System.out.println("Insert edited date");
              Float dateEdit = scanner.nextFloat();
              scanner.nextLine();
              taskMap.remove(c);
              taskMap.put(dateEdit, currentTask);
              }
         }
         } 

          static void deleteTask(LinkedHashMap<Float, String> taskMap){
            for (Float i : taskMap.keySet()){
              int x = 0;
              x++;
                System.out.println(x + " " + taskMap.get(i));
  
                
                }
                
                System.out.println("Choose a task to edit");
                int selected = scanner.nextInt();
                scanner.nextLine();
               
                int index = 0;
              for(Float c : taskMap.keySet())
              {
                index++;
                if(index == selected){
                  taskMap.remove(c);
                  }
          }

      
    }
    public static void main(String[] args) {

      LinkedHashMap<Float, String> taskMap = new LinkedHashMap<>();

      
     int choice = 0;
      while(choice != 5){
        System.out.println("What would you like to do?");
     
      choice = scanner.nextInt();
      scanner.nextLine();
        
        if (choice == 1){
          createTask(taskMap);
      }
      else if (choice == 2){

        viewDate(taskMap);
      }
      else if (choice == 3){
        editTask(taskMap);
      }
      else if (choice == 4){
        deleteTask(taskMap);
      }
      }
      
      scanner.close();
    }
}