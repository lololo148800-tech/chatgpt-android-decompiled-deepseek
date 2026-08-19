package com.google.android.gms.auth.api.signin;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p945p9.C18313d;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractC20851a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C18313d(0);

    /* JADX INFO: renamed from: Y */
    public final int f36004Y;

    /* JADX INFO: renamed from: Z */
    public final String f36005Z;

    /* JADX INFO: renamed from: o0 */
    public final String f36006o0;

    /* JADX INFO: renamed from: p0 */
    public final String f36007p0;

    /* JADX INFO: renamed from: q0 */
    public final String f36008q0;

    /* JADX INFO: renamed from: r0 */
    public final Uri f36009r0;

    /* JADX INFO: renamed from: s0 */
    public String f36010s0;

    /* JADX INFO: renamed from: t0 */
    public final long f36011t0;

    /* JADX INFO: renamed from: u0 */
    public final String f36012u0;

    /* JADX INFO: renamed from: v0 */
    public final ArrayList f36013v0;

    /* JADX INFO: renamed from: w0 */
    public final String f36014w0;

    /* JADX INFO: renamed from: x0 */
    public final String f36015x0;

    /* JADX INFO: renamed from: y0 */
    public final HashSet f36016y0 = new HashSet();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, ArrayList arrayList, String str7, String str8) {
        this.f36004Y = i10;
        this.f36005Z = str;
        this.f36006o0 = str2;
        this.f36007p0 = str3;
        this.f36008q0 = str4;
        this.f36009r0 = uri;
        this.f36010s0 = str5;
        this.f36011t0 = j10;
        this.f36012u0 = str6;
        this.f36013v0 = arrayList;
        this.f36014w0 = str7;
        this.f36015x0 = str8;
    }

    /* JADX INFO: renamed from: b */
    public static GoogleSignInAccount m13178b(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String strOptString2 = jSONObject.optString(ParameterNames.f31999ID);
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        AbstractC20502t.m21153d(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j10, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f36010s0 = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.f36012u0.equals(this.f36012u0)) {
            HashSet hashSet = new HashSet(googleSignInAccount.f36013v0);
            hashSet.addAll(googleSignInAccount.f36016y0);
            HashSet hashSet2 = new HashSet(this.f36013v0);
            hashSet2.addAll(this.f36016y0);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f36012u0.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f36013v0);
        hashSet.addAll(this.f36016y0);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f36004Y);
        AbstractC8199t5.m8807f(parcel, 2, this.f36005Z);
        AbstractC8199t5.m8807f(parcel, 3, this.f36006o0);
        AbstractC8199t5.m8807f(parcel, 4, this.f36007p0);
        AbstractC8199t5.m8807f(parcel, 5, this.f36008q0);
        AbstractC8199t5.m8806e(parcel, 6, this.f36009r0, i10);
        AbstractC8199t5.m8807f(parcel, 7, this.f36010s0);
        AbstractC8199t5.m8813l(parcel, 8, 8);
        parcel.writeLong(this.f36011t0);
        AbstractC8199t5.m8807f(parcel, 9, this.f36012u0);
        AbstractC8199t5.m8810i(parcel, 10, this.f36013v0);
        AbstractC8199t5.m8807f(parcel, 11, this.f36014w0);
        AbstractC8199t5.m8807f(parcel, 12, this.f36015x0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
