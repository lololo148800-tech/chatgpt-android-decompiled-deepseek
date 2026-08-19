package com.openai.feature.jawbone.impl.tools;

import android.app.Application;
import gd.C13969n2;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p092Dc.C1991h;
import p092Dc.C1992i;
import p092Dc.C1993j;
import p1081wc.InterfaceC20904w;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p324Mn.C5531a;
import p854kf.C16390h;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/jawbone/impl/tools/JawboneToolViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/jawbone/impl/tools/JawboneToolViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class JawboneToolViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: h */
    public static final Companion f38467h = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f38468a;

    /* JADX INFO: renamed from: b */
    public final C1993j f38469b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f38470c;

    /* JADX INFO: renamed from: d */
    public final C1992i f38471d;

    /* JADX INFO: renamed from: e */
    public final C4474e f38472e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17068a f38473f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC17068a f38474g;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/jawbone/impl/tools/JawboneToolViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public JawboneToolViewModelImpl_Factory(InterfaceC17068a repository, C1993j defaultLocale, InterfaceC17068a stringResolver, C1992i clock, C4474e application, InterfaceC17068a configurationManager, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(repository, "repository");
        AbstractC16544l.m18094g(defaultLocale, "defaultLocale");
        AbstractC16544l.m18094g(stringResolver, "stringResolver");
        AbstractC16544l.m18094g(clock, "clock");
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(configurationManager, "configurationManager");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f38468a = repository;
        this.f38469b = defaultLocale;
        this.f38470c = stringResolver;
        this.f38471d = clock;
        this.f38472e = application;
        this.f38473f = configurationManager;
        this.f38474g = analyticsService;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f38468a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        C16390h c16390h = (C16390h) obj;
        Locale locale = (Locale) this.f38469b.get();
        Object obj2 = this.f38470c.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        C1991h c1991h = (C1991h) obj2;
        this.f38471d.get();
        C5531a c5531a = C5531a.f17986a;
        Object obj3 = this.f38472e.f14617a;
        AbstractC16544l.m18093f(obj3, "get(...)");
        Application application = (Application) obj3;
        Object obj4 = this.f38473f.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        C13969n2 c13969n2 = (C13969n2) obj4;
        Object obj5 = this.f38474g.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj5;
        f38467h.getClass();
        return new JawboneToolViewModelImpl(c16390h, locale, c1991h, c5531a, application, c13969n2, interfaceC20904w);
    }
}
