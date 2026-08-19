package com.revenuecat.purchases;

import android.content.Context;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17300c;
import p025An.C0644w;
import p1113xn.AbstractC21322p;
import p211I8.lPE.sRXLFOsOgS;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001/B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u00060"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesConfiguration;", "", "builder", "Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;", "(Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;)V", "apiKey", "", "getApiKey", "()Ljava/lang/String;", "appUserID", "getAppUserID", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "dangerousSettings", "Lcom/revenuecat/purchases/DangerousSettings;", "getDangerousSettings", "()Lcom/revenuecat/purchases/DangerousSettings;", "diagnosticsEnabled", "", "getDiagnosticsEnabled", "()Z", "observerMode", "getObserverMode$annotations", "()V", "getObserverMode", "pendingTransactionsForPrepaidPlansEnabled", "getPendingTransactionsForPrepaidPlansEnabled", "purchasesAreCompletedBy", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "getPurchasesAreCompletedBy", "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", ReferencesHeader.SERVICE, "Ljava/util/concurrent/ExecutorService;", "getService", "()Ljava/util/concurrent/ExecutorService;", "showInAppMessagesAutomatically", "getShowInAppMessagesAutomatically", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "getStore", "()Lcom/revenuecat/purchases/Store;", "verificationMode", "Lcom/revenuecat/purchases/EntitlementVerificationMode;", "getVerificationMode", "()Lcom/revenuecat/purchases/EntitlementVerificationMode;", "Builder", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public class PurchasesConfiguration {
    private final String apiKey;
    private final String appUserID;
    private final Context context;
    private final DangerousSettings dangerousSettings;
    private final boolean diagnosticsEnabled;
    private final boolean pendingTransactionsForPrepaidPlansEnabled;
    private final PurchasesAreCompletedBy purchasesAreCompletedBy;
    private final ExecutorService service;
    private final boolean showInAppMessagesAutomatically;
    private final Store store;
    private final EntitlementVerificationMode verificationMode;

    @Metadata(m18066d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\b\u0010:\u001a\u00020;H\u0016J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010<\u001a\u00020\u00002\u0006\u00105\u001a\u000204J\u0010\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0016H\u0007J\u0010\u0010?\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0016H\u0007J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0016J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0016J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR*\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00058@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00168@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\u001c\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00168@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR&\u0010 \u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u001f8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\t\u001a\u0004\u0018\u00010%8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R&\u0010+\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00168@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR&\u0010/\u001a\u00020.2\u0006\u0010\t\u001a\u00020.8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R&\u00105\u001a\u0002042\u0006\u0010\t\u001a\u0002048@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006@"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;", "", "context", "Landroid/content/Context;", "apiKey", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getApiKey$purchases_customEntitlementComputationRelease", "()Ljava/lang/String;", "<set-?>", "appUserID", "getAppUserID$purchases_customEntitlementComputationRelease", "setAppUserID$purchases_customEntitlementComputationRelease", "(Ljava/lang/String;)V", "getContext$purchases_customEntitlementComputationRelease", "()Landroid/content/Context;", "Lcom/revenuecat/purchases/DangerousSettings;", "dangerousSettings", "getDangerousSettings$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/DangerousSettings;", "setDangerousSettings$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/DangerousSettings;)V", "", "diagnosticsEnabled", "getDiagnosticsEnabled$purchases_customEntitlementComputationRelease", "()Z", "setDiagnosticsEnabled$purchases_customEntitlementComputationRelease", "(Z)V", "pendingTransactionsForPrepaidPlansEnabled", "getPendingTransactionsForPrepaidPlansEnabled$purchases_customEntitlementComputationRelease", "setPendingTransactionsForPrepaidPlansEnabled$purchases_customEntitlementComputationRelease", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "purchasesAreCompletedBy", "getPurchasesAreCompletedBy$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "setPurchasesAreCompletedBy$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/PurchasesAreCompletedBy;)V", "Ljava/util/concurrent/ExecutorService;", ReferencesHeader.SERVICE, "getService$purchases_customEntitlementComputationRelease", "()Ljava/util/concurrent/ExecutorService;", "setService$purchases_customEntitlementComputationRelease", "(Ljava/util/concurrent/ExecutorService;)V", "showInAppMessagesAutomatically", "getShowInAppMessagesAutomatically$purchases_customEntitlementComputationRelease", "setShowInAppMessagesAutomatically$purchases_customEntitlementComputationRelease", "Lcom/revenuecat/purchases/Store;", ProductResponseJsonKeys.STORE, "getStore$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/Store;", "setStore$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/Store;)V", "Lcom/revenuecat/purchases/EntitlementVerificationMode;", "verificationMode", "getVerificationMode$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/EntitlementVerificationMode;", "setVerificationMode$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/EntitlementVerificationMode;)V", "build", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "entitlementVerificationMode", "informationalVerificationModeAndDiagnosticsEnabled", "enabled", "observerMode", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static class Builder {
        private final String apiKey;
        private String appUserID;
        private final Context context;
        private DangerousSettings dangerousSettings;
        private boolean diagnosticsEnabled;
        private boolean pendingTransactionsForPrepaidPlansEnabled;
        private PurchasesAreCompletedBy purchasesAreCompletedBy;
        private ExecutorService service;
        private boolean showInAppMessagesAutomatically;
        private Store store;
        private EntitlementVerificationMode verificationMode;

        public Builder(Context context, String apiKey) {
            AbstractC16544l.m18094g(context, "context");
            AbstractC16544l.m18094g(apiKey, "apiKey");
            this.context = context;
            this.apiKey = apiKey;
            this.purchasesAreCompletedBy = PurchasesAreCompletedBy.REVENUECAT;
            this.showInAppMessagesAutomatically = true;
            this.store = Store.PLAY_STORE;
            this.verificationMode = EntitlementVerificationMode.INSTANCE.getDefault();
            this.dangerousSettings = new DangerousSettings(false, 1, null);
        }

        public final Builder appUserID(String appUserID) {
            this.appUserID = appUserID;
            return this;
        }

        public PurchasesConfiguration build() {
            return new PurchasesConfiguration(this);
        }

        public final Builder dangerousSettings(DangerousSettings dangerousSettings) {
            AbstractC16544l.m18094g(dangerousSettings, "dangerousSettings");
            this.dangerousSettings = dangerousSettings;
            return this;
        }

        public final Builder diagnosticsEnabled(boolean diagnosticsEnabled) {
            this.diagnosticsEnabled = diagnosticsEnabled;
            return this;
        }

        public final Builder entitlementVerificationMode(EntitlementVerificationMode verificationMode) {
            AbstractC16544l.m18094g(verificationMode, "verificationMode");
            this.verificationMode = verificationMode;
            return this;
        }

        /* JADX INFO: renamed from: getApiKey$purchases_customEntitlementComputationRelease, reason: from getter */
        public final /* synthetic */ String getApiKey() {
            return this.apiKey;
        }

        /* JADX INFO: renamed from: getAppUserID$purchases_customEntitlementComputationRelease, reason: from getter */
        public final /* synthetic */ String getAppUserID() {
            return this.appUserID;
        }

        /* JADX INFO: renamed from: getContext$purchases_customEntitlementComputationRelease, reason: from getter */
        public final /* synthetic */ Context getContext() {
            return this.context;
        }

        /* JADX INFO: renamed from: getDangerousSettings$purchases_customEntitlementComputationRelease, reason: from getter */
        public final /* synthetic */ DangerousSettings getDangerousSettings() {
            return this.dangerousSettings;
        }

        /* JADX INFO: renamed from: getDiagnosticsEnabled$purchases_customEntitlementComputationRelease, reason: from getter */
        public final /* synthetic */ boolean getDiagnosticsEnabled() {
            return this.diagnosticsEnabled;
        }

        /* JADX INFO: renamed from: getPendingTransactionsForPrepaidPlansEnabled$purchases_customEntitlementComputationRelease, reason: from getter */
        public final /* synthetic */ boolean getPendingTransactionsForPrepaidPlansEnabled() {
            return this.pendingTransactionsForPrepaidPlansEnabled;
        }

        /* JADX INFO: renamed from: getPurchasesAreCompletedBy$purchases_customEntitlementComputationRelease, reason: from getter */
        public final /* synthetic */ PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
            return this.purchasesAreCompletedBy;
        }

        /* JADX INFO: renamed from: getService$purchases_customEntitlementComputationRelease, reason: from getter */
        public final /* synthetic */ ExecutorService getService() {
            return this.service;
        }

        /* JADX INFO: renamed from: getShowInAppMessagesAutomatically$purchases_customEntitlementComputationRelease, reason: from getter */
        public final /* synthetic */ boolean getShowInAppMessagesAutomatically() {
            return this.showInAppMessagesAutomatically;
        }

        /* JADX INFO: renamed from: getStore$purchases_customEntitlementComputationRelease, reason: from getter */
        public final /* synthetic */ Store getStore() {
            return this.store;
        }

        /* JADX INFO: renamed from: getVerificationMode$purchases_customEntitlementComputationRelease, reason: from getter */
        public final /* synthetic */ EntitlementVerificationMode getVerificationMode() {
            return this.verificationMode;
        }

        @InterfaceC17300c
        public final /* synthetic */ Builder informationalVerificationModeAndDiagnosticsEnabled(boolean enabled) {
            if (enabled) {
                this.verificationMode = EntitlementVerificationMode.INFORMATIONAL;
                this.diagnosticsEnabled = true;
            } else {
                this.verificationMode = EntitlementVerificationMode.DISABLED;
                this.diagnosticsEnabled = false;
            }
            return this;
        }

        @InterfaceC17300c
        public final Builder observerMode(boolean observerMode) {
            purchasesAreCompletedBy(observerMode ? PurchasesAreCompletedBy.MY_APP : PurchasesAreCompletedBy.REVENUECAT);
            return this;
        }

        public final Builder pendingTransactionsForPrepaidPlansEnabled(boolean pendingTransactionsForPrepaidPlansEnabled) {
            this.pendingTransactionsForPrepaidPlansEnabled = pendingTransactionsForPrepaidPlansEnabled;
            return this;
        }

        public final Builder purchasesAreCompletedBy(PurchasesAreCompletedBy purchasesAreCompletedBy) {
            AbstractC16544l.m18094g(purchasesAreCompletedBy, "purchasesAreCompletedBy");
            this.purchasesAreCompletedBy = purchasesAreCompletedBy;
            return this;
        }

        public final Builder service(ExecutorService service) {
            AbstractC16544l.m18094g(service, "service");
            this.service = service;
            return this;
        }

        public final /* synthetic */ void setAppUserID$purchases_customEntitlementComputationRelease(String str) {
            this.appUserID = str;
        }

        /* JADX INFO: renamed from: setDiagnosticsEnabled$purchases_customEntitlementComputationRelease */
        public final /* synthetic */ void m14427x1faa4242(boolean z6) {
            this.diagnosticsEnabled = z6;
        }

        /* JADX INFO: renamed from: setPendingTransactionsForPrepaidPlansEnabled$purchases_customEntitlementComputationRelease */
        public final /* synthetic */ void m14428xc9483732(boolean z6) {
            this.pendingTransactionsForPrepaidPlansEnabled = z6;
        }

        /* JADX INFO: renamed from: setPurchasesAreCompletedBy$purchases_customEntitlementComputationRelease */
        public final /* synthetic */ void m14429x95f05089(PurchasesAreCompletedBy purchasesAreCompletedBy) {
            AbstractC16544l.m18094g(purchasesAreCompletedBy, "<set-?>");
            this.purchasesAreCompletedBy = purchasesAreCompletedBy;
        }

        public final /* synthetic */ void setService$purchases_customEntitlementComputationRelease(ExecutorService executorService) {
            this.service = executorService;
        }

        /* JADX INFO: renamed from: setShowInAppMessagesAutomatically$purchases_customEntitlementComputationRelease */
        public final /* synthetic */ void m14430xbf95c745(boolean z6) {
            this.showInAppMessagesAutomatically = z6;
        }

        public final /* synthetic */ void setStore$purchases_customEntitlementComputationRelease(Store store) {
            AbstractC16544l.m18094g(store, "<set-?>");
            this.store = store;
        }

        /* JADX INFO: renamed from: setVerificationMode$purchases_customEntitlementComputationRelease */
        public final /* synthetic */ void m14431xb170196b(EntitlementVerificationMode entitlementVerificationMode) {
            AbstractC16544l.m18094g(entitlementVerificationMode, "<set-?>");
            this.verificationMode = entitlementVerificationMode;
        }

        public final Builder showInAppMessagesAutomatically(boolean showInAppMessagesAutomatically) {
            this.showInAppMessagesAutomatically = showInAppMessagesAutomatically;
            return this;
        }

        public final Builder store(Store store) {
            AbstractC16544l.m18094g(store, "store");
            this.store = store;
            return this;
        }

        /* JADX INFO: renamed from: setDangerousSettings$purchases_customEntitlementComputationRelease */
        public final /* synthetic */ void m14426x3457e796(DangerousSettings dangerousSettings) {
            AbstractC16544l.m18094g(dangerousSettings, sRXLFOsOgS.TKwuJRjqEMC);
            this.dangerousSettings = dangerousSettings;
        }
    }

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchasesAreCompletedBy.values().length];
            try {
                iArr[PurchasesAreCompletedBy.REVENUECAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchasesAreCompletedBy.MY_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PurchasesConfiguration(Builder builder) {
        AbstractC16544l.m18094g(builder, "builder");
        this.context = builder.getContext();
        this.apiKey = AbstractC21322p.m21711s0(builder.getApiKey()).toString();
        this.appUserID = builder.getAppUserID();
        this.purchasesAreCompletedBy = builder.getPurchasesAreCompletedBy();
        this.service = builder.getService();
        this.store = builder.getStore();
        this.diagnosticsEnabled = builder.getDiagnosticsEnabled();
        this.verificationMode = builder.getVerificationMode();
        this.dangerousSettings = builder.getDangerousSettings();
        this.showInAppMessagesAutomatically = builder.getShowInAppMessagesAutomatically();
        this.pendingTransactionsForPrepaidPlansEnabled = builder.getPendingTransactionsForPrepaidPlansEnabled();
    }

    @InterfaceC17300c
    public static /* synthetic */ void getObserverMode$annotations() {
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getAppUserID() {
        return this.appUserID;
    }

    public final Context getContext() {
        return this.context;
    }

    public final DangerousSettings getDangerousSettings() {
        return this.dangerousSettings;
    }

    public final boolean getDiagnosticsEnabled() {
        return this.diagnosticsEnabled;
    }

    public final boolean getObserverMode() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.purchasesAreCompletedBy.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        throw new C0644w();
    }

    public final boolean getPendingTransactionsForPrepaidPlansEnabled() {
        return this.pendingTransactionsForPrepaidPlansEnabled;
    }

    public final PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchasesAreCompletedBy;
    }

    public final ExecutorService getService() {
        return this.service;
    }

    public final boolean getShowInAppMessagesAutomatically() {
        return this.showInAppMessagesAutomatically;
    }

    public final Store getStore() {
        return this.store;
    }

    public final EntitlementVerificationMode getVerificationMode() {
        return this.verificationMode;
    }
}
