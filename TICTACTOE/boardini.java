import java.util.Scanner;


 public class Boardini{
    static char[][] arr= new char[3][3] ;    
    static{ 
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=' ';
            }
                 }
     }          
    public boolean empty (int x, int y){
        if(arr[x][y]==' ') {return true;}
        else { return false; }
    }
    public  boolean win(int x,int y){
        if(arr[x][y]=='X'){ arr[x][y]='x';  }
        if(arr[x][y]=='O'){ arr[x][y]='o';  }

         final int[] x1= new int[]{0,0,-1,1,-1,-1,1,1};   //up,down,left,right,leftup,leftdown,ru,rd 
        
         final int[] y1= new int[]{1,-1,0,0,1,-1,1,-1}; 
        for(int i=0;i<8;i++){
            
               if(x+x1[i]<3 && x+x1[i]>=0 && y+y1[i]<3 && y+y1[i]>=0){
                if(arr[x][y]==arr[x+x1[i]][y+y1[i]])
                {
                    if(x+2*x1[i]<3 && x+2*x1[i]>=0 && y+2*y1[i]<3 && y+2*y1[i]>=0)
                    {  
                        if(arr[x][y]==arr[x+2*x1[i]][y+2*y1[i]])
                        {
                            return true;
                        }
                        else { return false;}

                    }
                    else if(x-x1[i]<3 && x-x1[i]>=0 && y-y1[i]<3 && y-y1[i]>=0){
                        if(arr[x][y]==arr[x-x1[i]][y-y1[i]])
                        {
                            return true;
                        }
                        else 
                        { return false;}

                    }
                }
               
            }
                 }
          return false;
    }
public static void main(String[] args) {
    Boardini a= new Boardini();
   
    Scanner news= new Scanner(System.in);
    



        int x=news.nextInt();
        int y=news.nextInt();
        String s=news.nextLine();
        Boardini.arr[x][y]=s.charAt(1);
            if(a.win(x,y)){System.out.println("ok");}
           
    
    news.close();            

}

}
