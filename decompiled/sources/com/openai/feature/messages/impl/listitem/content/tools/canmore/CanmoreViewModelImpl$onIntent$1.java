package com.openai.feature.messages.impl.listitem.content.tools.canmore;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p193Hf.C3358e;
import p193Hf.C3420z0;
import p193Hf.InterfaceC3364g;
import p909nm.AbstractC17659D;
import ye.C21514c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LHf/z0;", "invoke", "(LHf/z0;)LHf/z0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class CanmoreViewModelImpl$onIntent$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC3364g f38911Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CanmoreViewModelImpl$onIntent$1(InterfaceC3364g interfaceC3364g) {
        super(1);
        this.f38911Y = interfaceC3364g;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C3420z0 setState = (C3420z0) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        C3358e c3358e = (C3358e) this.f38911Y;
        return C3420z0.m4185e(setState, null, null, null, AbstractC17659D.m19249k(setState.f10422g, new C17309l(new C21514c(c3358e.f10253a), c3358e.f10254b)), false, false, null, 959);
    }
}
