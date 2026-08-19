package p594Y9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: Y9.d5 */
/* JADX INFO: loaded from: classes.dex */
public final class C9875d5 extends AbstractC20851a {
    public static final Parcelable.Creator<C9875d5> CREATOR = new C9864c1(9);

    /* JADX INFO: renamed from: Y */
    public final C9967s4[] f29382Y;

    /* JADX INFO: renamed from: Z */
    public final C9700B0 f29383Z;

    /* JADX INFO: renamed from: o0 */
    public final C9700B0 f29384o0;

    /* JADX INFO: renamed from: p0 */
    public final String f29385p0;

    /* JADX INFO: renamed from: q0 */
    public final float f29386q0;

    /* JADX INFO: renamed from: r0 */
    public final String f29387r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f29388s0;

    public C9875d5(C9967s4[] c9967s4Arr, C9700B0 c9700b0, C9700B0 c9700b1, String str, float f10, String str2, boolean z6) {
        this.f29382Y = c9967s4Arr;
        this.f29383Z = c9700b0;
        this.f29384o0 = c9700b1;
        this.f29385p0 = str;
        this.f29386q0 = f10;
        this.f29387r0 = str2;
        this.f29388s0 = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8809h(parcel, 2, this.f29382Y, i10);
        AbstractC8199t5.m8806e(parcel, 3, this.f29383Z, i10);
        AbstractC8199t5.m8806e(parcel, 4, this.f29384o0, i10);
        AbstractC8199t5.m8807f(parcel, 5, this.f29385p0);
        AbstractC8199t5.m8813l(parcel, 6, 4);
        parcel.writeFloat(this.f29386q0);
        AbstractC8199t5.m8807f(parcel, 7, this.f29387r0);
        AbstractC8199t5.m8813l(parcel, 8, 4);
        parcel.writeInt(this.f29388s0 ? 1 : 0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
