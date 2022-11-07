public class l1 {


        private int number;
        private boolean rot1=true;




        public void click(){

         this. number ++;

        }


        public void retern(){
            this.number=0;

        }

        public int display(){
            return this.number;

        }
        public void undo(){
           this.number=(this.rot1==true)?this.number-1:this.number-0;
rot1=false;

        }


    }


