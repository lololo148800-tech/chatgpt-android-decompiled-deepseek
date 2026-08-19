package com.openai.feature.settings.impl.instructions;

import androidx.lifecycle.C11082S;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p876lm.InterfaceC17068a;
import ve.C20592p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/settings/impl/instructions/CustomInstructionsEditViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/settings/impl/instructions/CustomInstructionsEditViewModelImpl;", "Companion", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CustomInstructionsEditViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: c */
    public static final Companion f39580c = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4474e f39581a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f39582b;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/settings/impl/instructions/CustomInstructionsEditViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public CustomInstructionsEditViewModelImpl_Factory(C4474e c4474e, InterfaceC17068a customizationsRepository) {
        AbstractC16544l.m18094g(customizationsRepository, "customizationsRepository");
        this.f39581a = c4474e;
        this.f39582b = customizationsRepository;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39581a.f14617a;
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f39582b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        f39580c.getClass();
        return new CustomInstructionsEditViewModelImpl((C11082S) obj, (C20592p) obj2);
    }
}
