public class L2 {


    private int number;

    private  int limit;
    public void   setLimit(int mux){
   limit=mux;
    }


    public void   click() {
this.number++;
    if (number>limit) {
  number=limit;  }


    }


    public int display(){
        return this.number;

    }



}


