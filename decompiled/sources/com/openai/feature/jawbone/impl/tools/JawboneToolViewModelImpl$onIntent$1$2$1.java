package com.openai.feature.jawbone.impl.tools;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p1155zi.AbstractC21933K1;
import p1155zi.C21913F1;
import p1155zi.C21941M1;
import p871lf.C16934r;
import p891mf.C17244e;
import p891mf.C17247h;
import p891mf.InterfaceC17246g;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmf/h;", "invoke", "(Lmf/h;)Lmf/h;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class JawboneToolViewModelImpl$onIntent$1$2$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC17246g f38457Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC21933K1 f38458Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JawboneToolViewModelImpl$onIntent$1$2$1(InterfaceC17246g interfaceC17246g, AbstractC21933K1 abstractC21933K1) {
        super(1);
        this.f38457Y = interfaceC17246g;
        this.f38458Z = abstractC21933K1;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17247h setState = (C17247h) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C17247h.m18969e(setState, AbstractC17659D.m19249k(setState.f55026a, new C17309l(new C16934r(((C17244e) this.f38457Y).f55023a), new C21913F1(new C21941M1(this.f38458Z.f69485a)))), null, false, 14);
    }
}
