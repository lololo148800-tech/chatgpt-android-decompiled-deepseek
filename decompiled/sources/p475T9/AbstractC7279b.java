package p475T9;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: T9.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7279b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f23071a = 0;

    static {
        AbstractC7279b.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m7731a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m7732b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iDataAvail).length() + 45);
        sb2.append("Parcel data not fully consumed, unread size: ");
        sb2.append(iDataAvail);
        throw new BadParcelableException(sb2.toString());
    }
}
