package com.openai.feature.subscriptions.impl.access;

import androidx.lifecycle.C11082S;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/subscriptions/impl/access/SubscriptionAccessCheckViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/subscriptions/impl/access/SubscriptionAccessCheckViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SubscriptionAccessCheckViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: b */
    public static final Companion f39929b = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4474e f39930a;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/subscriptions/impl/access/SubscriptionAccessCheckViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public SubscriptionAccessCheckViewModelImpl_Factory(C4474e c4474e) {
        this.f39930a = c4474e;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39930a.f14617a;
        AbstractC16544l.m18093f(obj, "get(...)");
        f39929b.getClass();
        return new SubscriptionAccessCheckViewModelImpl((C11082S) obj);
    }
}
