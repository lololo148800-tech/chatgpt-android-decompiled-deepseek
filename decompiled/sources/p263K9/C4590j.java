package p263K9;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import fo.C13711h;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p063C9.AbstractC1616b;
import p1060v9.AbstractC20502t;
import p449S9.AbstractC7057a;
import p449S9.AbstractC7072h0;
import p449S9.C7045N;
import p449S9.C7047P;
import p449S9.C7053W;
import p449S9.C7054X;
import p449S9.C7060b0;
import p449S9.C7062c0;
import p449S9.C7064d0;
import p449S9.C7066e0;
import p449S9.C7068f0;
import p449S9.C7070g0;
import p449S9.C7076j0;
import p449S9.C7091r;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: K9.j */
/* JADX INFO: loaded from: classes.dex */
public final class C4590j extends AbstractC4592l {
    public static final Parcelable.Creator<C4590j> CREATOR = new C4576X(1);

    /* JADX INFO: renamed from: Y */
    public final C7054X f14958Y;

    /* JADX INFO: renamed from: Z */
    public final C7054X f14959Z;

    /* JADX INFO: renamed from: o0 */
    public final C7054X f14960o0;

    /* JADX INFO: renamed from: p0 */
    public final String[] f14961p0;

    public C4590j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        AbstractC20502t.m21157h(bArr);
        C7054X c7054xM7451s = C7054X.m7451s(bArr.length, bArr);
        AbstractC20502t.m21157h(bArr2);
        C7054X c7054xM7451s2 = C7054X.m7451s(bArr2.length, bArr2);
        AbstractC20502t.m21157h(bArr3);
        C7054X c7054xM7451s3 = C7054X.m7451s(bArr3.length, bArr3);
        this.f14958Y = c7054xM7451s;
        this.f14959Z = c7054xM7451s2;
        this.f14960o0 = c7054xM7451s3;
        AbstractC20502t.m21157h(strArr);
        this.f14961p0 = strArr;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0145 A[Catch: JSONException -> 0x0023, g0 -> 0x01b0, TRY_LEAVE, TryCatch #7 {g0 -> 0x01b0, blocks: (B:42:0x0111, B:49:0x0136, B:51:0x0145, B:56:0x015b, B:59:0x0177, B:61:0x018c, B:63:0x0191, B:66:0x01b3, B:67:0x01b8, B:68:0x01b9, B:69:0x01be, B:74:0x01ca, B:76:0x01d7, B:78:0x01e4, B:79:0x01fd, B:80:0x0202, B:81:0x0203, B:82:0x0208, B:87:0x022b, B:88:0x0230), top: B:130:0x0111, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d7 A[Catch: JSONException -> 0x0023, g0 -> 0x01b0, TryCatch #7 {g0 -> 0x01b0, blocks: (B:42:0x0111, B:49:0x0136, B:51:0x0145, B:56:0x015b, B:59:0x0177, B:61:0x018c, B:63:0x0191, B:66:0x01b3, B:67:0x01b8, B:68:0x01b9, B:69:0x01be, B:74:0x01ca, B:76:0x01d7, B:78:0x01e4, B:79:0x01fd, B:80:0x0202, B:81:0x0203, B:82:0x0208, B:87:0x022b, B:88:0x0230), top: B:130:0x0111, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01e4 A[Catch: JSONException -> 0x0023, g0 -> 0x01b0, TryCatch #7 {g0 -> 0x01b0, blocks: (B:42:0x0111, B:49:0x0136, B:51:0x0145, B:56:0x015b, B:59:0x0177, B:61:0x018c, B:63:0x0191, B:66:0x01b3, B:67:0x01b8, B:68:0x01b9, B:69:0x01be, B:74:0x01ca, B:76:0x01d7, B:78:0x01e4, B:79:0x01fd, B:80:0x0202, B:81:0x0203, B:82:0x0208, B:87:0x022b, B:88:0x0230), top: B:130:0x0111, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01fd A[Catch: JSONException -> 0x0023, g0 -> 0x01b0, TryCatch #7 {g0 -> 0x01b0, blocks: (B:42:0x0111, B:49:0x0136, B:51:0x0145, B:56:0x015b, B:59:0x0177, B:61:0x018c, B:63:0x0191, B:66:0x01b3, B:67:0x01b8, B:68:0x01b9, B:69:0x01be, B:74:0x01ca, B:76:0x01d7, B:78:0x01e4, B:79:0x01fd, B:80:0x0202, B:81:0x0203, B:82:0x0208, B:87:0x022b, B:88:0x0230), top: B:130:0x0111, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0203 A[Catch: JSONException -> 0x0023, g0 -> 0x01b0, TryCatch #7 {g0 -> 0x01b0, blocks: (B:42:0x0111, B:49:0x0136, B:51:0x0145, B:56:0x015b, B:59:0x0177, B:61:0x018c, B:63:0x0191, B:66:0x01b3, B:67:0x01b8, B:68:0x01b9, B:69:0x01be, B:74:0x01ca, B:76:0x01d7, B:78:0x01e4, B:79:0x01fd, B:80:0x0202, B:81:0x0203, B:82:0x0208, B:87:0x022b, B:88:0x0230), top: B:130:0x0111, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x022b A[Catch: JSONException -> 0x0023, g0 -> 0x01b0, TRY_ENTER, TryCatch #7 {g0 -> 0x01b0, blocks: (B:42:0x0111, B:49:0x0136, B:51:0x0145, B:56:0x015b, B:59:0x0177, B:61:0x018c, B:63:0x0191, B:66:0x01b3, B:67:0x01b8, B:68:0x01b9, B:69:0x01be, B:74:0x01ca, B:76:0x01d7, B:78:0x01e4, B:79:0x01fd, B:80:0x0202, B:81:0x0203, B:82:0x0208, B:87:0x022b, B:88:0x0230), top: B:130:0x0111, outer: #2 }] */
    /* JADX INFO: renamed from: b */
    public final JSONObject m5337b() {
        AbstractC7072h0 abstractC7072h0;
        long j10;
        AbstractC7072h0 abstractC7072h1;
        C7054X c7054x;
        String[] strArr = this.f14961p0;
        try {
            JSONObject jSONObject = new JSONObject();
            C7054X c7054x2 = this.f14959Z;
            if (c7054x2 != null) {
                jSONObject.put("clientDataJSON", AbstractC1616b.m2470b(c7054x2.m7453t()));
            }
            C7054X c7054x3 = this.f14960o0;
            if (c7054x3 != null) {
                jSONObject.put("attestationObject", AbstractC1616b.m2470b(c7054x3.m7453t()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (strArr[i10].equals("cable")) {
                    jSONArray.put(i10, "hybrid");
                } else {
                    jSONArray.put(i10, strArr[i10]);
                }
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    AbstractC7072h0 abstractC7072h2 = (AbstractC7072h0) ((C7066e0) AbstractC7072h0.m7476e(c7054x3.m7453t()).m7477c(C7066e0.class)).f22541Z.get(new C7068f0("authData"));
                    if (abstractC7072h2 == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    C7054X c7054x4 = ((C7060b0) abstractC7072h2.m7477c(C7060b0.class)).f22537Y;
                    byte[] bArr = c7054x4.f22527Z;
                    ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(bArr, 0, c7054x4.mo7448m()).asReadOnlyBuffer();
                    try {
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 32);
                        if ((byteBufferAsReadOnlyBuffer.get() & 64) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 4);
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 16);
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + byteBufferAsReadOnlyBuffer.getShort());
                        try {
                            try {
                                int iPosition = byteBufferAsReadOnlyBuffer.position();
                                int iM7450r = C7054X.m7450r(iPosition, bArr.length, c7054x4.mo7448m());
                                C7076j0 c7076j0 = new C7076j0((iM7450r == 0 ? C7054X.f22525o0 : new C7053W(bArr, iPosition, iM7450r)).m7452q());
                                try {
                                    AbstractC7072h0 abstractC7072h0M7466k = AbstractC7057a.m7466k(c7076j0);
                                    try {
                                        c7076j0.close();
                                    } catch (IOException unused) {
                                    }
                                    C7091r c7091r = ((C7066e0) abstractC7072h0M7466k.m7477c(C7066e0.class)).f22541Z;
                                    AbstractC7072h0 abstractC7072h3 = (AbstractC7072h0) c7091r.get(new C7064d0(3L));
                                    AbstractC7072h0 abstractC7072h4 = (AbstractC7072h0) c7091r.get(new C7064d0(1L));
                                    if (abstractC7072h3 == null || abstractC7072h4 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    try {
                                        long j11 = ((C7064d0) abstractC7072h3.m7477c(C7064d0.class)).f22538Y;
                                        long j12 = ((C7064d0) abstractC7072h4.m7477c(C7064d0.class)).f22538Y;
                                        byte[] bArrM7465j = null;
                                        if (j12 == 1) {
                                            abstractC7072h0 = (AbstractC7072h0) c7091r.get(new C7064d0(-1L));
                                            if (abstractC7072h0 != null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            long j13 = ((C7064d0) abstractC7072h0.m7477c(C7064d0.class)).f22538Y;
                                            j10 = j11;
                                            if (j12 != 2 && j13 == 1) {
                                                AbstractC7072h0 abstractC7072h5 = (AbstractC7072h0) c7091r.get(new C7064d0(-2L));
                                                AbstractC7072h0 abstractC7072h6 = (AbstractC7072h0) c7091r.get(new C7064d0(-3L));
                                                if (abstractC7072h5 == null || abstractC7072h6 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                C7054X c7054x5 = ((C7060b0) abstractC7072h5.m7477c(C7060b0.class)).f22537Y;
                                                C7054X c7054x6 = ((C7060b0) abstractC7072h6.m7477c(C7060b0.class)).f22537Y;
                                                if (c7054x5.f22527Z.length != 32 || c7054x6.f22527Z.length != 32) {
                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                }
                                                bArrM7465j = AbstractC7057a.m7465j(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), c7054x5.m7453t(), c7054x6.m7453t());
                                            } else if (j12 == 1 && j13 == 6) {
                                                abstractC7072h1 = (AbstractC7072h0) c7091r.get(new C7064d0(-2L));
                                                if (abstractC7072h1 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                c7054x = ((C7060b0) abstractC7072h1.m7477c(C7060b0.class)).f22537Y;
                                                if (c7054x.f22527Z.length != 32) {
                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                }
                                                bArrM7465j = AbstractC7057a.m7465j(Base64.decode("MCowBQYDK2VwAyEA", 0), c7054x.m7453t());
                                            }
                                        } else if (j12 == 2) {
                                            j12 = 2;
                                            abstractC7072h0 = (AbstractC7072h0) c7091r.get(new C7064d0(-1L));
                                            if (abstractC7072h0 != null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            long j14 = ((C7064d0) abstractC7072h0.m7477c(C7064d0.class)).f22538Y;
                                            j10 = j11;
                                            if (j12 != 2) {
                                                if (j12 == 1) {
                                                    abstractC7072h1 = (AbstractC7072h0) c7091r.get(new C7064d0(-2L));
                                                    if (abstractC7072h1 == null) {
                                                        throw new IllegalArgumentException("COSE key missing required fields");
                                                    }
                                                    c7054x = ((C7060b0) abstractC7072h1.m7477c(C7060b0.class)).f22537Y;
                                                    if (c7054x.f22527Z.length != 32) {
                                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                    }
                                                    bArrM7465j = AbstractC7057a.m7465j(Base64.decode("MCowBQYDK2VwAyEA", 0), c7054x.m7453t());
                                                }
                                            } else if (j12 == 1) {
                                                abstractC7072h1 = (AbstractC7072h0) c7091r.get(new C7064d0(-2L));
                                                if (abstractC7072h1 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                c7054x = ((C7060b0) abstractC7072h1.m7477c(C7060b0.class)).f22537Y;
                                                if (c7054x.f22527Z.length != 32) {
                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                }
                                                bArrM7465j = AbstractC7057a.m7465j(Base64.decode("MCowBQYDK2VwAyEA", 0), c7054x.m7453t());
                                            }
                                        } else {
                                            j10 = j11;
                                        }
                                        byte[] bArr2 = bArrM7465j;
                                        jSONObject.put("authenticatorData", AbstractC1616b.m2470b(c7054x4.m7453t()));
                                        jSONObject.put("publicKeyAlgorithm", j10);
                                        if (bArr2 != null) {
                                            jSONObject.put("publicKey", Base64.encodeToString(bArr2, 11));
                                        }
                                        return jSONObject;
                                    } catch (C7070g0 e10) {
                                        throw new IllegalArgumentException("COSE key ill-formed", e10);
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        c7076j0.close();
                                        throw th2;
                                    } catch (IOException unused2) {
                                        throw th2;
                                    }
                                }
                            } catch (C7070g0 e11) {
                                e = e11;
                                throw new IllegalArgumentException("failed to parse COSE key", e);
                            }
                        } catch (C7062c0 e12) {
                            e = e12;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e13) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e13);
                    }
                } catch (C7070g0 e14) {
                    throw new IllegalArgumentException("authData value has wrong type", e14);
                }
            } catch (C7062c0 e15) {
                e = e15;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (C7070g0 e16) {
                e = e16;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e17) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e17);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4590j)) {
            return false;
        }
        C4590j c4590j = (C4590j) obj;
        return AbstractC20502t.m21161l(this.f14958Y, c4590j.f14958Y) && AbstractC20502t.m21161l(this.f14959Z, c4590j.f14959Z) && AbstractC20502t.m21161l(this.f14960o0, c4590j.f14960o0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f14958Y})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f14959Z})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f14960o0}))});
    }

    public final String toString() {
        C13711h c13711h = new C13711h(getClass().getSimpleName());
        C7045N c7045n = C7047P.f22510d;
        byte[] bArrM7453t = this.f14958Y.m7453t();
        c13711h.m15191N(c7045n.m7444c(bArrM7453t.length, bArrM7453t), "keyHandle");
        byte[] bArrM7453t2 = this.f14959Z.m7453t();
        c13711h.m15191N(c7045n.m7444c(bArrM7453t2.length, bArrM7453t2), "clientDataJSON");
        byte[] bArrM7453t3 = this.f14960o0.m7453t();
        c13711h.m15191N(c7045n.m7444c(bArrM7453t3.length, bArrM7453t3), "attestationObject");
        c13711h.m15191N(Arrays.toString(this.f14961p0), "transports");
        return c13711h.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8804c(parcel, 2, this.f14958Y.m7453t());
        AbstractC8199t5.m8804c(parcel, 3, this.f14959Z.m7453t());
        AbstractC8199t5.m8804c(parcel, 4, this.f14960o0.m7453t());
        AbstractC8199t5.m8808g(parcel, 5, this.f14961p0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
