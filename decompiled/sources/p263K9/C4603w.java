package p263K9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.ims.ParameterNamesIms;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Base64;
import com.google.android.gms.fido.common.Transport;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p063C9.AbstractC1616b;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p212I9.C3653a;
import p247Jj.C4409T0;
import p449S9.AbstractC7063d;
import p449S9.C7059b;
import p449S9.C7065e;
import p523V9.AbstractC8199t5;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: K9.w */
/* JADX INFO: loaded from: classes.dex */
public final class C4603w extends AbstractC20851a {
    public static final Parcelable.Creator<C4603w> CREATOR = new C4409T0(9);

    /* JADX INFO: renamed from: Y */
    public final C4606z f15005Y;

    /* JADX INFO: renamed from: Z */
    public final C4556C f15006Z;

    /* JADX INFO: renamed from: o0 */
    public final byte[] f15007o0;

    /* JADX INFO: renamed from: p0 */
    public final ArrayList f15008p0;

    /* JADX INFO: renamed from: q0 */
    public final Double f15009q0;

    /* JADX INFO: renamed from: r0 */
    public final ArrayList f15010r0;

    /* JADX INFO: renamed from: s0 */
    public final C4593m f15011s0;

    /* JADX INFO: renamed from: t0 */
    public final Integer f15012t0;

    /* JADX INFO: renamed from: u0 */
    public final C4562I f15013u0;

    /* JADX INFO: renamed from: v0 */
    public final EnumC4585e f15014v0;

    /* JADX INFO: renamed from: w0 */
    public final C4586f f15015w0;

    /* JADX INFO: renamed from: x0 */
    public final String f15016x0;

    /* JADX INFO: renamed from: y0 */
    public final ResultReceiver f15017y0;

