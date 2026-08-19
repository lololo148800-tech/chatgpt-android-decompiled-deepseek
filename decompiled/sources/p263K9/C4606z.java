package p263K9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p247Jj.C4409T0;
import p523V9.AbstractC8199t5;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: K9.z */
/* JADX INFO: loaded from: classes.dex */
public final class C4606z extends AbstractC20851a {
    public static final Parcelable.Creator<C4606z> CREATOR = new C4409T0(13);

    /* JADX INFO: renamed from: Y */
    public final String f15023Y;

    /* JADX INFO: renamed from: Z */
    public final String f15024Z;

    /* JADX INFO: renamed from: o0 */
    public final String f15025o0;

    public C4606z(String str, String str2, String str3) {
        AbstractC20502t.m21157h(str);
        this.f15023Y = str;
        AbstractC20502t.m21157h(str2);
        this.f15024Z = str2;
        this.f15025o0 = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4606z)) {
            return false;
        }
        C4606z c4606z = (C4606z) obj;
        return AbstractC20502t.m21161l(this.f15023Y, c4606z.f15023Y) && AbstractC20502t.m21161l(this.f15024Z, c4606z.f15024Z) && AbstractC20502t.m21161l(this.f15025o0, c4606z.f15025o0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15023Y, this.f15024Z, this.f15025o0});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f15023Y);
        sb2.append("', \n name='");
        sb2.append(this.f15024Z);
        sb2.append("', \n icon='");
        return AbstractC9306j0.m9891j(this.f15025o0, "'}", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 2, this.f15023Y);
        AbstractC8199t5.m8807f(parcel, 3, this.f15024Z);
        AbstractC8199t5.m8807f(parcel, 4, this.f15025o0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
