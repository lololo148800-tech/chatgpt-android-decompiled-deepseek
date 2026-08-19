package com.revenuecat.purchases.common.offerings;

import android.os.Handler;
import android.os.Looper;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.utils.OfferingImagePreDownloader;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import org.json.JSONObject;
import p003A1.RunnableC0156C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p909nm.AbstractC17678l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJG\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00112\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJW\u0010$\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\b\b\u0002\u0010#\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b&\u0010'JM\u0010(\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.¨\u0006/"}, m18067d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsManager;", "", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "offeringsCache", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "offeringsFactory", "Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;", "offeringImagePreDownloader", "Landroid/os/Handler;", "mainHandler", "<init>", "(Lcom/revenuecat/purchases/common/offerings/OfferingsCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;Landroid/os/Handler;)V", "Lorg/json/JSONObject;", "offeringsJSON", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Lmm/C;", "onError", "Lcom/revenuecat/purchases/Offerings;", "onSuccess", "createAndCacheOfferings", "(Lorg/json/JSONObject;LBm/k;LBm/k;)V", "error", "handleErrorFetchingOfferings", "(Lcom/revenuecat/purchases/PurchasesError;LBm/k;)V", "Lkotlin/Function0;", "action", "dispatch", "(LBm/a;)V", "", "appUserID", "", "appInBackground", "fetchCurrent", "getOfferings", "(Ljava/lang/String;ZLBm/k;LBm/k;Z)V", "onAppForeground", "(Ljava/lang/String;)V", "fetchAndCacheOfferings", "(Ljava/lang/String;ZLBm/k;LBm/k;)V", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;", "Landroid/os/Handler;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class OfferingsManager {
    private final Backend backend;
    private final Handler mainHandler;
    private final OfferingImagePreDownloader offeringImagePreDownloader;
    private final OfferingsCache offeringsCache;
    private final OfferingsFactory offeringsFactory;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126951 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126951(InterfaceC1436k interfaceC1436k) {
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
            OfferingsManager.this.handleErrorFetchingOfferings(error, this.$onError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$2 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/Offerings;", "offerings", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/Offerings;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126962 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ JSONObject $offeringsJSON;
        final /* synthetic */ InterfaceC1436k $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$2$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1426a {
            final /* synthetic */ Offerings $offerings;
            final /* synthetic */ InterfaceC1436k $onSuccess;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC1436k interfaceC1436k, Offerings offerings) {
                super(0);
                this.$onSuccess = interfaceC1436k;
                this.$offerings = offerings;
            }

            @Override // p049Bm.InterfaceC1426a
            public /* bridge */ /* synthetic */ Object invoke() {
                m22512invoke();
                return C17296C.f55119a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m22512invoke() {
                InterfaceC1436k interfaceC1436k = this.$onSuccess;
                if (interfaceC1436k != null) {
                    interfaceC1436k.invoke(this.$offerings);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126962(JSONObject jSONObject, InterfaceC1436k interfaceC1436k) {
            super(1);
            this.$offeringsJSON = jSONObject;
            this.$onSuccess = interfaceC1436k;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Offerings) obj);
            return C17296C.f55119a;
        }

        public final void invoke(Offerings offerings) {
            AbstractC16544l.m18094g(offerings, "offerings");
            Offering current = offerings.getCurrent();
            if (current != null) {
                OfferingsManager.this.offeringImagePreDownloader.preDownloadOfferingImages(current);
            }
            OfferingsManager.this.offeringsCache.cacheOfferings(offerings, this.$offeringsJSON);
            OfferingsManager.this.dispatch(new AnonymousClass2(this.$onSuccess, offerings));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lorg/json/JSONObject;", "it", "Lmm/C;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126971 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $onError;
        final /* synthetic */ InterfaceC1436k $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126971(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
            super(1);
            this.$onError = interfaceC1436k;
            this.$onSuccess = interfaceC1436k2;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return C17296C.f55119a;
        }

        public final void invoke(JSONObject it) {
            AbstractC16544l.m18094g(it, "it");
            OfferingsManager.this.createAndCacheOfferings(it, this.$onError, this.$onSuccess);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$2 */
    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "", "isServerError", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126982 extends AbstractC16546n implements InterfaceC1439n {
        final /* synthetic */ InterfaceC1436k $onError;
        final /* synthetic */ InterfaceC1436k $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126982(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
            super(2);
            this.$onError = interfaceC1436k;
            this.$onSuccess = interfaceC1436k2;
        }

        @Override // p049Bm.InterfaceC1439n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError backendError, boolean z6) {
            AbstractC16544l.m18094g(backendError, "backendError");
            if (!z6) {
                OfferingsManager.this.handleErrorFetchingOfferings(backendError, this.$onError);
                return;
            }
            JSONObject cachedOfferingsResponse = OfferingsManager.this.offeringsCache.getCachedOfferingsResponse();
            if (cachedOfferingsResponse == null) {
                OfferingsManager.this.handleErrorFetchingOfferings(backendError, this.$onError);
            } else {
                LogUtilsKt.warnLog(OfferingStrings.ERROR_FETCHING_OFFERINGS_USING_DISK_CACHE);
                OfferingsManager.this.createAndCacheOfferings(cachedOfferingsResponse, this.$onError, this.$onSuccess);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$getOfferings$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126991 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ Offerings $cachedOfferings;
        final /* synthetic */ InterfaceC1436k $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126991(InterfaceC1436k interfaceC1436k, Offerings offerings) {
            super(0);
            this.$onSuccess = interfaceC1436k;
            this.$cachedOfferings = offerings;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22513invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22513invoke() {
            InterfaceC1436k interfaceC1436k = this.$onSuccess;
            if (interfaceC1436k != null) {
                interfaceC1436k.invoke(this.$cachedOfferings);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$handleErrorFetchingOfferings$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127001 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ PurchasesError $error;
        final /* synthetic */ InterfaceC1436k $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127001(InterfaceC1436k interfaceC1436k, PurchasesError purchasesError) {
            super(0);
            this.$onError = interfaceC1436k;
            this.$error = purchasesError;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22514invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22514invoke() {
            InterfaceC1436k interfaceC1436k = this.$onError;
            if (interfaceC1436k != null) {
                interfaceC1436k.invoke(this.$error);
            }
        }
    }

    public OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, OfferingImagePreDownloader offeringImagePreDownloader, Handler handler) {
        AbstractC16544l.m18094g(offeringsCache, "offeringsCache");
        AbstractC16544l.m18094g(backend, "backend");
        AbstractC16544l.m18094g(offeringsFactory, "offeringsFactory");
        AbstractC16544l.m18094g(offeringImagePreDownloader, "offeringImagePreDownloader");
        this.offeringsCache = offeringsCache;
        this.backend = backend;
        this.offeringsFactory = offeringsFactory;
        this.offeringImagePreDownloader = offeringImagePreDownloader;
        this.mainHandler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createAndCacheOfferings(JSONObject offeringsJSON, InterfaceC1436k onError, InterfaceC1436k onSuccess) {
        this.offeringsFactory.createOfferings(offeringsJSON, new C126951(onError), new C126962(offeringsJSON, onSuccess));
    }

    public static /* synthetic */ void createAndCacheOfferings$default(OfferingsManager offeringsManager, JSONObject jSONObject, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC1436k = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC1436k2 = null;
        }
        offeringsManager.createAndCacheOfferings(jSONObject, interfaceC1436k, interfaceC1436k2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(InterfaceC1426a action) {
        if (AbstractC16544l.m18089b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            action.invoke();
            return;
        }
        Handler handler = this.mainHandler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new RunnableC0156C(5, action));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatch$lambda$0(InterfaceC1426a tmp0) {
        AbstractC16544l.m18094g(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static /* synthetic */ void fetchAndCacheOfferings$default(OfferingsManager offeringsManager, String str, boolean z6, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC1436k = null;
        }
        if ((i10 & 8) != 0) {
            interfaceC1436k2 = null;
        }
        offeringsManager.fetchAndCacheOfferings(str, z6, interfaceC1436k, interfaceC1436k2);
    }

    public static /* synthetic */ void getOfferings$default(OfferingsManager offeringsManager, String str, boolean z6, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, boolean z10, int i10, Object obj) {
        InterfaceC1436k interfaceC1436k3 = (i10 & 4) != 0 ? null : interfaceC1436k;
        InterfaceC1436k interfaceC1436k4 = (i10 & 8) != 0 ? null : interfaceC1436k2;
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        offeringsManager.getOfferings(str, z6, interfaceC1436k3, interfaceC1436k4, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleErrorFetchingOfferings(PurchasesError error, InterfaceC1436k onError) {
        AbstractC12107L1.m13831v(new Object[]{error}, 1, OfferingStrings.FETCHING_OFFERINGS_ERROR, AbstractC17678l.m19293P(new PurchasesErrorCode[]{PurchasesErrorCode.ConfigurationError, PurchasesErrorCode.UnexpectedBackendResponseError}).contains(error.getCode()) ? LogIntent.RC_ERROR : LogIntent.GOOGLE_ERROR);
        this.offeringsCache.clearOfferingsCacheTimestamp();
        dispatch(new C127001(onError, error));
    }

    public final void fetchAndCacheOfferings(String appUserID, boolean appInBackground, InterfaceC1436k onError, InterfaceC1436k onSuccess) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        LogWrapperKt.log(LogIntent.RC_SUCCESS, OfferingStrings.OFFERINGS_START_UPDATE_FROM_NETWORK);
        this.backend.getOfferings(appUserID, appInBackground, new C126971(onError, onSuccess), new C126982(onError, onSuccess));
    }

    public final void getOfferings(String appUserID, boolean appInBackground, InterfaceC1436k onError, InterfaceC1436k onSuccess, boolean fetchCurrent) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        Offerings cachedOfferings = this.offeringsCache.getCachedOfferings();
        if (cachedOfferings == null) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.NO_CACHED_OFFERINGS_FETCHING_NETWORK);
            fetchAndCacheOfferings(appUserID, appInBackground, onError, onSuccess);
            return;
        }
        if (fetchCurrent) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.FORCE_OFFERINGS_FETCHING_NETWORK);
            fetchAndCacheOfferings(appUserID, appInBackground, onError, onSuccess);
            return;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, OfferingStrings.VENDING_OFFERINGS_CACHE);
        dispatch(new C126991(onSuccess, cachedOfferings));
        if (this.offeringsCache.isOfferingsCacheStale(appInBackground)) {
            LogWrapperKt.log(logIntent, appInBackground ? OfferingStrings.OFFERINGS_STALE_UPDATING_IN_BACKGROUND : OfferingStrings.OFFERINGS_STALE_UPDATING_IN_FOREGROUND);
            fetchAndCacheOfferings$default(this, appUserID, appInBackground, null, null, 12, null);
        }
    }

    public final void onAppForeground(String appUserID) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        if (this.offeringsCache.isOfferingsCacheStale(false)) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.OFFERINGS_STALE_UPDATING_IN_FOREGROUND);
            fetchAndCacheOfferings$default(this, appUserID, false, null, null, 12, null);
        }
    }

    public /* synthetic */ OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, OfferingImagePreDownloader offeringImagePreDownloader, Handler handler, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(offeringsCache, backend, offeringsFactory, offeringImagePreDownloader, (i10 & 16) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
