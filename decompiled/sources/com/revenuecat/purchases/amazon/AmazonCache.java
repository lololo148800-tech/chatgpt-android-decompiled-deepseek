package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17306i;
import org.json.JSONObject;
import p571X9.AbstractC9227W;
import p909nm.AbstractC17659D;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u00078@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m18067d2 = {"Lcom/revenuecat/purchases/amazon/AmazonCache;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;)V", "", "", "receiptsToSkus", "Lmm/C;", "cacheSkusByToken", "(Ljava/util/Map;)V", "getReceiptSkus", "()Ljava/util/Map;", "token", "addSuccessfullyPostedToken", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "amazonPostedTokensKey$delegate", "Lmm/i;", "getAmazonPostedTokensKey$purchases_customEntitlementComputationRelease", "()Ljava/lang/String;", "amazonPostedTokensKey", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AmazonCache {

    /* JADX INFO: renamed from: amazonPostedTokensKey$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i amazonPostedTokensKey;
    private final DeviceCache deviceCache;

    public AmazonCache(DeviceCache deviceCache) {
        AbstractC16544l.m18094g(deviceCache, "deviceCache");
        this.deviceCache = deviceCache;
        this.amazonPostedTokensKey = AbstractC9227W.m9800c(new AmazonCache$amazonPostedTokensKey$2(this));
    }

    public final synchronized void addSuccessfullyPostedToken(String token) {
        AbstractC16544l.m18094g(token, "token");
        this.deviceCache.addSuccessfullyPostedToken(token);
    }

    public final synchronized void cacheSkusByToken(Map<String, String> receiptsToSkus) {
        AbstractC16544l.m18094g(receiptsToSkus, "receiptsToSkus");
        LogWrapperKt.log(LogIntent.DEBUG, String.format(AmazonStrings.CACHING_RECEIPT_TERM_SKUS, Arrays.copyOf(new Object[]{receiptsToSkus}, 1)));
        JSONObject jSONObject = new JSONObject(AbstractC17659D.m19248j(getReceiptSkus(), receiptsToSkus));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("receiptsToSkus", jSONObject);
        DeviceCache deviceCache = this.deviceCache;
        String strM14440x2c422917 = m14440x2c422917();
        String string = jSONObject2.toString();
        AbstractC16544l.m18093f(string, "jsonToCache.toString()");
        deviceCache.putString(strM14440x2c422917, string);
    }

    /* JADX INFO: renamed from: getAmazonPostedTokensKey$purchases_customEntitlementComputationRelease */
    public final String m14440x2c422917() {
        return (String) this.amazonPostedTokensKey.getValue();
    }

    public final synchronized Map<String, String> getReceiptSkus() {
        Map<String, String> map$default;
        try {
            JSONObject jSONObjectOrNull = this.deviceCache.getJSONObjectOrNull(m14440x2c422917());
            JSONObject jSONObject = jSONObjectOrNull != null ? jSONObjectOrNull.getJSONObject("receiptsToSkus") : null;
            if (jSONObject == null || (map$default = JSONObjectExtensionsKt.toMap$default(jSONObject, false, 1, null)) == null) {
                map$default = C17690x.f56481Y;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return map$default;
    }
}
