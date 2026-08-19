package com.openai.feature.voice.impl.assistant;

import gd.InterfaceC13849E;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import md.C17236j;
import p248Jk.InterfaceC4473d;
import p708dh.C13133K;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/voice/impl/assistant/AssistantViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/voice/impl/assistant/AssistantViewModelImpl;", "Companion", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AssistantViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: d */
    public static final Companion f40263d = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f40264a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f40265b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f40266c;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/voice/impl/assistant/AssistantViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public AssistantViewModelImpl_Factory(InterfaceC17068a assistantSessionProvider, InterfaceC17068a settingsRepository, InterfaceC17068a experimentManager) {
        AbstractC16544l.m18094g(assistantSessionProvider, "assistantSessionProvider");
        AbstractC16544l.m18094g(settingsRepository, "settingsRepository");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        this.f40264a = assistantSessionProvider;
        this.f40265b = settingsRepository;
        this.f40266c = experimentManager;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f40264a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f40265b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        Object obj3 = this.f40266c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        f40263d.getClass();
        return new AssistantViewModelImpl((C17236j) obj, (C13133K) obj2, (InterfaceC13849E) obj3);
    }
}
