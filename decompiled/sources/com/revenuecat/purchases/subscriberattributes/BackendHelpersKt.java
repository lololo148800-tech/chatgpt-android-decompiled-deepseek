package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.common.BackendKt;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p200Hm.C3508g;
import p530Vi.AbstractC8301I;
import p909nm.AbstractC17657B;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0004\u0018\u00010\u0003H\u0000\u001a2\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u0005*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0005H\u0000¨\u0006\t"}, m18067d2 = {"getAttributeErrors", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "Lorg/json/JSONObject;", "toBackendMap", "", "", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class BackendHelpersKt {
    public static final List<SubscriberAttributeError> getAttributeErrors(JSONObject jSONObject) throws JSONException {
        C17689w c17689w = C17689w.f56480Y;
        if (jSONObject == null) {
            return c17689w;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(BackendKt.ATTRIBUTES_ERROR_RESPONSE_KEY);
        if (jSONObjectOptJSONObject != null) {
            jSONObject = jSONObjectOptJSONObject;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(BackendKt.ATTRIBUTE_ERRORS_KEY);
        if (jSONArrayOptJSONArray == null) {
            return c17689w;
        }
        C3508g c3508gM8929t = AbstractC8301I.m8929t(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c3508gM8929t, 10));
        Iterator it = c3508gM8929t.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArrayOptJSONArray.getJSONObject(((AbstractC17657B) it).mo4199a()));
        }
        ArrayList<JSONObject> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            JSONObject jSONObject2 = (JSONObject) obj;
            if (jSONObject2.has("key_name") && jSONObject2.has("message")) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
        for (JSONObject jSONObject3 : arrayList2) {
            String string = jSONObject3.getString("key_name");
            AbstractC16544l.m18093f(string, "it.getString(\"key_name\")");
            String string2 = jSONObject3.getString("message");
            AbstractC16544l.m18093f(string2, "it.getString(\"message\")");
            arrayList3.add(new SubscriberAttributeError(string, string2));
        }
        return AbstractC17680n.m19322C0(arrayList3);
    }

    public static final Map<String, Map<String, Object>> toBackendMap(Map<String, SubscriberAttribute> map) {
        AbstractC16544l.m18094g(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, SubscriberAttribute> entry : map.entrySet()) {
            arrayList.add(new C17309l(entry.getKey(), entry.getValue().toBackendMap()));
        }
        return AbstractC17659D.m19253o(arrayList);
    }
}
