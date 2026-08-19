package com.openai.feature.conversations.impl.compliance;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import ni.C17641o;
import p1081wc.InterfaceC20904w;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p876lm.InterfaceC17068a;
import p924od.C18075e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/compliance/ComplianceViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/conversations/impl/compliance/ComplianceViewModelImpl;", "Companion", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ComplianceViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: d */
    public static final Companion f37560d = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f37561a;

    /* JADX INFO: renamed from: b */
    public final C4474e f37562b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f37563c;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/compliance/ComplianceViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public ComplianceViewModelImpl_Factory(InterfaceC17068a complianceRepository, C4474e userCoroutineScope, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(complianceRepository, "complianceRepository");
        AbstractC16544l.m18094g(userCoroutineScope, "userCoroutineScope");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f37561a = complianceRepository;
        this.f37562b = userCoroutineScope;
        this.f37563c = analyticsService;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f37561a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f37562b.f14617a;
        AbstractC16544l.m18093f(obj2, "get(...)");
        Object obj3 = this.f37563c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        f37560d.getClass();
        return new ComplianceViewModelImpl((C18075e) obj, (C17641o) obj2, (InterfaceC20904w) obj3);
    }
}
