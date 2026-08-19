package com.openai.feature.voice.impl.training;

import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import com.openai.voice.training.VoiceTrainingViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p098Di.InterfaceC2053b;
import p1081wc.C20862H;
import p1081wc.InterfaceC20904w;
import p1155zi.EnumC21946N2;
import p318Mh.C5360E0;
import p319Mi.C5441c;
import p319Mi.C5442d;
import p319Mi.C5447i;
import p319Mi.InterfaceC5443e;
import p571X9.AbstractC9327m3;
import p708dh.C13132J;
import p909nm.C17690x;
import sm.AbstractC19694j;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/voice/impl/training/VoiceTrainingViewModelImpl;", "Lcom/openai/voice/training/VoiceTrainingViewModel;", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class VoiceTrainingViewModelImpl extends VoiceTrainingViewModel {

    /* JADX INFO: renamed from: i */
    public final C13132J f40299i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC20904w f40300j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceTrainingViewModelImpl(C13132J c13132j, InterfaceC20904w interfaceC20904w, C11082S c11082s) {
        super(new C5447i((EnumC21946N2) C5360E0.f17593h.m5892c(c11082s), false, false));
        C5360E0.f17592g.getClass();
        this.f40299i = c13132j;
        this.f40300j = interfaceC20904w;
    }

    /* JADX INFO: renamed from: n */
    public static final Object m14387n(VoiceTrainingViewModelImpl voiceTrainingViewModelImpl, boolean z6, AbstractC19694j abstractC19694j) {
        InterfaceC20904w interfaceC20904w = voiceTrainingViewModelImpl.f40300j;
        if (z6) {
            interfaceC20904w.mo21447a(C20862H.f66417y, C17690x.f56481Y);
        } else {
            interfaceC20904w.mo21447a(C20862H.f66416x, C17690x.f56481Y);
        }
        return voiceTrainingViewModelImpl.f40299i.m14816m(z6, abstractC19694j);
    }

    /* JADX INFO: renamed from: o */
    public static final Object m14388o(VoiceTrainingViewModelImpl voiceTrainingViewModelImpl, boolean z6, AbstractC19694j abstractC19694j) {
        InterfaceC20904w interfaceC20904w = voiceTrainingViewModelImpl.f40300j;
        if (z6) {
            interfaceC20904w.mo21447a(C20862H.f66397e, C17690x.f56481Y);
        } else {
            interfaceC20904w.mo21447a(C20862H.f66396d, C17690x.f56481Y);
        }
        return voiceTrainingViewModelImpl.f40299i.m14812i(z6, abstractC19694j);
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC5443e intent = (InterfaceC5443e) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C5442d) {
            m14394i(new VoiceTrainingViewModelImpl$onIntent$1(this, null));
        } else if (intent instanceof C5441c) {
            m14394i(new VoiceTrainingViewModelImpl$onIntent$2(this, null));
        }
    }
}
