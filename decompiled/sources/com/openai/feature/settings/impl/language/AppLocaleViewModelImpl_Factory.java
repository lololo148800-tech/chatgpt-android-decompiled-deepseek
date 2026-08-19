package com.openai.feature.settings.impl.language;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1081wc.InterfaceC20904w;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/settings/impl/language/AppLocaleViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/settings/impl/language/AppLocaleViewModelImpl;", "Companion", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AppLocaleViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: c */
    public static final Companion f39617c = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4474e f39618a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f39619b;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/settings/impl/language/AppLocaleViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public AppLocaleViewModelImpl_Factory(C4474e context, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f39618a = context;
        this.f39619b = analyticsService;
    }

    /* JADX INFO: renamed from: a */
    public static final AppLocaleViewModelImpl_Factory m14357a(C4474e context, InterfaceC17068a analyticsService) {
        f39617c.getClass();
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        return new AppLocaleViewModelImpl_Factory(context, analyticsService);
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39618a.f14617a;
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f39619b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        f39617c.getClass();
        return new AppLocaleViewModelImpl((Application) obj, (InterfaceC20904w) obj2);
    }
}
