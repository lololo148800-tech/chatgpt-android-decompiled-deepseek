package com.revenuecat.purchases.utils;

import android.net.Uri;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.paywalls.PaywallData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;", "", "", "shouldPredownloadImages", "Lcom/revenuecat/purchases/utils/CoilImageDownloader;", "coilImageDownloader", "<init>", "(ZLcom/revenuecat/purchases/utils/CoilImageDownloader;)V", "Lcom/revenuecat/purchases/Offering;", "offering", "Lmm/C;", "preDownloadOfferingImages", "(Lcom/revenuecat/purchases/Offering;)V", "Z", "Lcom/revenuecat/purchases/utils/CoilImageDownloader;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class OfferingImagePreDownloader {
    private final CoilImageDownloader coilImageDownloader;
    private final boolean shouldPredownloadImages;

    public OfferingImagePreDownloader(boolean z6, CoilImageDownloader coilImageDownloader) {
        AbstractC16544l.m18094g(coilImageDownloader, "coilImageDownloader");
        this.shouldPredownloadImages = z6;
        this.coilImageDownloader = coilImageDownloader;
    }

    public final void preDownloadOfferingImages(Offering offering) {
        AbstractC16544l.m18094g(offering, "offering");
        if (!this.shouldPredownloadImages) {
            LogUtilsKt.verboseLog("OfferingImagePreDownloader won't pre-download images");
            return;
        }
        LogUtilsKt.debugLog("OfferingImagePreDownloader: starting image download");
        PaywallData paywall = offering.getPaywall();
        if (paywall != null) {
            List<String> all$purchases_customEntitlementComputationRelease = paywall.getConfig().getImages().getAll$purchases_customEntitlementComputationRelease();
            ArrayList<Uri> arrayList = new ArrayList(AbstractC17682p.m19389r(all$purchases_customEntitlementComputationRelease, 10));
            Iterator<T> it = all$purchases_customEntitlementComputationRelease.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.parse(paywall.getAssetBaseURL().toString()).buildUpon().path((String) it.next()).build());
            }
            for (Uri it2 : arrayList) {
                LogUtilsKt.debugLog("Pre-downloading paywall image: " + it2);
                CoilImageDownloader coilImageDownloader = this.coilImageDownloader;
                AbstractC16544l.m18093f(it2, "it");
                coilImageDownloader.downloadImage(it2);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OfferingImagePreDownloader(boolean z6, CoilImageDownloader coilImageDownloader, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            try {
                Class.forName("com.revenuecat.purchases.ui.revenuecatui.PaywallKt");
                z6 = true;
            } catch (ClassNotFoundException unused) {
                z6 = false;
            }
        }
        this(z6, coilImageDownloader);
    }
}
