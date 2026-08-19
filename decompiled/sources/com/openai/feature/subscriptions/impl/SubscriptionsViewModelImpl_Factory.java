package com.openai.feature.subscriptions.impl;

import androidx.lifecycle.C11082S;
import bh.C11431e;
import gd.C13993t2;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1081wc.InterfaceC20904w;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p876lm.InterfaceC17068a;
import p948pi.C18418a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/subscriptions/impl/SubscriptionsViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/subscriptions/impl/SubscriptionsViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SubscriptionsViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: f */
    public static final Companion f39923f = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f39924a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f39925b;

    /* JADX INFO: renamed from: c */
    public final C4474e f39926c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f39927d;

    /* JADX INFO: renamed from: e */
    public final C4474e f39928e;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/subscriptions/impl/SubscriptionsViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public SubscriptionsViewModelImpl_Factory(InterfaceC17068a subscriptionManager, InterfaceC17068a layerManager, C4474e accountSession, InterfaceC17068a analyticsService, C4474e c4474e) {
        AbstractC16544l.m18094g(subscriptionManager, "subscriptionManager");
        AbstractC16544l.m18094g(layerManager, "layerManager");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f39924a = subscriptionManager;
        this.f39925b = layerManager;
        this.f39926c = accountSession;
        this.f39927d = analyticsService;
        this.f39928e = c4474e;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39924a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        C11431e c11431e = (C11431e) obj;
        Object obj2 = this.f39925b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        C13993t2 c13993t2 = (C13993t2) obj2;
        Object obj3 = this.f39926c.f14617a;
        AbstractC16544l.m18093f(obj3, "get(...)");
        C18418a c18418a = (C18418a) obj3;
        Object obj4 = this.f39927d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj4;
        Object obj5 = this.f39928e.f14617a;
        AbstractC16544l.m18093f(obj5, "get(...)");
        C11082S c11082s = (C11082S) obj5;
        f39923f.getClass();
        return new SubscriptionsViewModelImpl(c11431e, c13993t2, c18418a, interfaceC20904w, c11082s);
    }
}
