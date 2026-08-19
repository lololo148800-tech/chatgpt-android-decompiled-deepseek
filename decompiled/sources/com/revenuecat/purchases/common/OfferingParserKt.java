package com.revenuecat.purchases.common;

import com.revenuecat.purchases.PackageType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1113xn.AbstractC21329w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m18067d2 = {"toPackageType", "Lcom/revenuecat/purchases/PackageType;", "", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class OfferingParserKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageType toPackageType(String str) {
        PackageType packageType;
        PackageType[] packageTypeArrValues = PackageType.values();
        int length = packageTypeArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                packageType = null;
                break;
            }
            packageType = packageTypeArrValues[i10];
            if (AbstractC16544l.m18089b(packageType.getIdentifier(), str)) {
                break;
            }
            i10++;
        }
        if (packageType == null) {
            return AbstractC21329w.m21734u(str, "$rc_", false) ? PackageType.UNKNOWN : PackageType.CUSTOM;
        }
        return packageType;
    }
}
