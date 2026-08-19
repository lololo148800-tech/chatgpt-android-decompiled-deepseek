package p571X9;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: X9.G */
/* JADX INFO: loaded from: classes.dex */
public final class C9132G extends AbstractC20851a {
    public static final Parcelable.Creator<C9132G> CREATOR = new C9270d0(0);

    /* JADX INFO: renamed from: Y */
    public final PointF[] f27907Y;

    /* JADX INFO: renamed from: Z */
    public final int f27908Z;

    public C9132G(PointF[] pointFArr, int i10) {
        this.f27907Y = pointFArr;
        this.f27908Z = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8809h(parcel, 2, this.f27907Y, i10);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(this.f27908Z);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
