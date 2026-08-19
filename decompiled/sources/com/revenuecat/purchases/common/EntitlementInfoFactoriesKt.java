package com.revenuecat.purchases.common;

import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.EntitlementInfos;
import com.revenuecat.purchases.OwnershipType;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.common.responses.EntitlementsResponseJsonKeys;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.utils.DateActive;
import com.revenuecat.purchases.utils.DateHelper;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import org.json.JSONException;
import org.json.JSONObject;
import p628Zk.GwZB.tpXhEMGxfXFVSh;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\"\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002\u001a,\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u001a,\u0010\u0012\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u001a\u0014\u0010\u0016\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0018\u001a\u00020\u0019*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\nH\u0000\u001a\u0014\u0010\u001a\u001a\u00020\u001b*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\nH\u0000¨\u0006\u001c"}, m18067d2 = {"getWillRenew", "", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "expirationDate", "Ljava/util/Date;", "unsubscribeDetectedAt", "billingIssueDetectedAt", "isDateActive", "identifier", "", "requestDate", "buildEntitlementInfo", "Lcom/revenuecat/purchases/EntitlementInfo;", "Lorg/json/JSONObject;", "productData", "verificationResult", "Lcom/revenuecat/purchases/VerificationResult;", "buildEntitlementInfos", "Lcom/revenuecat/purchases/EntitlementInfos;", CustomerInfoResponseJsonKeys.SUBSCRIPTIONS, "nonSubscriptionsLatestPurchases", "getStore", DiagnosticsEntry.NAME_KEY, "optOwnershipType", "Lcom/revenuecat/purchases/OwnershipType;", "optPeriodType", "Lcom/revenuecat/purchases/PeriodType;", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class EntitlementInfoFactoriesKt {
    public static final EntitlementInfo buildEntitlementInfo(JSONObject jSONObject, String identifier, JSONObject productData, Date requestDate, VerificationResult verificationResult) throws JSONException {
        AbstractC16544l.m18094g(jSONObject, "<this>");
        AbstractC16544l.m18094g(identifier, "identifier");
        AbstractC16544l.m18094g(productData, "productData");
        AbstractC16544l.m18094g(requestDate, "requestDate");
        AbstractC16544l.m18094g(verificationResult, "verificationResult");
        Date dateOptDate = JSONObjectExtensionsKt.optDate(jSONObject, "expires_date");
        Date dateOptDate2 = JSONObjectExtensionsKt.optDate(productData, ProductResponseJsonKeys.UNSUBSCRIBE_DETECTED_AT);
        Date dateOptDate3 = JSONObjectExtensionsKt.optDate(productData, ProductResponseJsonKeys.BILLING_ISSUES_DETECTED_AT);
        Store store = getStore(productData, ProductResponseJsonKeys.STORE);
        boolean zIsDateActive = isDateActive(identifier, dateOptDate, requestDate);
        boolean willRenew = getWillRenew(store, dateOptDate, dateOptDate2, dateOptDate3);
        PeriodType periodTypeOptPeriodType = optPeriodType(productData, ProductResponseJsonKeys.PERIOD_TYPE);
        Date date = JSONObjectExtensionsKt.getDate(jSONObject, "purchase_date");
        Date date2 = JSONObjectExtensionsKt.getDate(productData, "original_purchase_date");
        String string = jSONObject.getString(EntitlementsResponseJsonKeys.PRODUCT_IDENTIFIER);
        AbstractC16544l.m18093f(string, "getString(EntitlementsRe…nKeys.PRODUCT_IDENTIFIER)");
        return new EntitlementInfo(identifier, zIsDateActive, willRenew, periodTypeOptPeriodType, date, date2, dateOptDate, store, string, JSONObjectExtensionsKt.optNullableString(jSONObject, "product_plan_identifier"), productData.getBoolean(ProductResponseJsonKeys.IS_SANDBOX), dateOptDate2, dateOptDate3, optOwnershipType(productData, ProductResponseJsonKeys.OWNERSHIP_TYPE), jSONObject, verificationResult);
    }

    public static final EntitlementInfos buildEntitlementInfos(JSONObject jSONObject, JSONObject subscriptions, JSONObject nonSubscriptionsLatestPurchases, Date requestDate, VerificationResult verificationResult) {
        AbstractC16544l.m18094g(jSONObject, "<this>");
        AbstractC16544l.m18094g(subscriptions, "subscriptions");
        AbstractC16544l.m18094g(nonSubscriptionsLatestPurchases, "nonSubscriptionsLatestPurchases");
        AbstractC16544l.m18094g(requestDate, "requestDate");
        AbstractC16544l.m18094g(verificationResult, "verificationResult");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC16544l.m18093f(itKeys, "keys()");
        while (itKeys.hasNext()) {
            String entitlementId = itKeys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(entitlementId);
            String it = jSONObject2.optString(EntitlementsResponseJsonKeys.PRODUCT_IDENTIFIER);
            AbstractC16544l.m18093f(it, "it");
            if (it.length() <= 0) {
                it = null;
            }
            if (it != null) {
                if (subscriptions.has(it)) {
                    AbstractC16544l.m18093f(entitlementId, "entitlementId");
                    JSONObject jSONObject3 = subscriptions.getJSONObject(it);
                    AbstractC16544l.m18093f(jSONObject3, "subscriptions.getJSONObject(productIdentifier)");
                    linkedHashMap.put(entitlementId, buildEntitlementInfo(jSONObject2, entitlementId, jSONObject3, requestDate, verificationResult));
                } else if (nonSubscriptionsLatestPurchases.has(it)) {
                    AbstractC16544l.m18093f(entitlementId, "entitlementId");
                    JSONObject jSONObject4 = nonSubscriptionsLatestPurchases.getJSONObject(it);
                    AbstractC16544l.m18093f(jSONObject4, "nonSubscriptionsLatestPu…Object(productIdentifier)");
                    linkedHashMap.put(entitlementId, buildEntitlementInfo(jSONObject2, entitlementId, jSONObject4, requestDate, verificationResult));
                }
            }
        }
        return new EntitlementInfos(linkedHashMap, verificationResult);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Store getStore(JSONObject jSONObject, String name) throws JSONException {
        AbstractC16544l.m18094g(jSONObject, "<this>");
        AbstractC16544l.m18094g(name, "name");
        String string = jSONObject.getString(name);
        if (string != null) {
            switch (string.hashCode()) {
                case -1820761141:
                    if (string.equals("external")) {
                        return Store.EXTERNAL;
                    }
                    break;
                case -1523640723:
                    if (string.equals("rc_billing")) {
                        return Store.RC_BILLING;
                    }
                    break;
                case -1414265340:
                    if (string.equals("amazon")) {
                        return Store.AMAZON;
                    }
                    break;
                case -891985843:
                    if (string.equals("stripe")) {
                        return Store.STRIPE;
                    }
                    break;
                case 564036179:
                    if (string.equals("mac_app_store")) {
                        return Store.MAC_APP_STORE;
                    }
                    break;
                case 756050958:
                    if (string.equals("promotional")) {
                        return Store.PROMOTIONAL;
                    }
                    break;
                case 1842542915:
                    if (string.equals("app_store")) {
                        return Store.APP_STORE;
                    }
                    break;
                case 1925951510:
                    if (string.equals("play_store")) {
                        return Store.PLAY_STORE;
                    }
                    break;
            }
        }
        return Store.UNKNOWN_STORE;
    }

    private static final boolean getWillRenew(Store store, Date date, Date date2, Date date3) {
        return ((store == Store.PROMOTIONAL) || (date == null) || (date2 != null) || (date3 != null)) ? false : true;
    }

    private static final boolean isDateActive(String str, Date date, Date date2) {
        DateActive dateActiveM22528isDateActiveSxA4cEA$default = DateHelper.Companion.m22528isDateActiveSxA4cEA$default(DateHelper.INSTANCE, date, date2, 0L, 4, null);
        if (!dateActiveM22528isDateActiveSxA4cEA$default.isActive() && !dateActiveM22528isDateActiveSxA4cEA$default.getInGracePeriod()) {
            LogUtilsKt.warnLog(String.format(PurchaseStrings.ENTITLEMENT_EXPIRED_OUTSIDE_GRACE_PERIOD, Arrays.copyOf(new Object[]{str, date, date2}, 3)));
        }
        return dateActiveM22528isDateActiveSxA4cEA$default.isActive();
    }

    public static final OwnershipType optOwnershipType(JSONObject jSONObject, String name) {
        AbstractC16544l.m18094g(jSONObject, "<this>");
        AbstractC16544l.m18094g(name, "name");
        String strOptString = jSONObject.optString(name);
        if (AbstractC16544l.m18089b(strOptString, "PURCHASED")) {
            return OwnershipType.PURCHASED;
        }
        return AbstractC16544l.m18089b(strOptString, "FAMILY_SHARED") ? OwnershipType.FAMILY_SHARED : OwnershipType.UNKNOWN;
    }

    public static final PeriodType optPeriodType(JSONObject jSONObject, String name) {
        AbstractC16544l.m18094g(jSONObject, "<this>");
        AbstractC16544l.m18094g(name, "name");
        String strOptString = jSONObject.optString(name);
        if (strOptString != null) {
            int iHashCode = strOptString.hashCode();
            if (iHashCode != -1039745817) {
                if (iHashCode != 100361836) {
                    if (iHashCode == 110628630 && strOptString.equals("trial")) {
                        return PeriodType.TRIAL;
                    }
                } else if (strOptString.equals("intro")) {
                    return PeriodType.INTRO;
                }
            } else if (strOptString.equals(tpXhEMGxfXFVSh.jCUd)) {
                return PeriodType.NORMAL;
            }
        }
        return PeriodType.NORMAL;
    }
}
