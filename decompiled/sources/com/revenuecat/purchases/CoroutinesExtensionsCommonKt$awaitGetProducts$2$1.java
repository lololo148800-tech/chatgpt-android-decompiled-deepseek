package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p972qm.AbstractC18773f;
import p972qm.InterfaceC18770c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public /* synthetic */ class CoroutinesExtensionsCommonKt$awaitGetProducts$2$1 extends AbstractC16541i implements InterfaceC1436k {
    public CoroutinesExtensionsCommonKt$awaitGetProducts$2$1(Object obj) {
        super(1, 1, AbstractC18773f.class, obj, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V");
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) obj);
        return C17296C.f55119a;
    }

    public final void invoke(List<? extends StoreProduct> p10) {
        AbstractC16544l.m18094g(p10, "p0");
        ((InterfaceC18770c) this.receiver).resumeWith(p10);
    }
}
