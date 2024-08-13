public class jaggedArray {
    public static void main(String[] args){

        int jarray[][] = new int[5][]; 
        for(int i = 0;i<5;i++){
            jarray[i] = new int[i+1];

        }
        int count = 0;
        for(int i = 0;i<5;i++){
            
            for(int j = 0;j<jarray[i].length;j++){
                jarray[i][j] = count;
                count++;

            }
        }

        for(int i = 0;i<5;i++){
            
            for(int j = 0;j<jarray[i].length;j++){
                System.out.print(jarray[i][j]);
                System.out.print(" ");

                

            }
            System.out.println("\n");
        }

    }
    
}
