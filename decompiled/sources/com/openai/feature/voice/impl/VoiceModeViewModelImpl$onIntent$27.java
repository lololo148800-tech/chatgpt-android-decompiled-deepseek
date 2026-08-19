package com.openai.feature.voice.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p124Ei.C2500d;
import p124Ei.C2516i0;
import p124Ei.C2532n1;
import p124Ei.InterfaceC2548v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LEi/n1;", "invoke", "(LEi/n1;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeViewModelImpl$onIntent$27 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC2548v0 f40168Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$onIntent$27(InterfaceC2548v0 interfaceC2548v0) {
        super(1);
        this.f40168Y = interfaceC2548v0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C2532n1 setState = (C2532n1) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C2532n1.m3605e(setState, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, null, null, false, false, false, false, C2500d.m3585a(setState.f7882N, ((C2516i0) this.f40168Y).f7817a, null, null, 13), -1, 1919);
    }
}
