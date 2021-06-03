package com.company;

public class Button {
    private String Name;
    private OnClickListner onClickListner;

    public Button(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setOnClickListner(OnClickListner onClickListner) {
        this.onClickListner = onClickListner;
    }
    /**
     * On click what happens
     */
    public void OnClick(){
        this.onClickListner.OnClick(this.Name);
    }
    /**
     * The Simple inner Interface Class
     */
    public interface OnClickListner {
        public void OnClick(String title);
    }
}
