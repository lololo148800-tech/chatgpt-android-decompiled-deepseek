package com.openai.feature.messages.impl.messagefeedback;

import gd.InterfaceC13849E;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1081wc.InterfaceC20904w;
import p218If.C3710a;
import p242Je.C4330c;
import p248Jk.C4471b;
import p248Jk.InterfaceC4473d;
import p787he.C14459O;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/messages/impl/messagefeedback/MessageFeedbackViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/messages/impl/messagefeedback/MessageFeedbackViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class MessageFeedbackViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: f */
    public static final Companion f38980f = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f38981a;

    /* JADX INFO: renamed from: b */
    public final C4471b f38982b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f38983c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f38984d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f38985e;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/messages/impl/messagefeedback/MessageFeedbackViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public MessageFeedbackViewModelImpl_Factory(InterfaceC17068a feedbackService, C4471b conversationCoordinator, InterfaceC17068a imageAnalytics, InterfaceC17068a analyticsService, InterfaceC17068a experimentManager) {
        AbstractC16544l.m18094g(feedbackService, "feedbackService");
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        AbstractC16544l.m18094g(imageAnalytics, "imageAnalytics");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        this.f38981a = feedbackService;
        this.f38982b = conversationCoordinator;
        this.f38983c = imageAnalytics;
        this.f38984d = analyticsService;
        this.f38985e = experimentManager;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f38981a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        C4330c c4330c = (C4330c) obj;
        Object obj2 = this.f38982b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        C14459O c14459o = (C14459O) obj2;
        Object obj3 = this.f38983c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C3710a c3710a = (C3710a) obj3;
        Object obj4 = this.f38984d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj4;
        Object obj5 = this.f38985e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj5;
        f38980f.getClass();
        return new MessageFeedbackViewModelImpl(c4330c, c14459o, c3710a, interfaceC20904w, interfaceC13849E);
    }
}
