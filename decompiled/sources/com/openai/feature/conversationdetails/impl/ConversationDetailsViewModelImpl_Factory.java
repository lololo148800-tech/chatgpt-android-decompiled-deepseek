package com.openai.feature.conversationdetails.impl;

import gd.InterfaceC13849E;
import ke.C16382j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import ne.C17600b;
import p1081wc.InterfaceC20904w;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p337Nd.C5710c;
import p576Xe.C9473F;
import p787he.C14459O;
import p811ih.C15000g;
import p876lm.InterfaceC17068a;
import ve.C20592p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversationdetails/impl/ConversationDetailsViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/conversationdetails/impl/ConversationDetailsViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ConversationDetailsViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: j */
    public static final Companion f37321j = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4474e f37322a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f37323b;

    /* JADX INFO: renamed from: c */
    public final C4471b f37324c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f37325d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f37326e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17068a f37327f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC17068a f37328g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC17068a f37329h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC17068a f37330i;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversationdetails/impl/ConversationDetailsViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public ConversationDetailsViewModelImpl_Factory(C4474e conversationInfo, InterfaceC17068a customizationsRepository, C4471b conversationCoordinator, InterfaceC17068a conversationModelProvider, InterfaceC17068a conversationGizmoProvider, InterfaceC17068a experimentManager, InterfaceC17068a accountUserProvider, InterfaceC17068a snorlaxRepository, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(conversationInfo, "conversationInfo");
        AbstractC16544l.m18094g(customizationsRepository, "customizationsRepository");
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        AbstractC16544l.m18094g(conversationModelProvider, "conversationModelProvider");
        AbstractC16544l.m18094g(conversationGizmoProvider, "conversationGizmoProvider");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(accountUserProvider, "accountUserProvider");
        AbstractC16544l.m18094g(snorlaxRepository, "snorlaxRepository");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f37322a = conversationInfo;
        this.f37323b = customizationsRepository;
        this.f37324c = conversationCoordinator;
        this.f37325d = conversationModelProvider;
        this.f37326e = conversationGizmoProvider;
        this.f37327f = experimentManager;
        this.f37328g = accountUserProvider;
        this.f37329h = snorlaxRepository;
        this.f37330i = analyticsService;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f37322a.f14617a;
        AbstractC16544l.m18093f(obj, "get(...)");
        C5710c c5710c = (C5710c) obj;
        Object obj2 = this.f37323b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        C20592p c20592p = (C20592p) obj2;
        Object obj3 = this.f37324c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C14459O c14459o = (C14459O) obj3;
        Object obj4 = this.f37325d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        C17600b c17600b = (C17600b) obj4;
        Object obj5 = this.f37326e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        C16382j c16382j = (C16382j) obj5;
        Object obj6 = this.f37327f.get();
        AbstractC16544l.m18093f(obj6, "get(...)");
        InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj6;
        Object obj7 = this.f37328g.get();
        AbstractC16544l.m18093f(obj7, "get(...)");
        C15000g c15000g = (C15000g) obj7;
        Object obj8 = this.f37329h.get();
        AbstractC16544l.m18093f(obj8, "get(...)");
        C9473F c9473f = (C9473F) obj8;
        Object obj9 = this.f37330i.get();
        AbstractC16544l.m18093f(obj9, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj9;
        f37321j.getClass();
        return new ConversationDetailsViewModelImpl(c5710c, c20592p, c14459o, c17600b, c16382j, interfaceC13849E, c15000g, c9473f, interfaceC20904w);
    }
}
