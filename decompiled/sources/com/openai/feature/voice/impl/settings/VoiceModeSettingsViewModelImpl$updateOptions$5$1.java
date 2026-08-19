package com.openai.feature.voice.impl.settings;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1155zi.AbstractC21933K1;
import p1155zi.C21913F1;
import p294Li.C5100v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LLi/v;", "invoke", "(LLi/v;)LLi/v;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeSettingsViewModelImpl$updateOptions$5$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC21933K1 f40292Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeSettingsViewModelImpl$updateOptions$5$1(AbstractC21933K1 abstractC21933K1) {
        super(1);
        this.f40292Y = abstractC21933K1;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C5100v setState = (C5100v) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        AbstractC21933K1 error = this.f40292Y;
        AbstractC16544l.m18094g(error, "error");
        return C5100v.m5663e(setState, new C21913F1(error), null, false, 30);
    }
}
