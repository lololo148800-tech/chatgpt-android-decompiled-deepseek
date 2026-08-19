package p903n9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p718e4.C13280a;

/* JADX INFO: renamed from: n9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C17531e extends AbstractC20851a {
    public static final Parcelable.Creator<C17531e> CREATOR = new C13280a(18);

    /* JADX INFO: renamed from: Y */
    public final C17530d f56070Y;

    /* JADX INFO: renamed from: Z */
    public final C17527a f56071Z;

    /* JADX INFO: renamed from: o0 */
    public final String f56072o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f56073p0;

    /* JADX INFO: renamed from: q0 */
    public final int f56074q0;

    /* JADX INFO: renamed from: r0 */
    public final C17529c f56075r0;

    /* JADX INFO: renamed from: s0 */
    public final C17528b f56076s0;

    /* JADX INFO: renamed from: t0 */
    public final boolean f56077t0;

    public C17531e(C17530d c17530d, C17527a c17527a, String str, boolean z6, int i10, C17529c c17529c, C17528b c17528b, boolean z10) {
        AbstractC20502t.m21157h(c17530d);
        this.f56070Y = c17530d;
        AbstractC20502t.m21157h(c17527a);
        this.f56071Z = c17527a;
        this.f56072o0 = str;
        this.f56073p0 = z6;
        this.f56074q0 = i10;
        this.f56075r0 = c17529c == null ? new C17529c(false, null, null) : c17529c;
        this.f56076s0 = c17528b == null ? new C17528b(null, false) : c17528b;
        this.f56077t0 = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17531e)) {
            return false;
        }
        C17531e c17531e = (C17531e) obj;
        return AbstractC20502t.m21161l(this.f56070Y, c17531e.f56070Y) && AbstractC20502t.m21161l(this.f56071Z, c17531e.f56071Z) && AbstractC20502t.m21161l(this.f56075r0, c17531e.f56075r0) && AbstractC20502t.m21161l(this.f56076s0, c17531e.f56076s0) && AbstractC20502t.m21161l(this.f56072o0, c17531e.f56072o0) && this.f56073p0 == c17531e.f56073p0 && this.f56074q0 == c17531e.f56074q0 && this.f56077t0 == c17531e.f56077t0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f56070Y, this.f56071Z, this.f56075r0, this.f56076s0, this.f56072o0, Boolean.valueOf(this.f56073p0), Integer.valueOf(this.f56074q0), Boolean.valueOf(this.f56077t0)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8806e(parcel, 1, this.f56070Y, i10);
        AbstractC8199t5.m8806e(parcel, 2, this.f56071Z, i10);
        AbstractC8199t5.m8807f(parcel, 3, this.f56072o0);
        AbstractC8199t5.m8813l(parcel, 4, 4);
        parcel.writeInt(this.f56073p0 ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 5, 4);
        parcel.writeInt(this.f56074q0);
        AbstractC8199t5.m8806e(parcel, 6, this.f56075r0, i10);
        AbstractC8199t5.m8806e(parcel, 7, this.f56076s0, i10);
        AbstractC8199t5.m8813l(parcel, 8, 4);
        parcel.writeInt(this.f56077t0 ? 1 : 0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
