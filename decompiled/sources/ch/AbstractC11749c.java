package ch;

import com.revenuecat.purchases.PurchasesErrorCode;

/* JADX INFO: renamed from: ch.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC11749c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f35629a;

    static {
        int[] iArr = new int[PurchasesErrorCode.values().length];
        try {
            iArr[PurchasesErrorCode.PurchaseCancelledError.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PurchasesErrorCode.ReceiptAlreadyInUseError.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PurchasesErrorCode.PaymentPendingError.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f35629a = iArr;
    }
}
