package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p972qm.InterfaceC18770c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class CoroutinesExtensionsCommonKt$awaitRestore$2$2 extends AbstractC16546n implements InterfaceC1436k {
    final /* synthetic */ InterfaceC18770c<CustomerInfo> $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutinesExtensionsCommonKt$awaitRestore$2$2(InterfaceC18770c<? super CustomerInfo> interfaceC18770c) {
        super(1);
        this.$continuation = interfaceC18770c;
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomerInfo) obj);
        return C17296C.f55119a;
    }

    public final void invoke(CustomerInfo it) {
        AbstractC16544l.m18094g(it, "it");
        this.$continuation.resumeWith(it);
    }
}