    public C4603w(C4606z c4606z, C4556C c4556c, byte[] bArr, ArrayList arrayList, Double d10, ArrayList arrayList2, C4593m c4593m, Integer num, C4562I c4562i, String str, C4586f c4586f, String str2, ResultReceiver resultReceiver) {
        this.f15017y0 = resultReceiver;
        if (str2 != null) {
            try {
                C4603w c4603wM5341b = m5341b(new JSONObject(str2));
                this.f15005Y = c4603wM5341b.f15005Y;
                this.f15006Z = c4603wM5341b.f15006Z;
                this.f15007o0 = c4603wM5341b.f15007o0;
                this.f15008p0 = c4603wM5341b.f15008p0;
                this.f15009q0 = c4603wM5341b.f15009q0;
                this.f15010r0 = c4603wM5341b.f15010r0;
                this.f15011s0 = c4603wM5341b.f15011s0;
                this.f15012t0 = c4603wM5341b.f15012t0;
                this.f15013u0 = c4603wM5341b.f15013u0;
                this.f15014v0 = c4603wM5341b.f15014v0;
                this.f15015w0 = c4603wM5341b.f15015w0;
                this.f15016x0 = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        AbstractC20502t.m21157h(c4606z);
        this.f15005Y = c4606z;
        AbstractC20502t.m21157h(c4556c);
        this.f15006Z = c4556c;
        AbstractC20502t.m21157h(bArr);
        this.f15007o0 = bArr;
        AbstractC20502t.m21157h(arrayList);
        this.f15008p0 = arrayList;
        this.f15009q0 = d10;
        this.f15010r0 = arrayList2;
        this.f15011s0 = c4593m;
        this.f15012t0 = num;
        this.f15013u0 = c4562i;
        if (str != null) {
            try {
                this.f15014v0 = EnumC4585e.m5334a(str);
            } catch (C4584d e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f15014v0 = null;
        }
        this.f15015w0 = c4586f;
        this.f15016x0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0260  */
    /* JADX WARN: Code duplicated, block: B:103:0x026a  */
    /* JADX WARN: Code duplicated, block: B:104:0x027c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0286  */
    /* JADX WARN: Code duplicated, block: B:108:0x0298  */
    /* JADX WARN: Code duplicated, block: B:111:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:116:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:119:0x02db  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:123:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:124:0x0308  */
    /* JADX WARN: Code duplicated, block: B:127:0x0312  */
    /* JADX WARN: Code duplicated, block: B:128:0x0324  */
    /* JADX WARN: Code duplicated, block: B:131:0x032e  */
    /* JADX WARN: Code duplicated, block: B:132:0x033a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0212  */
    /* JADX WARN: Code duplicated, block: B:98:0x0221 A[LOOP:3: B:96:0x021b->B:98:0x0221, LOOP_END] */
    /* JADX INFO: renamed from: b */
    public static C4603w m5341b(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList;
        C4593m c4593m;
        C4586f c4586f;
        EnumC4585e enumC4585eM5334a;
        int i10;
        C4571S c4571s;
        C4571S c4571sM5327b;
        C4578Z c4578z;
        C4563J c4563j;
        C4582b0 c4582b0;
        C4567N c4567n;
        C4568O c4568o;
        C4580a0 c4580a0;
        C4569P c4569p;
        C4600t c4600t;
        C4572T c4572t;
        JSONArray jSONArray;
        ArrayList arrayList2;
        String str;
        int i11;
        ArrayList arrayList3;
        JSONArray jSONArray2;
        String str2;
        AbstractC7063d c7065e;
        int i12 = 1;
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        String str3 = ParameterNames.f31999ID;
        C4606z c4606z = new C4606z(jSONObject2.getString(ParameterNames.f31999ID), jSONObject2.getString(DiagnosticsEntry.NAME_KEY), jSONObject2.has(ParameterNames.ICON) ? jSONObject2.optString(ParameterNames.ICON) : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        C4556C c4556c = new C4556C(jSONObject3.getString(DiagnosticsEntry.NAME_KEY), jSONObject3.has(ParameterNames.ICON) ? jSONObject3.optString(ParameterNames.ICON) : null, jSONObject3.optString("displayName"), AbstractC1616b.m2469a(jSONObject3.getString(ParameterNames.f31999ID)));
        byte[] bArrM2469a = AbstractC1616b.m2469a(jSONObject.getString("challenge"));
        AbstractC20502t.m21157h(bArrM2469a);
        JSONArray jSONArray3 = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList4 = new ArrayList();
        for (int i13 = 0; i13 < jSONArray3.length(); i13++) {
            JSONObject jSONObject4 = jSONArray3.getJSONObject(i13);
            try {
                c7065e = new C7065e(new C4605y(jSONObject4.getString("type"), jSONObject4.getInt(ParameterNamesIms.ALG)));
            } catch (IllegalArgumentException unused) {
                c7065e = C7059b.f22536Y;
            }
            if (c7065e.mo7471b()) {
                arrayList4.add(c7065e.mo7470a());
            }
        }
        Double dValueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d) : null;
        int i14 = 11;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("excludeCredentials");
            arrayList = new ArrayList();
            int i15 = 0;
            while (i15 < jSONArray4.length()) {
                JSONObject jSONObject5 = jSONArray4.getJSONObject(i15);
                Parcelable.Creator<C4604x> creator = C4604x.CREATOR;
                String string = jSONObject5.getString("type");
                byte[] bArrDecode = Base64.decode(jSONObject5.getString(str3), i14);
                if (!jSONObject5.has("transports") || (jSONArray2 = jSONObject5.getJSONArray("transports")) == null) {
                    str = str3;
                    i11 = i12;
                    arrayList3 = null;
                } else {
                    HashSet hashSet = new HashSet(jSONArray2.length());
                    int i16 = 0;
                    while (i16 < jSONArray2.length()) {
                        String string2 = jSONArray2.getString(i16);
                        if (string2 == null || string2.isEmpty()) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            try {
                                hashSet.add(Transport.m13211a(string2));
                            } catch (C3653a unused2) {
                                AbstractC15256t.m16482t("Transport", "Ignoring unrecognized transport ".concat(string2));
                            }
                        }
                        i16++;
                        str3 = str2;
                    }
                    str = str3;
                    i11 = 1;
                    arrayList3 = new ArrayList(hashSet);
                }
                arrayList.add(new C4604x(string, bArrDecode, arrayList3));
                i15 += i11;
                i12 = i11;
                jSONArray4 = jSONArray4;
                str3 = str;
                i14 = 11;
            }
        } else {
            arrayList = null;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
            c4593m = new C4593m(jSONObject6.has("authenticatorAttachment") ? jSONObject6.optString("authenticatorAttachment") : null, jSONObject6.has("requireResidentKey") ? Boolean.valueOf(jSONObject6.optBoolean("requireResidentKey")) : null, jSONObject6.has("userVerification") ? jSONObject6.optString("userVerification") : null, jSONObject6.has("residentKey") ? jSONObject6.optString("residentKey") : null);
        } else {
            c4593m = null;
        }
        if (jSONObject.has("extensions")) {
            JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
            C4599s c4599s = jSONObject7.has("fidoAppIdExtension") ? new C4599s(jSONObject7.getJSONObject("fidoAppIdExtension").getString("appid")) : null;
            if (jSONObject7.has("appid")) {
                c4599s = new C4599s(jSONObject7.getString("appid"));
            }
            C4599s c4599s2 = c4599s;
            if (!jSONObject7.has("prf")) {
                i10 = 0;
                if (jSONObject7.has("prfAlreadyHashed")) {
                    c4571sM5327b = C4571S.m5327b(jSONObject7.getJSONObject("prfAlreadyHashed"), true);
                } else {
                    c4571s = null;
                }
                if (jSONObject7.has("cableAuthenticationExtension")) {
                    jSONArray = jSONObject7.getJSONArray("cableAuthenticationExtension");
                    arrayList2 = new ArrayList();
                    while (i10 < jSONArray.length()) {
                        JSONObject jSONObject8 = jSONArray.getJSONObject(i10);
                        arrayList2.add(new C4577Y(jSONObject8.getLong("version"), Base64.decode(jSONObject8.getString("clientEid"), 11), Base64.decode(jSONObject8.getString("authenticatorEid"), 11), Base64.decode(jSONObject8.getString("sessionPreKey"), 11)));
                        i10++;
                    }
                    c4578z = new C4578Z(arrayList2);
                } else {
                    c4578z = null;
                }
                if (jSONObject7.has("userVerificationMethodExtension")) {
                    c4563j = new C4563J(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
                } else {
                    c4563j = null;
                }
                if (jSONObject7.has("google_multiAssertionExtension")) {
                    c4582b0 = new C4582b0(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion"));
                } else {
                    c4582b0 = null;
                }
                if (jSONObject7.has("google_sessionIdExtension")) {
                    c4567n = new C4567N(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId"));
                } else {
                    c4567n = null;
                }
                if (jSONObject7.has("google_silentVerificationExtension")) {
                    c4568o = new C4568O(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification"));
                } else {
                    c4568o = null;
                }
                if (jSONObject7.has("devicePublicKeyExtension")) {
                    jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                    c4580a0 = new C4580a0();
                } else {
                    c4580a0 = null;
                }
                if (jSONObject7.has("google_tunnelServerIdExtension")) {
                    c4569p = new C4569P(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId"));
                } else {
                    c4569p = null;
                }
                if (jSONObject7.has("google_thirdPartyPaymentExtension")) {
                    c4600t = new C4600t(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment"));
                } else {
                    c4600t = null;
                }
                if (jSONObject7.has("txAuthSimple")) {
                    c4572t = new C4572T(jSONObject7.getString("txAuthSimple"));
                } else {
                    c4572t = null;
                }
                c4586f = new C4586f(c4599s2, c4578z, c4563j, c4582b0, c4567n, c4568o, c4580a0, c4569p, c4600t, c4571s, c4572t, null);
            } else {
                if (jSONObject7.has("prfAlreadyHashed")) {
                    throw new JSONException("both prf and prfAlreadyHashed extensions found");
                }
                i10 = 0;
                c4571sM5327b = C4571S.m5327b(jSONObject7.getJSONObject("prf"), false);
            }
            c4571s = c4571sM5327b;
            if (jSONObject7.has("cableAuthenticationExtension")) {
                jSONArray = jSONObject7.getJSONArray("cableAuthenticationExtension");
                arrayList2 = new ArrayList();
                while (i10 < jSONArray.length()) {
                    JSONObject jSONObject9 = jSONArray.getJSONObject(i10);
                    arrayList2.add(new C4577Y(jSONObject9.getLong("version"), Base64.decode(jSONObject9.getString("clientEid"), 11), Base64.decode(jSONObject9.getString("authenticatorEid"), 11), Base64.decode(jSONObject9.getString("sessionPreKey"), 11)));
                    i10++;
                }
                c4578z = new C4578Z(arrayList2);
            } else {
                c4578z = null;
            }
            if (jSONObject7.has("userVerificationMethodExtension")) {
                c4563j = new C4563J(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
            } else {
                c4563j = null;
            }
            if (jSONObject7.has("google_multiAssertionExtension")) {
                c4582b0 = new C4582b0(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion"));
            } else {
                c4582b0 = null;
            }
            if (jSONObject7.has("google_sessionIdExtension")) {
                c4567n = new C4567N(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId"));
            } else {
                c4567n = null;
            }
            if (jSONObject7.has("google_silentVerificationExtension")) {
                c4568o = new C4568O(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification"));
            } else {
                c4568o = null;
            }
            if (jSONObject7.has("devicePublicKeyExtension")) {
                jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                c4580a0 = new C4580a0();
            } else {
                c4580a0 = null;
            }
            if (jSONObject7.has("google_tunnelServerIdExtension")) {
                c4569p = new C4569P(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId"));
            } else {
                c4569p = null;
            }
            if (jSONObject7.has("google_thirdPartyPaymentExtension")) {
                c4600t = new C4600t(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment"));
            } else {
                c4600t = null;
            }
            if (jSONObject7.has("txAuthSimple")) {
                c4572t = new C4572T(jSONObject7.getString("txAuthSimple"));
            } else {
                c4572t = null;
            }
            c4586f = new C4586f(c4599s2, c4578z, c4563j, c4582b0, c4567n, c4568o, c4580a0, c4569p, c4600t, c4571s, c4572t, null);
        } else {
            c4586f = null;
        }
        if (jSONObject.has("attestation")) {
            try {
                enumC4585eM5334a = EnumC4585e.m5334a(jSONObject.getString("attestation"));
            } catch (C4584d e10) {
                AbstractC15256t.m16483u("PKCCreationOptions", "Invalid AttestationConveyancePreference", e10);
                enumC4585eM5334a = EnumC4585e.NONE;
            }
        } else {
            enumC4585eM5334a = null;
        }
        return new C4603w(c4606z, c4556c, bArrM2469a, arrayList4, dValueOf, arrayList, c4593m, null, null, enumC4585eM5334a == null ? null : enumC4585eM5334a.f14934Y, c4586f, null, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4603w)) {
            return false;
        }
        C4603w c4603w = (C4603w) obj;
        if (AbstractC20502t.m21161l(this.f15005Y, c4603w.f15005Y) && AbstractC20502t.m21161l(this.f15006Z, c4603w.f15006Z) && Arrays.equals(this.f15007o0, c4603w.f15007o0) && AbstractC20502t.m21161l(this.f15009q0, c4603w.f15009q0)) {
            ArrayList arrayList = this.f15008p0;
            ArrayList arrayList2 = c4603w.f15008p0;
            if (arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList)) {
                ArrayList arrayList3 = this.f15010r0;
                ArrayList arrayList4 = c4603w.f15010r0;
                if (((arrayList3 == null && arrayList4 == null) || (arrayList3 != null && arrayList4 != null && arrayList3.containsAll(arrayList4) && arrayList4.containsAll(arrayList3))) && AbstractC20502t.m21161l(this.f15011s0, c4603w.f15011s0) && AbstractC20502t.m21161l(this.f15012t0, c4603w.f15012t0) && AbstractC20502t.m21161l(this.f15013u0, c4603w.f15013u0) && AbstractC20502t.m21161l(this.f15014v0, c4603w.f15014v0) && AbstractC20502t.m21161l(this.f15015w0, c4603w.f15015w0) && AbstractC20502t.m21161l(this.f15016x0, c4603w.f15016x0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15005Y, this.f15006Z, Integer.valueOf(Arrays.hashCode(this.f15007o0)), this.f15008p0, this.f15009q0, this.f15010r0, this.f15011s0, this.f15012t0, this.f15013u0, this.f15014v0, this.f15015w0, this.f15016x0});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f15005Y);
        String strValueOf2 = String.valueOf(this.f15006Z);
        String strM2470b = AbstractC1616b.m2470b(this.f15007o0);
        String strValueOf3 = String.valueOf(this.f15008p0);
        String strValueOf4 = String.valueOf(this.f15010r0);
        String strValueOf5 = String.valueOf(this.f15011s0);
        String strValueOf6 = String.valueOf(this.f15013u0);
        String strValueOf7 = String.valueOf(this.f15014v0);
        String strValueOf8 = String.valueOf(this.f15015w0);
        StringBuilder sbM9896o = AbstractC9306j0.m9896o("PublicKeyCredentialCreationOptions{\n rp=", strValueOf, ", \n user=", strValueOf2, ", \n challenge=");
        AbstractC10763a.m11067y(sbM9896o, strM2470b, ", \n parameters=", strValueOf3, ", \n timeoutSeconds=");
        sbM9896o.append(this.f15009q0);
        sbM9896o.append(", \n excludeList=");
        sbM9896o.append(strValueOf4);
        sbM9896o.append(", \n authenticatorSelection=");
        sbM9896o.append(strValueOf5);
        sbM9896o.append(", \n requestId=");
        sbM9896o.append(this.f15012t0);
        sbM9896o.append(", \n tokenBinding=");
        sbM9896o.append(strValueOf6);
        sbM9896o.append(", \n attestationConveyancePreference=");
        sbM9896o.append(strValueOf7);
        sbM9896o.append(", \n authenticationExtensions=");
        sbM9896o.append(strValueOf8);
        sbM9896o.append("}");
        return sbM9896o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8806e(parcel, 2, this.f15005Y, i10);
        AbstractC8199t5.m8806e(parcel, 3, this.f15006Z, i10);
        AbstractC8199t5.m8804c(parcel, 4, this.f15007o0);
        AbstractC8199t5.m8810i(parcel, 5, this.f15008p0);
        Double d10 = this.f15009q0;
        if (d10 != null) {
            AbstractC8199t5.m8813l(parcel, 6, 8);
            parcel.writeDouble(d10.doubleValue());
        }
        AbstractC8199t5.m8810i(parcel, 7, this.f15010r0);
        AbstractC8199t5.m8806e(parcel, 8, this.f15011s0, i10);
        Integer num = this.f15012t0;
        if (num != null) {
            AbstractC8199t5.m8813l(parcel, 9, 4);
            parcel.writeInt(num.intValue());
        }
        AbstractC8199t5.m8806e(parcel, 10, this.f15013u0, i10);
        EnumC4585e enumC4585e = this.f15014v0;
        AbstractC8199t5.m8807f(parcel, 11, enumC4585e == null ? null : enumC4585e.f14934Y);
        AbstractC8199t5.m8806e(parcel, 12, this.f15015w0, i10);
        AbstractC8199t5.m8807f(parcel, 13, this.f15016x0);
        AbstractC8199t5.m8806e(parcel, 14, this.f15017y0, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
