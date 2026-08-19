package p1060v9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p960q9.C18658l;

/* JADX INFO: renamed from: v9.j */
/* JADX INFO: loaded from: classes.dex */
public final class C20492j extends AbstractC20851a {
    public static final Parcelable.Creator<C20492j> CREATOR = new C18658l(25);

    /* JADX INFO: renamed from: Y */
    public final int f65069Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f65070Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f65071o0;

    /* JADX INFO: renamed from: p0 */
    public final int f65072p0;

    /* JADX INFO: renamed from: q0 */
    public final int f65073q0;

    public C20492j(int i10, int i11, int i12, boolean z6, boolean z10) {
        this.f65069Y = i10;
        this.f65070Z = z6;
        this.f65071o0 = z10;
        this.f65072p0 = i11;
        this.f65073q0 = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f65069Y);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f65070Z ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(this.f65071o0 ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 4, 4);
        parcel.writeInt(this.f65072p0);
        AbstractC8199t5.m8813l(parcel, 5, 4);
        parcel.writeInt(this.f65073q0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
