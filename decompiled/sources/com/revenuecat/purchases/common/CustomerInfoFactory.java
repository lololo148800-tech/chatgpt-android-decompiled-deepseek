package com.revenuecat.purchases.common;

import android.net.Uri;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.EntitlementInfos;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.utils.Iso8601Utils;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p861l1.xapn.suYVq;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ4\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000ej\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\n`\u0010*\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\u001a\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0013*\u00020\bH\u0002J\u001a\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0013*\u00020\bH\u0002¨\u0006\u0015"}, m18067d2 = {"Lcom/revenuecat/purchases/common/CustomerInfoFactory;", "", "()V", "buildCustomerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "httpResult", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "body", "Lorg/json/JSONObject;", "overrideRequestDate", "Ljava/util/Date;", "verificationResult", "Lcom/revenuecat/purchases/VerificationResult;", "parseDates", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "jsonKey", "parseExpirations", "", "parsePurchaseDates", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CustomerInfoFactory {
    public static final CustomerInfoFactory INSTANCE = new CustomerInfoFactory();

    private CustomerInfoFactory() {
    }

    private final HashMap<String, Date> parseDates(JSONObject jSONObject, String str) throws JSONException {
        HashMap<String, Date> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            String it = jSONObject.getJSONObject(key).optString("product_plan_identifier");
            AbstractC16544l.m18093f(it, "it");
            if (it.length() <= 0) {
                it = null;
            }
            JSONObject expirationObject = jSONObject.getJSONObject(key);
            if (it != null) {
                String str2 = key + ':' + it;
                if (str2 != null) {
                    key = str2;
                }
            }
            AbstractC16544l.m18093f(key, "key");
            AbstractC16544l.m18093f(expirationObject, "expirationObject");
            map.put(key, JSONObjectExtensionsKt.optDate(expirationObject, str));
        }
        return map;
    }

    private final Map<String, Date> parseExpirations(JSONObject jSONObject) {
        return parseDates(jSONObject, "expires_date");
    }

    private final Map<String, Date> parsePurchaseDates(JSONObject jSONObject) {
        return parseDates(jSONObject, "purchase_date");
    }

    public final CustomerInfo buildCustomerInfo(HTTPResult httpResult) {
        AbstractC16544l.m18094g(httpResult, "httpResult");
        return buildCustomerInfo(httpResult.getBody(), httpResult.getRequestDate(), httpResult.getVerificationResult());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x008f  */
    public final CustomerInfo buildCustomerInfo(JSONObject body, Date overrideRequestDate, VerificationResult verificationResult) throws JSONException {
        EntitlementInfos entitlementInfos;
        Date date;
        AbstractC16544l.m18094g(body, "body");
        AbstractC16544l.m18094g(verificationResult, "verificationResult");
        JSONObject jSONObject = body.getJSONObject(CustomerInfoResponseJsonKeys.SUBSCRIBER);
        JSONObject jSONObject2 = jSONObject.getJSONObject(CustomerInfoResponseJsonKeys.NON_SUBSCRIPTIONS);
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> itKeys = jSONObject2.keys();
        AbstractC16544l.m18093f(itKeys, "nonSubscriptions.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONArray jSONArray = jSONObject2.getJSONArray(next);
            int length = jSONArray.length();
            if (length > 0) {
                jSONObject3.put(next, jSONArray.getJSONObject(length - 1));
            }
        }
        JSONObject subscriptions = jSONObject.getJSONObject(CustomerInfoResponseJsonKeys.SUBSCRIPTIONS);
        AbstractC16544l.m18093f(subscriptions, "subscriptions");
        Map<String, Date> expirations = parseExpirations(subscriptions);
        LinkedHashMap linkedHashMapM19248j = AbstractC17659D.m19248j(parsePurchaseDates(subscriptions), parsePurchaseDates(jSONObject3));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(CustomerInfoResponseJsonKeys.ENTITLEMENTS);
        Date requestDate = overrideRequestDate == null ? Iso8601Utils.parse(body.getString(CustomerInfoResponseJsonKeys.REQUEST_DATE)) : overrideRequestDate;
        Date date2 = Iso8601Utils.parse(jSONObject.getString(CustomerInfoResponseJsonKeys.FIRST_SEEN));
        if (jSONObjectOptJSONObject != null) {
            AbstractC16544l.m18093f(requestDate, "requestDate");
            entitlementInfos = EntitlementInfoFactoriesKt.buildEntitlementInfos(jSONObjectOptJSONObject, subscriptions, jSONObject3, requestDate, verificationResult);
            if (entitlementInfos == null) {
                Map mapEmptyMap = Collections.emptyMap();
                AbstractC16544l.m18093f(mapEmptyMap, "emptyMap()");
                entitlementInfos = new EntitlementInfos(mapEmptyMap, verificationResult);
            }
        } else {
            Map mapEmptyMap2 = Collections.emptyMap();
            AbstractC16544l.m18093f(mapEmptyMap2, "emptyMap()");
            entitlementInfos = new EntitlementInfos(mapEmptyMap2, verificationResult);
        }
        String strOptNullableString = JSONObjectExtensionsKt.optNullableString(jSONObject, CustomerInfoResponseJsonKeys.MANAGEMENT_URL);
        String strOptNullableString2 = JSONObjectExtensionsKt.optNullableString(jSONObject, "original_purchase_date");
        if (strOptNullableString2 != null) {
            Date date3 = Iso8601Utils.parse(strOptNullableString2);
            if (date3 == null) {
                date3 = null;
            }
            date = date3;
        } else {
            date = null;
        }
        int iOptInt = body.optInt("schema_version", 3);
        String strOptString = jSONObject.optString(CustomerInfoResponseJsonKeys.ORIGINAL_APP_USER_ID);
        Uri uri = strOptNullableString != null ? Uri.parse(strOptNullableString) : null;
        AbstractC16544l.m18093f(requestDate, "requestDate");
        AbstractC16544l.m18093f(date2, suYVq.WQJnVNf);
        AbstractC16544l.m18093f(strOptString, "optString(CustomerInfoRe…eys.ORIGINAL_APP_USER_ID)");
        return new CustomerInfo(entitlementInfos, expirations, linkedHashMapM19248j, requestDate, iOptInt, date2, strOptString, uri, date, body);
    }
}
