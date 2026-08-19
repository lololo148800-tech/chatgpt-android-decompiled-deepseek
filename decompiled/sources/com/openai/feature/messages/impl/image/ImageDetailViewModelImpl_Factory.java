package com.openai.feature.messages.impl.image;

import gd.C13993t2;
import gd.InterfaceC13849E;
import ke.C16382j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p092Dc.C1991h;
import p1025te.C19864O;
import p1041uf.C20217f;
import p1081wc.InterfaceC20904w;
import p218If.C3710a;
import p248Jk.C4471b;
import p248Jk.InterfaceC4473d;
import p338Ne.C5718f;
import p708dh.C13141T;
import p787he.C14459O;
import p876lm.InterfaceC17068a;
import tf.C19909N;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/messages/impl/image/ImageDetailViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/messages/impl/image/ImageDetailViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ImageDetailViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: m */
    public static final Companion f38809m = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f38810a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f38811b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f38812c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f38813d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f38814e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17068a f38815f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC17068a f38816g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC17068a f38817h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC17068a f38818i;

    /* JADX INFO: renamed from: j */
    public final C4471b f38819j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC17068a f38820k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC17068a f38821l;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/messages/impl/image/ImageDetailViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public ImageDetailViewModelImpl_Factory(InterfaceC17068a inputStateFlow, InterfaceC17068a imageSelectionObserver, InterfaceC17068a imageActionHandler, InterfaceC17068a experimentManager, InterfaceC17068a stringResolver, InterfaceC17068a userAnnouncementsRepository, InterfaceC17068a imageAnalytics, InterfaceC17068a analyticsService, InterfaceC17068a layerManager, C4471b conversationCoordinator, InterfaceC17068a sharingService, InterfaceC17068a conversationGizmoProvider) {
        AbstractC16544l.m18094g(inputStateFlow, "inputStateFlow");
        AbstractC16544l.m18094g(imageSelectionObserver, "imageSelectionObserver");
        AbstractC16544l.m18094g(imageActionHandler, "imageActionHandler");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(stringResolver, "stringResolver");
        AbstractC16544l.m18094g(userAnnouncementsRepository, "userAnnouncementsRepository");
        AbstractC16544l.m18094g(imageAnalytics, "imageAnalytics");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        AbstractC16544l.m18094g(layerManager, "layerManager");
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        AbstractC16544l.m18094g(sharingService, "sharingService");
        AbstractC16544l.m18094g(conversationGizmoProvider, "conversationGizmoProvider");
        this.f38810a = inputStateFlow;
        this.f38811b = imageSelectionObserver;
        this.f38812c = imageActionHandler;
        this.f38813d = experimentManager;
        this.f38814e = stringResolver;
        this.f38815f = userAnnouncementsRepository;
        this.f38816g = imageAnalytics;
        this.f38817h = analyticsService;
        this.f38818i = layerManager;
        this.f38819j = conversationCoordinator;
        this.f38820k = sharingService;
        this.f38821l = conversationGizmoProvider;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f38810a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        C19864O c19864o = (C19864O) obj;
        Object obj2 = this.f38811b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        C19909N c19909n = (C19909N) obj2;
        Object obj3 = this.f38812c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C20217f c20217f = (C20217f) obj3;
        Object obj4 = this.f38813d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj4;
        Object obj5 = this.f38814e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        C1991h c1991h = (C1991h) obj5;
        Object obj6 = this.f38815f.get();
        AbstractC16544l.m18093f(obj6, "get(...)");
        C13141T c13141t = (C13141T) obj6;
        Object obj7 = this.f38816g.get();
        AbstractC16544l.m18093f(obj7, "get(...)");
        C3710a c3710a = (C3710a) obj7;
        Object obj8 = this.f38817h.get();
        AbstractC16544l.m18093f(obj8, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj8;
        Object obj9 = this.f38818i.get();
        AbstractC16544l.m18093f(obj9, "get(...)");
        C13993t2 c13993t2 = (C13993t2) obj9;
        Object obj10 = this.f38819j.get();
        AbstractC16544l.m18093f(obj10, "get(...)");
        C14459O c14459o = (C14459O) obj10;
        Object obj11 = this.f38820k.get();
        AbstractC16544l.m18093f(obj11, "get(...)");
        C5718f c5718f = (C5718f) obj11;
        Object obj12 = this.f38821l.get();
        AbstractC16544l.m18093f(obj12, "get(...)");
        C16382j c16382j = (C16382j) obj12;
        f38809m.getClass();
        return new ImageDetailViewModelImpl(c19864o, c19909n, c20217f, interfaceC13849E, c1991h, c13141t, c3710a, interfaceC20904w, c13993t2, c14459o, c5718f, c16382j);
    }
}
