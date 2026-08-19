package com.openai.feature.messages.impl.listitem.content.tools.canmore;

import android.app.Application;
import be.C11345b;
import gd.InterfaceC13849E;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1061vb.C20513d;
import p1081wc.InterfaceC20904w;
import p1149zc.AbstractC21864z;
import p193Hf.C3332T;
import p193Hf.C3414w1;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p364Oh.C6226E;
import p432Rh.C6906s;
import p787he.C14459O;
import p876lm.InterfaceC17068a;
import p948pi.C18418a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/messages/impl/listitem/content/tools/canmore/CanmoreViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/messages/impl/listitem/content/tools/canmore/CanmoreViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CanmoreViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: l */
    public static final Companion f38938l = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4474e f38939a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f38940b;

    /* JADX INFO: renamed from: c */
    public final C4471b f38941c;

    /* JADX INFO: renamed from: d */
    public final C4474e f38942d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f38943e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17068a f38944f;

    /* JADX INFO: renamed from: g */
    public final C4471b f38945g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC17068a f38946h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC17068a f38947i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC17068a f38948j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC17068a f38949k;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/messages/impl/listitem/content/tools/canmore/CanmoreViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public CanmoreViewModelImpl_Factory(C4474e application, InterfaceC17068a servicesConfig, C4471b authSessionProvider, C4474e accountSession, InterfaceC17068a canmoreRepository, InterfaceC17068a conversationIdsProvider, C4471b conversationCoordinator, InterfaceC17068a analytics, InterfaceC17068a experimentManager, InterfaceC17068a persistentCookieStorage, InterfaceC17068a textdocRepository) {
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(servicesConfig, "servicesConfig");
        AbstractC16544l.m18094g(authSessionProvider, "authSessionProvider");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        AbstractC16544l.m18094g(canmoreRepository, "canmoreRepository");
        AbstractC16544l.m18094g(conversationIdsProvider, "conversationIdsProvider");
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        AbstractC16544l.m18094g(analytics, "analytics");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(persistentCookieStorage, "persistentCookieStorage");
        AbstractC16544l.m18094g(textdocRepository, "textdocRepository");
        this.f38939a = application;
        this.f38940b = servicesConfig;
        this.f38941c = authSessionProvider;
        this.f38942d = accountSession;
        this.f38943e = canmoreRepository;
        this.f38944f = conversationIdsProvider;
        this.f38945g = conversationCoordinator;
        this.f38946h = analytics;
        this.f38947i = experimentManager;
        this.f38948j = persistentCookieStorage;
        this.f38949k = textdocRepository;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f38939a.f14617a;
        AbstractC16544l.m18093f(obj, "get(...)");
        Application application = (Application) obj;
        C20513d c20513d = new C20513d();
        Object obj2 = this.f38940b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        C6226E c6226e = (C6226E) obj2;
        Object obj3 = this.f38941c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        AbstractC21864z abstractC21864z = (AbstractC21864z) obj3;
        Object obj4 = this.f38942d.f14617a;
        AbstractC16544l.m18093f(obj4, "get(...)");
        C18418a c18418a = (C18418a) obj4;
        Object obj5 = this.f38943e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        C3332T c3332t = (C3332T) obj5;
        Object obj6 = this.f38944f.get();
        AbstractC16544l.m18093f(obj6, "get(...)");
        C11345b c11345b = (C11345b) obj6;
        Object obj7 = this.f38945g.get();
        AbstractC16544l.m18093f(obj7, "get(...)");
        C14459O c14459o = (C14459O) obj7;
        Object obj8 = this.f38946h.get();
        AbstractC16544l.m18093f(obj8, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj8;
        Object obj9 = this.f38947i.get();
        AbstractC16544l.m18093f(obj9, "get(...)");
        InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj9;
        Object obj10 = this.f38948j.get();
        AbstractC16544l.m18093f(obj10, "get(...)");
        C6906s c6906s = (C6906s) obj10;
        Object obj11 = this.f38949k.get();
        AbstractC16544l.m18093f(obj11, "get(...)");
        C3414w1 c3414w1 = (C3414w1) obj11;
        f38938l.getClass();
        return new CanmoreViewModelImpl(application, c20513d, c6226e, abstractC21864z, c18418a, c3332t, c11345b, c14459o, interfaceC20904w, interfaceC13849E, c6906s, c3414w1);
    }
}
