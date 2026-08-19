package com.openai.feature.gizmos.impl.store;

import af.C10573b0;
import bf.C11363S;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Laf/b0;", "invoke", "(Laf/b0;)Laf/b0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class GizmoStoreViewModelImpl$1$1$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ List f38237Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmoStoreViewModelImpl$1$1$1(List list) {
        super(1);
        this.f38237Y = list;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C10573b0 setState = (C10573b0) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        List list = this.f38237Y;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(GizmoStoreViewModelKt.m14285a((C11363S) it.next()));
        }
        return C10573b0.m10982e(setState, arrayList, null, null, null, 14);
    }
}
