package com.revenuecat.purchases.common.diagnostics;

import android.os.Build;
import cn.UfGr.EhBykzn;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p003A1.AbstractC0168G;
import p003A1.RunnableC0156C;
import p049Bm.InterfaceC1426a;
import p1135yn.C21555b;
import p160G5.p161rK.TVCuK;
import p909nm.AbstractC17659D;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 M2\u00020\u0001:\u0001MB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010JE\u0010!\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001dø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J3\u0010(\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J3\u0010*\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010'J3\u0010,\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010'J#\u0010/\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J#\u00101\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u0010.J\u0017\u00103\u001a\u00020\r2\b\b\u0002\u00102\u001a\u00020\u0017¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\r¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\r¢\u0006\u0004\b7\u00106J\u001d\u00108\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\"¢\u0006\u0004\b8\u00109J\u0015\u0010<\u001a\u00020\r2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\r¢\u0006\u0004\b>\u00106J\u0015\u0010A\u001a\u00020\r2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0015\u0010E\u001a\u00020\r2\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\r2\u0006\u0010D\u001a\u00020CH\u0000¢\u0006\u0004\bG\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010IR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010L\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006N"}, m18067d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "diagnosticsFileHelper", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;", "diagnosticsHelper", "Lcom/revenuecat/purchases/common/Dispatcher;", "diagnosticsDispatcher", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;Lcom/revenuecat/purchases/common/Dispatcher;)V", "Lkotlin/Function0;", "Lmm/C;", "completion", "checkAndClearDiagnosticsFileIfTooBig", "(LBm/a;)V", "command", "enqueue", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "endpoint", "Lyn/b;", "responseTime", "", "wasSuccessful", "", "responseCode", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;", "resultOrigin", "Lcom/revenuecat/purchases/VerificationResult;", "verificationResult", "trackHttpRequestPerformed-NcHsxvU", "(Lcom/revenuecat/purchases/common/networking/Endpoint;JZILcom/revenuecat/purchases/common/networking/HTTPResult$Origin;Lcom/revenuecat/purchases/VerificationResult;)V", "trackHttpRequestPerformed", "", "productType", "billingResponseCode", "billingDebugMessage", "trackGoogleQueryProductDetailsRequest-Wn2Vu4Y", "(Ljava/lang/String;ILjava/lang/String;J)V", "trackGoogleQueryProductDetailsRequest", "trackGoogleQueryPurchasesRequest-Wn2Vu4Y", "trackGoogleQueryPurchasesRequest", "trackGoogleQueryPurchaseHistoryRequest-Wn2Vu4Y", "trackGoogleQueryPurchaseHistoryRequest", "trackAmazonQueryProductDetailsRequest-VtjQ1oo", "(JZ)V", "trackAmazonQueryProductDetailsRequest", "trackAmazonQueryPurchasesRequest-VtjQ1oo", "trackAmazonQueryPurchasesRequest", "useCurrentThread", "trackMaxEventsStoredLimitReached", "(Z)V", "trackMaxDiagnosticsSyncRetriesReached", "()V", "trackClearingDiagnosticsAfterFailedSync", "trackProductDetailsNotSupported", "(ILjava/lang/String;)V", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "trackCustomerInfoVerificationResultIfNeeded", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "trackEnteredOfflineEntitlementsMode", "Lcom/revenuecat/purchases/PurchasesError;", "error", "trackErrorEnteringOfflineEntitlementsMode", "(Lcom/revenuecat/purchases/PurchasesError;)V", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;", "diagnosticsEntry", "trackEvent", "(Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;)V", "trackEventInCurrentThread$purchases_customEntitlementComputationRelease", "trackEventInCurrentThread", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Companion", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DiagnosticsTracker {

    @Deprecated
    public static final String BILLING_DEBUG_MESSAGE = "billing_debug_message";

    @Deprecated
    public static final String BILLING_RESPONSE_CODE = "billing_response_code";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String ENDPOINT_NAME_KEY = "endpoint_name";

    @Deprecated
    public static final String ETAG_HIT_KEY = "etag_hit";

    @Deprecated
    public static final String PRODUCT_TYPE_QUERIED_KEY = "product_type_queried";

    @Deprecated
    public static final String RESPONSE_CODE_KEY = "response_code";

    @Deprecated
    public static final String RESPONSE_TIME_MILLIS_KEY = "response_time_millis";

    @Deprecated
    public static final String SUCCESSFUL_KEY = "successful";

    @Deprecated
    public static final String VERIFICATION_RESULT_KEY = "verification_result";
    private final AppConfig appConfig;
    private final Dispatcher diagnosticsDispatcher;
    private final DiagnosticsFileHelper diagnosticsFileHelper;
    private final DiagnosticsHelper diagnosticsHelper;

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m18067d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$Companion;", "", "()V", "BILLING_DEBUG_MESSAGE", "", "BILLING_RESPONSE_CODE", "ENDPOINT_NAME_KEY", "ETAG_HIT_KEY", "PRODUCT_TYPE_QUERIED_KEY", "RESPONSE_CODE_KEY", "RESPONSE_TIME_MILLIS_KEY", "SUCCESSFUL_KEY", "VERIFICATION_RESULT_KEY", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker$checkAndClearDiagnosticsFileIfTooBig$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126881 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ InterfaceC1426a $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126881(InterfaceC1426a interfaceC1426a) {
            super(0);
            this.$completion = interfaceC1426a;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22510invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22510invoke() {
            if (Build.VERSION.SDK_INT < 24) {
                LogUtilsKt.errorLog$default("Diagnostics only supported in Android 24+", null, 2, null);
            } else if (DiagnosticsTracker.this.diagnosticsFileHelper.isDiagnosticsFileTooBig()) {
                LogUtilsKt.verboseLog("Diagnostics file is too big. Deleting it.");
                DiagnosticsTracker.this.diagnosticsHelper.resetDiagnosticsStatus();
                DiagnosticsTracker.trackMaxEventsStoredLimitReached$default(DiagnosticsTracker.this, false, 1, null);
            }
            this.$completion.invoke();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker$trackEvent$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126891 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ DiagnosticsEntry $diagnosticsEntry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126891(DiagnosticsEntry diagnosticsEntry) {
            super(0);
            this.$diagnosticsEntry = diagnosticsEntry;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22511invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22511invoke() {
            DiagnosticsTracker.this.m14460x1c397bfa(this.$diagnosticsEntry);
        }
    }

    public DiagnosticsTracker(AppConfig appConfig, DiagnosticsFileHelper diagnosticsFileHelper, DiagnosticsHelper diagnosticsHelper, Dispatcher diagnosticsDispatcher) {
        AbstractC16544l.m18094g(appConfig, "appConfig");
        AbstractC16544l.m18094g(diagnosticsFileHelper, "diagnosticsFileHelper");
        AbstractC16544l.m18094g(diagnosticsHelper, "diagnosticsHelper");
        AbstractC16544l.m18094g(diagnosticsDispatcher, "diagnosticsDispatcher");
        this.appConfig = appConfig;
        this.diagnosticsFileHelper = diagnosticsFileHelper;
        this.diagnosticsHelper = diagnosticsHelper;
        this.diagnosticsDispatcher = diagnosticsDispatcher;
    }

    private final void checkAndClearDiagnosticsFileIfTooBig(InterfaceC1426a completion) {
        enqueue(new C126881(completion));
    }

    private final void enqueue(InterfaceC1426a command) {
        Dispatcher.enqueue$default(this.diagnosticsDispatcher, new RunnableC0156C(4, command), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$0(InterfaceC1426a tmp0) {
        AbstractC16544l.m18094g(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static /* synthetic */ void trackMaxEventsStoredLimitReached$default(DiagnosticsTracker diagnosticsTracker, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = true;
        }
        diagnosticsTracker.trackMaxEventsStoredLimitReached(z6);
    }

    /* JADX INFO: renamed from: trackAmazonQueryProductDetailsRequest-VtjQ1oo, reason: not valid java name */
    public final void m22504trackAmazonQueryProductDetailsRequestVtjQ1oo(long responseTime, boolean wasSuccessful) {
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.AMAZON_QUERY_PRODUCT_DETAILS_REQUEST, AbstractC17659D.m19244f(new C17309l(SUCCESSFUL_KEY, Boolean.valueOf(wasSuccessful)), new C17309l(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(C21555b.m21835e(responseTime)))), null, null, 12, null));
    }

    /* JADX INFO: renamed from: trackAmazonQueryPurchasesRequest-VtjQ1oo, reason: not valid java name */
    public final void m22505trackAmazonQueryPurchasesRequestVtjQ1oo(long responseTime, boolean wasSuccessful) {
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.AMAZON_QUERY_PURCHASES_REQUEST, AbstractC17659D.m19244f(new C17309l(SUCCESSFUL_KEY, Boolean.valueOf(wasSuccessful)), new C17309l(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(C21555b.m21835e(responseTime)))), null, null, 12, null));
    }

    public final void trackClearingDiagnosticsAfterFailedSync() {
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.CLEARING_DIAGNOSTICS_AFTER_FAILED_SYNC, C17690x.f56481Y, null, null, 12, null));
    }

    public final void trackCustomerInfoVerificationResultIfNeeded(CustomerInfo customerInfo) {
        AbstractC16544l.m18094g(customerInfo, "customerInfo");
        VerificationResult verification = customerInfo.getEntitlements().getVerification();
        if (verification == VerificationResult.NOT_REQUESTED) {
            return;
        }
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.CUSTOMER_INFO_VERIFICATION_RESULT, AbstractC0168G.m535x(VERIFICATION_RESULT_KEY, verification.name()), null, null, 12, null));
    }

    public final void trackEnteredOfflineEntitlementsMode() {
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.ENTERED_OFFLINE_ENTITLEMENTS_MODE, C17690x.f56481Y, null, null, 12, null));
    }

    public final void trackEvent(DiagnosticsEntry diagnosticsEntry) {
        AbstractC16544l.m18094g(diagnosticsEntry, "diagnosticsEntry");
        checkAndClearDiagnosticsFileIfTooBig(new C126891(diagnosticsEntry));
    }

    /* JADX INFO: renamed from: trackEventInCurrentThread$purchases_customEntitlementComputationRelease */
    public final void m14460x1c397bfa(DiagnosticsEntry diagnosticsEntry) {
        AbstractC16544l.m18094g(diagnosticsEntry, "diagnosticsEntry");
        if (AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            LogUtilsKt.verboseLog("Tracking diagnostics entry: " + diagnosticsEntry);
            try {
                this.diagnosticsFileHelper.appendEvent(diagnosticsEntry);
            } catch (IOException e10) {
                LogUtilsKt.verboseLog("Error tracking diagnostics entry: " + e10);
            }
        }
    }

    /* JADX INFO: renamed from: trackGoogleQueryProductDetailsRequest-Wn2Vu4Y, reason: not valid java name */
    public final void m22506trackGoogleQueryProductDetailsRequestWn2Vu4Y(String productType, int billingResponseCode, String billingDebugMessage, long responseTime) {
        AbstractC16544l.m18094g(productType, "productType");
        AbstractC16544l.m18094g(billingDebugMessage, "billingDebugMessage");
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.GOOGLE_QUERY_PRODUCT_DETAILS_REQUEST, AbstractC17659D.m19244f(new C17309l(PRODUCT_TYPE_QUERIED_KEY, productType), new C17309l(BILLING_RESPONSE_CODE, Integer.valueOf(billingResponseCode)), new C17309l(BILLING_DEBUG_MESSAGE, billingDebugMessage), new C17309l(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(C21555b.m21835e(responseTime)))), null, null, 12, null));
    }

    /* JADX INFO: renamed from: trackGoogleQueryPurchaseHistoryRequest-Wn2Vu4Y, reason: not valid java name */
    public final void m22507trackGoogleQueryPurchaseHistoryRequestWn2Vu4Y(String productType, int billingResponseCode, String billingDebugMessage, long responseTime) {
        AbstractC16544l.m18094g(productType, "productType");
        AbstractC16544l.m18094g(billingDebugMessage, "billingDebugMessage");
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.GOOGLE_QUERY_PURCHASE_HISTORY_REQUEST, AbstractC17659D.m19244f(new C17309l(PRODUCT_TYPE_QUERIED_KEY, productType), new C17309l(BILLING_RESPONSE_CODE, Integer.valueOf(billingResponseCode)), new C17309l(BILLING_DEBUG_MESSAGE, billingDebugMessage), new C17309l(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(C21555b.m21835e(responseTime)))), null, null, 12, null));
    }

    /* JADX INFO: renamed from: trackGoogleQueryPurchasesRequest-Wn2Vu4Y, reason: not valid java name */
    public final void m22508trackGoogleQueryPurchasesRequestWn2Vu4Y(String productType, int billingResponseCode, String billingDebugMessage, long responseTime) {
        AbstractC16544l.m18094g(productType, "productType");
        AbstractC16544l.m18094g(billingDebugMessage, "billingDebugMessage");
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.GOOGLE_QUERY_PURCHASES_REQUEST, AbstractC17659D.m19244f(new C17309l(PRODUCT_TYPE_QUERIED_KEY, productType), new C17309l(BILLING_RESPONSE_CODE, Integer.valueOf(billingResponseCode)), new C17309l(BILLING_DEBUG_MESSAGE, billingDebugMessage), new C17309l(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(C21555b.m21835e(responseTime)))), null, null, 12, null));
    }

    /* JADX INFO: renamed from: trackHttpRequestPerformed-NcHsxvU, reason: not valid java name */
    public final void m22509trackHttpRequestPerformedNcHsxvU(Endpoint endpoint, long responseTime, boolean wasSuccessful, int responseCode, HTTPResult.Origin resultOrigin, VerificationResult verificationResult) {
        AbstractC16544l.m18094g(endpoint, "endpoint");
        AbstractC16544l.m18094g(verificationResult, "verificationResult");
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.HTTP_REQUEST_PERFORMED, AbstractC17659D.m19244f(new C17309l(ENDPOINT_NAME_KEY, endpoint.getName()), new C17309l(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(C21555b.m21835e(responseTime))), new C17309l(SUCCESSFUL_KEY, Boolean.valueOf(wasSuccessful)), new C17309l(RESPONSE_CODE_KEY, Integer.valueOf(responseCode)), new C17309l(ETAG_HIT_KEY, Boolean.valueOf(resultOrigin == HTTPResult.Origin.CACHE)), new C17309l(VERIFICATION_RESULT_KEY, verificationResult.name())), null, null, 12, null));
    }

    public final void trackMaxDiagnosticsSyncRetriesReached() {
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.MAX_DIAGNOSTICS_SYNC_RETRIES_REACHED, C17690x.f56481Y, null, null, 12, null));
    }

    public final void trackMaxEventsStoredLimitReached(boolean useCurrentThread) {
        DiagnosticsEntry diagnosticsEntry = new DiagnosticsEntry(DiagnosticsEntryName.MAX_EVENTS_STORED_LIMIT_REACHED, C17690x.f56481Y, null, null, 12, null);
        if (useCurrentThread) {
            m14460x1c397bfa(diagnosticsEntry);
        } else {
            trackEvent(diagnosticsEntry);
        }
    }

    public final void trackErrorEnteringOfflineEntitlementsMode(PurchasesError error) {
        AbstractC16544l.m18094g(error, "error");
        String str = (error.getCode() == PurchasesErrorCode.UnsupportedError && AbstractC16544l.m18089b(error.getUnderlyingErrorMessage(), OfflineEntitlementsStrings.OFFLINE_ENTITLEMENTS_UNSUPPORTED_INAPP_PURCHASES)) ? "one_time_purchase_found" : "unknown";
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.ERROR_ENTERING_OFFLINE_ENTITLEMENTS_MODE, AbstractC17659D.m19244f(new C17309l("offline_entitlement_error_reason", str), new C17309l(TVCuK.cxvbULOeHMA, error.getMessage() + " Underlying error: " + error.getUnderlyingErrorMessage())), null, null, 12, null));
    }

    public final void trackProductDetailsNotSupported(int billingResponseCode, String billingDebugMessage) {
        AbstractC16544l.m18094g(billingDebugMessage, "billingDebugMessage");
        DiagnosticsEntryName diagnosticsEntryName = DiagnosticsEntryName.PRODUCT_DETAILS_NOT_SUPPORTED;
        String playStoreVersionName = this.appConfig.getPlayStoreVersionName();
        if (playStoreVersionName == null) {
            playStoreVersionName = "";
        }
        C17309l c17309l = new C17309l("play_store_version", playStoreVersionName);
        String playServicesVersionName = this.appConfig.getPlayServicesVersionName();
        trackEvent(new DiagnosticsEntry(diagnosticsEntryName, AbstractC17659D.m19244f(c17309l, new C17309l("play_services_version", playServicesVersionName != null ? playServicesVersionName : ""), new C17309l(BILLING_RESPONSE_CODE, Integer.valueOf(billingResponseCode)), new C17309l(EhBykzn.imCkMhFMZtpuRqv, billingDebugMessage)), null, null, 12, null));
    }
}
