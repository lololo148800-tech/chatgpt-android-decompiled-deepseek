package com.revenuecat.purchases.utils;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p049Bm.InterfaceC1436k;
import p1091wn.AbstractC21031l;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\b\u001a\u0016\u0010\t\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\b\u001a\u0016\u0010\f\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u001a4\u0010\r\u001a\u0010\u0012\u0004\u0012\u0002H\u000f\u0012\u0006\u0012\u0004\u0018\u0001H\u00100\u000e\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0010*\u0010\u0012\u0004\u0012\u0002H\u000f\u0012\u0006\u0012\u0004\u0018\u0001H\u00100\u000eH\u0000\u001a(\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00120\u000e\"\u0004\b\u0000\u0010\u0012*\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0000¨\u0006\u0015"}, m18067d2 = {"getDate", "Ljava/util/Date;", "Lorg/json/JSONObject;", "jsonKey", "", "getNullableInt", "", DiagnosticsEntry.NAME_KEY, "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "getNullableString", "optDate", "optNullableInt", "optNullableString", "replaceJsonNullWithKotlinNull", "", TokenNames.f32013K, TokenNames.f32021V, "toMap", TokenNames.f32019T, "deep", "", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class JSONObjectExtensionsKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.JSONObjectExtensionsKt$toMap$1 */
    @Metadata(m18066d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {TokenNames.f32019T, "", "kotlin.jvm.PlatformType", "jsonKey", "Lmm/l;", "invoke", "(Ljava/lang/String;)Lmm/l;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127721 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ boolean $deep;
        final /* synthetic */ JSONObject $this_toMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127721(boolean z6, JSONObject jSONObject) {
            super(1);
            this.$deep = z6;
            this.$this_toMap = jSONObject;
        }

        @Override // p049Bm.InterfaceC1436k
        public final C17309l invoke(String str) throws JSONException {
            if (!this.$deep) {
                return new C17309l(str, this.$this_toMap.get(str));
            }
            Object list = this.$this_toMap.get(str);
            if (list instanceof JSONObject) {
                list = JSONObjectExtensionsKt.toMap((JSONObject) list, true);
            } else if (list instanceof JSONArray) {
                list = JSONArrayExtensionsKt.toList((JSONArray) list);
            }
            return new C17309l(str, list);
        }
    }

    public static final Date getDate(JSONObject jSONObject, String jsonKey) {
        AbstractC16544l.m18094g(jSONObject, "<this>");
        AbstractC16544l.m18094g(jsonKey, "jsonKey");
        Date date = Iso8601Utils.parse(jSONObject.getString(jsonKey));
        AbstractC16544l.m18093f(date, "parse(getString(jsonKey))");
        return date;
    }

    public static final Integer getNullableInt(JSONObject jSONObject, String name) {
        AbstractC16544l.m18094g(jSONObject, "<this>");
        AbstractC16544l.m18094g(name, "name");
        if (jSONObject.isNull(name)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return Integer.valueOf(jSONObject.getInt(name));
        }
        return null;
    }

    public static final String getNullableString(JSONObject jSONObject, String name) {
        AbstractC16544l.m18094g(jSONObject, "<this>");
        AbstractC16544l.m18094g(name, "name");
        if (jSONObject.isNull(name)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject.getString(name);
        }
        return null;
    }

    public static final Date optDate(JSONObject jSONObject, String jsonKey) {
        AbstractC16544l.m18094g(jSONObject, "<this>");
        AbstractC16544l.m18094g(jsonKey, "jsonKey");
        if (jSONObject.isNull(jsonKey)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getDate(jSONObject, jsonKey);
        }
        return null;
    }

    public static final Integer optNullableInt(JSONObject jSONObject, String name) {
        AbstractC16544l.m18094g(jSONObject, "<this>");
        AbstractC16544l.m18094g(name, "name");
        if (!jSONObject.has(name)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getNullableInt(jSONObject, name);
        }
        return null;
    }

    public static final String optNullableString(JSONObject jSONObject, String name) {
        AbstractC16544l.m18094g(jSONObject, "<this>");
        AbstractC16544l.m18094g(name, "name");
        if (!jSONObject.has(name)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getNullableString(jSONObject, name);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> replaceJsonNullWithKotlinNull(Map<K, ? extends V> map) {
        AbstractC16544l.m18094g(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC17660E.m19257b(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                AbstractC16544l.m18092e(value, "null cannot be cast to non-null type kotlin.collections.Map<K of com.revenuecat.purchases.utils.JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull$lambda$5, V of com.revenuecat.purchases.utils.JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull$lambda$5?>");
                value = replaceJsonNullWithKotlinNull((Map) value);
            } else if (value instanceof List) {
                AbstractC16544l.m18092e(value, "null cannot be cast to non-null type kotlin.collections.List<V of com.revenuecat.purchases.utils.JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull$lambda$5?>");
                value = JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull((List) value);
            } else if (AbstractC16544l.m18089b(value, JSONObject.NULL)) {
                value = null;
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    public static final <T> Map<String, T> toMap(JSONObject jSONObject, boolean z6) {
        AbstractC16544l.m18094g(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC16544l.m18093f(itKeys, "this.keys()");
        return AbstractC17659D.m19255q(AbstractC21031l.m21495s(AbstractC21031l.m21483g(itKeys), new C127721(z6, jSONObject)));
    }

    public static /* synthetic */ Map toMap$default(JSONObject jSONObject, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = false;
        }
        return toMap(jSONObject, z6);
    }
}
