package com.openai.feature.gizmoshome.impl.details;

import ke.C16382j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p016Ae.C0452n;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p337Nd.C5710c;
import p576Xe.C9473F;
import p726ef.C13374a;
import p876lm.InterfaceC17068a;
import p925oe.C18077B;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/gizmoshome/impl/details/SnorlaxHomeViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/gizmoshome/impl/details/SnorlaxHomeViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SnorlaxHomeViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: g */
    public static final Companion f38379g = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f38380a;

    /* JADX INFO: renamed from: b */
    public final C4474e f38381b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f38382c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f38383d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f38384e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17068a f38385f;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/gizmoshome/impl/details/SnorlaxHomeViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public SnorlaxHomeViewModelImpl_Factory(InterfaceC17068a conversationGizmoProvider, C4474e conversationInfo, InterfaceC17068a conversationService, InterfaceC17068a store, InterfaceC17068a conversationRepository, InterfaceC17068a snorlaxRepository) {
        AbstractC16544l.m18094g(conversationGizmoProvider, "conversationGizmoProvider");
        AbstractC16544l.m18094g(conversationInfo, "conversationInfo");
        AbstractC16544l.m18094g(conversationService, "conversationService");
        AbstractC16544l.m18094g(store, "store");
        AbstractC16544l.m18094g(conversationRepository, "conversationRepository");
        AbstractC16544l.m18094g(snorlaxRepository, "snorlaxRepository");
        this.f38380a = conversationGizmoProvider;
        this.f38381b = conversationInfo;
        this.f38382c = conversationService;
        this.f38383d = store;
        this.f38384e = conversationRepository;
        this.f38385f = snorlaxRepository;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f38380a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        C16382j c16382j = (C16382j) obj;
        Object obj2 = this.f38381b.f14617a;
        AbstractC16544l.m18093f(obj2, "get(...)");
        C5710c c5710c = (C5710c) obj2;
        Object obj3 = this.f38382c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C0452n c0452n = (C0452n) obj3;
        Object obj4 = this.f38383d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        C13374a c13374a = (C13374a) obj4;
        Object obj5 = this.f38384e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        C18077B c18077b = (C18077B) obj5;
        Object obj6 = this.f38385f.get();
        AbstractC16544l.m18093f(obj6, "get(...)");
        C9473F c9473f = (C9473F) obj6;
        f38379g.getClass();
        return new SnorlaxHomeViewModelImpl(c16382j, c5710c, c0452n, c13374a, c18077b, c9473f);
    }
}
