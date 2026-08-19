package com.openai.feature.voice.impl.settings;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1081wc.InterfaceC20904w;
import p248Jk.InterfaceC4473d;
import p708dh.C13133K;
import p708dh.C13141T;
import p811ih.C15000g;
import p873lh.C16961l;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/voice/impl/settings/VoiceModeSettingsViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/voice/impl/settings/VoiceModeSettingsViewModelImpl;", "Companion", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class VoiceModeSettingsViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: f */
    public static final Companion f40293f = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f40294a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f40295b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f40296c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f40297d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f40298e;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/voice/impl/settings/VoiceModeSettingsViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public VoiceModeSettingsViewModelImpl_Factory(InterfaceC17068a accountUserProvider, InterfaceC17068a analyticsService, InterfaceC17068a repo, InterfaceC17068a announcementsRepository, InterfaceC17068a settingsRepository) {
        AbstractC16544l.m18094g(accountUserProvider, "accountUserProvider");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        AbstractC16544l.m18094g(repo, "repo");
        AbstractC16544l.m18094g(announcementsRepository, "announcementsRepository");
        AbstractC16544l.m18094g(settingsRepository, "settingsRepository");
        this.f40294a = accountUserProvider;
        this.f40295b = analyticsService;
        this.f40296c = repo;
        this.f40297d = announcementsRepository;
        this.f40298e = settingsRepository;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f40294a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        C15000g c15000g = (C15000g) obj;
        Object obj2 = this.f40295b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj2;
        Object obj3 = this.f40296c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C16961l c16961l = (C16961l) obj3;
        Object obj4 = this.f40297d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        C13141T c13141t = (C13141T) obj4;
        Object obj5 = this.f40298e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        C13133K c13133k = (C13133K) obj5;
        f40293f.getClass();
        return new VoiceModeSettingsViewModelImpl(c15000g, interfaceC20904w, c16961l, c13141t, c13133k);
    }
}
