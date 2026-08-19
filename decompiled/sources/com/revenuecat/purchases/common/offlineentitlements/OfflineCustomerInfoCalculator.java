package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.CustomerInfoFactory;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.common.responses.EntitlementsResponseJsonKeys;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import com.revenuecat.purchases.utils.Iso8601Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import org.json.JSONException;
import org.json.JSONObject;
import p049Bm.InterfaceC1436k;
import p312Mb.AbstractC5316a;
import p806ia.nJAW.FpwNpGDhomXHZ;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u00010\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00192\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\u00192\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ=\u0010\"\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001e0\u001d2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'¨\u0006("}, m18067d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;", "", "Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProductsFetcher;", "purchasedProductsFetcher", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTracker", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProductsFetcher;Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/DateProvider;)V", "", "appUserID", "", "Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProduct;", "purchasedProducts", "Lcom/revenuecat/purchases/CustomerInfo;", "buildCustomerInfoUsingListOfPurchases", "(Ljava/lang/String;Ljava/util/List;)Lcom/revenuecat/purchases/CustomerInfo;", "kotlin.jvm.PlatformType", "determineManagementURL", "()Ljava/lang/Object;", "calculateOriginalPurchaseDate", "(Ljava/util/List;)Ljava/lang/String;", "Lorg/json/JSONObject;", "generateSubscriptions", "(Ljava/util/List;)Lorg/json/JSONObject;", "generateEntitlementsResponse", "Lkotlin/Function1;", "Lmm/C;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "computeOfflineCustomerInfo", "(Ljava/lang/String;LBm/k;LBm/k;)V", "Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProductsFetcher;", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/DateProvider;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class OfflineCustomerInfoCalculator {
    private final AppConfig appConfig;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTracker;
    private final PurchasedProductsFetcher purchasedProductsFetcher;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineCustomerInfoCalculator$computeOfflineCustomerInfo$1 */
    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"", "Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProduct;", "purchasedProducts", "Lmm/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127031 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ InterfaceC1436k $onError;
        final /* synthetic */ InterfaceC1436k $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127031(InterfaceC1436k interfaceC1436k, String str, InterfaceC1436k interfaceC1436k2) {
            super(1);
            this.$onError = interfaceC1436k;
            this.$appUserID = str;
            this.$onSuccess = interfaceC1436k2;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<PurchasedProduct>) obj);
            return C17296C.f55119a;
        }

        public final void invoke(List<PurchasedProduct> purchasedProducts) {
            AbstractC16544l.m18094g(purchasedProducts, "purchasedProducts");
            List<PurchasedProduct> list = purchasedProducts;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((PurchasedProduct) it.next()).getStoreTransaction().getType() == ProductType.INAPP) {
                        PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnsupportedError, OfflineEntitlementsStrings.OFFLINE_ENTITLEMENTS_UNSUPPORTED_INAPP_PURCHASES);
                        LogUtilsKt.errorLog$default(String.format(CustomerInfoStrings.COMPUTING_OFFLINE_CUSTOMER_INFO_FAILED, Arrays.copyOf(new Object[]{purchasesError}, 1)), null, 2, null);
                        DiagnosticsTracker diagnosticsTracker = OfflineCustomerInfoCalculator.this.diagnosticsTracker;
                        if (diagnosticsTracker != null) {
                            diagnosticsTracker.trackErrorEnteringOfflineEntitlementsMode(purchasesError);
                        }
                        this.$onError.invoke(purchasesError);
                        return;
                    }
                }
            }
            this.$onSuccess.invoke(OfflineCustomerInfoCalculator.this.buildCustomerInfoUsingListOfPurchases(this.$appUserID, purchasedProducts));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineCustomerInfoCalculator$computeOfflineCustomerInfo$2 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127042 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127042(InterfaceC1436k interfaceC1436k) {
            super(1);
            this.$onError = interfaceC1436k;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError error) {
            AbstractC16544l.m18094g(error, "error");
            LogUtilsKt.errorLog$default(String.format(CustomerInfoStrings.COMPUTING_OFFLINE_CUSTOMER_INFO_FAILED, Arrays.copyOf(new Object[]{error}, 1)), null, 2, null);
            DiagnosticsTracker diagnosticsTracker = OfflineCustomerInfoCalculator.this.diagnosticsTracker;
            if (diagnosticsTracker != null) {
                diagnosticsTracker.trackErrorEnteringOfflineEntitlementsMode(error);
            }
            this.$onError.invoke(error);
        }
    }

    public OfflineCustomerInfoCalculator(PurchasedProductsFetcher purchasedProductsFetcher, AppConfig appConfig, DiagnosticsTracker diagnosticsTracker, DateProvider dateProvider) {
        AbstractC16544l.m18094g(purchasedProductsFetcher, "purchasedProductsFetcher");
        AbstractC16544l.m18094g(appConfig, FpwNpGDhomXHZ.gweDF);
        AbstractC16544l.m18094g(dateProvider, "dateProvider");
        this.purchasedProductsFetcher = purchasedProductsFetcher;
        this.appConfig = appConfig;
        this.diagnosticsTracker = diagnosticsTracker;
        this.dateProvider = dateProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomerInfo buildCustomerInfoUsingListOfPurchases(String appUserID, List<PurchasedProduct> purchasedProducts) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Date now = this.dateProvider.getNow();
        String str = Iso8601Utils.format(now);
        jSONObject.put(CustomerInfoResponseJsonKeys.REQUEST_DATE, str);
        jSONObject.put(CustomerInfoResponseJsonKeys.REQUEST_DATE_MS, now.getTime());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(CustomerInfoResponseJsonKeys.ORIGINAL_APP_USER_ID, appUserID);
        jSONObject2.put(CustomerInfoResponseJsonKeys.ORIGINAL_APPLICATION_VERSION, "1.0");
        jSONObject2.put(CustomerInfoResponseJsonKeys.ENTITLEMENTS, generateEntitlementsResponse(purchasedProducts));
        jSONObject2.put(CustomerInfoResponseJsonKeys.FIRST_SEEN, str);
        jSONObject2.put("original_purchase_date", calculateOriginalPurchaseDate(purchasedProducts));
        jSONObject2.put(CustomerInfoResponseJsonKeys.NON_SUBSCRIPTIONS, new JSONObject());
        jSONObject2.put(CustomerInfoResponseJsonKeys.SUBSCRIPTIONS, generateSubscriptions(purchasedProducts));
        jSONObject2.put(CustomerInfoResponseJsonKeys.MANAGEMENT_URL, determineManagementURL());
        jSONObject.put(CustomerInfoResponseJsonKeys.SUBSCRIBER, jSONObject2);
        return CustomerInfoFactory.INSTANCE.buildCustomerInfo(jSONObject, now, VerificationResult.VERIFIED_ON_DEVICE);
    }

    private final String calculateOriginalPurchaseDate(List<PurchasedProduct> purchasedProducts) {
        Long lValueOf;
        Iterator<T> it = purchasedProducts.iterator();
        if (it.hasNext()) {
            lValueOf = Long.valueOf(((PurchasedProduct) it.next()).getStoreTransaction().getPurchaseTime());
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((PurchasedProduct) it.next()).getStoreTransaction().getPurchaseTime());
                if (lValueOf.compareTo(lValueOf2) > 0) {
                    lValueOf = lValueOf2;
                }
            }
        } else {
            lValueOf = null;
        }
        if (lValueOf == null) {
            return null;
        }
        Date date = new Date(lValueOf.longValue());
        TimeZone timeZone = AbstractC5316a.f17500a;
        Locale locale = Locale.US;
        TimeZone timeZone2 = AbstractC5316a.f17500a;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone2, locale);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(19 + (timeZone2.getRawOffset() == 0 ? 1 : 6));
        AbstractC5316a.m5872b(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        AbstractC5316a.m5872b(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        AbstractC5316a.m5872b(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        AbstractC5316a.m5872b(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        AbstractC5316a.m5872b(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        AbstractC5316a.m5872b(sb2, gregorianCalendar.get(13), 2);
        int offset = timeZone2.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i10 = offset / 60000;
            int iAbs = Math.abs(i10 / 60);
            int iAbs2 = Math.abs(i10 % 60);
            sb2.append(offset >= 0 ? '+' : '-');
            AbstractC5316a.m5872b(sb2, iAbs, 2);
            sb2.append(':');
            AbstractC5316a.m5872b(sb2, iAbs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }

    private final Object determineManagementURL() {
        return this.appConfig.getStore() == Store.PLAY_STORE ? Constants.GOOGLE_PLAY_MANAGEMENT_URL : JSONObject.NULL;
    }

    private final JSONObject generateEntitlementsResponse(List<PurchasedProduct> purchasedProducts) throws JSONException {
        ArrayList<C17309l> arrayList = new ArrayList();
        for (PurchasedProduct purchasedProduct : purchasedProducts) {
            List<String> entitlements = purchasedProduct.getEntitlements();
            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(entitlements, 10));
            Iterator<T> it = entitlements.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C17309l((String) it.next(), purchasedProduct));
            }
            AbstractC17686t.m19398v(arrayList2, arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C17309l c17309l : arrayList) {
            String str = (String) c17309l.f55136Y;
            Object arrayList3 = linkedHashMap.get(str);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(str, arrayList3);
            }
            ((List) arrayList3).add((PurchasedProduct) c17309l.f55137Z);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC17660E.m19257b(linkedHashMap.size()));
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (true) {
            Object next = null;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            Iterator it3 = list.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    Date expiresDate = ((PurchasedProduct) next).getExpiresDate();
                    long time = expiresDate != null ? expiresDate.getTime() : Long.MAX_VALUE;
                    do {
                        Object next2 = it3.next();
                        Date expiresDate2 = ((PurchasedProduct) next2).getExpiresDate();
                        long time2 = expiresDate2 != null ? expiresDate2.getTime() : Long.MAX_VALUE;
                        if (time < time2) {
                            next = next2;
                            time = time2;
                        }
                    } while (it3.hasNext());
                }
            }
            PurchasedProduct purchasedProduct2 = (PurchasedProduct) next;
            if (purchasedProduct2 == null) {
                purchasedProduct2 = (PurchasedProduct) AbstractC17680n.m19341Q(list);
            }
            linkedHashMap2.put(key, purchasedProduct2);
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            String str2 = (String) entry2.getKey();
            PurchasedProduct purchasedProduct3 = (PurchasedProduct) entry2.getValue();
            JSONObject jSONObject2 = new JSONObject();
            Date expiresDate3 = purchasedProduct3.getExpiresDate();
            jSONObject2.put("expires_date", expiresDate3 != null ? Iso8601Utils.format(expiresDate3) : null);
            jSONObject2.put(EntitlementsResponseJsonKeys.PRODUCT_IDENTIFIER, purchasedProduct3.getProductIdentifier());
            jSONObject2.put("purchase_date", Iso8601Utils.format(new Date(purchasedProduct3.getStoreTransaction().getPurchaseTime())));
            String basePlanId = purchasedProduct3.getBasePlanId();
            if (basePlanId != null) {
                jSONObject2.put("product_plan_identifier", basePlanId);
            }
            jSONObject.put(str2, jSONObject2);
        }
        return jSONObject;
    }

    private final JSONObject generateSubscriptions(List<PurchasedProduct> purchasedProducts) throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        for (PurchasedProduct purchasedProduct : purchasedProducts) {
            String productIdentifier = purchasedProduct.getProductIdentifier();
            JSONObject jSONObject2 = new JSONObject();
            Object obj = JSONObject.NULL;
            jSONObject2.put(ProductResponseJsonKeys.BILLING_ISSUES_DETECTED_AT, obj);
            jSONObject2.put(ProductResponseJsonKeys.IS_SANDBOX, false);
            Date date = new Date(purchasedProduct.getStoreTransaction().getPurchaseTime());
            jSONObject2.put("original_purchase_date", Iso8601Utils.format(date));
            jSONObject2.put("purchase_date", Iso8601Utils.format(date));
            String strName = this.appConfig.getStore().name();
            Locale locale = Locale.ROOT;
            String lowerCase = strName.toLowerCase(locale);
            AbstractC16544l.m18093f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            jSONObject2.put(ProductResponseJsonKeys.STORE, lowerCase);
            jSONObject2.put(ProductResponseJsonKeys.UNSUBSCRIBE_DETECTED_AT, obj);
            jSONObject2.put("product_plan_identifier", purchasedProduct.getBasePlanId());
            Date expiresDate = purchasedProduct.getExpiresDate();
            if (expiresDate != null && (str = Iso8601Utils.format(expiresDate)) != null) {
                obj = str;
            }
            jSONObject2.put("expires_date", obj);
            String lowerCase2 = "NORMAL".toLowerCase(locale);
            AbstractC16544l.m18093f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            jSONObject2.put(ProductResponseJsonKeys.PERIOD_TYPE, lowerCase2);
            jSONObject.put(productIdentifier, jSONObject2);
        }
        return jSONObject;
    }

    public final void computeOfflineCustomerInfo(String appUserID, InterfaceC1436k onSuccess, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        this.purchasedProductsFetcher.queryActiveProducts(appUserID, new C127031(onError, appUserID, onSuccess), new C127042(onError));
    }

    public /* synthetic */ OfflineCustomerInfoCalculator(PurchasedProductsFetcher purchasedProductsFetcher, AppConfig appConfig, DiagnosticsTracker diagnosticsTracker, DateProvider dateProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(purchasedProductsFetcher, appConfig, diagnosticsTracker, (i10 & 8) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
