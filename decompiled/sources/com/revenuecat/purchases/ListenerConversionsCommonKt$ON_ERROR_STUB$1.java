package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class ListenerConversionsCommonKt$ON_ERROR_STUB$1 extends AbstractC16546n implements InterfaceC1436k {
    public static final ListenerConversionsCommonKt$ON_ERROR_STUB$1 INSTANCE = new ListenerConversionsCommonKt$ON_ERROR_STUB$1();

    public ListenerConversionsCommonKt$ON_ERROR_STUB$1() {
        super(1);
    }

    public final void invoke(PurchasesError it) {
        AbstractC16544l.m18094g(it, "it");
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C17296C.f55119a;
    }
}
