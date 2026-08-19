package com.openai.voice.assistant;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8106i0;
import p553Wh.C8870f;
import p926of.C18177n;
import p926of.InterfaceC18179p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lof/p;", "effect", "Lmm/C;", "invoke", "(Lof/p;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class AssistantScreenKt$AssistantScreenContent$messagesViewModel$1$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C8870f f40394Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantScreenKt$AssistantScreenContent$messagesViewModel$1$1(C8870f c8870f) {
        super(1);
        this.f40394Y = c8870f;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC18179p effect = (InterfaceC18179p) obj;
        AbstractC16544l.m18094g(effect, "effect");
        if (effect instanceof C18177n) {
            C8870f.m9547b(this.f40394Y, AbstractC8106i0.m8589d(((C18177n) effect).f57990a));
        }
        return C17296C.f55119a;
    }
}
