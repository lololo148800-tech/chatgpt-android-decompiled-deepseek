package com.revenuecat.purchases.common.offlineentitlements;

import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p909nm.AbstractC17660E;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, m18067d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "", "mappings", "", "", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping$Mapping;", "(Ljava/util/Map;)V", "getMappings", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "Mapping", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class ProductEntitlementMapping {
    private static final String BASE_PLAN_ID_KEY = "base_plan_id";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String ENTITLEMENTS_KEY = "entitlements";
    private static final String PRODUCT_ENTITLEMENT_MAPPING_KEY = "product_entitlement_mapping";
    private static final String PRODUCT_ID_KEY = "product_identifier";
    private final Map<String, Mapping> mappings;

    @Metadata(m18066d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m18067d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping$Companion;", "", "()V", "BASE_PLAN_ID_KEY", "", "ENTITLEMENTS_KEY", "PRODUCT_ENTITLEMENT_MAPPING_KEY", "PRODUCT_ID_KEY", "fromJson", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "json", "Lorg/json/JSONObject;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ProductEntitlementMapping fromJson(JSONObject json) throws JSONException {
            AbstractC16544l.m18094g(json, "json");
            JSONObject jSONObject = json.getJSONObject(ProductEntitlementMapping.PRODUCT_ENTITLEMENT_MAPPING_KEY);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            AbstractC16544l.m18093f(itKeys, "productsObject.keys()");
            while (itKeys.hasNext()) {
                String mappingIdentifier = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(mappingIdentifier);
                String productIdentifier = jSONObject2.getString("product_identifier");
                String strOptNullableString = JSONObjectExtensionsKt.optNullableString(jSONObject2, ProductEntitlementMapping.BASE_PLAN_ID_KEY);
                JSONArray jSONArray = jSONObject2.getJSONArray("entitlements");
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String string = jSONArray.getString(i10);
                    AbstractC16544l.m18093f(string, "entitlementsArray.getString(entitlementIndex)");
                    arrayList.add(string);
                }
                AbstractC16544l.m18093f(mappingIdentifier, "mappingIdentifier");
                AbstractC16544l.m18093f(productIdentifier, "productIdentifier");
                linkedHashMap.put(mappingIdentifier, new Mapping(productIdentifier, strOptNullableString, arrayList));
            }
            return new ProductEntitlementMapping(linkedHashMap);
        }

        private Companion() {
        }
    }

    @Metadata(m18066d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J/\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, m18067d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping$Mapping;", "", "productIdentifier", "", "basePlanId", "entitlements", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getBasePlanId", "()Ljava/lang/String;", "getEntitlements", "()Ljava/util/List;", "getProductIdentifier", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class Mapping {
        private final String basePlanId;
        private final List<String> entitlements;
        private final String productIdentifier;

        public Mapping(String productIdentifier, String str, List<String> entitlements) {
            AbstractC16544l.m18094g(productIdentifier, "productIdentifier");
            AbstractC16544l.m18094g(entitlements, "entitlements");
            this.productIdentifier = productIdentifier;
            this.basePlanId = str;
            this.entitlements = entitlements;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Mapping copy$default(Mapping mapping, String str, String str2, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = mapping.productIdentifier;
            }
            if ((i10 & 2) != 0) {
                str2 = mapping.basePlanId;
            }
            if ((i10 & 4) != 0) {
                list = mapping.entitlements;
            }
            return mapping.copy(str, str2, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getProductIdentifier() {
            return this.productIdentifier;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBasePlanId() {
            return this.basePlanId;
        }

        public final List<String> component3() {
            return this.entitlements;
        }

        public final Mapping copy(String productIdentifier, String basePlanId, List<String> entitlements) {
            AbstractC16544l.m18094g(productIdentifier, "productIdentifier");
            AbstractC16544l.m18094g(entitlements, "entitlements");
            return new Mapping(productIdentifier, basePlanId, entitlements);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Mapping)) {
                return false;
            }
            Mapping mapping = (Mapping) other;
            return AbstractC16544l.m18089b(this.productIdentifier, mapping.productIdentifier) && AbstractC16544l.m18089b(this.basePlanId, mapping.basePlanId) && AbstractC16544l.m18089b(this.entitlements, mapping.entitlements);
        }

        public final String getBasePlanId() {
            return this.basePlanId;
        }

        public final List<String> getEntitlements() {
            return this.entitlements;
        }

        public final String getProductIdentifier() {
            return this.productIdentifier;
        }

        public int hashCode() {
            int iHashCode = this.productIdentifier.hashCode() * 31;
            String str = this.basePlanId;
            return this.entitlements.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            return "Mapping(productIdentifier=" + this.productIdentifier + ", basePlanId=" + this.basePlanId + ", entitlements=" + this.entitlements + ')';
        }
    }

    public ProductEntitlementMapping(Map<String, Mapping> mappings) {
        AbstractC16544l.m18094g(mappings, "mappings");
        this.mappings = mappings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductEntitlementMapping copy$default(ProductEntitlementMapping productEntitlementMapping, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = productEntitlementMapping.mappings;
        }
        return productEntitlementMapping.copy(map);
    }

    public final Map<String, Mapping> component1() {
        return this.mappings;
    }

    public final ProductEntitlementMapping copy(Map<String, Mapping> mappings) {
        AbstractC16544l.m18094g(mappings, "mappings");
        return new ProductEntitlementMapping(mappings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProductEntitlementMapping) && AbstractC16544l.m18089b(this.mappings, ((ProductEntitlementMapping) other).mappings);
    }

    public final Map<String, Mapping> getMappings() {
        return this.mappings;
    }

    public int hashCode() {
        return this.mappings.hashCode();
    }

    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, Mapping> map = this.mappings;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC17660E.m19257b(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Mapping mapping = (Mapping) entry.getValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("product_identifier", mapping.getProductIdentifier());
            String basePlanId = mapping.getBasePlanId();
            if (basePlanId != null) {
                jSONObject2.put(BASE_PLAN_ID_KEY, basePlanId);
            }
            jSONObject2.put("entitlements", new JSONArray((Collection) mapping.getEntitlements()));
            linkedHashMap.put(key, jSONObject2);
        }
        jSONObject.put(PRODUCT_ENTITLEMENT_MAPPING_KEY, new JSONObject(linkedHashMap));
        return jSONObject;
    }

    public String toString() {
        return AbstractC12107L1.m13827r(new StringBuilder("ProductEntitlementMapping(mappings="), this.mappings, ')');
    }
}
