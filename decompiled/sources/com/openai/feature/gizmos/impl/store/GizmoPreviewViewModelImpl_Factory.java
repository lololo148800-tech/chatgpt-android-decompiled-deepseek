package com.openai.feature.gizmos.impl.store;

import androidx.lifecycle.C11082S;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1081wc.InterfaceC20904w;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p576Xe.C9473F;
import p811ih.C15000g;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/gizmos/impl/store/GizmoPreviewViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/gizmos/impl/store/GizmoPreviewViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class GizmoPreviewViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: e */
    public static final Companion f38191e = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4474e f38192a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f38193b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f38194c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f38195d;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/gizmos/impl/store/GizmoPreviewViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public GizmoPreviewViewModelImpl_Factory(C4474e c4474e, InterfaceC17068a gizmosRepository, InterfaceC17068a analyticsService, InterfaceC17068a accountUserProvider) {
        AbstractC16544l.m18094g(gizmosRepository, "gizmosRepository");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        AbstractC16544l.m18094g(accountUserProvider, "accountUserProvider");
        this.f38192a = c4474e;
        this.f38193b = gizmosRepository;
        this.f38194c = analyticsService;
        this.f38195d = accountUserProvider;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f38192a.f14617a;
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f38193b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        Object obj3 = this.f38194c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        Object obj4 = this.f38195d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        f38191e.getClass();
        return new GizmoPreviewViewModelImpl((C11082S) obj, (C9473F) obj2, (InterfaceC20904w) obj3, (C15000g) obj4);
    }
}
