package p903n9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p718e4.C13280a;

/* JADX INFO: renamed from: n9.g */
/* JADX INFO: loaded from: classes.dex */
public final class C17533g extends AbstractC20851a {
    public static final Parcelable.Creator<C17533g> CREATOR = new C13280a(20);

    /* JADX INFO: renamed from: Y */
    public final String f56079Y;

    /* JADX INFO: renamed from: Z */
    public final String f56080Z;

    /* JADX INFO: renamed from: o0 */
    public final String f56081o0;

    /* JADX INFO: renamed from: p0 */
    public final String f56082p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f56083q0;

    /* JADX INFO: renamed from: r0 */
    public final int f56084r0;

    public C17533g(String str, int i10, String str2, boolean z6, String str3, String str4) {
        AbstractC20502t.m21157h(str);
        this.f56079Y = str;
        this.f56080Z = str2;
        this.f56081o0 = str3;
        this.f56082p0 = str4;
        this.f56083q0 = z6;
        this.f56084r0 = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17533g)) {
            return false;
        }
        C17533g c17533g = (C17533g) obj;
        return AbstractC20502t.m21161l(this.f56079Y, c17533g.f56079Y) && AbstractC20502t.m21161l(this.f56082p0, c17533g.f56082p0) && AbstractC20502t.m21161l(this.f56080Z, c17533g.f56080Z) && AbstractC20502t.m21161l(Boolean.valueOf(this.f56083q0), Boolean.valueOf(c17533g.f56083q0)) && this.f56084r0 == c17533g.f56084r0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f56079Y, this.f56080Z, this.f56082p0, Boolean.valueOf(this.f56083q0), Integer.valueOf(this.f56084r0)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 1, this.f56079Y);
        AbstractC8199t5.m8807f(parcel, 2, this.f56080Z);
        AbstractC8199t5.m8807f(parcel, 3, this.f56081o0);
        AbstractC8199t5.m8807f(parcel, 4, this.f56082p0);
        AbstractC8199t5.m8813l(parcel, 5, 4);
        parcel.writeInt(this.f56083q0 ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 6, 4);
        parcel.writeInt(this.f56084r0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
