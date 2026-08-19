package com.openai.feature.settings.impl.memory;

import gd.InterfaceC13849E;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p248Jk.InterfaceC4473d;
import p456Sg.C7132c;
import p576Xe.C9473F;
import p708dh.C13132J;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/settings/impl/memory/ViewMemoryViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/settings/impl/memory/ViewMemoryViewModelImpl;", "Companion", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ViewMemoryViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: e */
    public static final Companion f39708e = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f39709a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f39710b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f39711c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f39712d;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/settings/impl/memory/ViewMemoryViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public ViewMemoryViewModelImpl_Factory(InterfaceC17068a experimentManager, InterfaceC17068a memoryRepository, InterfaceC17068a remoteUserSettingsRepository, InterfaceC17068a gizmosRepository) {
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(memoryRepository, "memoryRepository");
        AbstractC16544l.m18094g(remoteUserSettingsRepository, "remoteUserSettingsRepository");
        AbstractC16544l.m18094g(gizmosRepository, "gizmosRepository");
        this.f39709a = experimentManager;
        this.f39710b = memoryRepository;
        this.f39711c = remoteUserSettingsRepository;
        this.f39712d = gizmosRepository;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39709a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f39710b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        Object obj3 = this.f39711c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        Object obj4 = this.f39712d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        f39708e.getClass();
        return new ViewMemoryViewModelImpl((InterfaceC13849E) obj, (C7132c) obj2, (C13132J) obj3, (C9473F) obj4);
    }
}
