public class Button {
    private String name;
    private OnClickListner onClickListner;

    public String getName() {
        return name;
    }

    public Button(String name) {
        this.name = name;
    }

    public void setOnClickListner(OnClickListner onClickListner) {
        this.onClickListner = onClickListner;
    }
    public void OnClick(){
        this.onClickListner.onClick(this.name);
    }

    public interface OnClickListner{
        public void onClick(String name);
    }
}

