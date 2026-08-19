package com.openai.feature.serverstatus.impl.unsupportedcountry;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1081wc.C20897p;
import p1081wc.InterfaceC20904w;
import p170Gg.C3057e;
import p248Jk.InterfaceC4473d;
import p876lm.InterfaceC17068a;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/serverstatus/impl/unsupportedcountry/UnsupportedCountryViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/serverstatus/impl/unsupportedcountry/UnsupportedCountryViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UnsupportedCountryViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: b */
    public static final Companion f39471b = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f39472a;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/serverstatus/impl/unsupportedcountry/UnsupportedCountryViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public UnsupportedCountryViewModelImpl_Factory(InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f39472a = analyticsService;
    }

    /* JADX INFO: renamed from: a */
    public static final UnsupportedCountryViewModelImpl_Factory m14349a(InterfaceC17068a analyticsService) {
        f39471b.getClass();
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        return new UnsupportedCountryViewModelImpl_Factory(analyticsService);
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39472a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        f39471b.getClass();
        UnsupportedCountryViewModelImpl unsupportedCountryViewModelImpl = new UnsupportedCountryViewModelImpl(C3057e.f9220a);
        ((InterfaceC20904w) obj).mo21447a(C20897p.f66611k, C17690x.f56481Y);
        return unsupportedCountryViewModelImpl;
    }
}
