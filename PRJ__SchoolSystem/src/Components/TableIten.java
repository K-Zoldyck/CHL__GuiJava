
package Components;


public class TableIten{
    private String _text;
    private String _type;
    private int _id;
        
    public TableIten(int id, String text, String type){
        this._text = text;
        this._id = id;
        this._type = type;
    }
     
    public String getType() {return this._type;}

    @Override
    public String toString(){
        return this._text;
    }
    
    public int getId() {return this._id;}
    public String getTable() {return this._type;}

}
