package p903n9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p263K9.C4601u;
import p523V9.AbstractC8199t5;
import p718e4.C13280a;

/* JADX INFO: renamed from: n9.j */
/* JADX INFO: loaded from: classes.dex */
public final class C17536j extends AbstractC20851a {
    public static final Parcelable.Creator<C17536j> CREATOR = new C13280a(27);

    /* JADX INFO: renamed from: Y */
    public final String f56089Y;

    /* JADX INFO: renamed from: Z */
    public final String f56090Z;

    /* JADX INFO: renamed from: o0 */
    public final String f56091o0;

    /* JADX INFO: renamed from: p0 */
    public final String f56092p0;

    /* JADX INFO: renamed from: q0 */
    public final Uri f56093q0;

    /* JADX INFO: renamed from: r0 */
    public final String f56094r0;

    /* JADX INFO: renamed from: s0 */
    public final String f56095s0;

    /* JADX INFO: renamed from: t0 */
    public final String f56096t0;

    /* JADX INFO: renamed from: u0 */
    public final C4601u f56097u0;

    public C17536j(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, C4601u c4601u) {
        AbstractC20502t.m21157h(str);
        this.f56089Y = str;
        this.f56090Z = str2;
        this.f56091o0 = str3;
        this.f56092p0 = str4;
        this.f56093q0 = uri;
        this.f56094r0 = str5;
        this.f56095s0 = str6;
        this.f56096t0 = str7;
        this.f56097u0 = c4601u;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17536j)) {
            return false;
        }
        C17536j c17536j = (C17536j) obj;
        return AbstractC20502t.m21161l(this.f56089Y, c17536j.f56089Y) && AbstractC20502t.m21161l(this.f56090Z, c17536j.f56090Z) && AbstractC20502t.m21161l(this.f56091o0, c17536j.f56091o0) && AbstractC20502t.m21161l(this.f56092p0, c17536j.f56092p0) && AbstractC20502t.m21161l(this.f56093q0, c17536j.f56093q0) && AbstractC20502t.m21161l(this.f56094r0, c17536j.f56094r0) && AbstractC20502t.m21161l(this.f56095s0, c17536j.f56095s0) && AbstractC20502t.m21161l(this.f56096t0, c17536j.f56096t0) && AbstractC20502t.m21161l(this.f56097u0, c17536j.f56097u0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f56089Y, this.f56090Z, this.f56091o0, this.f56092p0, this.f56093q0, this.f56094r0, this.f56095s0, this.f56096t0, this.f56097u0});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 1, this.f56089Y);
        AbstractC8199t5.m8807f(parcel, 2, this.f56090Z);
        AbstractC8199t5.m8807f(parcel, 3, this.f56091o0);
        AbstractC8199t5.m8807f(parcel, 4, this.f56092p0);
        AbstractC8199t5.m8806e(parcel, 5, this.f56093q0, i10);
        AbstractC8199t5.m8807f(parcel, 6, this.f56094r0);
        AbstractC8199t5.m8807f(parcel, 7, this.f56095s0);
        AbstractC8199t5.m8807f(parcel, 8, this.f56096t0);
        AbstractC8199t5.m8806e(parcel, 9, this.f56097u0, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
