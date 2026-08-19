package com.revenuecat.purchases.common.caching;

import android.content.SharedPreferences;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.CustomerInfoFactory;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.interfaces.StorefrontProvider;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import com.revenuecat.purchases.strings.ReceiptStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17306i;
import org.json.JSONException;
import org.json.JSONObject;
import p1113xn.AbstractC21329w;
import p571X9.AbstractC9227W;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bB\b\u0010\u0018\u0000 \u0087\u00012\u00020\u0001:\u0002\u0087\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u0013J\u0015\u0010%\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\u0013J\u001d\u0010%\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\n¢\u0006\u0004\b%\u0010'J\u0015\u0010(\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u0013J\u001d\u0010+\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0004¢\u0006\u0004\b.\u0010\u0013J\u0011\u0010/\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b/\u0010\u000eJ\r\u00100\u001a\u00020\u0011¢\u0006\u0004\b0\u00101J\u0013\u00103\u001a\b\u0012\u0004\u0012\u00020\u000402¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u0004¢\u0006\u0004\b6\u0010\u0013J\u001b\u00108\u001a\u00020\u00112\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000402¢\u0006\u0004\b8\u00109J'\u0010=\u001a\b\u0012\u0004\u0012\u00020;0<2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020;0:¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\u00112\u0006\u0010B\u001a\u00020?¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\u0011¢\u0006\u0004\bE\u00101J\u0015\u0010H\u001a\u00020\u00112\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020\u0011¢\u0006\u0004\bJ\u00101J\r\u0010K\u001a\u00020 ¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u0004\u0018\u00010F¢\u0006\u0004\bM\u0010NJ\u0019\u0010P\u001a\u0004\u0018\u00010?2\u0006\u0010O\u001a\u00020\u0004H\u0016¢\u0006\u0004\bP\u0010QJ\u001f\u0010T\u001a\u00020\u00112\u0006\u0010R\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u0004H\u0016¢\u0006\u0004\bT\u0010UJ\u0015\u0010V\u001a\u00020\u00112\u0006\u0010R\u001a\u00020\u0004¢\u0006\u0004\bV\u0010\u0013J\u001b\u0010W\u001a\b\u0012\u0004\u0012\u00020\u0004022\u0006\u0010R\u001a\u00020\u0004¢\u0006\u0004\bW\u0010XJ\u0015\u0010Y\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u0004¢\u0006\u0004\bY\u0010\u0018J\u0013\u0010Z\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\bZ\u0010[J\u0013\u0010\\\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\\\u0010[J\u001b\u0010$\u001a\u00020\n*\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010]J\u0017\u0010^\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b^\u0010_J\u001d\u0010a\u001a\u00020\u00112\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u000402H\u0002¢\u0006\u0004\ba\u00109J\u0017\u0010b\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\bb\u0010cJ\u0011\u0010d\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\bd\u0010eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010gR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010hR\u001b\u0010l\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010\u000eR\u001b\u0010o\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bm\u0010j\u001a\u0004\bn\u0010\u000eR\u001b\u0010r\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bp\u0010j\u001a\u0004\bq\u0010\u000eR\u001a\u0010s\u001a\u00020\u00048\u0000X\u0080D¢\u0006\f\n\u0004\bs\u0010g\u001a\u0004\bt\u0010\u000eR\u001b\u0010w\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bu\u0010j\u001a\u0004\bv\u0010\u000eR\u001b\u0010z\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bx\u0010j\u001a\u0004\by\u0010\u000eR\u001b\u0010}\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010j\u001a\u0004\b|\u0010\u000eR\u001c\u0010\u0080\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b~\u0010j\u001a\u0004\b\u007f\u0010\u000eR\u001e\u0010\u0083\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010j\u001a\u0005\b\u0082\u0001\u0010\u000eR\u001e\u0010\u0086\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010j\u001a\u0005\b\u0085\u0001\u0010\u000e¨\u0006\u0088\u0001"}, m18067d2 = {"Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/interfaces/StorefrontProvider;", "Landroid/content/SharedPreferences;", "preferences", "", "apiKey", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;Lcom/revenuecat/purchases/common/DateProvider;)V", "Landroid/content/SharedPreferences$Editor;", "startEditing", "()Landroid/content/SharedPreferences$Editor;", "getLegacyCachedAppUserID", "()Ljava/lang/String;", "getCachedAppUserID", "appUserID", "Lmm/C;", "cacheAppUserID", "(Ljava/lang/String;)V", "cacheEditor", "(Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)Landroid/content/SharedPreferences$Editor;", "clearCachesForAppUserID", "customerInfoCacheKey", "(Ljava/lang/String;)Ljava/lang/String;", "customerInfoLastUpdatedCacheKey", "Lcom/revenuecat/purchases/CustomerInfo;", "getCachedCustomerInfo", "(Ljava/lang/String;)Lcom/revenuecat/purchases/CustomerInfo;", ParameterNames.INFO, "cacheCustomerInfo", "(Ljava/lang/String;Lcom/revenuecat/purchases/CustomerInfo;)V", "", "appInBackground", "isCustomerInfoCacheStale", "(Ljava/lang/String;Z)Z", "clearCustomerInfoCacheTimestamp", "clearCustomerInfoCache", "editor", "(Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)V", "setCustomerInfoCacheTimestampToNow", "Ljava/util/Date;", "date", "setCustomerInfoCacheTimestamp", "(Ljava/lang/String;Ljava/util/Date;)V", "countryCode", "setStorefront", "getStorefront", "cleanupOldAttributionData", "()V", "", "getPreviouslySentHashedTokens", "()Ljava/util/Set;", "token", "addSuccessfullyPostedToken", "hashedTokens", "cleanPreviouslySentTokens", "(Ljava/util/Set;)V", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "", "getActivePurchasesNotInCache", "(Ljava/util/Map;)Ljava/util/List;", "Lorg/json/JSONObject;", "getOfferingsResponseCache", "()Lorg/json/JSONObject;", "offeringsResponse", "cacheOfferingsResponse", "(Lorg/json/JSONObject;)V", "clearOfferingsResponseCache", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "productEntitlementMapping", "cacheProductEntitlementMapping", "(Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;)V", "setProductEntitlementMappingCacheTimestampToNow", "isProductEntitlementMappingCacheStale", "()Z", "getProductEntitlementMapping", "()Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", SubscriberAttributeKt.JSON_NAME_KEY, "getJSONObjectOrNull", "(Ljava/lang/String;)Lorg/json/JSONObject;", "cacheKey", "value", "putString", "(Ljava/lang/String;Ljava/lang/String;)V", "remove", "findKeysThatStartWith", "(Ljava/lang/String;)Ljava/util/Set;", "newKey", "clearCustomerInfo", "(Landroid/content/SharedPreferences$Editor;)Landroid/content/SharedPreferences$Editor;", "clearAppUserID", "(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;", "getCustomerInfoCachesLastUpdated", "(Ljava/lang/String;)Ljava/util/Date;", "newSet", "setSavedTokenHashes", "setProductEntitlementMappingCacheTimestamp", "(Ljava/util/Date;)V", "getProductEntitlementMappingLastUpdated", "()Ljava/util/Date;", "Landroid/content/SharedPreferences;", "Ljava/lang/String;", "Lcom/revenuecat/purchases/common/DateProvider;", "apiKeyPrefix$delegate", "Lmm/i;", "getApiKeyPrefix", "apiKeyPrefix", "legacyAppUserIDCacheKey$delegate", "getLegacyAppUserIDCacheKey", "legacyAppUserIDCacheKey", "appUserIDCacheKey$delegate", "getAppUserIDCacheKey", "appUserIDCacheKey", "attributionCacheKey", "getAttributionCacheKey$purchases_customEntitlementComputationRelease", "tokensCacheKey$delegate", "getTokensCacheKey", "tokensCacheKey", "storefrontCacheKey$delegate", "getStorefrontCacheKey", "storefrontCacheKey", "productEntitlementMappingCacheKey$delegate", "getProductEntitlementMappingCacheKey", "productEntitlementMappingCacheKey", "productEntitlementMappingLastUpdatedCacheKey$delegate", "getProductEntitlementMappingLastUpdatedCacheKey", "productEntitlementMappingLastUpdatedCacheKey", "customerInfoCachesLastUpdatedCacheBaseKey$delegate", "getCustomerInfoCachesLastUpdatedCacheBaseKey", "customerInfoCachesLastUpdatedCacheBaseKey", "offeringsResponseCacheKey$delegate", "getOfferingsResponseCacheKey", "offeringsResponseCacheKey", "Companion", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public class DeviceCache implements StorefrontProvider {
    private static final String CUSTOMER_INFO_REQUEST_DATE_KEY = "customer_info_request_date";
    private static final String CUSTOMER_INFO_SCHEMA_VERSION_KEY = "schema_version";
    private static final String CUSTOMER_INFO_VERIFICATION_RESULT_KEY = "verification_result";
    private final String apiKey;

    /* JADX INFO: renamed from: apiKeyPrefix$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i apiKeyPrefix;

    /* JADX INFO: renamed from: appUserIDCacheKey$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i appUserIDCacheKey;
    private final String attributionCacheKey;

    /* JADX INFO: renamed from: customerInfoCachesLastUpdatedCacheBaseKey$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i customerInfoCachesLastUpdatedCacheBaseKey;
    private final DateProvider dateProvider;

    /* JADX INFO: renamed from: legacyAppUserIDCacheKey$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i legacyAppUserIDCacheKey;

    /* JADX INFO: renamed from: offeringsResponseCacheKey$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i offeringsResponseCacheKey;
    private final SharedPreferences preferences;

    /* JADX INFO: renamed from: productEntitlementMappingCacheKey$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i productEntitlementMappingCacheKey;

    /* JADX INFO: renamed from: productEntitlementMappingLastUpdatedCacheKey$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i productEntitlementMappingLastUpdatedCacheKey;

    /* JADX INFO: renamed from: storefrontCacheKey$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i storefrontCacheKey;

    /* JADX INFO: renamed from: tokensCacheKey$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i tokensCacheKey;

    public DeviceCache(SharedPreferences preferences, String apiKey, DateProvider dateProvider) {
        AbstractC16544l.m18094g(preferences, "preferences");
        AbstractC16544l.m18094g(apiKey, "apiKey");
        AbstractC16544l.m18094g(dateProvider, "dateProvider");
        this.preferences = preferences;
        this.apiKey = apiKey;
        this.dateProvider = dateProvider;
        this.apiKeyPrefix = AbstractC9227W.m9800c(new DeviceCache$apiKeyPrefix$2(this));
        this.legacyAppUserIDCacheKey = AbstractC9227W.m9800c(new DeviceCache$legacyAppUserIDCacheKey$2(this));
        this.appUserIDCacheKey = AbstractC9227W.m9800c(new DeviceCache$appUserIDCacheKey$2(this));
        this.attributionCacheKey = "com.revenuecat.purchases..attribution";
        this.tokensCacheKey = AbstractC9227W.m9800c(new DeviceCache$tokensCacheKey$2(this));
        this.storefrontCacheKey = AbstractC9227W.m9800c(DeviceCache$storefrontCacheKey$2.INSTANCE);
        this.productEntitlementMappingCacheKey = AbstractC9227W.m9800c(new DeviceCache$productEntitlementMappingCacheKey$2(this));
        this.productEntitlementMappingLastUpdatedCacheKey = AbstractC9227W.m9800c(new DeviceCache$productEntitlementMappingLastUpdatedCacheKey$2(this));
        this.customerInfoCachesLastUpdatedCacheBaseKey = AbstractC9227W.m9800c(new DeviceCache$customerInfoCachesLastUpdatedCacheBaseKey$2(this));
        this.offeringsResponseCacheKey = AbstractC9227W.m9800c(new DeviceCache$offeringsResponseCacheKey$2(this));
    }

    private final SharedPreferences.Editor clearAppUserID(SharedPreferences.Editor editor) {
        editor.remove(getAppUserIDCacheKey());
        editor.remove(getLegacyAppUserIDCacheKey());
        return editor;
    }

    private final SharedPreferences.Editor clearCustomerInfo(SharedPreferences.Editor editor) {
        String cachedAppUserID = getCachedAppUserID();
        if (cachedAppUserID != null) {
            editor.remove(customerInfoCacheKey(cachedAppUserID));
        }
        String legacyCachedAppUserID = getLegacyCachedAppUserID();
        if (legacyCachedAppUserID != null) {
            editor.remove(customerInfoCacheKey(legacyCachedAppUserID));
        }
        return editor;
    }

    private final SharedPreferences.Editor clearCustomerInfoCacheTimestamp(SharedPreferences.Editor editor, String str) {
        editor.remove(customerInfoLastUpdatedCacheKey(str));
        return editor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getApiKeyPrefix() {
        return (String) this.apiKeyPrefix.getValue();
    }

    private final synchronized Date getCustomerInfoCachesLastUpdated(String appUserID) {
        return new Date(this.preferences.getLong(customerInfoLastUpdatedCacheKey(appUserID), 0L));
    }

    private final String getCustomerInfoCachesLastUpdatedCacheBaseKey() {
        return (String) this.customerInfoCachesLastUpdatedCacheBaseKey.getValue();
    }

    private final String getOfferingsResponseCacheKey() {
        return (String) this.offeringsResponseCacheKey.getValue();
    }

    private final String getProductEntitlementMappingCacheKey() {
        return (String) this.productEntitlementMappingCacheKey.getValue();
    }

    private final Date getProductEntitlementMappingLastUpdated() {
        if (this.preferences.contains(getProductEntitlementMappingLastUpdatedCacheKey())) {
            return new Date(this.preferences.getLong(getProductEntitlementMappingLastUpdatedCacheKey(), -1L));
        }
        return null;
    }

    private final String getProductEntitlementMappingLastUpdatedCacheKey() {
        return (String) this.productEntitlementMappingLastUpdatedCacheKey.getValue();
    }

    private final void setProductEntitlementMappingCacheTimestamp(Date date) {
        this.preferences.edit().putLong(getProductEntitlementMappingLastUpdatedCacheKey(), date.getTime()).apply();
    }

    private final synchronized void setSavedTokenHashes(Set<String> newSet) {
        LogWrapperKt.log(LogIntent.DEBUG, String.format(ReceiptStrings.SAVING_TOKENS, Arrays.copyOf(new Object[]{newSet}, 1)));
        this.preferences.edit().putStringSet(getTokensCacheKey(), newSet).apply();
    }

    public final synchronized void addSuccessfullyPostedToken(String token) {
        AbstractC16544l.m18094g(token, "token");
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, String.format(ReceiptStrings.SAVING_TOKENS_WITH_HASH, Arrays.copyOf(new Object[]{token, UtilsKt.sha1(token)}, 2)));
        Set<String> previouslySentHashedTokens = getPreviouslySentHashedTokens();
        LogWrapperKt.log(logIntent, String.format(ReceiptStrings.TOKENS_IN_CACHE, Arrays.copyOf(new Object[]{previouslySentHashedTokens}, 1)));
        Set<String> setM19326F0 = AbstractC17680n.m19326F0(previouslySentHashedTokens);
        setM19326F0.add(UtilsKt.sha1(token));
        setSavedTokenHashes(setM19326F0);
    }

    public final synchronized void cacheAppUserID(String appUserID) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        AbstractC16544l.m18093f(editorEdit, "preferences.edit()");
        cacheAppUserID(appUserID, editorEdit).apply();
    }

    public final synchronized void cacheCustomerInfo(String appUserID, CustomerInfo info) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(info, "info");
        JSONObject rawData = info.getRawData();
        rawData.put(CUSTOMER_INFO_SCHEMA_VERSION_KEY, 3);
        rawData.put("verification_result", info.getEntitlements().getVerification().name());
        rawData.put(CUSTOMER_INFO_REQUEST_DATE_KEY, info.getRequestDate().getTime());
        this.preferences.edit().putString(customerInfoCacheKey(appUserID), rawData.toString()).apply();
        setCustomerInfoCacheTimestampToNow(appUserID);
    }

    public final synchronized void cacheOfferingsResponse(JSONObject offeringsResponse) {
        AbstractC16544l.m18094g(offeringsResponse, "offeringsResponse");
        this.preferences.edit().putString(getOfferingsResponseCacheKey(), offeringsResponse.toString()).apply();
    }

    public final synchronized void cacheProductEntitlementMapping(ProductEntitlementMapping productEntitlementMapping) {
        AbstractC16544l.m18094g(productEntitlementMapping, "productEntitlementMapping");
        this.preferences.edit().putString(getProductEntitlementMappingCacheKey(), productEntitlementMapping.toJson().toString()).apply();
        setProductEntitlementMappingCacheTimestampToNow();
    }

    public final synchronized void cleanPreviouslySentTokens(Set<String> hashedTokens) {
        AbstractC16544l.m18094g(hashedTokens, "hashedTokens");
        LogWrapperKt.log(LogIntent.DEBUG, ReceiptStrings.CLEANING_PREV_SENT_HASHED_TOKEN);
        setSavedTokenHashes(AbstractC17680n.m19346V(hashedTokens, getPreviouslySentHashedTokens()));
    }

    public final synchronized void cleanupOldAttributionData() {
        try {
            SharedPreferences.Editor editorEdit = this.preferences.edit();
            for (String str : this.preferences.getAll().keySet()) {
                if (str != null && AbstractC21329w.m21734u(str, this.attributionCacheKey, false)) {
                    editorEdit.remove(str);
                }
            }
            editorEdit.apply();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void clearCachesForAppUserID(String appUserID) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        AbstractC16544l.m18093f(editorEdit, "preferences.edit()");
        clearCustomerInfoCacheTimestamp(clearAppUserID(clearCustomerInfo(editorEdit)), appUserID).apply();
    }

    public final synchronized void clearCustomerInfoCache(String appUserID) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        SharedPreferences.Editor editor = this.preferences.edit();
        AbstractC16544l.m18093f(editor, "editor");
        clearCustomerInfoCache(appUserID, editor);
        editor.apply();
    }

    public final synchronized void clearOfferingsResponseCache() {
        this.preferences.edit().remove(getOfferingsResponseCacheKey()).apply();
    }

    public final String customerInfoCacheKey(String appUserID) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        return getLegacyAppUserIDCacheKey() + '.' + appUserID;
    }

    public final String customerInfoLastUpdatedCacheKey(String appUserID) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        return getCustomerInfoCachesLastUpdatedCacheBaseKey() + '.' + appUserID;
    }

    public final Set<String> findKeysThatStartWith(String cacheKey) {
        C17691y c17691y = C17691y.f56482Y;
        AbstractC16544l.m18094g(cacheKey, "cacheKey");
        try {
            Map<String, ?> all = this.preferences.getAll();
            if (all == null) {
                return c17691y;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String it = entry.getKey();
                AbstractC16544l.m18093f(it, "it");
                if (AbstractC21329w.m21734u(it, cacheKey, false)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set<String> setKeySet = linkedHashMap.keySet();
            return setKeySet != null ? setKeySet : c17691y;
        } catch (NullPointerException unused) {
            return c17691y;
        }
    }

    public final synchronized List<StoreTransaction> getActivePurchasesNotInCache(Map<String, StoreTransaction> hashedTokens) {
        LinkedHashMap linkedHashMapM19256r;
        AbstractC16544l.m18094g(hashedTokens, "hashedTokens");
        Set<String> keys = getPreviouslySentHashedTokens();
        AbstractC16544l.m18094g(keys, "keys");
        linkedHashMapM19256r = AbstractC17659D.m19256r(hashedTokens);
        AbstractC17686t.m19402z(keys, linkedHashMapM19256r.keySet());
        return AbstractC17680n.m19322C0(AbstractC17659D.m19247i(linkedHashMapM19256r).values());
    }

    public final String getAppUserIDCacheKey() {
        return (String) this.appUserIDCacheKey.getValue();
    }

    /* JADX INFO: renamed from: getAttributionCacheKey$purchases_customEntitlementComputationRelease, reason: from getter */
    public final String getAttributionCacheKey() {
        return this.attributionCacheKey;
    }

    public final synchronized String getCachedAppUserID() {
        return this.preferences.getString(getAppUserIDCacheKey(), null);
    }

    public final CustomerInfo getCachedCustomerInfo(String appUserID) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        String string = this.preferences.getString(customerInfoCacheKey(appUserID), null);
        if (string == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            int iOptInt = jSONObject.optInt(CUSTOMER_INFO_SCHEMA_VERSION_KEY);
            String verificationResultString = jSONObject.has("verification_result") ? jSONObject.getString("verification_result") : "NOT_REQUESTED";
            Long lValueOf = Long.valueOf(jSONObject.optLong(CUSTOMER_INFO_REQUEST_DATE_KEY));
            if (lValueOf.longValue() <= 0) {
                lValueOf = null;
            }
            Date date = lValueOf != null ? new Date(lValueOf.longValue()) : null;
            jSONObject.remove("verification_result");
            jSONObject.remove(CUSTOMER_INFO_REQUEST_DATE_KEY);
            AbstractC16544l.m18093f(verificationResultString, "verificationResultString");
            VerificationResult verificationResultValueOf = VerificationResult.valueOf(verificationResultString);
            if (iOptInt == 3) {
                return CustomerInfoFactory.INSTANCE.buildCustomerInfo(jSONObject, date, verificationResultValueOf);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    public JSONObject getJSONObjectOrNull(String key) {
        AbstractC16544l.m18094g(key, "key");
        String string = this.preferences.getString(key, null);
        if (string == null) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String getLegacyAppUserIDCacheKey() {
        return (String) this.legacyAppUserIDCacheKey.getValue();
    }

    public final synchronized String getLegacyCachedAppUserID() {
        return this.preferences.getString(getLegacyAppUserIDCacheKey(), null);
    }

    public final synchronized JSONObject getOfferingsResponseCache() {
        return getJSONObjectOrNull(getOfferingsResponseCacheKey());
    }

    public final synchronized Set<String> getPreviouslySentHashedTokens() {
        Set<String> setM19328G0;
        try {
            try {
                SharedPreferences sharedPreferences = this.preferences;
                String tokensCacheKey = getTokensCacheKey();
                setM19328G0 = C17691y.f56482Y;
                Set<String> stringSet = sharedPreferences.getStringSet(tokensCacheKey, setM19328G0);
                if (stringSet != null) {
                    setM19328G0 = AbstractC17680n.m19328G0(stringSet);
                }
                LogWrapperKt.log(LogIntent.DEBUG, String.format(ReceiptStrings.TOKENS_ALREADY_POSTED, Arrays.copyOf(new Object[]{setM19328G0}, 1)));
            } catch (ClassCastException unused) {
                setM19328G0 = C17691y.f56482Y;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return setM19328G0;
    }

    public final synchronized ProductEntitlementMapping getProductEntitlementMapping() {
        try {
            ProductEntitlementMapping productEntitlementMappingFromJson = null;
            String string = this.preferences.getString(getProductEntitlementMappingCacheKey(), null);
            if (string == null) {
                return null;
            }
            try {
                productEntitlementMappingFromJson = ProductEntitlementMapping.INSTANCE.fromJson(new JSONObject(string));
            } catch (JSONException e10) {
                LogUtilsKt.errorLog(String.format(OfflineEntitlementsStrings.ERROR_PARSING_PRODUCT_ENTITLEMENT_MAPPING, Arrays.copyOf(new Object[]{string}, 1)), e10);
                this.preferences.edit().remove(getProductEntitlementMappingCacheKey()).apply();
            }
            return productEntitlementMappingFromJson;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.revenuecat.purchases.interfaces.StorefrontProvider
    public synchronized String getStorefront() {
        String string;
        string = this.preferences.getString(getStorefrontCacheKey(), null);
        if (string == null) {
            LogUtilsKt.debugLog(BillingStrings.BILLING_STOREFRONT_NULL_FROM_CACHE);
        }
        return string;
    }

    public final String getStorefrontCacheKey() {
        return (String) this.storefrontCacheKey.getValue();
    }

    public final String getTokensCacheKey() {
        return (String) this.tokensCacheKey.getValue();
    }

    public final synchronized boolean isCustomerInfoCacheStale(String appUserID, boolean appInBackground) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        return DateExtensionsKt.isCacheStale(getCustomerInfoCachesLastUpdated(appUserID), appInBackground, this.dateProvider);
    }

    public final synchronized boolean isProductEntitlementMappingCacheStale() {
        return DateExtensionsKt.m22501isCacheStale8Mi8wO0(getProductEntitlementMappingLastUpdated(), DeviceCacheKt.PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD, this.dateProvider);
    }

    public final String newKey(String key) {
        AbstractC16544l.m18094g(key, "key");
        return getApiKeyPrefix() + '.' + key;
    }

    public void putString(String cacheKey, String value) {
        AbstractC16544l.m18094g(cacheKey, "cacheKey");
        AbstractC16544l.m18094g(value, "value");
        this.preferences.edit().putString(cacheKey, value).apply();
    }

    public final void remove(String cacheKey) {
        AbstractC16544l.m18094g(cacheKey, "cacheKey");
        this.preferences.edit().remove(cacheKey).apply();
    }

    public final synchronized void setCustomerInfoCacheTimestamp(String appUserID, Date date) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(date, "date");
        this.preferences.edit().putLong(customerInfoLastUpdatedCacheKey(appUserID), date.getTime()).apply();
    }

    public final synchronized void setCustomerInfoCacheTimestampToNow(String appUserID) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        setCustomerInfoCacheTimestamp(appUserID, this.dateProvider.getNow());
    }

    public final synchronized void setProductEntitlementMappingCacheTimestampToNow() {
        setProductEntitlementMappingCacheTimestamp(this.dateProvider.getNow());
    }

    public final synchronized void setStorefront(String countryCode) {
        AbstractC16544l.m18094g(countryCode, "countryCode");
        LogUtilsKt.verboseLog(String.format(BillingStrings.BILLING_STOREFRONT_CACHING, Arrays.copyOf(new Object[]{countryCode}, 1)));
        this.preferences.edit().putString(getStorefrontCacheKey(), countryCode).apply();
    }

    public final SharedPreferences.Editor startEditing() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        AbstractC16544l.m18093f(editorEdit, "preferences.edit()");
        return editorEdit;
    }

    public final synchronized void clearCustomerInfoCacheTimestamp(String appUserID) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        AbstractC16544l.m18093f(editorEdit, "preferences.edit()");
        clearCustomerInfoCacheTimestamp(editorEdit, appUserID).apply();
    }

    public final synchronized SharedPreferences.Editor cacheAppUserID(String appUserID, SharedPreferences.Editor cacheEditor) {
        SharedPreferences.Editor editorPutString;
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(cacheEditor, "cacheEditor");
        editorPutString = cacheEditor.putString(getAppUserIDCacheKey(), appUserID);
        AbstractC16544l.m18093f(editorPutString, "cacheEditor.putString(ap…serIDCacheKey, appUserID)");
        return editorPutString;
    }

    public final synchronized void clearCustomerInfoCache(String appUserID, SharedPreferences.Editor editor) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(editor, "editor");
        clearCustomerInfoCacheTimestamp(editor, appUserID);
        editor.remove(customerInfoCacheKey(appUserID));
    }

    public /* synthetic */ DeviceCache(SharedPreferences sharedPreferences, String str, DateProvider dateProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, str, (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
