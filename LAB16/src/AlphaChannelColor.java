public class AlphaChannelColor extends Color {
    private int opacity;

    public AlphaChannelColor(int red, int green, int blue, int opacity) {
        super(red, green, blue);
        this.opacity = opacity;
    }

    public AlphaChannelColor(int red, int green, int blue, String name, int opacity) {
        super(red, green, blue, name);
        this.opacity = opacity;
    }

    @Override
    public String getName(){
        if(opacity<100) return "opaque "+super.getName();
        else if(opacity>=100 && opacity<=199)return "semi-transparent " + super.getName();
        else if(opacity>=200) return "transparent "+ super.getName() ;
        return "transparent "+ super.getName();
    }


}
