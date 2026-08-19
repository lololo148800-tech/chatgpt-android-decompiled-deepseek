package com.openai.feature.gizmos.impl.settings;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p550We.C8826g;
import p622Ze.C10298p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LZe/p;", "invoke", "(LZe/p;)LZe/p;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class GizmoSettingsViewModelImpl$updateSettings$2$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C8826g f38180Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmoSettingsViewModelImpl$updateSettings$2$1(C8826g c8826g) {
        super(1);
        this.f38180Y = c8826g;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C10298p setState = (C10298p) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C10298p.m10880e(setState, null, null, this.f38180Y, 7);
    }
}
