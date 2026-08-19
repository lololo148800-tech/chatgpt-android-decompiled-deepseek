package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.strings.ConfigureStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m18067d2 = {"Lcom/revenuecat/purchases/APIKeyValidator;", "", "<init>", "()V", "", "apiKey", "Lcom/revenuecat/purchases/APIKeyValidator$APIKeyPlatform;", "getApiKeyPlatform", "(Ljava/lang/String;)Lcom/revenuecat/purchases/APIKeyValidator$APIKeyPlatform;", "Lcom/revenuecat/purchases/Store;", "configuredStore", "Lmm/C;", "validateAndLog", "(Ljava/lang/String;Lcom/revenuecat/purchases/Store;)V", "Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;", "validate", "(Ljava/lang/String;Lcom/revenuecat/purchases/Store;)Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;", "APIKeyPlatform", "ValidationResult", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class APIKeyValidator {

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/revenuecat/purchases/APIKeyValidator$APIKeyPlatform;", "", "(Ljava/lang/String;I)V", "GOOGLE", "AMAZON", "LEGACY", "OTHER_PLATFORM", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public enum APIKeyPlatform {
        GOOGLE,
        AMAZON,
        LEGACY,
        OTHER_PLATFORM
    }

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m18067d2 = {"Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;", "", "(Ljava/lang/String;I)V", "VALID", "GOOGLE_KEY_AMAZON_STORE", "AMAZON_KEY_GOOGLE_STORE", "LEGACY", "OTHER_PLATFORM", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public enum ValidationResult {
        VALID,
        GOOGLE_KEY_AMAZON_STORE,
        AMAZON_KEY_GOOGLE_STORE,
        LEGACY,
        OTHER_PLATFORM
    }

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ValidationResult.values().length];
            try {
                iArr[ValidationResult.AMAZON_KEY_GOOGLE_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValidationResult.GOOGLE_KEY_AMAZON_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValidationResult.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ValidationResult.OTHER_PLATFORM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ValidationResult.VALID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final APIKeyPlatform getApiKeyPlatform(String apiKey) {
        if (AbstractC21329w.m21734u(apiKey, "goog_", false)) {
            return APIKeyPlatform.GOOGLE;
        }
        if (AbstractC21329w.m21734u(apiKey, "amzn_", false)) {
            return APIKeyPlatform.AMAZON;
        }
        return !AbstractC21322p.m21668B(apiKey, '_') ? APIKeyPlatform.LEGACY : APIKeyPlatform.OTHER_PLATFORM;
    }

    public final ValidationResult validate(String apiKey, Store configuredStore) {
        AbstractC16544l.m18094g(apiKey, "apiKey");
        AbstractC16544l.m18094g(configuredStore, "configuredStore");
        APIKeyPlatform apiKeyPlatform = getApiKeyPlatform(apiKey);
        APIKeyPlatform aPIKeyPlatform = APIKeyPlatform.GOOGLE;
        if (apiKeyPlatform == aPIKeyPlatform && configuredStore == Store.PLAY_STORE) {
            return ValidationResult.VALID;
        }
        APIKeyPlatform aPIKeyPlatform2 = APIKeyPlatform.AMAZON;
        if (apiKeyPlatform == aPIKeyPlatform2 && configuredStore == Store.AMAZON) {
            return ValidationResult.VALID;
        }
        if (apiKeyPlatform == aPIKeyPlatform && configuredStore == Store.AMAZON) {
            return ValidationResult.GOOGLE_KEY_AMAZON_STORE;
        }
        if (apiKeyPlatform == aPIKeyPlatform2 && configuredStore == Store.PLAY_STORE) {
            return ValidationResult.AMAZON_KEY_GOOGLE_STORE;
        }
        if (apiKeyPlatform == APIKeyPlatform.LEGACY) {
            return ValidationResult.LEGACY;
        }
        return apiKeyPlatform == APIKeyPlatform.OTHER_PLATFORM ? ValidationResult.OTHER_PLATFORM : ValidationResult.OTHER_PLATFORM;
    }

    public final void validateAndLog(String apiKey, Store configuredStore) {
        AbstractC16544l.m18094g(apiKey, "apiKey");
        AbstractC16544l.m18094g(configuredStore, "configuredStore");
        int i10 = WhenMappings.$EnumSwitchMapping$0[validate(apiKey, configuredStore).ordinal()];
        if (i10 == 1) {
            LogUtilsKt.errorLog$default(ConfigureStrings.AMAZON_API_KEY_GOOGLE_STORE, null, 2, null);
            return;
        }
        if (i10 == 2) {
            LogUtilsKt.errorLog$default(ConfigureStrings.GOOGLE_API_KEY_AMAZON_STORE, null, 2, null);
        } else if (i10 == 3) {
            LogUtilsKt.debugLog(ConfigureStrings.LEGACY_API_KEY);
        } else {
            if (i10 != 4) {
                return;
            }
            LogUtilsKt.errorLog$default(ConfigureStrings.INVALID_API_KEY, null, 2, null);
        }
    }
}
