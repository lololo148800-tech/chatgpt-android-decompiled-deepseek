package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.K6 */
/* JADX INFO: loaded from: classes.dex */
public final class C7927K6 extends AbstractC20851a {
    public static final Parcelable.Creator<C7927K6> CREATOR = new C8041a(17);

    /* JADX INFO: renamed from: Y */
    public final String f25145Y;

    /* JADX INFO: renamed from: Z */
    public final String f25146Z;

    /* JADX INFO: renamed from: o0 */
    public final String f25147o0;

    /* JADX INFO: renamed from: p0 */
    public final String f25148p0;

    /* JADX INFO: renamed from: q0 */
    public final String f25149q0;

    /* JADX INFO: renamed from: r0 */
    public final String f25150r0;

    /* JADX INFO: renamed from: s0 */
    public final String f25151s0;

    public C7927K6(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f25145Y = str;
        this.f25146Z = str2;
        this.f25147o0 = str3;
        this.f25148p0 = str4;
        this.f25149q0 = str5;
        this.f25150r0 = str6;
        this.f25151s0 = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 1, this.f25145Y);
        AbstractC8199t5.m8807f(parcel, 2, this.f25146Z);
        AbstractC8199t5.m8807f(parcel, 3, this.f25147o0);
        AbstractC8199t5.m8807f(parcel, 4, this.f25148p0);
        AbstractC8199t5.m8807f(parcel, 5, this.f25149q0);
        AbstractC8199t5.m8807f(parcel, 6, this.f25150r0);
        AbstractC8199t5.m8807f(parcel, 7, this.f25151s0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
