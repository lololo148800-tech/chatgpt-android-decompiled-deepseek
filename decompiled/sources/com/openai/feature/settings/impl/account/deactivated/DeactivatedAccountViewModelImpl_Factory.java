package com.openai.feature.settings.impl.account.deactivated;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p248Jk.InterfaceC4473d;
import p708dh.C13158l;
import p708dh.C13166t;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/settings/impl/account/deactivated/DeactivatedAccountViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/settings/impl/account/deactivated/DeactivatedAccountViewModelImpl;", "Companion", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DeactivatedAccountViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: c */
    public static final Companion f39485c = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f39486a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f39487b;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/settings/impl/account/deactivated/DeactivatedAccountViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public DeactivatedAccountViewModelImpl_Factory(InterfaceC17068a accountUserRepository, InterfaceC17068a accountStatusRepository) {
        AbstractC16544l.m18094g(accountUserRepository, "accountUserRepository");
        AbstractC16544l.m18094g(accountStatusRepository, "accountStatusRepository");
        this.f39486a = accountUserRepository;
        this.f39487b = accountStatusRepository;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39486a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f39487b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        f39485c.getClass();
        return new DeactivatedAccountViewModelImpl((C13166t) obj, (C13158l) obj2);
    }
}
