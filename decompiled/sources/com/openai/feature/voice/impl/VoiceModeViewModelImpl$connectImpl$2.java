package com.openai.feature.voice.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1155zi.EnumC22033m2;
import p124Ei.C2532n1;
import p216Id.AbstractC3693a;
import p216Id.C3694b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LEi/n1;", "invoke", "(LEi/n1;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeViewModelImpl$connectImpl$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ VoiceModeViewModelImpl f40093Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3694b f40094Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$connectImpl$2(VoiceModeViewModelImpl voiceModeViewModelImpl, C3694b c3694b) {
        super(1);
        this.f40093Y = voiceModeViewModelImpl;
        this.f40094Z = c3694b;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C2532n1 setState = (C2532n1) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        this.f40093Y.getClass();
        C3694b c3694b = this.f40094Z;
        return C2532n1.m3605e(setState, null, null, null, null, AbstractC3693a.m4406f(c3694b.f11224i) ? EnumC22033m2.Advanced : EnumC22033m2.Standard, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, null, null, false, false, false, c3694b.f11216a == null, null, -17, 1983);
    }
}
