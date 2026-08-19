package p263K9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1078w9.AbstractC20851a;
import p247Jj.C4409T0;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: K9.O */
/* JADX INFO: loaded from: classes.dex */
public final class C4568O extends AbstractC20851a {
    public static final Parcelable.Creator<C4568O> CREATOR = new C4409T0(4);

    /* JADX INFO: renamed from: Y */
    public final boolean f14910Y;

    public C4568O(boolean z6) {
        this.f14910Y = Boolean.valueOf(z6).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4568O) && this.f14910Y == ((C4568O) obj).f14910Y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f14910Y)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f14910Y ? 1 : 0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
