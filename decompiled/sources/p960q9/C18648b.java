package p960q9;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1060v9.AbstractC20502t;
import p571X9.AbstractC9306j0;
import p926of.yRae.sVDIzpC;
import p945p9.C18312c;

/* JADX INFO: renamed from: q9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C18648b {

    /* JADX INFO: renamed from: c */
    public static final ReentrantLock f59390c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    public static C18648b f59391d;

    /* JADX INFO: renamed from: a */
    public final ReentrantLock f59392a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f59393b;

    public C18648b(Context context) {
        this.f59393b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* JADX INFO: renamed from: a */
    public static C18648b m20005a(Context context) {
        AbstractC20502t.m21157h(context);
        ReentrantLock reentrantLock = f59390c;
        reentrantLock.lock();
        try {
            if (f59391d == null) {
                f59391d = new C18648b(context.getApplicationContext());
            }
            return f59391d;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: g */
    public static final String m20006g(String str, String str2) {
        return AbstractC9306j0.m9890i(str, ":", str2);
    }

    /* JADX INFO: renamed from: b */
    public final GoogleSignInAccount m20007b() {
        String strM20010e;
        String strM20010e2 = m20010e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strM20010e2) || (strM20010e = m20010e(m20006g("googleSignInAccount", strM20010e2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m13178b(strM20010e);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final GoogleSignInOptions m20008c() {
        String strM20010e;
        String strM20010e2 = m20010e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strM20010e2) || (strM20010e = m20010e(m20006g("googleSignInOptions", strM20010e2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m13179b(strM20010e);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m20010e(String str) {
        ReentrantLock reentrantLock = this.f59392a;
        reentrantLock.lock();
        try {
            return this.f59393b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m20011f(String str, String str2) {
        ReentrantLock reentrantLock = this.f59392a;
        reentrantLock.lock();
        try {
            this.f59393b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m20009d(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        AbstractC20502t.m21157h(googleSignInAccount);
        AbstractC20502t.m21157h(googleSignInOptions);
        String str = googleSignInAccount.f36012u0;
        m20011f("defaultGoogleSignInAccount", str);
        String strM20006g = m20006g("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f36005Z;
            if (str2 != null) {
                jSONObject.put(sVDIzpC.vFYgpZGkZnoDWV, str2);
            }
            String str3 = googleSignInAccount.f36006o0;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f36007p0;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f36008q0;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f36014w0;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f36015x0;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f36009r0;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f36010s0;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f36011t0);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = googleSignInAccount.f36013v0;
            Scope[] scopeArr = (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
            Arrays.sort(scopeArr, C18312c.f58450Z);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f36046Z);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            m20011f(strM20006g, jSONObject.toString());
            String strM20006g2 = m20006g("googleSignInOptions", str);
            String str9 = googleSignInOptions.f36029t0;
            String str10 = googleSignInOptions.f36028s0;
            ArrayList arrayList2 = googleSignInOptions.f36023Z;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList2, GoogleSignInOptions.f36017A0);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).f36046Z);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f36024o0;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f36025p0);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f36027r0);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f36026q0);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                m20011f(strM20006g2, jSONObject2.toString());
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        } catch (JSONException e11) {
            throw new RuntimeException(e11);
        }
    }
}
