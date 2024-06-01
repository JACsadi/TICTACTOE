import java.util.Scanner;

import jva.util.*;
public class boardini{
    char[][] arr= new char[3][3] ;    
    boardini(){ 
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=' ';
            }
                 }
    }          
    boolean empty (int x, int y){
        if(arr[x][y]==' ') {return true;}
        else { return false; }
    }
    boolean win(int x,int y){
        if(arr[x][y]=='X'){ arr[x][y]='x';  }
        if(arr[x][y]=='O'){ arr[x][y]='o';  }

        int[] x1= new int[]{0,0,-1,1,-1,-1,1,1};   //up,down,left,right,leftup,leftdown,ru,rd 
        
        int[] y1= new int[]{1,-1,0,0,1,-1,1,-1}; 
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
               if(x+x1[j]<3 && x+x1[j]>=0 && y+y1[i]<3 && y+y1[i]>=0){
                if(arr[x][y]==arr[x+x1[j]][y+y1[i]])
                {
                    if(x+2*x1[j]<3 && x+2*x1[j]>=0 && y+2*y1[i]<3 && y+2*y1[i]>=0)
                    {  
                        if(arr[x][y]==arr[x+2*x1[j]][y+2*y1[i]])
                        {
                            return true;
                        }
                        else { return false;}

                    }
                    else if(x-x1[j]<3 && x-x1[j]>=0 && y-y1[i]<3 && y-y1[i]>=0){
                        if(arr[x][y]==arr[x-x1[j]][y-y1[i]])
                        {
                            return true;
                        }
                        else 
                        { return false;}

                    }
                }
               }
            }
                 }
          return false;
    }
public static void main(String[] args) {
    boardini a=new boardini();
    Scanner news= new Scanner(System.in);
    char s=news.nextLine();
    while(1){
        char x=news.nextLine();
        char y=news.nextLine();
        char s=news.nextLine();
        if(empty(x,y))

    }
    
}

}