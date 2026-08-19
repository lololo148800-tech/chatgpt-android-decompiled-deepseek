package com.openai.feature.sharing.impl;

import android.app.Application;
import androidx.lifecycle.C11082S;
import gd.C13993t2;
import gd.InterfaceC13849E;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p015Ad.C0431f;
import p1081wc.InterfaceC20904w;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p338Ne.C5718f;
import p576Xe.C9473F;
import p876lm.InterfaceC17068a;
import p948pi.C18418a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/sharing/impl/ViewSharedConversationViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/sharing/impl/ViewSharedConversationViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ViewSharedConversationViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: j */
    public static final Companion f39852j = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4474e f39853a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f39854b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f39855c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f39856d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f39857e;

    /* JADX INFO: renamed from: f */
    public final C4474e f39858f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC17068a f39859g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC17068a f39860h;

    /* JADX INFO: renamed from: i */
    public final C4474e f39861i;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/sharing/impl/ViewSharedConversationViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public ViewSharedConversationViewModelImpl_Factory(C4474e c4474e, InterfaceC17068a gizmosRepository, InterfaceC17068a conversationItemMapper, InterfaceC17068a experimentManager, InterfaceC17068a layerManager, C4474e authSession, InterfaceC17068a analyticsService, InterfaceC17068a sharedConversationService, C4474e context) {
        AbstractC16544l.m18094g(gizmosRepository, "gizmosRepository");
        AbstractC16544l.m18094g(conversationItemMapper, "conversationItemMapper");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(layerManager, "layerManager");
        AbstractC16544l.m18094g(authSession, "authSession");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        AbstractC16544l.m18094g(sharedConversationService, "sharedConversationService");
        AbstractC16544l.m18094g(context, "context");
        this.f39853a = c4474e;
        this.f39854b = gizmosRepository;
        this.f39855c = conversationItemMapper;
        this.f39856d = experimentManager;
        this.f39857e = layerManager;
        this.f39858f = authSession;
        this.f39859g = analyticsService;
        this.f39860h = sharedConversationService;
        this.f39861i = context;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39853a.f14617a;
        AbstractC16544l.m18093f(obj, "get(...)");
        C11082S c11082s = (C11082S) obj;
        Object obj2 = this.f39854b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        C9473F c9473f = (C9473F) obj2;
        Object obj3 = this.f39855c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C0431f c0431f = (C0431f) obj3;
        Object obj4 = this.f39856d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj4;
        Object obj5 = this.f39857e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        C13993t2 c13993t2 = (C13993t2) obj5;
        Object obj6 = this.f39858f.f14617a;
        AbstractC16544l.m18093f(obj6, "get(...)");
        C18418a c18418a = (C18418a) obj6;
        Object obj7 = this.f39859g.get();
        AbstractC16544l.m18093f(obj7, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj7;
        Object obj8 = this.f39860h.get();
        AbstractC16544l.m18093f(obj8, "get(...)");
        C5718f c5718f = (C5718f) obj8;
        Object obj9 = this.f39861i.f14617a;
        AbstractC16544l.m18093f(obj9, "get(...)");
        Application application = (Application) obj9;
        f39852j.getClass();
        return new ViewSharedConversationViewModelImpl(c11082s, c9473f, c0431f, interfaceC13849E, c13993t2, c18418a, interfaceC20904w, c5718f, application);
    }
}
