package Cards;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;

import com.example.administrator.a1_person_project.R;

/**
 * Created by Administrator on 2017/1/11.
 */

public class Card {
    //This class contains all the information of one poker card
    private int type;
    //type:1 is clubs,2 is diamonds, 3 is hearts, 4 is spades, 0 is joker, -1 is about to delete
    private int number;
    // 1 means ace, 2 means two......13 means king, 14 is black joker, 15 is red joker
    private Bitmap cardPic;
    public Card(int type,int number,Bitmap cardPic){
        this.type=type;
        this.number=number;
        this.cardPic=cardPic;
    }

    public void setType(int type) {
        this.type=type;
    }

    public int getType() {
        return type;
    }

    public String getTypeStr(){
        switch (type){
            case 1:return "clubs";
            case 2:return "diamonds";
            case 3:return "hearts";
            case 4:return "spades";
        }
        return "";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Bitmap getCardPic() {
        return cardPic;
    }

    public void setCardPic(Bitmap cardPic) {
        this.cardPic = cardPic;
    }
}
