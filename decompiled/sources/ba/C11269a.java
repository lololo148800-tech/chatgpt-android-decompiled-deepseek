package ba;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p475T9.AbstractC7283f;
import p475T9.C7282e;
import p523V9.AbstractC8199t5;
import p571X9.AbstractC9306j0;
import p647ak.C10707i0;

/* JADX INFO: renamed from: ba.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11269a extends AbstractC20851a {
    public static final Parcelable.Creator<C11269a> CREATOR = new C10707i0(3);

    /* JADX INFO: renamed from: Y */
    public final long f34139Y;

    /* JADX INFO: renamed from: Z */
    public final int f34140Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f34141o0;

    /* JADX INFO: renamed from: p0 */
    public final C7282e f34142p0;

    public C11269a(long j10, int i10, boolean z6, C7282e c7282e) {
        this.f34139Y = j10;
        this.f34140Z = i10;
        this.f34141o0 = z6;
        this.f34142p0 = c7282e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11269a)) {
            return false;
        }
        C11269a c11269a = (C11269a) obj;
        return this.f34139Y == c11269a.f34139Y && this.f34140Z == c11269a.f34140Z && this.f34141o0 == c11269a.f34141o0 && AbstractC20502t.m21161l(this.f34142p0, c11269a.f34142p0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f34139Y), Integer.valueOf(this.f34140Z), Boolean.valueOf(this.f34141o0)});
    }

    public final String toString() {
        String str;
        StringBuilder sbM9893l = AbstractC9306j0.m9893l("LastLocationRequest[");
        long j10 = this.f34139Y;
        if (j10 != Long.MAX_VALUE) {
            sbM9893l.append("maxAge=");
            AbstractC7283f.m7734a(j10, sbM9893l);
        }
        int i10 = this.f34140Z;
        if (i10 != 0) {
            sbM9893l.append(", ");
            if (i10 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i10 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            sbM9893l.append(str);
        }
        if (this.f34141o0) {
            sbM9893l.append(", bypass");
        }
        C7282e c7282e = this.f34142p0;
        if (c7282e != null) {
            sbM9893l.append(", impersonation=");
            sbM9893l.append(c7282e);
        }
        sbM9893l.append(']');
        return sbM9893l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 8);
        parcel.writeLong(this.f34139Y);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f34140Z);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(this.f34141o0 ? 1 : 0);
        AbstractC8199t5.m8806e(parcel, 5, this.f34142p0, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
