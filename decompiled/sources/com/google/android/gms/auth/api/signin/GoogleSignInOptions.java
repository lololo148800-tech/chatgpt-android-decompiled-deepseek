package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1022t9.InterfaceC19817b;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p945p9.C18312c;
import p945p9.C18313d;
import p960q9.C18647a;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInOptions extends AbstractC20851a implements InterfaceC19817b, ReflectedParcelable {

    /* JADX INFO: renamed from: A0 */
    public static final C18312c f36017A0;
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: w0 */
    public static final GoogleSignInOptions f36018w0;

    /* JADX INFO: renamed from: x0 */
    public static final Scope f36019x0;

    /* JADX INFO: renamed from: y0 */
    public static final Scope f36020y0;

    /* JADX INFO: renamed from: z0 */
    public static final Scope f36021z0;

    /* JADX INFO: renamed from: Y */
    public final int f36022Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f36023Z;

    /* JADX INFO: renamed from: o0 */
    public final Account f36024o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f36025p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f36026q0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f36027r0;

    /* JADX INFO: renamed from: s0 */
    public final String f36028s0;

    /* JADX INFO: renamed from: t0 */
    public final String f36029t0;

    /* JADX INFO: renamed from: u0 */
    public final ArrayList f36030u0;

    /* JADX INFO: renamed from: v0 */
    public final String f36031v0;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        f36019x0 = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f36020y0 = scope3;
        f36021z0 = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f36021z0)) {
            Scope scope4 = f36020y0;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f36018w0 = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f36021z0)) {
            Scope scope5 = f36020y0;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new C18313d(1);
        f36017A0 = new C18312c(1);
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z6, boolean z10, boolean z11, String str, String str2, HashMap map, String str3) {
        this.f36022Y = i10;
        this.f36023Z = arrayList;
        this.f36024o0 = account;
        this.f36025p0 = z6;
        this.f36026q0 = z10;
        this.f36027r0 = z11;
        this.f36028s0 = str;
        this.f36029t0 = str2;
        this.f36030u0 = new ArrayList(map.values());
        this.f36031v0 = str3;
    }

    /* JADX INFO: renamed from: b */
    public static GoogleSignInOptions m13179b(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    /* JADX INFO: renamed from: c */
    public static HashMap m13180c(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C18647a c18647a = (C18647a) it.next();
                map.put(Integer.valueOf(c18647a.f59388Z), c18647a);
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004f A[Catch: ClassCastException -> 0x007b, TryCatch #0 {ClassCastException -> 0x007b, blocks: (B:5:0x0008, B:7:0x0018, B:10:0x0021, B:12:0x0030, B:15:0x003c, B:21:0x0049, B:23:0x004f, B:29:0x005d, B:31:0x0063, B:33:0x0069, B:35:0x006f, B:26:0x0056, B:19:0x0043), top: B:41:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[Catch: ClassCastException -> 0x007b, TryCatch #0 {ClassCastException -> 0x007b, blocks: (B:5:0x0008, B:7:0x0018, B:10:0x0021, B:12:0x0030, B:15:0x003c, B:21:0x0049, B:23:0x004f, B:29:0x005d, B:31:0x0063, B:33:0x0069, B:35:0x006f, B:26:0x0056, B:19:0x0043), top: B:41:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d A[Catch: ClassCastException -> 0x007b, TryCatch #0 {ClassCastException -> 0x007b, blocks: (B:5:0x0008, B:7:0x0018, B:10:0x0021, B:12:0x0030, B:15:0x003c, B:21:0x0049, B:23:0x004f, B:29:0x005d, B:31:0x0063, B:33:0x0069, B:35:0x006f, B:26:0x0056, B:19:0x0043), top: B:41:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0063 A[Catch: ClassCastException -> 0x007b, TryCatch #0 {ClassCastException -> 0x007b, blocks: (B:5:0x0008, B:7:0x0018, B:10:0x0021, B:12:0x0030, B:15:0x003c, B:21:0x0049, B:23:0x004f, B:29:0x005d, B:31:0x0063, B:33:0x0069, B:35:0x006f, B:26:0x0056, B:19:0x0043), top: B:41:0x0008 }] */
    public final boolean equals(Object obj) {
        String str = this.f36028s0;
        ArrayList arrayList = this.f36023Z;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList2 = googleSignInOptions.f36023Z;
            String str2 = googleSignInOptions.f36028s0;
            Account account = googleSignInOptions.f36024o0;
            if (this.f36030u0.isEmpty() && googleSignInOptions.f36030u0.isEmpty() && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
                Account account2 = this.f36024o0;
                if (account2 == null) {
                    if (account == null) {
                        if (TextUtils.isEmpty(str)) {
                            if (TextUtils.isEmpty(str2)) {
                                if (this.f36027r0 != googleSignInOptions.f36027r0 && this.f36025p0 == googleSignInOptions.f36025p0 && this.f36026q0 == googleSignInOptions.f36026q0 && TextUtils.equals(this.f36031v0, googleSignInOptions.f36031v0)) {
                                    return true;
                                }
                            }
                        } else if (!str.equals(str2)) {
                            if (this.f36027r0 != googleSignInOptions.f36027r0) {
                            }
                        }
                    }
                } else if (account2.equals(account)) {
                    if (TextUtils.isEmpty(str)) {
                        if (TextUtils.isEmpty(str2)) {
                            if (this.f36027r0 != googleSignInOptions.f36027r0) {
                            }
                        }
                    } else if (!str.equals(str2)) {
                        if (this.f36027r0 != googleSignInOptions.f36027r0) {
                        }
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f36023Z;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).f36046Z);
        }
        Collections.sort(arrayList);
        int iHashCode = arrayList.hashCode() + (1 * 31);
        Account account = this.f36024o0;
        int iHashCode2 = (iHashCode * 31) + (account == null ? 0 : account.hashCode());
        String str = this.f36028s0;
        int iHashCode3 = (((((((iHashCode2 * 31) + (str == null ? 0 : str.hashCode())) * 31) + (this.f36027r0 ? 1 : 0)) * 31) + (this.f36025p0 ? 1 : 0)) * 31) + (this.f36026q0 ? 1 : 0);
        String str2 = this.f36031v0;
        return (iHashCode3 * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f36022Y);
        AbstractC8199t5.m8810i(parcel, 2, new ArrayList(this.f36023Z));
        AbstractC8199t5.m8806e(parcel, 3, this.f36024o0, i10);
        AbstractC8199t5.m8813l(parcel, 4, 4);
        parcel.writeInt(this.f36025p0 ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 5, 4);
        parcel.writeInt(this.f36026q0 ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 6, 4);
        parcel.writeInt(this.f36027r0 ? 1 : 0);
        AbstractC8199t5.m8807f(parcel, 7, this.f36028s0);
        AbstractC8199t5.m8807f(parcel, 8, this.f36029t0);
        AbstractC8199t5.m8810i(parcel, 9, this.f36030u0);
        AbstractC8199t5.m8807f(parcel, 10, this.f36031v0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
