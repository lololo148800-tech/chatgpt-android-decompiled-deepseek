package com.openai.feature.conversations.impl.voicefeedback;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p148Fi.C2854t0;
import p248Jk.InterfaceC4473d;
import p625Zh.C10396b;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/voicefeedback/VoiceFeedbackDetailsViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/conversations/impl/voicefeedback/VoiceFeedbackDetailsViewModelImpl;", "Companion", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class VoiceFeedbackDetailsViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: c */
    public static final Companion f38101c = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f38102a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f38103b;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/voicefeedback/VoiceFeedbackDetailsViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public VoiceFeedbackDetailsViewModelImpl_Factory(InterfaceC17068a voiceApi, InterfaceC17068a connectivityChecker) {
        AbstractC16544l.m18094g(voiceApi, "voiceApi");
        AbstractC16544l.m18094g(connectivityChecker, "connectivityChecker");
        this.f38102a = voiceApi;
        this.f38103b = connectivityChecker;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f38102a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f38103b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        f38101c.getClass();
        return new VoiceFeedbackDetailsViewModelImpl((C2854t0) obj, (C10396b) obj2);
    }
}
