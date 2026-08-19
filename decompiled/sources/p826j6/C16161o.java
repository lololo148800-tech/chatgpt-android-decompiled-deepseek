package p826j6;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p228J.C3847l0;

/* JADX INFO: renamed from: j6.o */
/* JADX INFO: loaded from: classes.dex */
public final class C16161o {

    /* JADX INFO: renamed from: a */
    public final String f50169a;

    /* JADX INFO: renamed from: b */
    public final String f50170b;

    /* JADX INFO: renamed from: c */
    public final String f50171c;

    /* JADX INFO: renamed from: d */
    public final C3847l0 f50172d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f50173e;

    /* JADX INFO: renamed from: f */
    public final C16158l f50174f;

    public C16161o(JSONObject jSONObject) throws JSONException {
        this.f50169a = jSONObject.optString("basePlanId");
        String strOptString = jSONObject.optString("offerId");
        this.f50170b = true == strOptString.isEmpty() ? null : strOptString;
        this.f50171c = jSONObject.getString("offerIdToken");
        this.f50172d = new C3847l0(jSONObject.getJSONArray("pricingPhases"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
        this.f50174f = jSONObjectOptJSONObject != null ? new C16158l(jSONObjectOptJSONObject) : null;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.getString("productId");
            jSONObjectOptJSONObject2.optString(UiComponentConfig.Title.type);
            jSONObjectOptJSONObject2.optString(DiagnosticsEntry.NAME_KEY);
            jSONObjectOptJSONObject2.optString("description");
            jSONObjectOptJSONObject2.optString("basePlanId");
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
            if (jSONObjectOptJSONObject3 != null) {
                jSONObjectOptJSONObject3.optString("billingPeriod");
                jSONObjectOptJSONObject3.optString("priceCurrencyCode");
                jSONObjectOptJSONObject3.optString("formattedPrice");
                jSONObjectOptJSONObject3.optLong("priceAmountMicros");
                jSONObjectOptJSONObject3.optInt("recurrenceMode");
                jSONObjectOptJSONObject3.optInt("billingCycleCount");
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i10));
            }
        }
        this.f50173e = arrayList;
    }
}
