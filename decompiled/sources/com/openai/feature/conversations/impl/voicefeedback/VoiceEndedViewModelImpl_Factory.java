package com.openai.feature.conversations.impl.voicefeedback;

import be.C11345b;
import gd.InterfaceC13849E;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1081wc.InterfaceC20904w;
import p148Fi.C2854t0;
import p248Jk.InterfaceC4473d;
import p708dh.C13132J;
import p708dh.C13133K;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/voicefeedback/VoiceEndedViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/conversations/impl/voicefeedback/VoiceEndedViewModelImpl;", "Companion", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class VoiceEndedViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: g */
    public static final Companion f38080g = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f38081a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f38082b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f38083c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f38084d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f38085e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17068a f38086f;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/voicefeedback/VoiceEndedViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public VoiceEndedViewModelImpl_Factory(InterfaceC17068a experimentManager, InterfaceC17068a settingsRepository, InterfaceC17068a remoteUserSettingsRepository, InterfaceC17068a conversationIdsProvider, InterfaceC17068a voiceApi, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(settingsRepository, "settingsRepository");
        AbstractC16544l.m18094g(remoteUserSettingsRepository, "remoteUserSettingsRepository");
        AbstractC16544l.m18094g(conversationIdsProvider, "conversationIdsProvider");
        AbstractC16544l.m18094g(voiceApi, "voiceApi");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f38081a = experimentManager;
        this.f38082b = settingsRepository;
        this.f38083c = remoteUserSettingsRepository;
        this.f38084d = conversationIdsProvider;
        this.f38085e = voiceApi;
        this.f38086f = analyticsService;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f38081a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj;
        Object obj2 = this.f38082b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        C13133K c13133k = (C13133K) obj2;
        Object obj3 = this.f38083c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C13132J c13132j = (C13132J) obj3;
        Object obj4 = this.f38084d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        C11345b c11345b = (C11345b) obj4;
        Object obj5 = this.f38085e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        C2854t0 c2854t0 = (C2854t0) obj5;
        Object obj6 = this.f38086f.get();
        AbstractC16544l.m18093f(obj6, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj6;
        f38080g.getClass();
        return new VoiceEndedViewModelImpl(interfaceC13849E, c13133k, c13132j, c11345b, c2854t0, interfaceC20904w);
    }
}
