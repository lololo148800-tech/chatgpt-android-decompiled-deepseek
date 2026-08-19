package com.openai.feature.notification.impl;

import androidx.lifecycle.C11082S;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1081wc.InterfaceC20904w;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p481Tf.C7409n;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/notification/impl/NotificationTaskViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/notification/impl/NotificationTaskViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NotificationTaskViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: d */
    public static final Companion f39015d = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f39016a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f39017b;

    /* JADX INFO: renamed from: c */
    public final C4474e f39018c;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/notification/impl/NotificationTaskViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public NotificationTaskViewModelImpl_Factory(InterfaceC17068a repository, InterfaceC17068a analyticsService, C4474e c4474e) {
        AbstractC16544l.m18094g(repository, "repository");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f39016a = repository;
        this.f39017b = analyticsService;
        this.f39018c = c4474e;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39016a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f39017b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        Object obj3 = this.f39018c.f14617a;
        AbstractC16544l.m18093f(obj3, "get(...)");
        f39015d.getClass();
        return new NotificationTaskViewModelImpl((C7409n) obj, (InterfaceC20904w) obj2, (C11082S) obj3);
    }
}
