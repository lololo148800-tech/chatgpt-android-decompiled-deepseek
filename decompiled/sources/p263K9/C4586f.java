package p263K9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p247Jj.C4409T0;
import p523V9.AbstractC8199t5;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: K9.f */
/* JADX INFO: loaded from: classes.dex */
public final class C4586f extends AbstractC20851a {
    public static final Parcelable.Creator<C4586f> CREATOR = new C4409T0(26);

    /* JADX INFO: renamed from: Y */
    public final C4599s f14935Y;

    /* JADX INFO: renamed from: Z */
    public final C4578Z f14936Z;

    /* JADX INFO: renamed from: o0 */
    public final C4563J f14937o0;

    /* JADX INFO: renamed from: p0 */
    public final C4582b0 f14938p0;

    /* JADX INFO: renamed from: q0 */
    public final C4567N f14939q0;

    /* JADX INFO: renamed from: r0 */
    public final C4568O f14940r0;

    /* JADX INFO: renamed from: s0 */
    public final C4580a0 f14941s0;

    /* JADX INFO: renamed from: t0 */
    public final C4569P f14942t0;

    /* JADX INFO: renamed from: u0 */
    public final C4600t f14943u0;

    /* JADX INFO: renamed from: v0 */
    public final C4571S f14944v0;

    /* JADX INFO: renamed from: w0 */
    public final C4572T f14945w0;

    /* JADX INFO: renamed from: x0 */
    public final C4570Q f14946x0;

    public C4586f(C4599s c4599s, C4578Z c4578z, C4563J c4563j, C4582b0 c4582b0, C4567N c4567n, C4568O c4568o, C4580a0 c4580a0, C4569P c4569p, C4600t c4600t, C4571S c4571s, C4572T c4572t, C4570Q c4570q) {
        this.f14935Y = c4599s;
        this.f14937o0 = c4563j;
        this.f14936Z = c4578z;
        this.f14938p0 = c4582b0;
        this.f14939q0 = c4567n;
        this.f14940r0 = c4568o;
        this.f14941s0 = c4580a0;
        this.f14942t0 = c4569p;
        this.f14943u0 = c4600t;
        this.f14944v0 = c4571s;
        this.f14945w0 = c4572t;
        this.f14946x0 = c4570q;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4586f)) {
            return false;
        }
        C4586f c4586f = (C4586f) obj;
        return AbstractC20502t.m21161l(this.f14935Y, c4586f.f14935Y) && AbstractC20502t.m21161l(this.f14936Z, c4586f.f14936Z) && AbstractC20502t.m21161l(this.f14937o0, c4586f.f14937o0) && AbstractC20502t.m21161l(this.f14938p0, c4586f.f14938p0) && AbstractC20502t.m21161l(this.f14939q0, c4586f.f14939q0) && AbstractC20502t.m21161l(this.f14940r0, c4586f.f14940r0) && AbstractC20502t.m21161l(this.f14941s0, c4586f.f14941s0) && AbstractC20502t.m21161l(this.f14942t0, c4586f.f14942t0) && AbstractC20502t.m21161l(this.f14943u0, c4586f.f14943u0) && AbstractC20502t.m21161l(this.f14944v0, c4586f.f14944v0) && AbstractC20502t.m21161l(this.f14945w0, c4586f.f14945w0) && AbstractC20502t.m21161l(this.f14946x0, c4586f.f14946x0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14935Y, this.f14936Z, this.f14937o0, this.f14938p0, this.f14939q0, this.f14940r0, this.f14941s0, this.f14942t0, this.f14943u0, this.f14944v0, this.f14945w0, this.f14946x0});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f14935Y);
        String strValueOf2 = String.valueOf(this.f14936Z);
        String strValueOf3 = String.valueOf(this.f14937o0);
        String strValueOf4 = String.valueOf(this.f14938p0);
        String strValueOf5 = String.valueOf(this.f14939q0);
        String strValueOf6 = String.valueOf(this.f14940r0);
        String strValueOf7 = String.valueOf(this.f14941s0);
        String strValueOf8 = String.valueOf(this.f14942t0);
        String strValueOf9 = String.valueOf(this.f14943u0);
        String strValueOf10 = String.valueOf(this.f14944v0);
        String strValueOf11 = String.valueOf(this.f14945w0);
        StringBuilder sbM9896o = AbstractC9306j0.m9896o("AuthenticationExtensions{\n fidoAppIdExtension=", strValueOf, ", \n cableAuthenticationExtension=", strValueOf2, ", \n userVerificationMethodExtension=");
        AbstractC10763a.m11067y(sbM9896o, strValueOf3, ", \n googleMultiAssertionExtension=", strValueOf4, ", \n googleSessionIdExtension=");
        AbstractC10763a.m11067y(sbM9896o, strValueOf5, ", \n googleSilentVerificationExtension=", strValueOf6, ", \n devicePublicKeyExtension=");
        AbstractC10763a.m11067y(sbM9896o, strValueOf7, ", \n googleTunnelServerIdExtension=", strValueOf8, ", \n googleThirdPartyPaymentExtension=");
        AbstractC10763a.m11067y(sbM9896o, strValueOf9, ", \n prfExtension=", strValueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return AbstractC9306j0.m9891j(strValueOf11, "}", sbM9896o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8806e(parcel, 2, this.f14935Y, i10);
        AbstractC8199t5.m8806e(parcel, 3, this.f14936Z, i10);
        AbstractC8199t5.m8806e(parcel, 4, this.f14937o0, i10);
        AbstractC8199t5.m8806e(parcel, 5, this.f14938p0, i10);
        AbstractC8199t5.m8806e(parcel, 6, this.f14939q0, i10);
        AbstractC8199t5.m8806e(parcel, 7, this.f14940r0, i10);
        AbstractC8199t5.m8806e(parcel, 8, this.f14941s0, i10);
        AbstractC8199t5.m8806e(parcel, 9, this.f14942t0, i10);
        AbstractC8199t5.m8806e(parcel, 10, this.f14943u0, i10);
        AbstractC8199t5.m8806e(parcel, 11, this.f14944v0, i10);
        AbstractC8199t5.m8806e(parcel, 12, this.f14945w0, i10);
        AbstractC8199t5.m8806e(parcel, 13, this.f14946x0, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
