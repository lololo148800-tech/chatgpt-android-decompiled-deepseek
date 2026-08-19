package p263K9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1078w9.AbstractC20851a;
import p247Jj.C4409T0;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: K9.N */
/* JADX INFO: loaded from: classes.dex */
public final class C4567N extends AbstractC20851a {
    public static final Parcelable.Creator<C4567N> CREATOR = new C4409T0(3);

    /* JADX INFO: renamed from: Y */
    public final long f14909Y;

    public C4567N(long j10) {
        this.f14909Y = Long.valueOf(j10).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4567N) && this.f14909Y == ((C4567N) obj).f14909Y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f14909Y)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 8);
        parcel.writeLong(this.f14909Y);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
