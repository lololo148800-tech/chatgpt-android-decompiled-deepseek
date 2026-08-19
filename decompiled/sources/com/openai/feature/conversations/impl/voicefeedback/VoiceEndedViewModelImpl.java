package com.openai.feature.conversations.impl.voicefeedback;

import androidx.lifecycle.ViewModel;
import be.C11345b;
import com.squareup.anvil.annotations.ContributesMultibinding;
import gd.InterfaceC13849E;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p1081wc.AbstractC20882b;
import p1081wc.InterfaceC20904w;
import p1155zi.C22011h0;
import p1155zi.EnumC22033m2;
import p148Fi.AbstractC2788S0;
import p148Fi.AbstractC2792U0;
import p148Fi.C2854t0;
import p148Fi.C2864y0;
import p172Gi.C3061C;
import p172Gi.EnumC3068a;
import p427Rc.C6852i;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p708dh.C13132J;
import p708dh.C13133K;
import p909nm.AbstractC17659D;
import p996rm.EnumC19250a;
import re.C18956i;
import re.C18957j;
import re.C18958k;
import re.C18959l;
import re.C18960m;
import re.C18961n;
import re.C18964q;
import re.InterfaceC18962o;
import sm.AbstractC19687c;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/voicefeedback/VoiceEndedViewModelImpl;", "Lcom/openai/feature/conversations/impl/voicefeedback/VoiceEndedViewModel;", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class VoiceEndedViewModelImpl extends VoiceEndedViewModel {

    /* JADX INFO: renamed from: i */
    public final InterfaceC13849E f38034i;

    /* JADX INFO: renamed from: j */
    public final C13133K f38035j;

    /* JADX INFO: renamed from: k */
    public final C13132J f38036k;

    /* JADX INFO: renamed from: l */
    public final C11345b f38037l;

    /* JADX INFO: renamed from: m */
    public final C2854t0 f38038m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC20904w f38039n;

    /* JADX INFO: renamed from: o */
    public final C2864y0 f38040o;

    public VoiceEndedViewModelImpl(InterfaceC13849E interfaceC13849E, C13133K c13133k, C13132J c13132j, C11345b c11345b, C2854t0 c2854t0, InterfaceC20904w interfaceC20904w) {
        super(C18964q.f60519a);
        this.f38034i = interfaceC13849E;
        this.f38035j = c13133k;
        this.f38036k = c13132j;
        this.f38037l = c11345b;
        this.f38038m = c2854t0;
        this.f38039n = interfaceC20904w;
        this.f38040o = AbstractC2792U0.m3712c("VoiceFeedbackViewModel");
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC18962o intent = (InterfaceC18962o) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C18957j) {
            m14394i(new VoiceEndedViewModelImpl$onIntent$1(this, null, intent));
            return;
        }
        if (intent instanceof C18961n) {
            m14394i(new VoiceEndedViewModelImpl$onIntent$2(this, null));
            return;
        }
        if (intent instanceof C18960m) {
            m14394i(new VoiceEndedViewModelImpl$onIntent$3(this, null));
            return;
        }
        if (intent instanceof C18959l) {
            m14394i(new VoiceEndedViewModelImpl$onIntent$4(this, null, intent));
        } else if (intent instanceof C18956i) {
            m14397m(VoiceEndedViewModelImpl$onIntent$5.f38063Y);
        } else if (intent instanceof C18958k) {
            m14394i(new VoiceEndedViewModelImpl$onIntent$6(this, null, intent));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m14273n(C3061C c3061c, AbstractC20882b abstractC20882b, Map map, AbstractC19687c abstractC19687c) {
        VoiceEndedViewModelImpl$trackVoiceEvent$1 voiceEndedViewModelImpl$trackVoiceEvent$1;
        C17309l[] c17309lArr;
        Object objM3221t;
        VoiceEndedViewModelImpl voiceEndedViewModelImpl;
        C17309l[] c17309lArr2;
        C3061C c3061c2;
        int i10;
        AbstractC20882b abstractC20882b2;
        String str;
        if (abstractC19687c instanceof VoiceEndedViewModelImpl$trackVoiceEvent$1) {
            voiceEndedViewModelImpl$trackVoiceEvent$1 = (VoiceEndedViewModelImpl$trackVoiceEvent$1) abstractC19687c;
            int i11 = voiceEndedViewModelImpl$trackVoiceEvent$1.f38079w0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                voiceEndedViewModelImpl$trackVoiceEvent$1.f38079w0 = i11 - Integer.MIN_VALUE;
            } else {
                voiceEndedViewModelImpl$trackVoiceEvent$1 = new VoiceEndedViewModelImpl$trackVoiceEvent$1(this, abstractC19687c);
            }
        } else {
            voiceEndedViewModelImpl$trackVoiceEvent$1 = new VoiceEndedViewModelImpl$trackVoiceEvent$1(this, abstractC19687c);
        }
        Object obj = voiceEndedViewModelImpl$trackVoiceEvent$1.f38077u0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = voiceEndedViewModelImpl$trackVoiceEvent$1.f38079w0;
        if (i12 == 0) {
            AbstractC9233X.m9807c(obj);
            c17309lArr = new C17309l[7];
            c17309lArr[0] = new C17309l("voice_session_id", c3061c.f9230b);
            c17309lArr[1] = new C17309l("surface", c3061c.f9231c.f9238Y);
            EnumC22033m2 enumC22033m2 = c3061c.f9232d;
            c17309lArr[2] = new C17309l("voice_mode", enumC22033m2.f69696Y);
            c17309lArr[3] = new C17309l("voice_advanced_mode", Boolean.valueOf(enumC22033m2 == EnumC22033m2.Advanced));
            C6852i c6852i = this.f38037l.f34301c;
            voiceEndedViewModelImpl$trackVoiceEvent$1.f38069Y = this;
            voiceEndedViewModelImpl$trackVoiceEvent$1.f38070Z = c3061c;
            voiceEndedViewModelImpl$trackVoiceEvent$1.f38071o0 = abstractC20882b;
            voiceEndedViewModelImpl$trackVoiceEvent$1.f38072p0 = c17309lArr;
            voiceEndedViewModelImpl$trackVoiceEvent$1.f38073q0 = map;
            voiceEndedViewModelImpl$trackVoiceEvent$1.f38074r0 = c17309lArr;
            voiceEndedViewModelImpl$trackVoiceEvent$1.f38075s0 = "conversation_id";
            voiceEndedViewModelImpl$trackVoiceEvent$1.f38076t0 = 4;
            voiceEndedViewModelImpl$trackVoiceEvent$1.f38079w0 = 1;
            objM3221t = AbstractC2124C.m3221t(c6852i, voiceEndedViewModelImpl$trackVoiceEvent$1);
            if (objM3221t == enumC19250a) {
                return enumC19250a;
            }
            voiceEndedViewModelImpl = this;
            c17309lArr2 = c17309lArr;
            c3061c2 = c3061c;
            i10 = 4;
            abstractC20882b2 = abstractC20882b;
            str = "conversation_id";
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = voiceEndedViewModelImpl$trackVoiceEvent$1.f38076t0;
            str = voiceEndedViewModelImpl$trackVoiceEvent$1.f38075s0;
            C17309l[] c17309lArr3 = voiceEndedViewModelImpl$trackVoiceEvent$1.f38074r0;
            Map map2 = voiceEndedViewModelImpl$trackVoiceEvent$1.f38073q0;
            c17309lArr2 = voiceEndedViewModelImpl$trackVoiceEvent$1.f38072p0;
            abstractC20882b2 = voiceEndedViewModelImpl$trackVoiceEvent$1.f38071o0;
            c3061c2 = voiceEndedViewModelImpl$trackVoiceEvent$1.f38070Z;
            VoiceEndedViewModelImpl voiceEndedViewModelImpl2 = voiceEndedViewModelImpl$trackVoiceEvent$1.f38069Y;
            AbstractC9233X.m9807c(obj);
            c17309lArr = c17309lArr3;
            map = map2;
            voiceEndedViewModelImpl = voiceEndedViewModelImpl2;
            objM3221t = obj;
        }
        c17309lArr[i10] = new C17309l(str, ((C22011h0) objM3221t).f69652a);
        c3061c2.getClass();
        c17309lArr2[5] = new C17309l("ended_from_backgrounding", Boolean.valueOf(c3061c2.f9233e == EnumC3068a.AppBackgrounded));
        c17309lArr2[6] = new C17309l("has_video_enabled", Boolean.valueOf(c3061c2.f9234f));
        LinkedHashMap linkedHashMapM19248j = AbstractC17659D.m19248j(map, AbstractC17659D.m19244f(c17309lArr2));
        voiceEndedViewModelImpl.f38039n.mo21447a(abstractC20882b2, linkedHashMapM19248j);
        if (AbstractC2788S0.f8511a.contains(abstractC20882b2)) {
            AbstractC8160o6.m8731f(voiceEndedViewModelImpl.f38040o, abstractC20882b2.toString(), null, linkedHashMapM19248j, 2);
        }
        return C17296C.f55119a;
    }
}
