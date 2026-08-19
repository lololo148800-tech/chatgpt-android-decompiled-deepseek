package com.openai.feature.disclosure.impl;

import androidx.lifecycle.C11082S;
import gd.InterfaceC13849E;
import id.C14968g;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p092Dc.C1991h;
import p1081wc.InterfaceC20904w;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p708dh.C13132J;
import p708dh.C13133K;
import p708dh.C13141T;
import p876lm.InterfaceC17068a;
import p948pi.C18418a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/disclosure/impl/DisclosureViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/disclosure/impl/DisclosureViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DisclosureViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: j */
    public static final Companion f38129j = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f38130a;

    /* JADX INFO: renamed from: b */
    public final C4474e f38131b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f38132c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f38133d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f38134e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17068a f38135f;

    /* JADX INFO: renamed from: g */
    public final C4474e f38136g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC17068a f38137h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC17068a f38138i;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/disclosure/impl/DisclosureViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public DisclosureViewModelImpl_Factory(InterfaceC17068a stringResolver, C4474e c4474e, InterfaceC17068a anonymousPromptRepository, InterfaceC17068a userAnnouncementsRepository, InterfaceC17068a remoteUserSettingsRepository, InterfaceC17068a settingsRepository, C4474e accountSession, InterfaceC17068a experimentManager, InterfaceC17068a analytics) {
        AbstractC16544l.m18094g(stringResolver, "stringResolver");
        AbstractC16544l.m18094g(anonymousPromptRepository, "anonymousPromptRepository");
        AbstractC16544l.m18094g(userAnnouncementsRepository, "userAnnouncementsRepository");
        AbstractC16544l.m18094g(remoteUserSettingsRepository, "remoteUserSettingsRepository");
        AbstractC16544l.m18094g(settingsRepository, "settingsRepository");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(analytics, "analytics");
        this.f38130a = stringResolver;
        this.f38131b = c4474e;
        this.f38132c = anonymousPromptRepository;
        this.f38133d = userAnnouncementsRepository;
        this.f38134e = remoteUserSettingsRepository;
        this.f38135f = settingsRepository;
        this.f38136g = accountSession;
        this.f38137h = experimentManager;
        this.f38138i = analytics;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f38130a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        C1991h c1991h = (C1991h) obj;
        Object obj2 = this.f38131b.f14617a;
        AbstractC16544l.m18093f(obj2, "get(...)");
        C11082S c11082s = (C11082S) obj2;
        Object obj3 = this.f38132c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C14968g c14968g = (C14968g) obj3;
        Object obj4 = this.f38133d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        C13141T c13141t = (C13141T) obj4;
        Object obj5 = this.f38134e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        C13132J c13132j = (C13132J) obj5;
        Object obj6 = this.f38135f.get();
        AbstractC16544l.m18093f(obj6, "get(...)");
        C13133K c13133k = (C13133K) obj6;
        Object obj7 = this.f38136g.f14617a;
        AbstractC16544l.m18093f(obj7, "get(...)");
        C18418a c18418a = (C18418a) obj7;
        Object obj8 = this.f38137h.get();
        AbstractC16544l.m18093f(obj8, "get(...)");
        InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj8;
        Object obj9 = this.f38138i.get();
        AbstractC16544l.m18093f(obj9, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj9;
        f38129j.getClass();
        return new DisclosureViewModelImpl(c1991h, c11082s, c14968g, c13141t, c13132j, c13133k, c18418a, interfaceC13849E, interfaceC20904w);
    }
}
