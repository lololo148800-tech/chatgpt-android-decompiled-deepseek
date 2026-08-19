package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Purchase {

    /* JADX INFO: renamed from: a */
    public final String f35950a;

    /* JADX INFO: renamed from: b */
    public final String f35951b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f35952c;

    public Purchase(String str, String str2) {
        this.f35950a = str;
        this.f35951b = str2;
        this.f35952c = new JSONObject(str);
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m13148a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f35952c;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final String m13149b() {
        JSONObject jSONObject = this.f35952c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f35950a, purchase.f35950a) && TextUtils.equals(this.f35951b, purchase.f35951b);
    }

    public final int hashCode() {
        return this.f35950a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f35950a));
    }
}
