package com.openai.voice.assistant;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p124Ei.C2460K;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LEi/K;", "effect", "Lmm/C;", "invoke", "(LEi/K;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class AssistantScreenKt$AssistantScreenContent$voiceViewModel$1$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC1436k f40395Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantScreenKt$AssistantScreenContent$voiceViewModel$1$1(InterfaceC1436k interfaceC1436k) {
        super(1);
        this.f40395Y = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C2460K effect = (C2460K) obj;
        AbstractC16544l.m18094g(effect, "effect");
        if (effect instanceof C2460K) {
            this.f40395Y.invoke(effect.f7650a);
        }
        return C17296C.f55119a;
    }
}
