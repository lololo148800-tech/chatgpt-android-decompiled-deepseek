package com.openai.feature.voice.impl.settings;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p294Li.C5098t;
import p294Li.C5100v;
import p294Li.InterfaceC5099u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LLi/v;", "invoke", "(LLi/v;)LLi/v;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeSettingsViewModelImpl$onIntent$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC5099u f40273Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeSettingsViewModelImpl$onIntent$2(InterfaceC5099u interfaceC5099u) {
        super(1);
        this.f40273Y = interfaceC5099u;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C5100v setState = (C5100v) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C5100v.m5663e(setState, null, ((C5098t) this.f40273Y).f16669a, false, 27);
    }
}
