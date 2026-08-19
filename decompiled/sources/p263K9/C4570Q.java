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

/* JADX INFO: renamed from: K9.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C4570Q extends AbstractC20851a {
    public static final Parcelable.Creator<C4570Q> CREATOR = new C4409T0(7);

    /* JADX INFO: renamed from: Y */
    public final C7054X f14912Y;

    /* JADX INFO: renamed from: Z */
    public final C7054X f14913Z;

    /* JADX INFO: renamed from: o0 */
    public final C7054X f14914o0;

    /* JADX INFO: renamed from: p0 */
    public final int f14915p0;

    public C4570Q(C7054X c7054x, C7054X c7054x2, C7054X c7054x3, int i10) {
        this.f14912Y = c7054x;
        this.f14913Z = c7054x2;
        this.f14914o0 = c7054x3;
        this.f14915p0 = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4570Q)) {
            return false;
        }
        C4570Q c4570q = (C4570Q) obj;
        return AbstractC20502t.m21161l(this.f14912Y, c4570q.f14912Y) && AbstractC20502t.m21161l(this.f14913Z, c4570q.f14913Z) && AbstractC20502t.m21161l(this.f14914o0, c4570q.f14914o0) && this.f14915p0 == c4570q.f14915p0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14912Y, this.f14913Z, this.f14914o0, Integer.valueOf(this.f14915p0)});
    }

    public final String toString() {
        C7054X c7054x = this.f14912Y;
        String strM2470b = AbstractC1616b.m2470b(c7054x == null ? null : c7054x.m7453t());
        C7054X c7054x2 = this.f14913Z;
        String strM2470b2 = AbstractC1616b.m2470b(c7054x2 == null ? null : c7054x2.m7453t());
        C7054X c7054x3 = this.f14914o0;
        String strM2470b3 = AbstractC1616b.m2470b(c7054x3 != null ? c7054x3.m7453t() : null);
        StringBuilder sbM9896o = AbstractC9306j0.m9896o("HmacSecretExtension{coseKeyAgreement=", strM2470b, ", saltEnc=", strM2470b2, ", saltAuth=");
        sbM9896o.append(strM2470b3);
        sbM9896o.append(", getPinUvAuthProtocol=");
        return AbstractC10763a.m11056n(sbM9896o, this.f14915p0, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        C7054X c7054x = this.f14912Y;
        AbstractC8199t5.m8804c(parcel, 1, c7054x == null ? null : c7054x.m7453t());
        C7054X c7054x2 = this.f14913Z;
        AbstractC8199t5.m8804c(parcel, 2, c7054x2 == null ? null : c7054x2.m7453t());
        C7054X c7054x3 = this.f14914o0;
        AbstractC8199t5.m8804c(parcel, 3, c7054x3 != null ? c7054x3.m7453t() : null);
        AbstractC8199t5.m8813l(parcel, 4, 4);
        parcel.writeInt(this.f14915p0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
