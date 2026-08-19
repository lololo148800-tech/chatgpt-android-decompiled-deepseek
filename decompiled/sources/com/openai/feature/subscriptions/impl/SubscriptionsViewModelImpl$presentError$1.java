package com.openai.feature.subscriptions.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p624Zg.AbstractC10357a0;
import p624Zg.AbstractC10381m0;
import p624Zg.C10375j0;
import p624Zg.C10379l0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LZg/m0;", "invoke", "(LZg/m0;)LZg/m0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class SubscriptionsViewModelImpl$presentError$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC10357a0 f39913Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionsViewModelImpl$presentError$1(AbstractC10357a0 abstractC10357a0) {
        super(1);
        this.f39913Y = abstractC10357a0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        AbstractC10381m0 setState = (AbstractC10381m0) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        boolean z6 = setState instanceof C10379l0;
        AbstractC10357a0 abstractC10357a0 = this.f39913Y;
        if (z6) {
            C10379l0 c10379l0 = (C10379l0) setState;
            if (c10379l0.f30754c != null) {
                return C10379l0.m10893f(c10379l0, null, Integer.valueOf(abstractC10357a0.f30703Y), 23);
            }
        }
        return new C10375j0(abstractC10357a0.f30703Y, setState.mo10891e());
    }
}
