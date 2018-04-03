package mvpproject.com.mbox.mvpproject.base.adapter;

import android.os.Parcel;
import android.os.Parcelable;

public class BaseItem implements Parcelable {

    protected int type;

    public BaseItem(int type) {
        this.type = type;
    }

    public BaseItem() {
    }

    protected BaseItem(Parcel in) {
        type = in.readInt();
    }

    public int getType() {
        return type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (BaseItem) super.clone();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.type);
    }

    public static final Creator<BaseItem> CREATOR = new Creator<BaseItem>() {
        @Override
        public BaseItem createFromParcel(Parcel in) {
            return new BaseItem(in);
        }

        @Override
        public BaseItem[] newArray(int size) {
            return new BaseItem[size];
        }
    };

}
