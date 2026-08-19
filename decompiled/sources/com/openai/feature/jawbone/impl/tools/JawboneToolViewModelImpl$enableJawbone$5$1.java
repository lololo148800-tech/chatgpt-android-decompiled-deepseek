package com.openai.feature.jawbone.impl.tools;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p871lf.C16934r;
import p891mf.C17247h;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmf/h;", "invoke", "(Lmf/h;)Lmf/h;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class JawboneToolViewModelImpl$enableJawbone$5$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f38452Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JawboneToolViewModelImpl$enableJawbone$5$1(String str) {
        super(1);
        this.f38452Y = str;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17247h setState = (C17247h) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C17247h.m18969e(setState, null, AbstractC17659D.m19245g(setState.f55027b, new C16934r(this.f38452Y)), false, 13);
    }
}
