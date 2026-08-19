package com.openai.feature.voice.impl.assistant;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p196Hi.C3442l;
import p196Hi.C3450t;
import p196Hi.InterfaceC3444n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LHi/t;", "invoke", "(LHi/t;)LHi/t;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class AssistantViewModelImpl$onIntent$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC3444n f40262Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantViewModelImpl$onIntent$2(InterfaceC3444n interfaceC3444n) {
        super(1);
        this.f40262Y = interfaceC3444n;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C3450t setState = (C3450t) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C3450t.m4192e(setState, null, ((C3442l) this.f40262Y).f10470a, false, 19);
    }
}
