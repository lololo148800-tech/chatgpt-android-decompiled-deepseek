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
import p449S9.C7088p0;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: K9.u */
/* JADX INFO: loaded from: classes.dex */
public final class C4601u extends AbstractC20851a {
    public static final Parcelable.Creator<C4601u> CREATOR = new C4409T0(10);

    /* JADX INFO: renamed from: Y */
    public final String f14988Y;

    /* JADX INFO: renamed from: Z */
    public final String f14989Z;

    /* JADX INFO: renamed from: o0 */
    public final C7054X f14990o0;

    /* JADX INFO: renamed from: p0 */
    public final C4590j f14991p0;

    /* JADX INFO: renamed from: q0 */
    public final C4589i f14992q0;

    /* JADX INFO: renamed from: r0 */
    public final C4591k f14993r0;

    /* JADX INFO: renamed from: s0 */
    public final C4587g f14994s0;

    /* JADX INFO: renamed from: t0 */
    public final String f14995t0;

    public C4601u(String str, String str2, byte[] bArr, C4590j c4590j, C4589i c4589i, C4591k c4591k, C4587g c4587g, String str3) {
        C7054X c7054xM7451s = bArr == null ? null : C7054X.m7451s(bArr.length, bArr);
        boolean z6 = false;
        AbstractC20502t.m21150a("Must provide a response object.", (c4590j != null && c4589i == null && c4591k == null) || (c4590j == null && c4589i != null && c4591k == null) || (c4590j == null && c4589i == null && c4591k != null));
        if (c4591k != null || (str != null && c7054xM7451s != null)) {
            z6 = true;
        }
        AbstractC20502t.m21150a("Must provide id and rawId if not an error response.", z6);
        this.f14988Y = str;
        this.f14989Z = str2;
        this.f14990o0 = c7054xM7451s;
        this.f14991p0 = c4590j;
        this.f14992q0 = c4589i;
        this.f14993r0 = c4591k;
        this.f14994s0 = c4587g;
        this.f14995t0 = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4601u)) {
            return false;
        }
        C4601u c4601u = (C4601u) obj;
        return AbstractC20502t.m21161l(this.f14988Y, c4601u.f14988Y) && AbstractC20502t.m21161l(this.f14989Z, c4601u.f14989Z) && AbstractC20502t.m21161l(this.f14990o0, c4601u.f14990o0) && AbstractC20502t.m21161l(this.f14991p0, c4601u.f14991p0) && AbstractC20502t.m21161l(this.f14992q0, c4601u.f14992q0) && AbstractC20502t.m21161l(this.f14993r0, c4601u.f14993r0) && AbstractC20502t.m21161l(this.f14994s0, c4601u.f14994s0) && AbstractC20502t.m21161l(this.f14995t0, c4601u.f14995t0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14988Y, this.f14989Z, this.f14990o0, this.f14992q0, this.f14991p0, this.f14993r0, this.f14994s0, this.f14995t0});
    }

    public final String toString() {
        C7054X c7054x = this.f14990o0;
        String strM2470b = AbstractC1616b.m2470b(c7054x == null ? null : c7054x.m7453t());
        String strValueOf = String.valueOf(this.f14991p0);
        String strValueOf2 = String.valueOf(this.f14992q0);
        String strValueOf3 = String.valueOf(this.f14993r0);
        String strValueOf4 = String.valueOf(this.f14994s0);
        StringBuilder sb2 = new StringBuilder("PublicKeyCredential{\n id='");
        sb2.append(this.f14988Y);
        sb2.append("', \n type='");
        AbstractC10763a.m11067y(sb2, this.f14989Z, "', \n rawId=", strM2470b, ", \n registerResponse=");
        AbstractC10763a.m11067y(sb2, strValueOf, ", \n signResponse=", strValueOf2, ", \n errorResponse=");
        AbstractC10763a.m11067y(sb2, strValueOf3, ", \n extensionsClientOutputs=", strValueOf4, ", \n authenticatorAttachment='");
        return AbstractC9306j0.m9891j(this.f14995t0, "'}", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C7088p0.f22571a.mo3914a();
        throw null;
    }
}
