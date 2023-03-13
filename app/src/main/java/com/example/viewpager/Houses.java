package com.example.viewpager;

public enum Houses {
    VidyaGyan(R.layout.vidyagyan,R.string.vg),
    Agni(R.layout.agni,R.string.red),
    Jal(R.layout.jal,R.string.blue),
    Prithvi(R.layout.prithvi,R.string.green),
    Vayu(R.layout.vayu,R.string.yellow);

    private int layout;
    private int title;
    Houses(int layout,int title)
    {
        this.layout=layout;
        this.title=title;
    }
    public int getLayout() {
        return layout;
    }
    public int getTitle() {
        return title;
    }
//    public CharSequence get

}
