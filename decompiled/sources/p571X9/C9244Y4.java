package p571X9;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: X9.Y4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9244Y4 extends AbstractC20851a {
    public static final Parcelable.Creator<C9244Y4> CREATOR = new C9270d0(7);

    /* JADX INFO: renamed from: Y */
    public final int f28030Y;

    /* JADX INFO: renamed from: Z */
    public final PointF f28031Z;

    public C9244Y4(int i10, PointF pointF) {
        this.f28030Y = i10;
        this.f28031Z = pointF;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f28030Y);
        AbstractC8199t5.m8806e(parcel, 2, this.f28031Z, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
