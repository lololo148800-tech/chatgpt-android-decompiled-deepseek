package com.revenuecat.purchases.subscriberattributes;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$ObtainDeviceIdentifiersObservable$waitUntilIdle$1 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class C12758xb041ba2 extends AbstractC16546n implements InterfaceC1426a {
    final /* synthetic */ InterfaceC1426a $completion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12758xb041ba2(InterfaceC1426a interfaceC1426a) {
        super(0);
        this.$completion = interfaceC1426a;
    }

    @Override // p049Bm.InterfaceC1426a
    public /* bridge */ /* synthetic */ Object invoke() {
        m22524invoke();
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m22524invoke() {
        this.$completion.invoke();
    }
}
