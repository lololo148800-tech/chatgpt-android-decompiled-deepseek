package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.F6 */
/* JADX INFO: loaded from: classes.dex */
public final class C7887F6 extends AbstractC20851a {
    public static final Parcelable.Creator<C7887F6> CREATOR = new C8041a(11);

    /* JADX INFO: renamed from: Y */
    public final String f24817Y;

    /* JADX INFO: renamed from: Z */
    public final String f24818Z;

    /* JADX INFO: renamed from: o0 */
    public final String f24819o0;

    /* JADX INFO: renamed from: p0 */
    public final String f24820p0;

    /* JADX INFO: renamed from: q0 */
    public final String f24821q0;

    /* JADX INFO: renamed from: r0 */
    public final C7879E6 f24822r0;

    /* JADX INFO: renamed from: s0 */
    public final C7879E6 f24823s0;

    public C7887F6(String str, String str2, String str3, String str4, String str5, C7879E6 c7879e6, C7879E6 c7879e7) {
        this.f24817Y = str;
        this.f24818Z = str2;
        this.f24819o0 = str3;
        this.f24820p0 = str4;
        this.f24821q0 = str5;
        this.f24822r0 = c7879e6;
        this.f24823s0 = c7879e7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 1, this.f24817Y);
        AbstractC8199t5.m8807f(parcel, 2, this.f24818Z);
        AbstractC8199t5.m8807f(parcel, 3, this.f24819o0);
        AbstractC8199t5.m8807f(parcel, 4, this.f24820p0);
        AbstractC8199t5.m8807f(parcel, 5, this.f24821q0);
        AbstractC8199t5.m8806e(parcel, 6, this.f24822r0, i10);
        AbstractC8199t5.m8806e(parcel, 7, this.f24823s0, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
