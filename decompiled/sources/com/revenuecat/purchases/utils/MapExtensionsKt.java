package com.revenuecat.purchases.utils;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\n\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\u001a2\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001H\u0000¨\u0006\u0004"}, m18067d2 = {"filterNotNullValues", "", TokenNames.f32013K, TokenNames.f32021V, "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class MapExtensionsKt {
    public static final <K, V> Map<K, V> filterNotNullValues(Map<K, ? extends V> map) {
        AbstractC16544l.m18094g(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
