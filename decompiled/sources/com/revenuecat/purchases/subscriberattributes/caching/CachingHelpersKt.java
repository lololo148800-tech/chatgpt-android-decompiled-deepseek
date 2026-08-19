package com.revenuecat.purchases.subscriberattributes.caching;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u0001*\"\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u00060\u0002H\u0000¨\u0006\u0007"}, m18067d2 = {"toJSONObject", "Lorg/json/JSONObject;", "", "", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CachingHelpersKt {
    public static final JSONObject toJSONObject(Map<String, ? extends Map<String, SubscriberAttribute>> map) throws JSONException {
        AbstractC16544l.m18094g(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Map<String, SubscriberAttribute>> entry : map.entrySet()) {
            String key = entry.getKey();
            Map<String, SubscriberAttribute> value = entry.getValue();
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, SubscriberAttribute> entry2 : value.entrySet()) {
                jSONObject2.put(entry2.getKey(), entry2.getValue().toJSONObject());
            }
            jSONObject.put(key, jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("attributes", jSONObject);
        return jSONObject3;
    }
}
