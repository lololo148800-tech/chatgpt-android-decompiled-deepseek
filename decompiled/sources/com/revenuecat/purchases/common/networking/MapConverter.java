package com.revenuecat.purchases.common.networking;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17660E;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0007\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0004\u0018\u0001*\u0004\u0018\u00010\u00012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H\u0082\b¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000f\u001a\u00020\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0000¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0000¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0012"}, m18067d2 = {"Lcom/revenuecat/purchases/common/networking/MapConverter;", "", "<init>", "()V", TokenNames.f32019T, "Lkotlin/Function1;", "ifSuccess", "tryCast", "(Ljava/lang/Object;LBm/k;)Ljava/lang/Object;", "", "", "inputMap", "Lorg/json/JSONObject;", "convertToJSON$purchases_customEntitlementComputationRelease", "(Ljava/util/Map;)Lorg/json/JSONObject;", "convertToJSON", "createJSONObject$purchases_customEntitlementComputationRelease", "createJSONObject", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class MapConverter {
    private final <T> Object tryCast(Object obj, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18102o();
        throw null;
    }

    public final JSONObject convertToJSON$purchases_customEntitlementComputationRelease(Map<String, ? extends Object> inputMap) throws JSONException {
        AbstractC16544l.m18094g(inputMap, "inputMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC17660E.m19257b(inputMap.size()));
        Iterator<T> it = inputMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                Iterable iterable = (Iterable) value;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it2 = iterable.iterator();
                    do {
                        if (!it2.hasNext()) {
                            value = new JSONObject(AbstractC17660E.m19258c(new C17309l("temp_key", new JSONArray((Collection) value)))).getJSONArray("temp_key");
                            break;
                        }
                    } while (it2.next() instanceof String);
                } else {
                    value = new JSONObject(AbstractC17660E.m19258c(new C17309l("temp_key", new JSONArray((Collection) value)))).getJSONArray("temp_key");
                    break;
                    break;
                }
            } else if (value instanceof Map) {
                value = convertToJSON$purchases_customEntitlementComputationRelease((Map) value);
            }
            linkedHashMap.put(key, value);
        }
        return createJSONObject$purchases_customEntitlementComputationRelease(linkedHashMap);
    }

    public final JSONObject createJSONObject$purchases_customEntitlementComputationRelease(Map<String, ? extends Object> inputMap) {
        AbstractC16544l.m18094g(inputMap, "inputMap");
        return new JSONObject(inputMap);
    }
}
