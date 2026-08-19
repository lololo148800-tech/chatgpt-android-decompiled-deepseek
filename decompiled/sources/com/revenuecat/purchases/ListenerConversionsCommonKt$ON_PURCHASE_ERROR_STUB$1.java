package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1 extends AbstractC16546n implements InterfaceC1439n {
    public static final ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1 INSTANCE = new ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1();

    public ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1() {
        super(2);
    }

    public final void invoke(PurchasesError purchasesError, boolean z6) {
        AbstractC16544l.m18094g(purchasesError, "<anonymous parameter 0>");
    }

    @Override // p049Bm.InterfaceC1439n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
        return C17296C.f55119a;
    }
}
