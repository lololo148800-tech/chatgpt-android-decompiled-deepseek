package com.openai.feature.voice.impl;

import androidx.lifecycle.ViewModelKt;
import be.C11345b;
import com.openai.feature.voice.impl.DebugVoiceViewModelImpl.C125307;
import com.openai.feature.voice.impl.DebugVoiceViewModelImpl.C125318;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p103Dn.AbstractC2124C;
import p103Dn.C2207t0;
import p148Fi.EnumC2779N0;
import p246Ji.C4365e;
import p248Jk.InterfaceC4473d;
import p317Mg.C5350a;
import p341Ni.C5784h0;
import p341Ni.C5793m;
import p876lm.InterfaceC17068a;
import p909nm.C17689w;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/voice/impl/DebugVoiceViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/voice/impl/DebugVoiceViewModelImpl;", "Companion", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DebugVoiceViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: d */
    public static final Companion f39963d = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f39964a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f39965b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f39966c;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/voice/impl/DebugVoiceViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public DebugVoiceViewModelImpl_Factory(InterfaceC17068a voiceModeService, InterfaceC17068a developerSettingsStore, InterfaceC17068a conversationIdsProvider) {
        AbstractC16544l.m18094g(voiceModeService, "voiceModeService");
        AbstractC16544l.m18094g(developerSettingsStore, "developerSettingsStore");
        AbstractC16544l.m18094g(conversationIdsProvider, "conversationIdsProvider");
        this.f39964a = voiceModeService;
        this.f39965b = developerSettingsStore;
        this.f39966c = conversationIdsProvider;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39964a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        C5784h0 c5784h0 = (C5784h0) obj;
        Object obj2 = this.f39965b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        Object obj3 = this.f39966c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        f39963d.getClass();
        EnumC2779N0 enumC2779N0 = EnumC2779N0.Idle;
        C5793m c5793m = C5793m.f18928a;
        C17690x c17690x = C17690x.f56481Y;
        C17689w c17689w = C17689w.f56480Y;
        DebugVoiceViewModelImpl debugVoiceViewModelImpl = new DebugVoiceViewModelImpl(new C4365e("", "", "", "", "", "", "", enumC2779N0, c5793m, c17690x, 0, 0, "", "", "", "", "", false, c17689w, c17689w, c17689w, c17689w, null));
        debugVoiceViewModelImpl.m14396l(DebugVoiceViewModelImpl.C125241.f39944Y, ((C11345b) obj3).f34301c);
        debugVoiceViewModelImpl.m14396l(DebugVoiceViewModelImpl.C125252.f39945Y, c5784h0.f18835I);
        debugVoiceViewModelImpl.m14396l(DebugVoiceViewModelImpl.C125263.f39946Y, c5784h0.f18831E);
        debugVoiceViewModelImpl.m14396l(DebugVoiceViewModelImpl.C125274.f39947Y, c5784h0.f18837K);
        debugVoiceViewModelImpl.m14396l(DebugVoiceViewModelImpl.C125285.f39948Y, c5784h0.f18829C);
        debugVoiceViewModelImpl.m14396l(DebugVoiceViewModelImpl.C125296.f39949Y, c5784h0.f18864p);
        AbstractC2124C.m3226y(new C2207t0(c5784h0.f18833G, c5784h0.f18827A, debugVoiceViewModelImpl.new C125307(null), 0), ViewModelKt.m12143a(debugVoiceViewModelImpl));
        AbstractC2124C.m3226y(new C2207t0(c5784h0.f18842P, c5784h0.f18843Q, debugVoiceViewModelImpl.new C125318(c5784h0, null), 0), ViewModelKt.m12143a(debugVoiceViewModelImpl));
        debugVoiceViewModelImpl.m14396l(DebugVoiceViewModelImpl.C125329.f39962Y, ((C5350a) obj2).f64176f);
        return debugVoiceViewModelImpl;
    }
}
