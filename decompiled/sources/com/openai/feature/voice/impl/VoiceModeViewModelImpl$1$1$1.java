package com.openai.feature.voice.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p124Ei.C2532n1;
import p148Fi.AbstractC2829i1;
import p341Ni.C5789k;
import p341Ni.InterfaceC5798r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LEi/n1;", "invoke", "(LEi/n1;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeViewModelImpl$1$1$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC2829i1 f40005Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5798r f40006Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$1$1$1(AbstractC2829i1 abstractC2829i1, InterfaceC5798r interfaceC5798r) {
        super(1);
        this.f40005Y = abstractC2829i1;
        this.f40006Z = interfaceC5798r;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C2532n1 setState = (C2532n1) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        InterfaceC5798r interfaceC5798r = this.f40006Z;
        return C2532n1.m3605e(setState, null, this.f40005Y, null, null, null, false, false, false, false, false, false, (interfaceC5798r instanceof C5789k) && ((C5789k) interfaceC5798r).f18912a, false, false, false, false, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, null, null, false, false, false, false, null, -2051, 2047);
    }
}
