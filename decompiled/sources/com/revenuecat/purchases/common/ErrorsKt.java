package com.revenuecat.purchases.common;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.verification.SignatureVerificationException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import org.json.JSONException;
import p025An.C0644w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0005H\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\u00060\u0006j\u0002`\u0007H\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0002H\u0002¨\u0006\n"}, m18067d2 = {"toPurchasesError", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/common/BackendErrorCode;", "underlyingErrorMessage", "", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "toPurchasesErrorCode", "Lcom/revenuecat/purchases/PurchasesErrorCode;", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ErrorsKt {

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BackendErrorCode.values().length];
            try {
                iArr[BackendErrorCode.BackendStoreProblem.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BackendErrorCode.BackendCannotTransferPurchase.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidReceiptToken.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidPlayStoreCredentials.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidAuthToken.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidAPIKey.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidPaymentModeOrIntroPriceNotProvided.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BackendErrorCode.BackendProductIdForGoogleReceiptNotProvided.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BackendErrorCode.BackendEmptyAppUserId.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BackendErrorCode.BackendPlayStoreQuotaExceeded.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BackendErrorCode.BackendPlayStoreInvalidPackageName.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidPlatform.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BackendErrorCode.BackendPlayStoreGenericError.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BackendErrorCode.BackendUserIneligibleForPromoOffer.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidSubscriberAttributes.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidSubscriberAttributesBody.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidAppStoreSharedSecret.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidAppleSubscriptionKey.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BackendErrorCode.BackendBadRequest.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BackendErrorCode.BackendInternalServerError.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BackendErrorCode.BackendProductIDsMalformed.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PurchasesError toPurchasesError(Exception exc) {
        AbstractC16544l.m18094g(exc, "<this>");
        if (exc instanceof JSONException ? true : exc instanceof IOException) {
            return new PurchasesError(PurchasesErrorCode.NetworkError, exc.getLocalizedMessage());
        }
        if (exc instanceof SecurityException) {
            return new PurchasesError(PurchasesErrorCode.InsufficientPermissionsError, ((SecurityException) exc).getLocalizedMessage());
        }
        return exc instanceof SignatureVerificationException ? new PurchasesError(PurchasesErrorCode.SignatureVerificationError, ((SignatureVerificationException) exc).getLocalizedMessage()) : new PurchasesError(PurchasesErrorCode.UnknownError, exc.getLocalizedMessage());
    }

    private static final PurchasesErrorCode toPurchasesErrorCode(BackendErrorCode backendErrorCode) {
        switch (WhenMappings.$EnumSwitchMapping$0[backendErrorCode.ordinal()]) {
            case 1:
                return PurchasesErrorCode.StoreProblemError;
            case 2:
                return PurchasesErrorCode.ReceiptAlreadyInUseError;
            case 3:
                return PurchasesErrorCode.InvalidReceiptError;
            case 4:
            case 5:
            case 6:
                return PurchasesErrorCode.InvalidCredentialsError;
            case 7:
            case 8:
                return PurchasesErrorCode.PurchaseInvalidError;
            case 9:
                return PurchasesErrorCode.InvalidAppUserIdError;
            case 10:
                return PurchasesErrorCode.StoreProblemError;
            case 11:
            case 12:
                return PurchasesErrorCode.ConfigurationError;
            case 13:
                return PurchasesErrorCode.StoreProblemError;
            case 14:
                return PurchasesErrorCode.IneligibleError;
            case 15:
            case 16:
                return PurchasesErrorCode.InvalidSubscriberAttributesError;
            case 17:
            case 18:
            case 19:
            case 20:
                return PurchasesErrorCode.UnexpectedBackendResponseError;
            case 21:
                return PurchasesErrorCode.UnsupportedError;
            default:
                throw new C0644w();
        }
    }

    private static final PurchasesError toPurchasesError(BackendErrorCode backendErrorCode, String str) {
        return new PurchasesError(toPurchasesErrorCode(backendErrorCode), str);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    public static final PurchasesError toPurchasesError(HTTPResult hTTPResult) throws JSONException {
        Integer num;
        String str;
        PurchasesError purchasesError;
        Object obj;
        AbstractC16544l.m18094g(hTTPResult, "<this>");
        if (hTTPResult.getBody().has("code")) {
            Object obj2 = hTTPResult.getBody().get("code");
            AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.Int");
            num = (Integer) obj2;
        } else {
            num = null;
        }
        if (hTTPResult.getBody().has("message")) {
            Object obj3 = hTTPResult.getBody().get("message");
            AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.String");
            str = (String) obj3;
        } else {
            str = "";
        }
        if (num != null) {
            BackendErrorCode backendErrorCodeValueOf = BackendErrorCode.INSTANCE.valueOf(num.intValue());
            if (backendErrorCodeValueOf == null || (purchasesError = toPurchasesError(backendErrorCodeValueOf, str)) == null) {
                PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.UnknownBackendError;
                StringBuilder sb2 = new StringBuilder("Backend Code: ");
                obj = num;
                if (num == null) {
                    obj = "N/A";
                }
                sb2.append(obj);
                sb2.append(" - ");
                sb2.append(str);
                purchasesError = new PurchasesError(purchasesErrorCode, sb2.toString());
            }
        } else {
            PurchasesErrorCode purchasesErrorCode2 = PurchasesErrorCode.UnknownBackendError;
            StringBuilder sb3 = new StringBuilder("Backend Code: ");
            obj = num;
            if (num == null) {
                obj = "N/A";
            }
            sb3.append(obj);
            sb3.append(" - ");
            sb3.append(str);
            purchasesError = new PurchasesError(purchasesErrorCode2, sb3.toString());
        }
        return purchasesError;
    }
}
