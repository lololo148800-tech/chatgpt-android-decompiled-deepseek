package p263K9;

import android.os.Parcel;
import android.os.Parcelable;
import fo.C13711h;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p449S9.C7061c;
import p523V9.AbstractC8199t5;
import p658b5.C11242m;

/* JADX INFO: renamed from: K9.k */
/* JADX INFO: loaded from: classes.dex */
public final class C4591k extends AbstractC4592l {
    public static final Parcelable.Creator<C4591k> CREATOR = new C4576X(2);

    /* JADX INFO: renamed from: Y */
    public final EnumC4598r f14962Y;

    /* JADX INFO: renamed from: Z */
    public final String f14963Z;

    /* JADX INFO: renamed from: o0 */
    public final int f14964o0;

    public C4591k(int i10, int i11, String str) {
        try {
            this.f14962Y = EnumC4598r.m5340a(i10);
            this.f14963Z = str;
            this.f14964o0 = i11;
        } catch (C4597q e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4591k)) {
            return false;
        }
        C4591k c4591k = (C4591k) obj;
        return AbstractC20502t.m21161l(this.f14962Y, c4591k.f14962Y) && AbstractC20502t.m21161l(this.f14963Z, c4591k.f14963Z) && AbstractC20502t.m21161l(Integer.valueOf(this.f14964o0), Integer.valueOf(c4591k.f14964o0));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14962Y, this.f14963Z, Integer.valueOf(this.f14964o0)});
    }

    public final String toString() {
        C13711h c13711h = new C13711h(getClass().getSimpleName());
        String strValueOf = String.valueOf(this.f14962Y.f14985Y);
        C7061c c7061c = new C7061c();
        ((C11242m) c13711h.f43261p0).f34020o0 = c7061c;
        c13711h.f43261p0 = c7061c;
        c7061c.f34019Z = strValueOf;
        c7061c.f34018Y = "errorCode";
        String str = this.f14963Z;
        if (str != null) {
            c13711h.m15191N(str, "errorMessage");
        }
        return c13711h.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        int i11 = this.f14962Y.f14985Y;
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(i11);
        AbstractC8199t5.m8807f(parcel, 3, this.f14963Z);
        AbstractC8199t5.m8813l(parcel, 4, 4);
        parcel.writeInt(this.f14964o0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
