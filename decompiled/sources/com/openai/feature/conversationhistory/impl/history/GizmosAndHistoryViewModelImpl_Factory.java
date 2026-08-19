package com.openai.feature.conversationhistory.impl.history;

import androidx.lifecycle.C11082S;
import be.C11345b;
import com.openai.feature.rootviewmodel.RootViewModel;
import gd.InterfaceC13849E;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1081wc.InterfaceC20904w;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p576Xe.C9473F;
import p708dh.C13133K;
import p811ih.C15000g;
import p876lm.InterfaceC17068a;
import p925oe.C18077B;
import p925oe.C18086K;
import p925oe.C18114g0;
import p925oe.C18127p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversationhistory/impl/history/GizmosAndHistoryViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/conversationhistory/impl/history/GizmosAndHistoryViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class GizmosAndHistoryViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: n */
    public static final Companion f37491n = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f37492a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f37493b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f37494c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f37495d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f37496e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17068a f37497f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC17068a f37498g;

    /* JADX INFO: renamed from: h */
    public final C4474e f37499h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC17068a f37500i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC17068a f37501j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC17068a f37502k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC17068a f37503l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC17068a f37504m;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversationhistory/impl/history/GizmosAndHistoryViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public GizmosAndHistoryViewModelImpl_Factory(InterfaceC17068a historyRepository, InterfaceC17068a conversationRepository, InterfaceC17068a settingsRepository, InterfaceC17068a gizmosRepository, InterfaceC17068a snorlaxRepository, InterfaceC17068a rootEffectEmitter, InterfaceC17068a analyticsService, C4474e c4474e, InterfaceC17068a experimentManager, InterfaceC17068a accountUserProvider, InterfaceC17068a conversationIdsProvider, InterfaceC17068a unreadConversationRepository, InterfaceC17068a streamingConversationRepository) {
        AbstractC16544l.m18094g(historyRepository, "historyRepository");
        AbstractC16544l.m18094g(conversationRepository, "conversationRepository");
        AbstractC16544l.m18094g(settingsRepository, "settingsRepository");
        AbstractC16544l.m18094g(gizmosRepository, "gizmosRepository");
        AbstractC16544l.m18094g(snorlaxRepository, "snorlaxRepository");
        AbstractC16544l.m18094g(rootEffectEmitter, "rootEffectEmitter");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(accountUserProvider, "accountUserProvider");
        AbstractC16544l.m18094g(conversationIdsProvider, "conversationIdsProvider");
        AbstractC16544l.m18094g(unreadConversationRepository, "unreadConversationRepository");
        AbstractC16544l.m18094g(streamingConversationRepository, "streamingConversationRepository");
        this.f37492a = historyRepository;
        this.f37493b = conversationRepository;
        this.f37494c = settingsRepository;
        this.f37495d = gizmosRepository;
        this.f37496e = snorlaxRepository;
        this.f37497f = rootEffectEmitter;
        this.f37498g = analyticsService;
        this.f37499h = c4474e;
        this.f37500i = experimentManager;
        this.f37501j = accountUserProvider;
        this.f37502k = conversationIdsProvider;
        this.f37503l = unreadConversationRepository;
        this.f37504m = streamingConversationRepository;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f37492a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        C18086K c18086k = (C18086K) obj;
        Object obj2 = this.f37493b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        C18077B c18077b = (C18077B) obj2;
        Object obj3 = this.f37494c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C13133K c13133k = (C13133K) obj3;
        Object obj4 = this.f37495d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        C9473F c9473f = (C9473F) obj4;
        Object obj5 = this.f37496e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        C9473F c9473f2 = (C9473F) obj5;
        Object obj6 = this.f37497f.get();
        AbstractC16544l.m18093f(obj6, "get(...)");
        RootViewModel rootViewModel = (RootViewModel) obj6;
        Object obj7 = this.f37498g.get();
        AbstractC16544l.m18093f(obj7, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj7;
        C11082S c11082s = (C11082S) this.f37499h.f14617a;
        Object obj8 = this.f37500i.get();
        AbstractC16544l.m18093f(obj8, "get(...)");
        InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj8;
        Object obj9 = this.f37501j.get();
        AbstractC16544l.m18093f(obj9, "get(...)");
        C15000g c15000g = (C15000g) obj9;
        Object obj10 = this.f37502k.get();
        AbstractC16544l.m18093f(obj10, "get(...)");
        C11345b c11345b = (C11345b) obj10;
        Object obj11 = this.f37503l.get();
        AbstractC16544l.m18093f(obj11, "get(...)");
        C18114g0 c18114g0 = (C18114g0) obj11;
        Object obj12 = this.f37504m.get();
        AbstractC16544l.m18093f(obj12, "get(...)");
        C18127p c18127p = (C18127p) obj12;
        f37491n.getClass();
        return new GizmosAndHistoryViewModelImpl(c18086k, c18077b, c13133k, c9473f, c9473f2, rootViewModel, interfaceC20904w, c11082s, interfaceC13849E, c15000g, c11345b, c18114g0, c18127p);
    }
}
