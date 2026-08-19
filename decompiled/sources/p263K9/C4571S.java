package p263K9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p063C9.AbstractC1616b;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p247Jj.C4409T0;
import p449S9.AbstractC7039H;
import p449S9.AbstractC7040I;
import p449S9.AbstractC7041J;
import p449S9.AbstractC7057a;
import p449S9.C7038G;
import p449S9.C7042K;
import p449S9.C7043L;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: K9.S */
/* JADX INFO: loaded from: classes.dex */
public final class C4571S extends AbstractC20851a {
    public static final Parcelable.Creator<C4571S> CREATOR = new C4409T0(8);

    /* JADX INFO: renamed from: Z */
    public static final byte[] f14916Z = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: Y */
    public final byte[][] f14917Y;

    public C4571S(byte[][] bArr) {
        AbstractC20502t.m21151b(bArr != null);
        AbstractC20502t.m21151b(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            AbstractC20502t.m21151b(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            AbstractC20502t.m21151b(bArr[i11] != null);
            int length = bArr[i11].length;
            AbstractC20502t.m21151b(length == 32 || length == 64);
            i10 += 2;
        }
        this.f14917Y = bArr;
    }

    /* JADX INFO: renamed from: b */
    public static C4571S m5327b(JSONObject jSONObject, boolean z6) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z6) {
                    arrayList.add(m5330f(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(m5331g(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.add(AbstractC1616b.m2469a(next));
                    if (z6) {
                        arrayList.add(m5330f(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(m5331g(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new C4571S((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m5328c(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
        } else {
            jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
            jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m5329d(byte[] bArr) {
        C7042K c7042k;
        C7038G c7038g;
        int i10 = AbstractC7041J.f22493a;
        C7043L c7043l = AbstractC7040I.f22492a;
        boolean z6 = c7043l.f22499o0;
        int i11 = c7043l.f22498Z;
        MessageDigest messageDigest = c7043l.f22497Y;
        if (z6) {
            try {
                c7042k = new C7042K((MessageDigest) messageDigest.clone(), i11);
            } catch (CloneNotSupportedException unused) {
                try {
                    c7042k = new C7042K(MessageDigest.getInstance(messageDigest.getAlgorithm()), i11);
                } catch (NoSuchAlgorithmException e10) {
                    throw new AssertionError(e10);
                }
            }
        } else {
            c7042k = new C7042K(MessageDigest.getInstance(messageDigest.getAlgorithm()), i11);
        }
        byte[] bArr2 = f14916Z;
        bArr2.getClass();
        int length = bArr2.length;
        if (c7042k.f22495b) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        MessageDigest messageDigest2 = (MessageDigest) c7042k.f22496c;
        messageDigest2.update(bArr2, 0, length);
        bArr.getClass();
        int length2 = bArr.length;
        if (c7042k.f22495b) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        messageDigest2.update(bArr, 0, length2);
        if (c7042k.f22495b) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        c7042k.f22495b = true;
        int digestLength = messageDigest2.getDigestLength();
        int i12 = c7042k.f22494a;
        if (i12 == digestLength) {
            byte[] bArrDigest = messageDigest2.digest();
            char[] cArr = AbstractC7039H.f22491Y;
            c7038g = new C7038G(bArrDigest);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(messageDigest2.digest(), i12);
            char[] cArr2 = AbstractC7039H.f22491Y;
            c7038g = new C7038G(bArrCopyOf);
        }
        return (byte[]) c7038g.f22490Z.clone();
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m5330f(JSONObject jSONObject) throws JSONException {
        byte[] bArrM2469a = AbstractC1616b.m2469a(jSONObject.getString("first"));
        if (bArrM2469a.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return bArrM2469a;
        }
        byte[] bArrM2469a2 = AbstractC1616b.m2469a(jSONObject.getString("second"));
        if (bArrM2469a2.length == 32) {
            return AbstractC7057a.m7465j(bArrM2469a, bArrM2469a2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m5331g(JSONObject jSONObject) {
        byte[] bArrM5329d = m5329d(AbstractC1616b.m2469a(jSONObject.getString("first")));
        return !jSONObject.has("second") ? bArrM5329d : AbstractC7057a.m7465j(bArrM5329d, m5329d(AbstractC1616b.m2469a(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4571S) {
            return Arrays.deepEquals(this.f14917Y, ((C4571S) obj).f14917Y);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.f14917Y) {
            if (bArr != null) {
                iHashCode ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return iHashCode;
    }

    public final String toString() {
        byte[][] bArr = this.f14917Y;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                if (bArr[i10] == null) {
                    jSONObject.put("eval", m5328c(bArr[i10 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(AbstractC1616b.m2470b(bArr[i10]), m5328c(bArr[i10 + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e10) {
            return AbstractC10763a.m11054l("PrfExtension{Exception:", e10.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        byte[][] bArr = this.f14917Y;
        if (bArr != null) {
            int iM8811j2 = AbstractC8199t5.m8811j(parcel, 1);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            AbstractC8199t5.m8812k(parcel, iM8811j2);
        }
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
