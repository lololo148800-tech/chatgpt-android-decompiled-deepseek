package com.openai.feature.gizmos.impl.store;

import af.C10573b0;
import af.C10575c0;
import bf.C11363S;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Laf/b0;", "invoke", "(Laf/b0;)Laf/b0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class GizmoStoreViewModelImpl$onCategoryLoadMoreShown$3$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ GizmoStoreViewModelImpl f38254Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11363S f38255Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11363S f38256o0;

    /* JADX INFO: renamed from: com.openai.feature.gizmos.impl.store.GizmoStoreViewModelImpl$onCategoryLoadMoreShown$3$1$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"Laf/c0;", "it", "invoke", "(Laf/c0;)Laf/c0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123711 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ C11363S f38257Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123711(C11363S c11363s) {
            super(1);
            this.f38257Y = c11363s;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C10575c0 it = (C10575c0) obj;
            AbstractC16544l.m18094g(it, "it");
            return it.m10983a(this.f38257Y);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmoStoreViewModelImpl$onCategoryLoadMoreShown$3$1(GizmoStoreViewModelImpl gizmoStoreViewModelImpl, C11363S c11363s, C11363S c11363s2) {
        super(1);
        this.f38254Y = gizmoStoreViewModelImpl;
        this.f38255Z = c11363s;
        this.f38256o0 = c11363s2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C10573b0 setState = (C10573b0) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        C11363S c11363s = this.f38255Z;
        return GizmoStoreViewModelImpl.m14281n(this.f38254Y, setState, c11363s.f34359a, new C123711(this.f38256o0));
    }
}
