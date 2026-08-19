package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;

/* JADX INFO: renamed from: V9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8049b extends AbstractC20851a {
    public static final Parcelable.Creator<C8049b> CREATOR = new C8041a(3);

    /* JADX INFO: renamed from: Y */
    public int f25356Y;

    /* JADX INFO: renamed from: Z */
    public boolean f25357Z;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8049b)) {
            return false;
        }
        C8049b c8049b = (C8049b) obj;
        return this.f25356Y == c8049b.f25356Y && AbstractC20502t.m21161l(Boolean.valueOf(this.f25357Z), Boolean.valueOf(c8049b.f25357Z));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25356Y), Boolean.valueOf(this.f25357Z)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        int i11 = this.f25356Y;
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(i11);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(this.f25357Z ? 1 : 0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
