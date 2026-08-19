package p572Xa;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Xa.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9421o {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f28401a = 0;

    static {
        AbstractC9421o.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m9996a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m9997b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC10763a.m11048f(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
