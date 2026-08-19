package com.revenuecat.purchases.google;

import android.text.TextUtils;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p449S9.C7042K;
import p618Za.C10267f;
import p826j6.C16152f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"Lj6/f;", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "Lmm/C;", "setUpgradeInfo", "(Lj6/f;Lcom/revenuecat/purchases/common/ReplaceProductInfo;)V", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class BillingFlowParamsExtensionsKt {
    public static final void setUpgradeInfo(C16152f c16152f, ReplaceProductInfo replaceProductInfo) {
        int playBillingClientMode;
        AbstractC16544l.m18094g(c16152f, "<this>");
        AbstractC16544l.m18094g(replaceProductInfo, "replaceProductInfo");
        String purchaseToken = replaceProductInfo.getOldPurchase().getPurchaseToken();
        ReplacementMode replacementMode = replaceProductInfo.getReplacementMode();
        if (replacementMode == null) {
            playBillingClientMode = 0;
        } else {
            GoogleReplacementMode googleReplacementMode = replacementMode instanceof GoogleReplacementMode ? (GoogleReplacementMode) replacementMode : null;
            if (googleReplacementMode == null) {
                LogUtilsKt.errorLog$default("Got non-Google replacement mode", null, 2, null);
                playBillingClientMode = 0;
            } else {
                playBillingClientMode = googleReplacementMode.getPlayBillingClientMode();
            }
        }
        boolean z6 = (TextUtils.isEmpty(purchaseToken) && TextUtils.isEmpty(null)) ? false : true;
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (z6 && !zIsEmpty) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!z6 && zIsEmpty) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        C10267f c10267f = new C10267f();
        c10267f.f30497a = purchaseToken;
        c10267f.f30498b = playBillingClientMode;
        C7042K c7042k = new C7042K();
        c7042k.f22496c = c10267f.f30497a;
        c7042k.f22494a = c10267f.f30498b;
        c16152f.f50142d = c7042k;
    }
}
