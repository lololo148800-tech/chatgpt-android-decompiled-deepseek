package com.openai.feature.gizmos.impl.store;

import af.C10545A;
import bf.C11367W;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Laf/A;", "invoke", "(Laf/A;)Laf/A;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class GizmoRatingViewModelImpl$3$1$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C11367W f38212Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmoRatingViewModelImpl$3$1$1(C11367W c11367w) {
        super(1);
        this.f38212Y = c11367w;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C10545A setState = (C10545A) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        C11367W c11367w = this.f38212Y;
        Integer num = c11367w.f34370a;
        return C10545A.m10981e(setState, null, num, num, c11367w.f34371b, AbstractC16544l.m18089b(c11367w.f34372c, Boolean.TRUE), null, num != null, false, 323);
    }
}
