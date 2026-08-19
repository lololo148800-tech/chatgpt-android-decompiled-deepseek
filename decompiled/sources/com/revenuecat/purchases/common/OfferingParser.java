package com.revenuecat.purchases.common;

import bo.AbstractC11516d;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.OfferingsKt;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.ArrayList;
import java.util.Arrays;
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
import p523V9.AbstractC8024X3;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0007J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bJ4\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J,\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0011\u001a\u00020\u0006H$¨\u0006\u0016"}, m18067d2 = {"Lcom/revenuecat/purchases/common/OfferingParser;", "", "()V", "createOffering", "Lcom/revenuecat/purchases/Offering;", "offeringJson", "Lorg/json/JSONObject;", "productsById", "", "", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "createOfferings", "Lcom/revenuecat/purchases/Offerings;", "offeringsJson", "createPackage", "Lcom/revenuecat/purchases/Package;", "packageJson", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "findMatchingProduct", "Companion", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class OfferingParser {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AbstractC11516d json = AbstractC8024X3.m8363a(AbstractC11516d.f34842d, OfferingParser$Companion$json$1.INSTANCE);

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m18067d2 = {"Lcom/revenuecat/purchases/common/OfferingParser$Companion;", "", "<init>", "()V", "Lbo/d;", "json", "Lbo/d;", "getJson$purchases_customEntitlementComputationRelease", "()Lbo/d;", "getJson$purchases_customEntitlementComputationRelease$annotations", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getJson$purchases_customEntitlementComputationRelease$annotations */
        public static /* synthetic */ void m14455x9655ae69() {
        }

        public final AbstractC11516d getJson$purchases_customEntitlementComputationRelease() {
            return OfferingParser.json;
        }

        private Companion() {
        }
    }

    public final Offering createOffering(JSONObject offeringJson, Map<String, ? extends List<? extends StoreProduct>> productsById) throws JSONException {
        Map map;
        PaywallData paywallData;
        PaywallData paywallData2;
        AbstractC16544l.m18094g(offeringJson, "offeringJson");
        AbstractC16544l.m18094g(productsById, "productsById");
        String offeringIdentifier = offeringJson.getString("identifier");
        JSONObject jSONObjectOptJSONObject = offeringJson.optJSONObject("metadata");
        if (jSONObjectOptJSONObject == null || (map = JSONObjectExtensionsKt.toMap(jSONObjectOptJSONObject, true)) == null) {
            map = C17690x.f56481Y;
        }
        Map map2 = map;
        JSONArray jSONArray = offeringJson.getJSONArray("packages");
        AbstractC16544l.m18093f(offeringIdentifier, "offeringIdentifier");
        PresentedOfferingContext presentedOfferingContext = new PresentedOfferingContext(offeringIdentifier);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject packageJson = jSONArray.getJSONObject(i10);
            AbstractC16544l.m18093f(packageJson, "packageJson");
            Package packageCreatePackage = createPackage(packageJson, productsById, presentedOfferingContext);
            if (packageCreatePackage != null) {
                arrayList.add(packageCreatePackage);
            }
        }
        JSONObject jSONObjectOptJSONObject2 = offeringJson.optJSONObject("paywall");
        if (jSONObjectOptJSONObject2 != null) {
            try {
                AbstractC11516d abstractC11516d = json;
                String string = jSONObjectOptJSONObject2.toString();
                AbstractC16544l.m18093f(string, "it.toString()");
                abstractC11516d.getClass();
                paywallData = (PaywallData) abstractC11516d.m12903b(string, PaywallData.INSTANCE.serializer());
            } catch (Exception e10) {
                LogUtilsKt.errorLog("Error deserializing paywall data", e10);
                paywallData = null;
            }
            paywallData2 = paywallData;
        } else {
            paywallData2 = null;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String string2 = offeringJson.getString("description");
        AbstractC16544l.m18093f(string2, "offeringJson.getString(\"description\")");
        return new Offering(offeringIdentifier, string2, map2, arrayList, paywallData2);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c1  */
    public final Offerings createOfferings(JSONObject offeringsJson, Map<String, ? extends List<? extends StoreProduct>> productsById) throws JSONException {
        Offerings.Targeting targeting;
        Offerings.Placements placements;
        Map map$default;
        AbstractC16544l.m18094g(offeringsJson, "offeringsJson");
        AbstractC16544l.m18094g(productsById, "productsById");
        AbstractC12107L1.m13831v(new Object[]{Integer.valueOf(productsById.size())}, 1, OfferingStrings.BUILDING_OFFERINGS, LogIntent.DEBUG);
        JSONArray jSONArray = offeringsJson.getJSONArray("offerings");
        String string = offeringsJson.getString("current_offering_id");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject offeringJson = jSONArray.getJSONObject(i10);
            AbstractC16544l.m18093f(offeringJson, "offeringJson");
            Offering offeringCreateOffering = createOffering(offeringJson, productsById);
            if (offeringCreateOffering != null) {
                linkedHashMap.put(offeringCreateOffering.getIdentifier(), offeringCreateOffering);
                if (offeringCreateOffering.getAvailablePackages().isEmpty()) {
                    LogUtilsKt.warnLog(String.format(OfferingStrings.OFFERING_EMPTY, Arrays.copyOf(new Object[]{offeringCreateOffering.getIdentifier()}, 1)));
                }
            }
        }
        JSONObject jSONObjectOptJSONObject = offeringsJson.optJSONObject("targeting");
        if (jSONObjectOptJSONObject != null) {
            Integer numOptNullableInt = JSONObjectExtensionsKt.optNullableInt(jSONObjectOptJSONObject, "revision");
            String strOptNullableString = JSONObjectExtensionsKt.optNullableString(jSONObjectOptJSONObject, "rule_id");
            if (numOptNullableInt == null || strOptNullableString == null) {
                LogUtilsKt.warnLog(OfferingStrings.TARGETING_ERROR);
                targeting = null;
            } else {
                targeting = new Offerings.Targeting(numOptNullableInt.intValue(), strOptNullableString);
            }
        } else {
            targeting = null;
        }
        JSONObject jSONObjectOptJSONObject2 = offeringsJson.optJSONObject("placements");
        if (jSONObjectOptJSONObject2 != null) {
            String nullableString = JSONObjectExtensionsKt.getNullableString(jSONObjectOptJSONObject2, "fallback_offering_id");
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("offering_ids_by_placement");
            Map mapReplaceJsonNullWithKotlinNull = (jSONObjectOptJSONObject3 == null || (map$default = JSONObjectExtensionsKt.toMap$default(jSONObjectOptJSONObject3, false, 1, null)) == null) ? null : JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull(map$default);
            if (mapReplaceJsonNullWithKotlinNull != null) {
                placements = new Offerings.Placements(nullableString, mapReplaceJsonNullWithKotlinNull);
            } else {
                placements = null;
            }
        } else {
            placements = null;
        }
        Offering offering = (Offering) linkedHashMap.get(string);
        return new Offerings(offering != null ? OfferingsKt.withPresentedContext(offering, null, targeting) : null, linkedHashMap, placements, targeting);
    }

    public final Package createPackage(JSONObject packageJson, Map<String, ? extends List<? extends StoreProduct>> productsById, PresentedOfferingContext presentedOfferingContext) throws JSONException {
        AbstractC16544l.m18094g(packageJson, "packageJson");
        AbstractC16544l.m18094g(productsById, "productsById");
        AbstractC16544l.m18094g(presentedOfferingContext, "presentedOfferingContext");
        String packageIdentifier = packageJson.getString("identifier");
        StoreProduct storeProductFindMatchingProduct = findMatchingProduct(productsById, packageJson);
        AbstractC16544l.m18093f(packageIdentifier, "packageIdentifier");
        PackageType packageType = OfferingParserKt.toPackageType(packageIdentifier);
        if (storeProductFindMatchingProduct != null) {
            return new Package(packageIdentifier, packageType, storeProductFindMatchingProduct.copyWithPresentedOfferingContext(presentedOfferingContext), presentedOfferingContext);
        }
        return null;
    }

    public abstract StoreProduct findMatchingProduct(Map<String, ? extends List<? extends StoreProduct>> productsById, JSONObject packageJson);
}
