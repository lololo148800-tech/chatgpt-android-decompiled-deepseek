package p826j6;

import org.json.JSONObject;

/* JADX INFO: renamed from: j6.n */
/* JADX INFO: loaded from: classes.dex */
public final class C16160n {

    /* JADX INFO: renamed from: a */
    public final String f50163a;

    /* JADX INFO: renamed from: b */
    public final long f50164b;

    /* JADX INFO: renamed from: c */
    public final String f50165c;

    /* JADX INFO: renamed from: d */
    public final String f50166d;

    /* JADX INFO: renamed from: e */
    public final int f50167e;

    /* JADX INFO: renamed from: f */
    public final int f50168f;

    public C16160n(JSONObject jSONObject) {
        this.f50166d = jSONObject.optString("billingPeriod");
        this.f50165c = jSONObject.optString("priceCurrencyCode");
        this.f50163a = jSONObject.optString("formattedPrice");
        this.f50164b = jSONObject.optLong("priceAmountMicros");
        this.f50168f = jSONObject.optInt("recurrenceMode");
        this.f50167e = jSONObject.optInt("billingCycleCount");
    }
}
