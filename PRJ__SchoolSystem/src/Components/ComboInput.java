package Components;


  public class ComboInput{
        private String _text;
        private int _id;
        
        public ComboInput(){}
        public ComboInput(int id, String text){
            this._text = text;
            this._id = id;
        }
        
        public void setText(String text) {this._text = text;}

        public void setId(int id) {this._id = id;}
        
        public String getText() {return this._text;}
        public int getId() {
            return this._id;
        }
        
        @Override
        public String toString(){
            return this._text;
        }
}