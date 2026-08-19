package com.revenuecat.purchases.subscriberattributes.caching;

import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import mm.InterfaceC17306i;
import org.json.JSONObject;
import p571X9.AbstractC9227W;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u000e\u001a\u00020\r*\u00020\u00022*\u0010\f\u001a&\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n0\u0006j\u0002`\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n*\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n2\n\u0010\u0015\u001a\u00060\u0007j\u0002`\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0019\u001a\u00020\r2\n\u0010\u0015\u001a\u00060\u0007j\u0002`\b2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001b\u001a&\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n0\u0006j\u0002`\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n2\n\u0010\u0015\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u001b\u0010\u001dJ1\u0010\u001e\u001a&\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n0\u0006j\u0002`\u000b¢\u0006\u0004\b\u001e\u0010\u001cJ%\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n2\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\r2\n\u0010\u0015\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\r2\n\u0010\u0015\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b!\u0010 J\u001d\u0010\"\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010*\u001a\u00020\u00078@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, m18067d2 = {"Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;)V", "", "", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesPerAppUserIDMap;", "updatedSubscriberAttributesForAll", "Lmm/C;", "putAttributes", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Ljava/util/Map;)V", "currentAppUserID", "Landroid/content/SharedPreferences$Editor;", "cacheEditor", "deleteSyncedSubscriberAttributesForOtherUsers", "(Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)V", "appUserID", "filterUnsynced", "(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;", "attributesToBeSet", "setAttributes", "(Ljava/lang/String;Ljava/util/Map;)V", "getAllStoredSubscriberAttributes", "()Ljava/util/Map;", "(Ljava/lang/String;)Ljava/util/Map;", "getUnsyncedSubscriberAttributes", "clearAllSubscriberAttributesFromUser", "(Ljava/lang/String;)V", "clearSubscriberAttributesIfSyncedForSubscriber", "cleanUpSubscriberAttributeCache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "getDeviceCache$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/common/caching/DeviceCache;", "subscriberAttributesCacheKey$delegate", "Lmm/i;", "getSubscriberAttributesCacheKey$purchases_customEntitlementComputationRelease", "()Ljava/lang/String;", "subscriberAttributesCacheKey", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SubscriberAttributesCache {
    private final DeviceCache deviceCache;

    /* JADX INFO: renamed from: subscriberAttributesCacheKey$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i subscriberAttributesCacheKey;

    public SubscriberAttributesCache(DeviceCache deviceCache) {
        AbstractC16544l.m18094g(deviceCache, "deviceCache");
        this.deviceCache = deviceCache;
        this.subscriberAttributesCacheKey = AbstractC9227W.m9800c(new SubscriberAttributesCache$subscriberAttributesCacheKey$2(this));
    }

    private final synchronized void deleteSyncedSubscriberAttributesForOtherUsers(String currentAppUserID, SharedPreferences.Editor cacheEditor) {
        C17309l c17309l;
        try {
            LogWrapperKt.log(LogIntent.DEBUG, String.format(AttributionStrings.DELETING_ATTRIBUTES_OTHER_USERS, Arrays.copyOf(new Object[]{currentAppUserID}, 1)));
            Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
            ArrayList arrayList = new ArrayList(allStoredSubscriberAttributes.size());
            for (Map.Entry<String, Map<String, SubscriberAttribute>> entry : allStoredSubscriberAttributes.entrySet()) {
                String key = entry.getKey();
                Map<String, SubscriberAttribute> value = entry.getValue();
                if (AbstractC16544l.m18089b(currentAppUserID, key)) {
                    c17309l = new C17309l(key, value);
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, SubscriberAttribute> entry2 : value.entrySet()) {
                        if (!entry2.getValue().isSynced()) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    c17309l = new C17309l(key, linkedHashMap);
                }
                arrayList.add(c17309l);
            }
            Map mapM19253o = AbstractC17659D.m19253o(arrayList);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry3 : mapM19253o.entrySet()) {
                if (!((Map) entry3.getValue()).isEmpty()) {
                    linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                }
            }
            cacheEditor.putString(m14503x7baee9fd(), CachingHelpersKt.toJSONObject(linkedHashMap2).toString());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final Map<String, SubscriberAttribute> filterUnsynced(Map<String, SubscriberAttribute> map, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, SubscriberAttribute> entry : map.entrySet()) {
            if (!entry.getValue().isSynced()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LogIntent logIntent = LogIntent.DEBUG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AttributionStrings.UNSYNCED_ATTRIBUTES_COUNT, Arrays.copyOf(new Object[]{Integer.valueOf(linkedHashMap.size()), str}, 2)));
        sb2.append(!linkedHashMap.isEmpty() ? AbstractC17680n.m19349Y(linkedHashMap.values(), Separators.RETURN, null, null, 0, null, null, 62) : "");
        LogWrapperKt.log(logIntent, sb2.toString());
        return linkedHashMap;
    }

    private final void putAttributes(DeviceCache deviceCache, Map<String, ? extends Map<String, SubscriberAttribute>> map) {
        DeviceCache deviceCache2 = this.deviceCache;
        String strM14503x7baee9fd = m14503x7baee9fd();
        String string = CachingHelpersKt.toJSONObject(map).toString();
        AbstractC16544l.m18093f(string, "updatedSubscriberAttribu…toJSONObject().toString()");
        deviceCache2.putString(strM14503x7baee9fd, string);
    }

    public final synchronized void cleanUpSubscriberAttributeCache(String currentAppUserID, SharedPreferences.Editor cacheEditor) {
        AbstractC16544l.m18094g(currentAppUserID, "currentAppUserID");
        AbstractC16544l.m18094g(cacheEditor, "cacheEditor");
        SubscriberAttributesMigrationExtensionsKt.migrateSubscriberAttributesIfNeeded(this, cacheEditor);
        deleteSyncedSubscriberAttributesForOtherUsers(currentAppUserID, cacheEditor);
    }

    public final synchronized void clearAllSubscriberAttributesFromUser(String appUserID) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        LogWrapperKt.log(LogIntent.DEBUG, String.format(AttributionStrings.DELETING_ATTRIBUTES, Arrays.copyOf(new Object[]{appUserID}, 1)));
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(getAllStoredSubscriberAttributes());
        linkedHashMapM19256r.remove(appUserID);
        putAttributes(this.deviceCache, AbstractC17659D.m19254p(linkedHashMapM19256r));
    }

    public final synchronized void clearSubscriberAttributesIfSyncedForSubscriber(String appUserID) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        if (getUnsyncedSubscriberAttributes(appUserID).isEmpty()) {
            clearAllSubscriberAttributesFromUser(appUserID);
        }
    }

    public final synchronized Map<String, Map<String, SubscriberAttribute>> getAllStoredSubscriberAttributes() {
        Map<String, Map<String, SubscriberAttribute>> mapBuildSubscriberAttributesMapPerUser;
        try {
            JSONObject jSONObjectOrNull = this.deviceCache.getJSONObjectOrNull(m14503x7baee9fd());
            if (jSONObjectOrNull == null || (mapBuildSubscriberAttributesMapPerUser = SubscriberAttributesFactoriesKt.buildSubscriberAttributesMapPerUser(jSONObjectOrNull)) == null) {
                mapBuildSubscriberAttributesMapPerUser = C17690x.f56481Y;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return mapBuildSubscriberAttributesMapPerUser;
    }

    /* JADX INFO: renamed from: getDeviceCache$purchases_customEntitlementComputationRelease, reason: from getter */
    public final DeviceCache getDeviceCache() {
        return this.deviceCache;
    }

    /* JADX INFO: renamed from: getSubscriberAttributesCacheKey$purchases_customEntitlementComputationRelease */
    public final String m14503x7baee9fd() {
        return (String) this.subscriberAttributesCacheKey.getValue();
    }

    public final synchronized Map<String, Map<String, SubscriberAttribute>> getUnsyncedSubscriberAttributes() {
        LinkedHashMap linkedHashMap;
        try {
            Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC17660E.m19257b(allStoredSubscriberAttributes.size()));
            for (Object obj : allStoredSubscriberAttributes.entrySet()) {
                Object key = ((Map.Entry) obj).getKey();
                Map.Entry entry = (Map.Entry) obj;
                linkedHashMap2.put(key, filterUnsynced((Map) entry.getValue(), (String) entry.getKey()));
            }
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                if (!((Map) entry2.getValue()).isEmpty()) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return linkedHashMap;
    }

    public final synchronized void setAttributes(String appUserID, Map<String, SubscriberAttribute> attributesToBeSet) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(attributesToBeSet, "attributesToBeSet");
        Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
        Map<String, SubscriberAttribute> map = allStoredSubscriberAttributes.get(appUserID);
        if (map == null) {
            map = C17690x.f56481Y;
        }
        putAttributes(this.deviceCache, AbstractC17659D.m19248j(allStoredSubscriberAttributes, AbstractC17660E.m19258c(new C17309l(appUserID, AbstractC17659D.m19248j(map, attributesToBeSet)))));
    }

    public final synchronized Map<String, SubscriberAttribute> getAllStoredSubscriberAttributes(String appUserID) {
        Map<String, SubscriberAttribute> map;
        AbstractC16544l.m18094g(appUserID, "appUserID");
        map = getAllStoredSubscriberAttributes().get(appUserID);
        if (map == null) {
            map = C17690x.f56481Y;
        }
        return map;
    }

    public final synchronized Map<String, SubscriberAttribute> getUnsyncedSubscriberAttributes(String appUserID) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        return filterUnsynced(getAllStoredSubscriberAttributes(appUserID), appUserID);
    }
}
