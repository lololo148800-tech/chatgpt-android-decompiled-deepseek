package com.openai.feature.conversationhistory.impl.archive;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1039ud.C20192i;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p811ih.C15000g;
import p876lm.InterfaceC17068a;
import p925oe.C18077B;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversationhistory/impl/archive/ArchiveViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/conversationhistory/impl/archive/ArchiveViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ArchiveViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: d */
    public static final Companion f37364d = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC4478i f37365a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f37366b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f37367c;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversationhistory/impl/archive/ArchiveViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public ArchiveViewModelImpl_Factory(InterfaceC4478i interfaceC4478i, InterfaceC17068a conversationRepository, InterfaceC17068a accountUserProvider) {
        AbstractC16544l.m18094g(conversationRepository, "conversationRepository");
        AbstractC16544l.m18094g(accountUserProvider, "accountUserProvider");
        this.f37365a = interfaceC4478i;
        this.f37366b = conversationRepository;
        this.f37367c = accountUserProvider;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f37365a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f37366b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        Object obj3 = this.f37367c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        f37364d.getClass();
        return new ArchiveViewModelImpl((C20192i) obj, (C18077B) obj2, (C15000g) obj3);
    }
}
