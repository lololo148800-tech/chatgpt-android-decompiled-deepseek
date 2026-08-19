package com.openai.feature.messages.impl.audio;

import android.app.Application;
import gd.InterfaceC13849E;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p092Dc.C1991h;
import p1061vb.C20513d;
import p1081wc.InterfaceC20904w;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p480Te.C7392q;
import p787he.C14459O;
import p873lh.C16961l;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/messages/impl/audio/MessageAudioViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/messages/impl/audio/MessageAudioViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class MessageAudioViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: i */
    public static final Companion f38717i = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4474e f38718a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f38719b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f38720c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f38721d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f38722e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17068a f38723f;

    /* JADX INFO: renamed from: g */
    public final C4471b f38724g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC17068a f38725h;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/messages/impl/audio/MessageAudioViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public MessageAudioViewModelImpl_Factory(C4474e application, InterfaceC17068a resolver, InterfaceC17068a provider, InterfaceC17068a settingsRepository, InterfaceC17068a fileServiceApi, InterfaceC17068a analyticsService, C4471b conversationCoordinator, InterfaceC17068a experimentManager) {
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(resolver, "resolver");
        AbstractC16544l.m18094g(provider, "provider");
        AbstractC16544l.m18094g(settingsRepository, "settingsRepository");
        AbstractC16544l.m18094g(fileServiceApi, "fileServiceApi");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        this.f38718a = application;
        this.f38719b = resolver;
        this.f38720c = provider;
        this.f38721d = settingsRepository;
        this.f38722e = fileServiceApi;
        this.f38723f = analyticsService;
        this.f38724g = conversationCoordinator;
        this.f38725h = experimentManager;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f38718a.f14617a;
        AbstractC16544l.m18093f(obj, "get(...)");
        Application application = (Application) obj;
        C20513d c20513d = new C20513d();
        Object obj2 = this.f38719b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        C1991h c1991h = (C1991h) obj2;
        Object obj3 = this.f38721d.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C16961l c16961l = (C16961l) obj3;
        Object obj4 = this.f38722e.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        C7392q c7392q = (C7392q) obj4;
        Object obj5 = this.f38723f.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj5;
        Object obj6 = this.f38724g.get();
        AbstractC16544l.m18093f(obj6, "get(...)");
        C14459O c14459o = (C14459O) obj6;
        Object obj7 = this.f38725h.get();
        AbstractC16544l.m18093f(obj7, "get(...)");
        InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj7;
        f38717i.getClass();
        InterfaceC17068a provider = this.f38720c;
        AbstractC16544l.m18094g(provider, "provider");
        return new MessageAudioViewModelImpl(application, c20513d, c1991h, provider, c16961l, c7392q, interfaceC20904w, c14459o, interfaceC13849E);
    }
}
