package com.revenuecat.purchases.utils;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import org.json.JSONArray;
import org.json.JSONObject;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001H\u0000\u001a\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0004H\u0000¨\u0006\u0005"}, m18067d2 = {"replaceJsonNullWithKotlinNull", "", TokenNames.f32019T, "toList", "Lorg/json/JSONArray;", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class JSONArrayExtensionsKt {
    public static final <T> List<T> replaceJsonNullWithKotlinNull(List<? extends T> list) {
        AbstractC16544l.m18094g(list, "<this>");
        List<? extends T> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        for (T t10 : list2) {
            if (t10 instanceof Map) {
                AbstractC16544l.m18092e(t10, "null cannot be cast to non-null type kotlin.collections.Map<T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull$lambda$0, T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull$lambda$0?>");
                t10 = (T) JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull((Map) t10);
            } else if (t10 instanceof List) {
                AbstractC16544l.m18092e(t10, "null cannot be cast to non-null type kotlin.collections.List<T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull$lambda$0?>");
                t10 = (T) replaceJsonNullWithKotlinNull((List) t10);
            } else if (AbstractC16544l.m18089b(t10, JSONObject.NULL)) {
                t10 = (T) null;
            }
            arrayList.add(t10);
        }
        return arrayList;
    }

    public static final <T> List<T> toList(JSONArray jSONArray) {
        AbstractC16544l.m18094g(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object list = jSONArray.get(i10);
            if (list instanceof JSONObject) {
                list = JSONObjectExtensionsKt.toMap((JSONObject) list, true);
            } else if (list instanceof JSONArray) {
                list = toList((JSONArray) list);
            }
            arrayList.add(list);
        }
        return arrayList;
    }
}
