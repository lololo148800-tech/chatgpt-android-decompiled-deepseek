package p263K9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p247Jj.C4409T0;
import p449S9.C7054X;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: K9.V */
/* JADX INFO: loaded from: classes.dex */
public final class C4574V extends AbstractC20851a {
    public static final Parcelable.Creator<C4574V> CREATOR = new C4409T0(28);

    /* JADX INFO: renamed from: Y */
    public final C7054X f14919Y;

    /* JADX INFO: renamed from: Z */
    public final C7054X f14920Z;

    public C4574V(C7054X c7054x, C7054X c7054x2) {
        this.f14919Y = c7054x;
        this.f14920Z = c7054x2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4574V)) {
            return false;
        }
        C4574V c4574v = (C4574V) obj;
        return AbstractC20502t.m21161l(this.f14919Y, c4574v.f14919Y) && AbstractC20502t.m21161l(this.f14920Z, c4574v.f14920Z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14919Y, this.f14920Z});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        C7054X c7054x = this.f14919Y;
        AbstractC8199t5.m8804c(parcel, 1, c7054x == null ? null : c7054x.m7453t());
        C7054X c7054x2 = this.f14920Z;
        AbstractC8199t5.m8804c(parcel, 2, c7054x2 != null ? c7054x2.m7453t() : null);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
