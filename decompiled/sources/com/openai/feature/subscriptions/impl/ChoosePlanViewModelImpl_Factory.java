package com.openai.feature.subscriptions.impl;

import bh.C11431e;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p092Dc.C1991h;
import p1081wc.InterfaceC20904w;
import p248Jk.InterfaceC4473d;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/subscriptions/impl/ChoosePlanViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/subscriptions/impl/ChoosePlanViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ChoosePlanViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: d */
    public static final Companion f39889d = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f39890a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f39891b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f39892c;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/subscriptions/impl/ChoosePlanViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public ChoosePlanViewModelImpl_Factory(InterfaceC17068a stringResolver, InterfaceC17068a subscriptionManager, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(stringResolver, "stringResolver");
        AbstractC16544l.m18094g(subscriptionManager, "subscriptionManager");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f39890a = stringResolver;
        this.f39891b = subscriptionManager;
        this.f39892c = analyticsService;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39890a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f39891b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        Object obj3 = this.f39892c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        f39889d.getClass();
        return new ChoosePlanViewModelImpl((C1991h) obj, (C11431e) obj2, (InterfaceC20904w) obj3);
    }
}
