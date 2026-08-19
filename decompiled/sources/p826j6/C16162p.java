package p826j6;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.text.TextUtils;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: j6.p */
/* JADX INFO: loaded from: classes.dex */
public final class C16162p {

    /* JADX INFO: renamed from: a */
    public final String f50175a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f50176b;

    /* JADX INFO: renamed from: c */
    public final String f50177c;

    /* JADX INFO: renamed from: d */
    public final String f50178d;

    /* JADX INFO: renamed from: e */
    public final String f50179e;

    /* JADX INFO: renamed from: f */
    public final String f50180f;

    /* JADX INFO: renamed from: g */
    public final String f50181g;

    /* JADX INFO: renamed from: h */
    public final String f50182h;

    /* JADX INFO: renamed from: i */
    public final String f50183i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f50184j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f50185k;

    public C16162p(String str) {
        this.f50175a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f50176b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f50177c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f50178d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f50179e = jSONObject.optString(UiComponentConfig.Title.type);
        this.f50180f = jSONObject.optString(DiagnosticsEntry.NAME_KEY);
        this.f50181g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f50182h = jSONObject.optString("skuDetailsToken");
        this.f50183i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new C16161o(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f50184j = arrayList;
        } else {
            this.f50184j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f50176b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f50176b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new C16159m(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.f50185k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f50185k = null;
        } else {
            arrayList2.add(new C16159m(jSONObjectOptJSONObject));
            this.f50185k = arrayList2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C16159m m17779a() {
        ArrayList arrayList = this.f50185k;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (C16159m) arrayList.get(0);
    }

    /* JADX INFO: renamed from: b */
    public final String m17780b() {
        return this.f50177c;
    }

    /* JADX INFO: renamed from: c */
    public final String m17781c() {
        return this.f50178d;
    }

    /* JADX INFO: renamed from: d */
    public final String m17782d() {
        return this.f50176b.optString("packageName");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16162p) {
            return TextUtils.equals(this.f50175a, ((C16162p) obj).f50175a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f50175a.hashCode();
    }

    public final String toString() {
        String string = this.f50176b.toString();
        String strValueOf = String.valueOf(this.f50184j);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        AbstractC10763a.m11067y(sb2, this.f50175a, "', parsedJson=", string, ", productId='");
        sb2.append(this.f50177c);
        sb2.append("', productType='");
        sb2.append(this.f50178d);
        sb2.append("', title='");
        sb2.append(this.f50179e);
        sb2.append("', productDetailsToken='");
        sb2.append(this.f50182h);
        sb2.append("', subscriptionOfferDetails=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
