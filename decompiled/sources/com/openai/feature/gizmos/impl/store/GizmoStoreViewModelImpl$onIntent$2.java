package com.openai.feature.gizmos.impl.store;

import af.C10546B;
import af.C10573b0;
import af.InterfaceC10551G;
import bf.C11363S;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Laf/b0;", "invoke", "(Laf/b0;)Laf/b0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class GizmoStoreViewModelImpl$onIntent$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC10551G f38265Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmoStoreViewModelImpl$onIntent$2(InterfaceC10551G interfaceC10551G) {
        super(1);
        this.f38265Y = interfaceC10551G;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C10573b0 setState = (C10573b0) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        C11363S c11363s = ((C10546B) this.f38265Y).f31310a;
        return C10573b0.m10982e(setState, null, c11363s != null ? c11363s.f34359a : null, null, null, 13);
    }
}
