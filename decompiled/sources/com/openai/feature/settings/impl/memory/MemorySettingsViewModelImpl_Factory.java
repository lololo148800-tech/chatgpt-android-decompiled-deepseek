package com.openai.feature.settings.impl.memory;

import gd.InterfaceC13849E;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p248Jk.InterfaceC4473d;
import p456Sg.C7132c;
import p708dh.C13132J;
import p811ih.C15000g;
import p876lm.InterfaceC17068a;
import ve.C20592p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/settings/impl/memory/MemorySettingsViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/settings/impl/memory/MemorySettingsViewModelImpl;", "Companion", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class MemorySettingsViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: f */
    public static final Companion f39641f = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f39642a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f39643b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f39644c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f39645d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f39646e;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/settings/impl/memory/MemorySettingsViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public MemorySettingsViewModelImpl_Factory(InterfaceC17068a remoteUserSettingsRepository, InterfaceC17068a customizationsRepository, InterfaceC17068a memoryRepository, InterfaceC17068a experimentManager, InterfaceC17068a accountUserProvider) {
        AbstractC16544l.m18094g(remoteUserSettingsRepository, "remoteUserSettingsRepository");
        AbstractC16544l.m18094g(customizationsRepository, "customizationsRepository");
        AbstractC16544l.m18094g(memoryRepository, "memoryRepository");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(accountUserProvider, "accountUserProvider");
        this.f39642a = remoteUserSettingsRepository;
        this.f39643b = customizationsRepository;
        this.f39644c = memoryRepository;
        this.f39645d = experimentManager;
        this.f39646e = accountUserProvider;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39642a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        C13132J c13132j = (C13132J) obj;
        Object obj2 = this.f39643b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        C20592p c20592p = (C20592p) obj2;
        Object obj3 = this.f39644c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C7132c c7132c = (C7132c) obj3;
        Object obj4 = this.f39645d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj4;
        Object obj5 = this.f39646e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        C15000g c15000g = (C15000g) obj5;
        f39641f.getClass();
        return new MemorySettingsViewModelImpl(c13132j, c20592p, c7132c, interfaceC13849E, c15000g);
    }
}
