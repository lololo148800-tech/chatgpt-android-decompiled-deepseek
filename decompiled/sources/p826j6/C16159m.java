package p826j6;

import cn.UfGr.EhBykzn;
import com.google.android.gms.internal.play_billing.AbstractC11857B;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p959q8.C18639a;

/* JADX INFO: renamed from: j6.m */
/* JADX INFO: loaded from: classes.dex */
public final class C16159m {

    /* JADX INFO: renamed from: a */
    public final String f50157a;

    /* JADX INFO: renamed from: b */
    public final long f50158b;

    /* JADX INFO: renamed from: c */
    public final String f50159c;

    /* JADX INFO: renamed from: d */
    public final String f50160d;

    /* JADX INFO: renamed from: e */
    public final String f50161e;

    /* JADX INFO: renamed from: f */
    public final C18639a f50162f;

    public C16159m(JSONObject jSONObject) throws JSONException {
        this.f50157a = jSONObject.optString("formattedPrice");
        this.f50158b = jSONObject.optLong("priceAmountMicros");
        this.f50159c = jSONObject.optString("priceCurrencyCode");
        String strOptString = jSONObject.optString("offerIdToken");
        C18639a c18639a = null;
        this.f50160d = true == strOptString.isEmpty() ? null : strOptString;
        jSONObject.optString("offerId").getClass();
        jSONObject.optString("purchaseOptionId").getClass();
        jSONObject.optInt("offerType");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i10));
            }
        }
        AbstractC11857B.m13222u(arrayList);
        if (jSONObject.has("fullPriceMicros")) {
            jSONObject.optLong("fullPriceMicros");
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.getInt("percentageDiscount");
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.getLong("startTimeMillis");
            jSONObjectOptJSONObject2.getLong("endTimeMillis");
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.getInt(EhBykzn.WhASIdWRrBJ);
            jSONObjectOptJSONObject3.getInt("remainingQuantity");
        }
        this.f50161e = jSONObject.optString("serializedDocid");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.getLong("preorderReleaseTimeMillis");
            jSONObjectOptJSONObject4.getLong("preorderPresaleEndTimeMillis");
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
        if (jSONObjectOptJSONObject5 != null) {
            jSONObjectOptJSONObject5.getString("rentalPeriod");
            jSONObjectOptJSONObject5.optString("rentalExpirationPeriod").getClass();
        }
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject(YladLSetV.WZddecu);
        if (jSONObjectOptJSONObject6 != null) {
            c18639a = new C18639a(29);
            jSONObjectOptJSONObject6.getString("type");
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject6.optJSONArray("balanceThresholds");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray2 != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                    arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray2.getInt(i11)));
                }
            }
            JSONArray jSONArray = jSONObjectOptJSONObject6.getJSONArray("pricingPhases");
            ArrayList arrayList3 = new ArrayList();
            if (jSONArray != null) {
                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                    JSONObject jSONObjectOptJSONObject7 = jSONArray.optJSONObject(i12);
                    if (jSONObjectOptJSONObject7 != null) {
                        arrayList3.add(new C16160n(jSONObjectOptJSONObject7));
                    }
                }
            }
        }
        this.f50162f = c18639a;
    }
}
