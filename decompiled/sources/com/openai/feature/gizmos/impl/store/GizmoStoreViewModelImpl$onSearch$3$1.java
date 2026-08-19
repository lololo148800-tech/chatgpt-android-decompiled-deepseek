package com.openai.feature.gizmos.impl.store;

import af.C10571a0;
import af.C10573b0;
import bf.C11363S;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Laf/b0;", "invoke", "(Laf/b0;)Laf/b0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class GizmoStoreViewModelImpl$onSearch$3$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f38278Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11363S f38279Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmoStoreViewModelImpl$onSearch$3$1(String str, C11363S c11363s) {
        super(1);
        this.f38278Y = str;
        this.f38279Z = c11363s;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C10573b0 setState = (C10573b0) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C10573b0.m10982e(setState, null, null, null, new C10571a0(this.f38278Y, GizmoStoreViewModelKt.m14285a(this.f38279Z)), 7);
    }
}
