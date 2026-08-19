package p263K9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p063C9.AbstractC1616b;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p247Jj.C4409T0;
import p449S9.C7054X;
import p523V9.AbstractC8199t5;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: K9.C */
/* JADX INFO: loaded from: classes.dex */
public final class C4556C extends AbstractC20851a {
    public static final Parcelable.Creator<C4556C> CREATOR = new C4409T0(15);

    /* JADX INFO: renamed from: Y */
    public final C7054X f14888Y;

    /* JADX INFO: renamed from: Z */
    public final String f14889Z;

    /* JADX INFO: renamed from: o0 */
    public final String f14890o0;

    /* JADX INFO: renamed from: p0 */
    public final String f14891p0;

    public C4556C(String str, String str2, String str3, byte[] bArr) {
        AbstractC20502t.m21157h(bArr);
        this.f14888Y = C7054X.m7451s(bArr.length, bArr);
        AbstractC20502t.m21157h(str);
        this.f14889Z = str;
        this.f14890o0 = str2;
        AbstractC20502t.m21157h(str3);
        this.f14891p0 = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4556C)) {
            return false;
        }
        C4556C c4556c = (C4556C) obj;
        return AbstractC20502t.m21161l(this.f14888Y, c4556c.f14888Y) && AbstractC20502t.m21161l(this.f14889Z, c4556c.f14889Z) && AbstractC20502t.m21161l(this.f14890o0, c4556c.f14890o0) && AbstractC20502t.m21161l(this.f14891p0, c4556c.f14891p0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14888Y, this.f14889Z, this.f14890o0, this.f14891p0});
    }

    public final String toString() {
        StringBuilder sbM11058p = AbstractC10763a.m11058p("PublicKeyCredentialUserEntity{\n id=", AbstractC1616b.m2470b(this.f14888Y.m7453t()), ", \n name='");
        sbM11058p.append(this.f14889Z);
        sbM11058p.append("', \n icon='");
        sbM11058p.append(this.f14890o0);
        sbM11058p.append("', \n displayName='");
        return AbstractC9306j0.m9891j(this.f14891p0, "'}", sbM11058p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8804c(parcel, 2, this.f14888Y.m7453t());
        AbstractC8199t5.m8807f(parcel, 3, this.f14889Z);
        AbstractC8199t5.m8807f(parcel, 4, this.f14890o0);
        AbstractC8199t5.m8807f(parcel, 5, this.f14891p0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
