package com.openai.feature.reporting.impl;

import gd.C13969n2;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p092Dc.C1991h;
import p1081wc.InterfaceC20904w;
import p248Jk.InterfaceC4473d;
import p315Me.Myis.CxcULo;
import p876lm.InterfaceC17068a;
import tg.C19945d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/reporting/impl/ReportingViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/reporting/impl/ReportingViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ReportingViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: e */
    public static final Companion f39400e = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f39401a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f39402b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f39403c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f39404d;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/reporting/impl/ReportingViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39401a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f39402b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        Object obj3 = this.f39403c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        Object obj4 = this.f39404d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        f39400e.getClass();
        return new ReportingViewModelImpl((C19945d) obj, (C1991h) obj2, (C13969n2) obj3, (InterfaceC20904w) obj4);
    }

    public ReportingViewModelImpl_Factory(InterfaceC17068a interfaceC17068a, InterfaceC17068a stringResolver, InterfaceC17068a configurationManager, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(interfaceC17068a, CxcULo.hkpoQUZDc);
        AbstractC16544l.m18094g(stringResolver, "stringResolver");
        AbstractC16544l.m18094g(configurationManager, "configurationManager");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f39401a = interfaceC17068a;
        this.f39402b = stringResolver;
        this.f39403c = configurationManager;
        this.f39404d = analyticsService;
    }
}
