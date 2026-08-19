package com.openai.feature.gizmos.impl.store;

import af.C10573b0;
import af.C10575c0;
import bf.C11363S;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1155zi.C21917G1;
import p1155zi.InterfaceC21925I1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Laf/b0;", "invoke", "(Laf/b0;)Laf/b0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class GizmoStoreViewModelImpl$onSearchLoadMore$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ GizmoStoreViewModelImpl f38287Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11363S f38288Z;

    /* JADX INFO: renamed from: com.openai.feature.gizmos.impl.store.GizmoStoreViewModelImpl$onSearchLoadMore$2$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"Laf/c0;", "it", "invoke", "(Laf/c0;)Laf/c0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123731 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C123731 f38289Y = new C123731();

        public C123731() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C10575c0 it = (C10575c0) obj;
            AbstractC16544l.m18094g(it, "it");
            C21917G1 c21917g1 = C21917G1.f69468a;
            InterfaceC21925I1 categoryResult = it.f31409a;
            AbstractC16544l.m18094g(categoryResult, "categoryResult");
            return new C10575c0(categoryResult, c21917g1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmoStoreViewModelImpl$onSearchLoadMore$2(GizmoStoreViewModelImpl gizmoStoreViewModelImpl, C11363S c11363s) {
        super(1);
        this.f38287Y = gizmoStoreViewModelImpl;
        this.f38288Z = c11363s;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C10573b0 setState = (C10573b0) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return GizmoStoreViewModelImpl.m14281n(this.f38287Y, setState, this.f38288Z.f34359a, C123731.f38289Y);
    }
}
