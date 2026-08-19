package com.openai.feature.subscriptions.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p624Zg.AbstractC10381m0;
import p624Zg.C10379l0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LZg/m0;", "invoke", "(LZg/m0;)LZg/m0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class SubscriptionsViewModelImpl$setStateIfLoaded$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC16546n f39922Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionsViewModelImpl$setStateIfLoaded$1(InterfaceC1436k interfaceC1436k) {
        super(1);
        this.f39922Y = (AbstractC16546n) interfaceC1436k;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        AbstractC10381m0 setState = (AbstractC10381m0) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return setState instanceof C10379l0 ? (AbstractC10381m0) this.f39922Y.invoke(setState) : setState;
    }
}
