package com.openai.feature.settings.impl.data;

import gd.InterfaceC13849E;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1081wc.InterfaceC20904w;
import p1149zc.AbstractC21864z;
import p138F8.vJO.anhfj;
import p248Jk.C4471b;
import p248Jk.InterfaceC4473d;
import p708dh.C13132J;
import p708dh.C13158l;
import p708dh.C13166t;
import p811ih.C15000g;
import p876lm.InterfaceC17068a;
import p925oe.C18086K;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/settings/impl/data/DataControlsViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/settings/impl/data/DataControlsViewModelImpl;", "Companion", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DataControlsViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: i */
    public static final Companion f39552i = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4471b f39553a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f39554b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f39555c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f39556d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f39557e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17068a f39558f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC17068a f39559g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC17068a f39560h;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/settings/impl/data/DataControlsViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39553a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        AbstractC21864z abstractC21864z = (AbstractC21864z) obj;
        Object obj2 = this.f39554b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        C18086K c18086k = (C18086K) obj2;
        Object obj3 = this.f39555c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C13132J c13132j = (C13132J) obj3;
        Object obj4 = this.f39556d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        C13166t c13166t = (C13166t) obj4;
        Object obj5 = this.f39557e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        C13158l c13158l = (C13158l) obj5;
        Object obj6 = this.f39558f.get();
        AbstractC16544l.m18093f(obj6, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj6;
        Object obj7 = this.f39559g.get();
        AbstractC16544l.m18093f(obj7, "get(...)");
        C15000g c15000g = (C15000g) obj7;
        Object obj8 = this.f39560h.get();
        AbstractC16544l.m18093f(obj8, "get(...)");
        InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj8;
        f39552i.getClass();
        return new DataControlsViewModelImpl(abstractC21864z, c18086k, c13132j, c13166t, c13158l, interfaceC20904w, c15000g, interfaceC13849E);
    }

    public DataControlsViewModelImpl_Factory(C4471b auth, InterfaceC17068a historyRepository, InterfaceC17068a remoteUserSettingsRepository, InterfaceC17068a accountUserRepository, InterfaceC17068a interfaceC17068a, InterfaceC17068a analyticsService, InterfaceC17068a accountUserProvider, InterfaceC17068a experimentManager) {
        AbstractC16544l.m18094g(auth, "auth");
        AbstractC16544l.m18094g(historyRepository, "historyRepository");
        AbstractC16544l.m18094g(remoteUserSettingsRepository, "remoteUserSettingsRepository");
        AbstractC16544l.m18094g(accountUserRepository, "accountUserRepository");
        AbstractC16544l.m18094g(interfaceC17068a, anhfj.mpbBleatkev);
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        AbstractC16544l.m18094g(accountUserProvider, "accountUserProvider");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        this.f39553a = auth;
        this.f39554b = historyRepository;
        this.f39555c = remoteUserSettingsRepository;
        this.f39556d = accountUserRepository;
        this.f39557e = interfaceC17068a;
        this.f39558f = analyticsService;
        this.f39559g = accountUserProvider;
        this.f39560h = experimentManager;
    }
}
