package com.revenuecat.purchases.subscriberattributes.caching;

import android.content.SharedPreferences;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import org.json.JSONObject;
import p1113xn.AbstractC21322p;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17682p;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aG\u0010\r\u001a\u00020\u0003*\u00020\u00002*\u0010\f\u001a&\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n0\u0006j\u0002`\u000b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0010\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a&\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n0\u0006j\u0002`\u000b*\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m18067d2 = {"Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "Landroid/content/SharedPreferences$Editor;", "cacheEditor", "Lmm/C;", "migrateSubscriberAttributesIfNeeded", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Landroid/content/SharedPreferences$Editor;)V", "", "", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesPerAppUserIDMap;", "legacySubscriberAttributesForAppUserID", "migrateSubscriberAttributes", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Ljava/util/Map;Landroid/content/SharedPreferences$Editor;)V", "appUserID", "legacySubscriberAttributesCacheKey", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Ljava/lang/String;)Ljava/lang/String;", "getAllLegacyStoredSubscriberAttributes", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;)Ljava/util/Map;", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SubscriberAttributesMigrationExtensionsKt {
    public static final synchronized Map<String, Map<String, SubscriberAttribute>> getAllLegacyStoredSubscriberAttributes(SubscriberAttributesCache subscriberAttributesCache) {
        LinkedHashMap linkedHashMap;
        Map mapBuildLegacySubscriberAttributes;
        try {
            AbstractC16544l.m18094g(subscriberAttributesCache, "<this>");
            String strLegacySubscriberAttributesCacheKey = legacySubscriberAttributesCacheKey(subscriberAttributesCache, "");
            Set<String> setFindKeysThatStartWith = subscriberAttributesCache.getDeviceCache().findKeysThatStartWith(strLegacySubscriberAttributesCacheKey);
            int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(setFindKeysThatStartWith, 10));
            if (iM19257b < 16) {
                iM19257b = 16;
            }
            linkedHashMap = new LinkedHashMap(iM19257b);
            for (String str : setFindKeysThatStartWith) {
                String str2 = (String) AbstractC21322p.m21697e0(str, new String[]{strLegacySubscriberAttributesCacheKey}, 0, 6).get(1);
                JSONObject jSONObjectOrNull = subscriberAttributesCache.getDeviceCache().getJSONObjectOrNull(str);
                if (jSONObjectOrNull == null || (mapBuildLegacySubscriberAttributes = SubscriberAttributesFactoriesKt.buildLegacySubscriberAttributes(jSONObjectOrNull)) == null) {
                    mapBuildLegacySubscriberAttributes = C17690x.f56481Y;
                }
                linkedHashMap.put(str2, mapBuildLegacySubscriberAttributes);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return linkedHashMap;
    }

    public static final String legacySubscriberAttributesCacheKey(SubscriberAttributesCache subscriberAttributesCache, String appUserID) {
        AbstractC16544l.m18094g(subscriberAttributesCache, "<this>");
        AbstractC16544l.m18094g(appUserID, "appUserID");
        return subscriberAttributesCache.m14503x7baee9fd() + '.' + appUserID;
    }

    public static final synchronized void migrateSubscriberAttributes(SubscriberAttributesCache subscriberAttributesCache, Map<String, ? extends Map<String, SubscriberAttribute>> legacySubscriberAttributesForAppUserID, SharedPreferences.Editor cacheEditor) {
        try {
            AbstractC16544l.m18094g(subscriberAttributesCache, "<this>");
            AbstractC16544l.m18094g(legacySubscriberAttributesForAppUserID, "legacySubscriberAttributesForAppUserID");
            AbstractC16544l.m18094g(cacheEditor, "cacheEditor");
            Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = subscriberAttributesCache.getAllStoredSubscriberAttributes();
            LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(allStoredSubscriberAttributes);
            for (Map.Entry<String, ? extends Map<String, SubscriberAttribute>> entry : legacySubscriberAttributesForAppUserID.entrySet()) {
                String key = entry.getKey();
                Map<String, SubscriberAttribute> value = entry.getValue();
                Map<String, SubscriberAttribute> map = allStoredSubscriberAttributes.get(key);
                if (map == null) {
                    map = C17690x.f56481Y;
                }
                linkedHashMapM19256r.put(key, AbstractC17659D.m19248j(value, map));
                cacheEditor.remove(legacySubscriberAttributesCacheKey(subscriberAttributesCache, key));
            }
            cacheEditor.putString(subscriberAttributesCache.m14503x7baee9fd(), CachingHelpersKt.toJSONObject(linkedHashMapM19256r).toString());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static final synchronized void migrateSubscriberAttributesIfNeeded(SubscriberAttributesCache subscriberAttributesCache, SharedPreferences.Editor cacheEditor) {
        AbstractC16544l.m18094g(subscriberAttributesCache, "<this>");
        AbstractC16544l.m18094g(cacheEditor, "cacheEditor");
        Map<String, Map<String, SubscriberAttribute>> allLegacyStoredSubscriberAttributes = getAllLegacyStoredSubscriberAttributes(subscriberAttributesCache);
        if (allLegacyStoredSubscriberAttributes.isEmpty()) {
            allLegacyStoredSubscriberAttributes = null;
        }
        if (allLegacyStoredSubscriberAttributes != null) {
            migrateSubscriberAttributes(subscriberAttributesCache, allLegacyStoredSubscriberAttributes, cacheEditor);
        }
    }
}
