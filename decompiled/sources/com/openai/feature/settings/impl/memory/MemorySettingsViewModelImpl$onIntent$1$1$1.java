package com.openai.feature.settings.impl.memory;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p072Ci.C1699d;
import p406Qg.C6725u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LQg/u;", "invoke", "(LQg/u;)LQg/u;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MemorySettingsViewModelImpl$onIntent$1$1$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1699d f39631Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemorySettingsViewModelImpl$onIntent$1$1$1(C1699d c1699d) {
        super(1);
        this.f39631Y = c1699d;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C6725u setState = (C6725u) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        C1699d c1699d = this.f39631Y;
        return C6725u.m7184e(setState, c1699d.f4827a, false, c1699d.f4828b, false, null, null, 122);
    }
}
