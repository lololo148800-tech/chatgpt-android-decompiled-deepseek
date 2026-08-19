package p263K9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: K9.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4580a0 extends AbstractC20851a {
    public static final Parcelable.Creator<C4580a0> CREATOR = new C4576X(7);

    public final boolean equals(Object obj) {
        return obj instanceof C4580a0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.FALSE});
    }

    public final String toString() {
        return "DevicePublicKeyExtension{devicePublicKey=false}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
