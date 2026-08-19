package com.openai.feature.messages.impl;

import bh.C11434h;
import gd.InterfaceC13849E;
import ke.C16382j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p092Dc.C1991h;
import p095Df.C2040j;
import p1041uf.C20212a;
import p1041uf.C20217f;
import p1081wc.InterfaceC20904w;
import p193Hf.C3332T;
import p217Ie.C3708d;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p268Kf.C4666u;
import p337Nd.C5710c;
import p480Te.C7392q;
import p480Te.C7395t;
import p576Xe.C9473F;
import p787he.C14459O;
import p876lm.InterfaceC17068a;
import tf.C19909N;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/messages/impl/MessagesViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/messages/impl/MessagesViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class MessagesViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: r */
    public static final Companion f38639r = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4471b f38640a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f38641b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f38642c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f38643d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f38644e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17068a f38645f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC17068a f38646g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC17068a f38647h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC17068a f38648i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC17068a f38649j;

    /* JADX INFO: renamed from: k */
    public final C4474e f38650k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC17068a f38651l;

    /* JADX INFO: renamed from: m */
    public final C4471b f38652m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC17068a f38653n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC17068a f38654o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC17068a f38655p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC17068a f38656q;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/messages/impl/MessagesViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public MessagesViewModelImpl_Factory(C4471b conversationCoordinator, InterfaceC17068a messageFileApi, InterfaceC17068a fileServiceApi, InterfaceC17068a urlAttributionsApi, InterfaceC17068a imageActionHandler, InterfaceC17068a gizmosRepository, InterfaceC17068a experimentManager, InterfaceC17068a clientActionsCoordinator, InterfaceC17068a imageSelectionObserver, InterfaceC17068a conversationGizmoProvider, C4474e conversationInfo, InterfaceC17068a stringResolver, C4471b editMessageRepository, InterfaceC17068a contentReferenceAnalytics, InterfaceC17068a canmoreRepository, InterfaceC17068a analyticsService, InterfaceC17068a subscriptionNavigationService) {
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        AbstractC16544l.m18094g(messageFileApi, "messageFileApi");
        AbstractC16544l.m18094g(fileServiceApi, "fileServiceApi");
        AbstractC16544l.m18094g(urlAttributionsApi, "urlAttributionsApi");
        AbstractC16544l.m18094g(imageActionHandler, "imageActionHandler");
        AbstractC16544l.m18094g(gizmosRepository, "gizmosRepository");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(clientActionsCoordinator, "clientActionsCoordinator");
        AbstractC16544l.m18094g(imageSelectionObserver, "imageSelectionObserver");
        AbstractC16544l.m18094g(conversationGizmoProvider, "conversationGizmoProvider");
        AbstractC16544l.m18094g(conversationInfo, "conversationInfo");
        AbstractC16544l.m18094g(stringResolver, "stringResolver");
        AbstractC16544l.m18094g(editMessageRepository, "editMessageRepository");
        AbstractC16544l.m18094g(contentReferenceAnalytics, "contentReferenceAnalytics");
        AbstractC16544l.m18094g(canmoreRepository, "canmoreRepository");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        AbstractC16544l.m18094g(subscriptionNavigationService, "subscriptionNavigationService");
        this.f38640a = conversationCoordinator;
        this.f38641b = messageFileApi;
        this.f38642c = fileServiceApi;
        this.f38643d = urlAttributionsApi;
        this.f38644e = imageActionHandler;
        this.f38645f = gizmosRepository;
        this.f38646g = experimentManager;
        this.f38647h = clientActionsCoordinator;
        this.f38648i = imageSelectionObserver;
        this.f38649j = conversationGizmoProvider;
        this.f38650k = conversationInfo;
        this.f38651l = stringResolver;
        this.f38652m = editMessageRepository;
        this.f38653n = contentReferenceAnalytics;
        this.f38654o = canmoreRepository;
        this.f38655p = analyticsService;
        this.f38656q = subscriptionNavigationService;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f38640a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        C14459O c14459o = (C14459O) obj;
        Object obj2 = this.f38641b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        C7395t c7395t = (C7395t) obj2;
        Object obj3 = this.f38642c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C7392q c7392q = (C7392q) obj3;
        Object obj4 = this.f38643d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        C2040j c2040j = (C2040j) obj4;
        Object obj5 = this.f38644e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        C20217f c20217f = (C20217f) obj5;
        Object obj6 = this.f38645f.get();
        AbstractC16544l.m18093f(obj6, "get(...)");
        C9473F c9473f = (C9473F) obj6;
        Object obj7 = this.f38646g.get();
        AbstractC16544l.m18093f(obj7, "get(...)");
        InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj7;
        Object obj8 = this.f38647h.get();
        AbstractC16544l.m18093f(obj8, "get(...)");
        C4666u c4666u = (C4666u) obj8;
        Object obj9 = this.f38648i.get();
        AbstractC16544l.m18093f(obj9, "get(...)");
        C19909N c19909n = (C19909N) obj9;
        Object obj10 = this.f38649j.get();
        AbstractC16544l.m18093f(obj10, "get(...)");
        C16382j c16382j = (C16382j) obj10;
        Object obj11 = this.f38650k.f14617a;
        AbstractC16544l.m18093f(obj11, "get(...)");
        C5710c c5710c = (C5710c) obj11;
        Object obj12 = this.f38651l.get();
        AbstractC16544l.m18093f(obj12, "get(...)");
        C1991h c1991h = (C1991h) obj12;
        Object obj13 = this.f38652m.get();
        AbstractC16544l.m18093f(obj13, "get(...)");
        C3708d c3708d = (C3708d) obj13;
        Object obj14 = this.f38653n.get();
        AbstractC16544l.m18093f(obj14, "get(...)");
        C20212a c20212a = (C20212a) obj14;
        Object obj15 = this.f38654o.get();
        AbstractC16544l.m18093f(obj15, "get(...)");
        C3332T c3332t = (C3332T) obj15;
        Object obj16 = this.f38655p.get();
        AbstractC16544l.m18093f(obj16, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj16;
        Object obj17 = this.f38656q.get();
        AbstractC16544l.m18093f(obj17, "get(...)");
        C11434h c11434h = (C11434h) obj17;
        f38639r.getClass();
        return new MessagesViewModelImpl(c14459o, c7395t, c7392q, c2040j, c20217f, c9473f, interfaceC13849E, c4666u, c19909n, c16382j, c5710c, c1991h, c3708d, c20212a, c3332t, interfaceC20904w, c11434h);
    }
}
