package com.revenuecat.purchases.utils;

import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1075w5.C20830h;
import p864l5.C16826m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, m18067d2 = {"Lcom/revenuecat/purchases/utils/CoilImageDownloader;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "Landroid/net/Uri;", "uri", "Lmm/C;", "downloadImage", "(Landroid/net/Uri;)V", "Landroid/content/Context;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CoilImageDownloader {
    private final Context applicationContext;

    public CoilImageDownloader(Context applicationContext) {
        AbstractC16544l.m18094g(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    public final void downloadImage(Uri uri) {
        AbstractC16544l.m18094g(uri, "uri");
        C20830h c20830h = new C20830h(this.applicationContext);
        c20830h.f66187c = uri;
        ((C16826m) CoilImageDownloaderKt.getRevenueCatUIImageLoader(this.applicationContext)).m18564b(c20830h.m21435a());
    }
}
