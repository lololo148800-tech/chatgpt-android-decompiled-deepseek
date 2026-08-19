package p263K9;

import android.os.Parcel;
import android.os.Parcelable;
import fo.C13711h;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import p063C9.AbstractC1616b;
import p1060v9.AbstractC20502t;
import p449S9.C7045N;
import p449S9.C7047P;
import p449S9.C7054X;
import p509Uk.lpqL.SfpOlmlMATQ;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: K9.i */
/* JADX INFO: loaded from: classes.dex */
public final class C4589i extends AbstractC4592l {
    public static final Parcelable.Creator<C4589i> CREATOR = new C4576X(0);

    /* JADX INFO: renamed from: Y */
    public final C7054X f14953Y;

    /* JADX INFO: renamed from: Z */
    public final C7054X f14954Z;

    /* JADX INFO: renamed from: o0 */
    public final C7054X f14955o0;

    /* JADX INFO: renamed from: p0 */
    public final C7054X f14956p0;

    /* JADX INFO: renamed from: q0 */
    public final C7054X f14957q0;

    public C4589i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        AbstractC20502t.m21157h(bArr);
        C7054X c7054xM7451s = C7054X.m7451s(bArr.length, bArr);
        AbstractC20502t.m21157h(bArr2);
        C7054X c7054xM7451s2 = C7054X.m7451s(bArr2.length, bArr2);
        AbstractC20502t.m21157h(bArr3);
        C7054X c7054xM7451s3 = C7054X.m7451s(bArr3.length, bArr3);
        AbstractC20502t.m21157h(bArr4);
        C7054X c7054xM7451s4 = C7054X.m7451s(bArr4.length, bArr4);
        C7054X c7054xM7451s5 = bArr5 == null ? null : C7054X.m7451s(bArr5.length, bArr5);
        this.f14953Y = c7054xM7451s;
        this.f14954Z = c7054xM7451s2;
        this.f14955o0 = c7054xM7451s3;
        this.f14956p0 = c7054xM7451s4;
        this.f14957q0 = c7054xM7451s5;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m5336b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", AbstractC1616b.m2470b(this.f14954Z.m7453t()));
            jSONObject.put("authenticatorData", AbstractC1616b.m2470b(this.f14955o0.m7453t()));
            jSONObject.put("signature", AbstractC1616b.m2470b(this.f14956p0.m7453t()));
            C7054X c7054x = this.f14957q0;
            if (c7054x != null) {
                jSONObject.put("userHandle", AbstractC1616b.m2470b(c7054x == null ? null : c7054x.m7453t()));
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4589i)) {
            return false;
        }
        C4589i c4589i = (C4589i) obj;
        return AbstractC20502t.m21161l(this.f14953Y, c4589i.f14953Y) && AbstractC20502t.m21161l(this.f14954Z, c4589i.f14954Z) && AbstractC20502t.m21161l(this.f14955o0, c4589i.f14955o0) && AbstractC20502t.m21161l(this.f14956p0, c4589i.f14956p0) && AbstractC20502t.m21161l(this.f14957q0, c4589i.f14957q0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f14953Y})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f14954Z})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f14955o0})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f14956p0})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f14957q0}))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8804c(parcel, 2, this.f14953Y.m7453t());
        AbstractC8199t5.m8804c(parcel, 3, this.f14954Z.m7453t());
        AbstractC8199t5.m8804c(parcel, 4, this.f14955o0.m7453t());
        AbstractC8199t5.m8804c(parcel, 5, this.f14956p0.m7453t());
        C7054X c7054x = this.f14957q0;
        AbstractC8199t5.m8804c(parcel, 6, c7054x == null ? null : c7054x.m7453t());
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }

    public final String toString() {
        byte[] bArrM7453t;
        C13711h c13711h = new C13711h(getClass().getSimpleName());
        C7045N c7045n = C7047P.f22510d;
        byte[] bArrM7453t2 = this.f14953Y.m7453t();
        c13711h.m15191N(c7045n.m7444c(bArrM7453t2.length, bArrM7453t2), "keyHandle");
        byte[] bArrM7453t3 = this.f14954Z.m7453t();
        c13711h.m15191N(c7045n.m7444c(bArrM7453t3.length, bArrM7453t3), "clientDataJSON");
        byte[] bArrM7453t4 = this.f14955o0.m7453t();
        c13711h.m15191N(c7045n.m7444c(bArrM7453t4.length, bArrM7453t4), "authenticatorData");
        byte[] bArrM7453t5 = this.f14956p0.m7453t();
        c13711h.m15191N(c7045n.m7444c(bArrM7453t5.length, bArrM7453t5), "signature");
        C7054X c7054x = this.f14957q0;
        if (c7054x == null) {
            bArrM7453t = null;
        } else {
            bArrM7453t = c7054x.m7453t();
        }
        if (bArrM7453t != null) {
            c13711h.m15191N(c7045n.m7444c(bArrM7453t.length, bArrM7453t), SfpOlmlMATQ.KcczeXukM);
        }
        return c13711h.toString();
    }
}
