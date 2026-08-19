package com.openai.feature.gizmos.impl.store;

import af.C10545A;
import af.C10593u;
import af.InterfaceC10597y;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Laf/A;", "invoke", "(Laf/A;)Laf/A;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class GizmoRatingViewModelImpl$onIntent$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC10597y f38216Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmoRatingViewModelImpl$onIntent$2(InterfaceC10597y interfaceC10597y) {
        super(1);
        this.f38216Y = interfaceC10597y;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C10545A setState = (C10545A) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C10545A.m10981e(setState, null, ((C10593u) this.f38216Y).f31444a, null, null, false, null, false, false, 507);
    }
}
