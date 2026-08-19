package com.revenuecat.purchases.common;

import android.content.Context;
import com.revenuecat.purchases.DangerousSettings;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.PurchasesAreCompletedByKt;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.api.BuildConfig;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.strings.ConfigureStrings;
import java.net.URL;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p003A1.AbstractC0168G;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 <2\u00020\u0001:\u0001<B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007¢\u0006\u0002\u0010\u0013J\u0013\u00107\u001a\u00020\u00072\b\u00108\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020'H\u0016R\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010!R\u001c\u0010\u0011\u001a\u00020\u00078FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010!R\u001c\u0010\u0012\u001a\u00020\u00078FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010!R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010.\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0013\u00100\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u00105\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b6\u0010)¨\u0006="}, m18067d2 = {"Lcom/revenuecat/purchases/common/AppConfig;", "", "context", "Landroid/content/Context;", "purchasesAreCompletedBy", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "showInAppMessagesAutomatically", "", "platformInfo", "Lcom/revenuecat/purchases/common/PlatformInfo;", "proxyURL", "Ljava/net/URL;", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "dangerousSettings", "Lcom/revenuecat/purchases/DangerousSettings;", "runningTests", "forceServerErrors", "forceSigningErrors", "(Landroid/content/Context;Lcom/revenuecat/purchases/PurchasesAreCompletedBy;ZLcom/revenuecat/purchases/common/PlatformInfo;Ljava/net/URL;Lcom/revenuecat/purchases/Store;Lcom/revenuecat/purchases/DangerousSettings;ZZZ)V", "baseURL", "getBaseURL", "()Ljava/net/URL;", BuildConfig.FLAVOR, "getCustomEntitlementComputation", "()Z", "getDangerousSettings", "()Lcom/revenuecat/purchases/DangerousSettings;", "enableOfflineEntitlements", "getEnableOfflineEntitlements", "finishTransactions", "getFinishTransactions", "setFinishTransactions", "(Z)V", "getForceServerErrors", "setForceServerErrors", "getForceSigningErrors", "setForceSigningErrors", "languageTag", "", "getLanguageTag", "()Ljava/lang/String;", "packageName", "getPackageName", "getPlatformInfo", "()Lcom/revenuecat/purchases/common/PlatformInfo;", "playServicesVersionName", "getPlayServicesVersionName", "playStoreVersionName", "getPlayStoreVersionName", "getShowInAppMessagesAutomatically", "getStore", "()Lcom/revenuecat/purchases/Store;", "versionName", "getVersionName", "equals", "other", "hashCode", "", "toString", "Companion", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AppConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final URL diagnosticsURL = new URL("https://api-diagnostics.revenuecat.com/");
    private static final URL paywallEventsURL = new URL("https://api-paywalls.revenuecat.com/");
    private final URL baseURL;
    private final DangerousSettings dangerousSettings;
    private final boolean enableOfflineEntitlements;
    private boolean finishTransactions;
    private boolean forceServerErrors;
    private boolean forceSigningErrors;
    private final String languageTag;
    private final String packageName;
    private final PlatformInfo platformInfo;
    private final String playServicesVersionName;
    private final String playStoreVersionName;
    private final boolean runningTests;
    private final boolean showInAppMessagesAutomatically;
    private final Store store;
    private final String versionName;

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m18067d2 = {"Lcom/revenuecat/purchases/common/AppConfig$Companion;", "", "()V", "diagnosticsURL", "Ljava/net/URL;", "getDiagnosticsURL", "()Ljava/net/URL;", "paywallEventsURL", "getPaywallEventsURL", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final URL getDiagnosticsURL() {
            return AppConfig.diagnosticsURL;
        }

        public final URL getPaywallEventsURL() {
            return AppConfig.paywallEventsURL;
        }

        private Companion() {
        }
    }

    public AppConfig(Context context, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z6, PlatformInfo platformInfo, URL url, Store store, DangerousSettings dangerousSettings, boolean z10, boolean z11, boolean z12) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        AbstractC16544l.m18094g(platformInfo, "platformInfo");
        AbstractC16544l.m18094g(store, "store");
        AbstractC16544l.m18094g(dangerousSettings, "dangerousSettings");
        this.showInAppMessagesAutomatically = z6;
        this.platformInfo = platformInfo;
        this.store = store;
        this.dangerousSettings = dangerousSettings;
        this.runningTests = z10;
        this.forceServerErrors = z11;
        this.forceSigningErrors = z12;
        this.enableOfflineEntitlements = true;
        Locale locale = UtilsKt.getLocale(context);
        String languageTag = locale != null ? locale.toLanguageTag() : null;
        this.languageTag = languageTag == null ? "" : languageTag;
        String versionName = UtilsKt.getVersionName(context);
        this.versionName = versionName != null ? versionName : "";
        String packageName = context.getPackageName();
        AbstractC16544l.m18093f(packageName, "context.packageName");
        this.packageName = packageName;
        this.finishTransactions = PurchasesAreCompletedByKt.getFinishTransactions(purchasesAreCompletedBy);
        if (url != null) {
            LogWrapperKt.log(LogIntent.INFO, ConfigureStrings.CONFIGURING_PURCHASES_PROXY_URL_SET);
        } else {
            url = new URL("https://api.revenuecat.com/");
        }
        this.baseURL = url;
        this.playStoreVersionName = UtilsKt.getPlayStoreVersionName(context);
        this.playServicesVersionName = UtilsKt.getPlayServicesVersionName(context);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!AppConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC16544l.m18092e(other, "null cannot be cast to non-null type com.revenuecat.purchases.common.AppConfig");
        AppConfig appConfig = (AppConfig) other;
        return AbstractC16544l.m18089b(this.platformInfo, appConfig.platformInfo) && this.store == appConfig.store && AbstractC16544l.m18089b(this.dangerousSettings, appConfig.dangerousSettings) && AbstractC16544l.m18089b(this.languageTag, appConfig.languageTag) && AbstractC16544l.m18089b(this.versionName, appConfig.versionName) && AbstractC16544l.m18089b(this.packageName, appConfig.packageName) && this.finishTransactions == appConfig.finishTransactions && getForceServerErrors() == appConfig.getForceServerErrors() && getForceSigningErrors() == appConfig.getForceSigningErrors() && AbstractC16544l.m18089b(this.baseURL, appConfig.baseURL) && this.showInAppMessagesAutomatically == appConfig.showInAppMessagesAutomatically;
    }

    public final URL getBaseURL() {
        return this.baseURL;
    }

    public final boolean getCustomEntitlementComputation() {
        return this.dangerousSettings.m14407x834cae6c();
    }

    public final DangerousSettings getDangerousSettings() {
        return this.dangerousSettings;
    }

    public final boolean getEnableOfflineEntitlements() {
        return this.enableOfflineEntitlements;
    }

    public final boolean getFinishTransactions() {
        return this.finishTransactions;
    }

    public final boolean getForceServerErrors() {
        return this.runningTests && this.forceServerErrors;
    }

    public final boolean getForceSigningErrors() {
        return this.runningTests && this.forceSigningErrors;
    }

    public final String getLanguageTag() {
        return this.languageTag;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final PlatformInfo getPlatformInfo() {
        return this.platformInfo;
    }

    public final String getPlayServicesVersionName() {
        return this.playServicesVersionName;
    }

    public final String getPlayStoreVersionName() {
        return this.playStoreVersionName;
    }

    public final boolean getShowInAppMessagesAutomatically() {
        return this.showInAppMessagesAutomatically;
    }

    public final Store getStore() {
        return this.store;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return ((this.baseURL.hashCode() + ((((((AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p((this.dangerousSettings.hashCode() + ((this.store.hashCode() + (this.platformInfo.hashCode() * 31)) * 31)) * 31, 31, this.languageTag), 31, this.versionName), 31, this.packageName) + (this.finishTransactions ? 1231 : 1237)) * 31) + (getForceServerErrors() ? 1231 : 1237)) * 31) + (getForceSigningErrors() ? 1231 : 1237)) * 31)) * 31) + (this.showInAppMessagesAutomatically ? 1231 : 1237);
    }

    public final void setFinishTransactions(boolean z6) {
        this.finishTransactions = z6;
    }

    public final void setForceServerErrors(boolean z6) {
        this.forceServerErrors = z6;
    }

    public final void setForceSigningErrors(boolean z6) {
        this.forceSigningErrors = z6;
    }

    public String toString() {
        return "AppConfig(platformInfo=" + this.platformInfo + ", store=" + this.store + ", dangerousSettings=" + this.dangerousSettings + ", languageTag='" + this.languageTag + "', versionName='" + this.versionName + "', packageName='" + this.packageName + "', finishTransactions=" + this.finishTransactions + ", showInAppMessagesAutomatically=" + this.showInAppMessagesAutomatically + ", baseURL=" + this.baseURL + ')';
    }

    public /* synthetic */ AppConfig(Context context, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z6, PlatformInfo platformInfo, URL url, Store store, DangerousSettings dangerousSettings, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, purchasesAreCompletedBy, z6, platformInfo, url, store, (i10 & 64) != 0 ? new DangerousSettings(true) : dangerousSettings, (i10 & 128) != 0 ? false : z10, (i10 & 256) != 0 ? false : z11, (i10 & 512) != 0 ? false : z12);
    }
}
