package com.revenuecat.purchases.utils;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import p026Ao.C0654C;
import p049Bm.InterfaceC1426a;
import p1061vb.C20513d;
import p1112xm.AbstractC21304h;
import p571X9.AbstractC9227W;
import p791hj.C14522e;
import p864l5.InterfaceC16818e;
import p916o5.C17823a;
import p916o5.InterfaceC17824b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m18067d2 = {"Landroid/content/Context;", "Ll5/e;", "getRevenueCatUIImageLoader", "(Landroid/content/Context;)Ll5/e;", "", "MAX_CACHE_SIZE_BYTES", "J", "", "PAYWALL_IMAGE_CACHE_FOLDER", "Ljava/lang/String;", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CoilImageDownloaderKt {
    private static final long MAX_CACHE_SIZE_BYTES = 26214400;
    private static final String PAYWALL_IMAGE_CACHE_FOLDER = "revenuecatui_cache";

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.CoilImageDownloaderKt$getRevenueCatUIImageLoader$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lo5/b;", "invoke", "()Lo5/b;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127691 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ Context $this_getRevenueCatUIImageLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127691(Context context) {
            super(0);
            this.$this_getRevenueCatUIImageLoader = context;
        }

        @Override // p049Bm.InterfaceC1426a
        public final InterfaceC17824b invoke() {
            C17823a c17823a = new C17823a();
            File cacheDir = this.$this_getRevenueCatUIImageLoader.getCacheDir();
            AbstractC16544l.m18093f(cacheDir, "cacheDir");
            File fileM21645h = AbstractC21304h.m21645h(cacheDir, CoilImageDownloaderKt.PAYWALL_IMAGE_CACHE_FOLDER);
            String str = C0654C.f1910Z;
            c17823a.f56855a = C20513d.m21170o(fileM21645h);
            c17823a.f56857c = 0.0d;
            c17823a.f56860f = CoilImageDownloaderKt.MAX_CACHE_SIZE_BYTES;
            return c17823a.m19574a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC16818e getRevenueCatUIImageLoader(Context context) {
        C14522e c14522e = new C14522e(context);
        c14522e.f45763o0 = AbstractC9227W.m9800c(new C127691(context));
        return c14522e.m16016g();
    }
}
