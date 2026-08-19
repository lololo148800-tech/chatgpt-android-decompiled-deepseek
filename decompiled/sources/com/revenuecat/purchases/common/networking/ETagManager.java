package com.revenuecat.purchases.common.networking;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.NetworkStrings;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import mm.InterfaceC17306i;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p571X9.AbstractC9227W;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 =2\u00020\u0001:\u0001=B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u0017H\u0000¢\u0006\u0004\b \u0010!JM\u0010.\u001a\u0004\u0018\u00010\r2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b/\u00100J\u0019\u00104\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b2\u00103J'\u00107\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u00105\u001a\u00020\u000bH\u0000¢\u0006\u0004\b6\u0010\u0012J\u000f\u0010:\u001a\u00020\u0010H\u0000¢\u0006\u0004\b8\u00109R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010;R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010<¨\u0006>"}, m18067d2 = {"Lcom/revenuecat/purchases/common/networking/ETagManager;", "", "Landroid/content/Context;", "context", "Lmm/i;", "Landroid/content/SharedPreferences;", "prefs", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Landroid/content/Context;Lmm/i;Lcom/revenuecat/purchases/common/DateProvider;)V", "", "path", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "result", "eTag", "Lmm/C;", "storeResult", "(Ljava/lang/String;Lcom/revenuecat/purchases/common/networking/HTTPResult;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/common/networking/HTTPResultWithETag;", "getStoredResultSavedInSharedPreferences", "(Ljava/lang/String;)Lcom/revenuecat/purchases/common/networking/HTTPResultWithETag;", "resultFromBackend", "", "shouldStoreBackendResult", "(Lcom/revenuecat/purchases/common/networking/HTTPResult;)Z", "storedResult", "verificationRequested", "shouldUseETag", "(Lcom/revenuecat/purchases/common/networking/HTTPResultWithETag;Z)Z", "refreshETag", "", "getETagHeaders$purchases_customEntitlementComputationRelease", "(Ljava/lang/String;ZZ)Ljava/util/Map;", "getETagHeaders", "", "responseCode", "payload", "eTagHeader", "urlPathWithVersion", "Ljava/util/Date;", "requestDate", "Lcom/revenuecat/purchases/VerificationResult;", "verificationResult", "getHTTPResultFromCacheOrBackend$purchases_customEntitlementComputationRelease", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Lcom/revenuecat/purchases/VerificationResult;)Lcom/revenuecat/purchases/common/networking/HTTPResult;", "getHTTPResultFromCacheOrBackend", "shouldUseCachedVersion$purchases_customEntitlementComputationRelease", "(I)Z", "shouldUseCachedVersion", "getStoredResult$purchases_customEntitlementComputationRelease", "(Ljava/lang/String;)Lcom/revenuecat/purchases/common/networking/HTTPResult;", "getStoredResult", "eTagInResponse", "storeBackendResultIfNoError$purchases_customEntitlementComputationRelease", "storeBackendResultIfNoError", "clearCaches$purchases_customEntitlementComputationRelease", "()V", "clearCaches", "Lmm/i;", "Lcom/revenuecat/purchases/common/DateProvider;", "Companion", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ETagManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final DateProvider dateProvider;
    private final InterfaceC17306i prefs;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.networking.ETagManager$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18067d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "invoke"}, m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class C126901 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126901(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // p049Bm.InterfaceC1426a
        public final SharedPreferences invoke() {
            return ETagManager.INSTANCE.initializeSharedPreferences(this.$context);
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/revenuecat/purchases/common/networking/ETagManager$Companion;", "", "()V", "initializeSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SharedPreferences initializeSharedPreferences(Context context) {
            AbstractC16544l.m18094g(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences_etags", 0);
            AbstractC16544l.m18093f(sharedPreferences, "context.getSharedPrefere…DE_PRIVATE,\n            )");
            return sharedPreferences;
        }

        private Companion() {
        }
    }

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationResult.values().length];
            try {
                iArr[VerificationResult.VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationResult.NOT_REQUESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationResult.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VerificationResult.VERIFIED_ON_DEVICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ETagManager(Context context, InterfaceC17306i prefs, DateProvider dateProvider) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(prefs, "prefs");
        AbstractC16544l.m18094g(dateProvider, "dateProvider");
        this.prefs = prefs;
        this.dateProvider = dateProvider;
    }

    /* JADX INFO: renamed from: getETagHeaders$purchases_customEntitlementComputationRelease$default */
    public static /* synthetic */ Map m14461xfe12fe83(ETagManager eTagManager, String str, boolean z6, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return eTagManager.getETagHeaders$purchases_customEntitlementComputationRelease(str, z6, z10);
    }

    private final HTTPResultWithETag getStoredResultSavedInSharedPreferences(String path) {
        String string = ((SharedPreferences) this.prefs.getValue()).getString(path, null);
        if (string != null) {
            return HTTPResultWithETag.INSTANCE.deserialize(string);
        }
        return null;
    }

    private final boolean shouldStoreBackendResult(HTTPResult resultFromBackend) {
        int responseCode = resultFromBackend.getResponseCode();
        return (responseCode == 304 || responseCode >= 500 || resultFromBackend.getVerificationResult() == VerificationResult.FAILED) ? false : true;
    }

    private final boolean shouldUseETag(HTTPResultWithETag storedResult, boolean verificationRequested) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[storedResult.getHttpResult().getVerificationResult().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                throw new C0644w();
            }
        } else if (!verificationRequested) {
            return true;
        }
        return false;
    }

    private final synchronized void storeResult(String path, HTTPResult result, String eTag) {
        ((SharedPreferences) this.prefs.getValue()).edit().putString(path, new HTTPResultWithETag(new ETagData(eTag, this.dateProvider.getNow()), HTTPResult.copy$default(result, 0, null, HTTPResult.Origin.CACHE, null, null, 27, null)).serialize()).apply();
    }

    public final synchronized void clearCaches$purchases_customEntitlementComputationRelease() {
        ((SharedPreferences) this.prefs.getValue()).edit().clear().apply();
    }

    public final Map<String, String> getETagHeaders$purchases_customEntitlementComputationRelease(String path, boolean verificationRequested, boolean refreshETag) {
        ETagData eTagData;
        Date lastRefreshTime;
        AbstractC16544l.m18094g(path, "path");
        String string = null;
        HTTPResultWithETag storedResultSavedInSharedPreferences = refreshETag ? null : getStoredResultSavedInSharedPreferences(path);
        if (storedResultSavedInSharedPreferences == null || (eTagData = storedResultSavedInSharedPreferences.getETagData()) == null || !shouldUseETag(storedResultSavedInSharedPreferences, verificationRequested)) {
            eTagData = null;
        }
        String eTag = eTagData != null ? eTagData.getETag() : null;
        if (eTag == null) {
            eTag = "";
        }
        C17309l c17309l = new C17309l("X-RevenueCat-ETag", eTag);
        if (eTagData != null && (lastRefreshTime = eTagData.getLastRefreshTime()) != null) {
            string = Long.valueOf(lastRefreshTime.getTime()).toString();
        }
        return AbstractC17659D.m19244f(c17309l, new C17309l(HTTPRequest.ETAG_LAST_REFRESH_NAME, string));
    }

    /* JADX INFO: renamed from: getHTTPResultFromCacheOrBackend$purchases_customEntitlementComputationRelease */
    public final HTTPResult m14462x4bec99f(int responseCode, String payload, String eTagHeader, String urlPathWithVersion, boolean refreshETag, Date requestDate, VerificationResult verificationResult) {
        HTTPResult hTTPResultCopy$default;
        AbstractC16544l.m18094g(payload, "payload");
        AbstractC16544l.m18094g(urlPathWithVersion, "urlPathWithVersion");
        AbstractC16544l.m18094g(verificationResult, "verificationResult");
        HTTPResult hTTPResult = new HTTPResult(responseCode, payload, HTTPResult.Origin.BACKEND, requestDate, verificationResult);
        if (eTagHeader != null) {
            if (m14463xa31f25ed(responseCode)) {
                HTTPResult storedResult$purchases_customEntitlementComputationRelease = getStoredResult$purchases_customEntitlementComputationRelease(urlPathWithVersion);
                if (storedResult$purchases_customEntitlementComputationRelease != null) {
                    hTTPResultCopy$default = HTTPResult.copy$default(storedResult$purchases_customEntitlementComputationRelease, 0, null, null, requestDate == null ? storedResult$purchases_customEntitlementComputationRelease.getRequestDate() : requestDate, verificationResult, 7, null);
                } else {
                    hTTPResultCopy$default = null;
                }
                if (hTTPResultCopy$default != null) {
                    return hTTPResultCopy$default;
                }
                if (!refreshETag) {
                    return null;
                }
                AbstractC12107L1.m13831v(new Object[]{hTTPResult}, 1, NetworkStrings.ETAG_CALL_ALREADY_RETRIED, LogIntent.WARNING);
                return hTTPResult;
            }
            m14464x745f1365(urlPathWithVersion, hTTPResult, eTagHeader);
        }
        return hTTPResult;
    }

    public final HTTPResult getStoredResult$purchases_customEntitlementComputationRelease(String path) {
        AbstractC16544l.m18094g(path, "path");
        HTTPResultWithETag storedResultSavedInSharedPreferences = getStoredResultSavedInSharedPreferences(path);
        if (storedResultSavedInSharedPreferences != null) {
            return storedResultSavedInSharedPreferences.getHttpResult();
        }
        return null;
    }

    /* JADX INFO: renamed from: shouldUseCachedVersion$purchases_customEntitlementComputationRelease */
    public final boolean m14463xa31f25ed(int responseCode) {
        return responseCode == 304;
    }

    /* JADX INFO: renamed from: storeBackendResultIfNoError$purchases_customEntitlementComputationRelease */
    public final void m14464x745f1365(String path, HTTPResult resultFromBackend, String eTagInResponse) {
        AbstractC16544l.m18094g(path, "path");
        AbstractC16544l.m18094g(resultFromBackend, "resultFromBackend");
        AbstractC16544l.m18094g(eTagInResponse, "eTagInResponse");
        if (shouldStoreBackendResult(resultFromBackend)) {
            storeResult(path, resultFromBackend, eTagInResponse);
        }
    }

    public /* synthetic */ ETagManager(Context context, InterfaceC17306i interfaceC17306i, DateProvider dateProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? AbstractC9227W.m9800c(new C126901(context)) : interfaceC17306i, (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
