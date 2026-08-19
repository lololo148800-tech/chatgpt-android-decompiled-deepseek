package com.openai.voice.assistant;

import com.openai.voice.VoiceModeViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p124Ei.C2479U;
import p196Hi.C3438h;
import p196Hi.C3439i;
import p196Hi.InterfaceC3440j;
import p893n.AbstractActivityC17375g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LHi/j;", "effect", "Lmm/C;", "invoke", "(LHi/j;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class AssistantScreenKt$AssistantScreenContent$assistantViewModel$1$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractActivityC17375g f40392Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceModeViewModel f40393Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantScreenKt$AssistantScreenContent$assistantViewModel$1$1(AbstractActivityC17375g abstractActivityC17375g, VoiceModeViewModel voiceModeViewModel) {
        super(1);
        this.f40392Y = abstractActivityC17375g;
        this.f40393Z = voiceModeViewModel;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC3440j effect = (InterfaceC3440j) obj;
        AbstractC16544l.m18094g(effect, "effect");
        boolean z6 = effect instanceof C3438h;
        AbstractActivityC17375g abstractActivityC17375g = this.f40392Y;
        if (z6) {
            abstractActivityC17375g.finish();
        } else if (effect instanceof C3439i) {
            this.f40393Z.m14395k(C2479U.f7725a);
            abstractActivityC17375g.finish();
        }
        return C17296C.f55119a;
    }
}
