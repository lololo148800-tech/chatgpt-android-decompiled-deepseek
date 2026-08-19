package p263K9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import p063C9.AbstractC1616b;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p247Jj.C4409T0;
import p449S9.AbstractC7057a;
import p449S9.AbstractC7085o;
import p449S9.C7054X;
import p523V9.AbstractC8199t5;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: K9.x */
/* JADX INFO: loaded from: classes.dex */
public final class C4604x extends AbstractC20851a {
    public static final Parcelable.Creator<C4604x> CREATOR;

    /* JADX INFO: renamed from: Y */
    public final EnumC4555B f15018Y;

    /* JADX INFO: renamed from: Z */
    public final C7054X f15019Z;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f15020o0;

    static {
        AbstractC7085o.m7495q(2, AbstractC7057a.f22533c, AbstractC7057a.f22534d);
        CREATOR = new C4409T0(11);
    }

    public C4604x(String str, byte[] bArr, ArrayList arrayList) {
        C7054X c7054x = C7054X.f22525o0;
        C7054X c7054xM7451s = C7054X.m7451s(bArr.length, bArr);
        AbstractC20502t.m21157h(str);
        try {
            this.f15018Y = EnumC4555B.m5321a(str);
            this.f15019Z = c7054xM7451s;
            this.f15020o0 = arrayList;
        } catch (C4554A e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4604x)) {
            return false;
        }
        C4604x c4604x = (C4604x) obj;
        if (!this.f15018Y.equals(c4604x.f15018Y) || !AbstractC20502t.m21161l(this.f15019Z, c4604x.f15019Z)) {
            return false;
        }
        ArrayList arrayList = this.f15020o0;
        ArrayList arrayList2 = c4604x.f15020o0;
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        return arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15018Y, this.f15019Z, this.f15020o0});
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(String.valueOf(this.f15020o0), "}", AbstractC9306j0.m9896o("PublicKeyCredentialDescriptor{\n type=", String.valueOf(this.f15018Y), ", \n id=", AbstractC1616b.m2470b(this.f15019Z.m7453t()), ", \n transports="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        this.f15018Y.getClass();
        AbstractC8199t5.m8807f(parcel, 2, "public-key");
        AbstractC8199t5.m8804c(parcel, 3, this.f15019Z.m7453t());
        AbstractC8199t5.m8810i(parcel, 4, this.f15020o0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
