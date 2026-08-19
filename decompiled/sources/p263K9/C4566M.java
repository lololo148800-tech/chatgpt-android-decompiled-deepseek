package p263K9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1078w9.AbstractC20851a;
import p247Jj.C4409T0;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: K9.M */
/* JADX INFO: loaded from: classes.dex */
public final class C4566M extends AbstractC20851a {
    public static final Parcelable.Creator<C4566M> CREATOR = new C4409T0(24);

    /* JADX INFO: renamed from: Y */
    public final int f14906Y;

    /* JADX INFO: renamed from: Z */
    public final short f14907Z;

    /* JADX INFO: renamed from: o0 */
    public final short f14908o0;

    public C4566M(int i10, short s10, short s11) {
        this.f14906Y = i10;
        this.f14907Z = s10;
        this.f14908o0 = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4566M)) {
            return false;
        }
        C4566M c4566m = (C4566M) obj;
        return this.f14906Y == c4566m.f14906Y && this.f14907Z == c4566m.f14907Z && this.f14908o0 == c4566m.f14908o0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14906Y), Short.valueOf(this.f14907Z), Short.valueOf(this.f14908o0)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f14906Y);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f14907Z);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(this.f14908o0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
