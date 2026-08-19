package p263K9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p247Jj.C4409T0;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: K9.T */
/* JADX INFO: loaded from: classes.dex */
public final class C4572T extends AbstractC20851a {
    public static final Parcelable.Creator<C4572T> CREATOR = new C4409T0(17);

    /* JADX INFO: renamed from: Y */
    public final String f14918Y;

    public C4572T(String str) {
        this.f14918Y = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4572T) {
            return AbstractC20502t.m21161l(this.f14918Y, ((C4572T) obj).f14918Y);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14918Y});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 1, this.f14918Y);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
