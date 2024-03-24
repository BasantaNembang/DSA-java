public class ArrayP {

    static void add(){ //To add
        int number[]={1,2,3,4,5,10};
        int sum=0;
        int i=0;
        while (i<number.length) {
            sum=sum+number[i];
            i++;
        }
        System.out.println(sum);    
    }

    static void findLargest(){  //To find largest number
    int number[]={1,0,2,3,12,17,4,5,10};
    int largest=0;
    for(int i=0; i<number.length; i++){
        if(number[i]>largest){
            largest=number[i];
        }
    }  System.out.println("Big number is "+largest);
    }

    //Search data at Array
    static void Find(int x){   //linear search   
    int nb[]={1,0,2,3,12,17,4,5,3,10};
       int found=-1;
       int i=0;
       for(i=0; i<nb.length; i++ ){
        if(nb[i]==x){
            found=i;
            break;
        }
       } 
       System.out.println("found at index "+found);
       //Print -1 if not found
    }

    public static void main(String[] args) {
       // add();
       //findLargest();
     Find(3);
    
}
    
}
