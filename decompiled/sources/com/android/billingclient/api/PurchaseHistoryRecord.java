package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class PurchaseHistoryRecord {

    /* JADX INFO: renamed from: a */
    public final String f35953a;

    /* JADX INFO: renamed from: b */
    public final String f35954b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f35955c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.f35953a = str;
        this.f35954b = str2;
        this.f35955c = new JSONObject(str);
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m13150a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f35955c;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f35953a, purchaseHistoryRecord.f35953a) && TextUtils.equals(this.f35954b, purchaseHistoryRecord.f35954b);
    }

    public final int hashCode() {
        return this.f35953a.hashCode();
    }

    public final String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f35953a));
    }
}
