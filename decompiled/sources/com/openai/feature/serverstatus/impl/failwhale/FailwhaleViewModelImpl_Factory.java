package com.openai.feature.serverstatus.impl.failwhale;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1081wc.InterfaceC20904w;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p876lm.InterfaceC17068a;
import si.InterfaceC19652d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/serverstatus/impl/failwhale/FailwhaleViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/serverstatus/impl/failwhale/FailwhaleViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class FailwhaleViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: d */
    public static final Companion f39456d = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4474e f39457a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f39458b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f39459c;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/serverstatus/impl/failwhale/FailwhaleViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public FailwhaleViewModelImpl_Factory(C4474e context, InterfaceC17068a serverStatusService, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(serverStatusService, "serverStatusService");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f39457a = context;
        this.f39458b = serverStatusService;
        this.f39459c = analyticsService;
    }

    /* JADX INFO: renamed from: a */
    public static final FailwhaleViewModelImpl_Factory m14347a(C4474e context, InterfaceC17068a serverStatusService, InterfaceC17068a analyticsService) {
        f39456d.getClass();
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(serverStatusService, "serverStatusService");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        return new FailwhaleViewModelImpl_Factory(context, serverStatusService, analyticsService);
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39457a.f14617a;
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f39458b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        Object obj3 = this.f39459c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        f39456d.getClass();
        return new FailwhaleViewModelImpl((Application) obj, (InterfaceC19652d) obj2, (InterfaceC20904w) obj3);
    }
}
