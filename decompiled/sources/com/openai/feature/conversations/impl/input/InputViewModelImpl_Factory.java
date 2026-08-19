package com.openai.feature.conversations.impl.input;

import androidx.lifecycle.C11082S;
import gd.C13969n2;
import gd.InterfaceC13849E;
import ke.C16382j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import me.C17238a;
import ne.C17600b;
import p1025te.C19864O;
import p1081wc.InterfaceC20904w;
import p217Ie.C3708d;
import p220Ih.InterfaceC3721c;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p337Nd.C5710c;
import p454Se.C7112f;
import p576Xe.C9473F;
import p708dh.C13133K;
import p787he.C14459O;
import p870le.C16916z;
import p876lm.InterfaceC17068a;
import p925oe.C18092Q;
import p925oe.C18095U;
import p948pi.C18418a;
import tf.C19909N;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/input/InputViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/conversations/impl/input/InputViewModelImpl;", "Companion", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class InputViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: u */
    public static final Companion f37993u = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f37994a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f37995b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f37996c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f37997d;

    /* JADX INFO: renamed from: e */
    public final C4471b f37998e;

    /* JADX INFO: renamed from: f */
    public final C4474e f37999f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC17068a f38000g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC17068a f38001h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC17068a f38002i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC17068a f38003j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC17068a f38004k;

    /* JADX INFO: renamed from: l */
    public final C4474e f38005l;

    /* JADX INFO: renamed from: m */
    public final C4471b f38006m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC17068a f38007n;

    /* JADX INFO: renamed from: o */
    public final C4474e f38008o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC17068a f38009p;

    /* JADX INFO: renamed from: q */
    public final C4471b f38010q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC17068a f38011r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC17068a f38012s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC17068a f38013t;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/input/InputViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public InputViewModelImpl_Factory(InterfaceC17068a conversationModelProvider, InterfaceC17068a conversationGizmoProvider, InterfaceC17068a configurationManager, InterfaceC17068a integrityTokenGenerator, C4471b conversationCoordinator, C4474e accountSession, InterfaceC17068a fileService, InterfaceC17068a inputStateFlow, InterfaceC17068a settingsRepository, InterfaceC17068a gizmosRepository, InterfaceC17068a experimentManager, C4474e c4474e, C4471b inputDecorationProvider, InterfaceC17068a imageSelectionObserver, C4474e conversationInfo, InterfaceC17068a shareSheetContentProvider, C4471b editMessageRepository, InterfaceC17068a modelsRepository, InterfaceC17068a searchModeRepository, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(conversationModelProvider, "conversationModelProvider");
        AbstractC16544l.m18094g(conversationGizmoProvider, "conversationGizmoProvider");
        AbstractC16544l.m18094g(configurationManager, "configurationManager");
        AbstractC16544l.m18094g(integrityTokenGenerator, "integrityTokenGenerator");
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        AbstractC16544l.m18094g(fileService, "fileService");
        AbstractC16544l.m18094g(inputStateFlow, "inputStateFlow");
        AbstractC16544l.m18094g(settingsRepository, "settingsRepository");
        AbstractC16544l.m18094g(gizmosRepository, "gizmosRepository");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(inputDecorationProvider, "inputDecorationProvider");
        AbstractC16544l.m18094g(imageSelectionObserver, "imageSelectionObserver");
        AbstractC16544l.m18094g(conversationInfo, "conversationInfo");
        AbstractC16544l.m18094g(shareSheetContentProvider, "shareSheetContentProvider");
        AbstractC16544l.m18094g(editMessageRepository, "editMessageRepository");
        AbstractC16544l.m18094g(modelsRepository, "modelsRepository");
        AbstractC16544l.m18094g(searchModeRepository, "searchModeRepository");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f37994a = conversationModelProvider;
        this.f37995b = conversationGizmoProvider;
        this.f37996c = configurationManager;
        this.f37997d = integrityTokenGenerator;
        this.f37998e = conversationCoordinator;
        this.f37999f = accountSession;
        this.f38000g = fileService;
        this.f38001h = inputStateFlow;
        this.f38002i = settingsRepository;
        this.f38003j = gizmosRepository;
        this.f38004k = experimentManager;
        this.f38005l = c4474e;
        this.f38006m = inputDecorationProvider;
        this.f38007n = imageSelectionObserver;
        this.f38008o = conversationInfo;
        this.f38009p = shareSheetContentProvider;
        this.f38010q = editMessageRepository;
        this.f38011r = modelsRepository;
        this.f38012s = searchModeRepository;
        this.f38013t = analyticsService;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f37994a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        C17600b c17600b = (C17600b) obj;
        Object obj2 = this.f37995b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        C16382j c16382j = (C16382j) obj2;
        Object obj3 = this.f37996c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C13969n2 c13969n2 = (C13969n2) obj3;
        Object obj4 = this.f37997d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        C16916z c16916z = (C16916z) obj4;
        Object obj5 = this.f37998e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        C14459O c14459o = (C14459O) obj5;
        Object obj6 = this.f37999f.f14617a;
        AbstractC16544l.m18093f(obj6, "get(...)");
        C18418a c18418a = (C18418a) obj6;
        Object obj7 = this.f38000g.get();
        AbstractC16544l.m18093f(obj7, "get(...)");
        C7112f c7112f = (C7112f) obj7;
        Object obj8 = this.f38001h.get();
        AbstractC16544l.m18093f(obj8, "get(...)");
        C19864O c19864o = (C19864O) obj8;
        Object obj9 = this.f38002i.get();
        AbstractC16544l.m18093f(obj9, "get(...)");
        C13133K c13133k = (C13133K) obj9;
        Object obj10 = this.f38003j.get();
        AbstractC16544l.m18093f(obj10, "get(...)");
        C9473F c9473f = (C9473F) obj10;
        Object obj11 = this.f38004k.get();
        AbstractC16544l.m18093f(obj11, "get(...)");
        InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj11;
        Object obj12 = this.f38005l.f14617a;
        AbstractC16544l.m18093f(obj12, "get(...)");
        C11082S c11082s = (C11082S) obj12;
        Object obj13 = this.f38006m.get();
        AbstractC16544l.m18093f(obj13, "get(...)");
        C17238a c17238a = (C17238a) obj13;
        Object obj14 = this.f38007n.get();
        AbstractC16544l.m18093f(obj14, "get(...)");
        C19909N c19909n = (C19909N) obj14;
        Object obj15 = this.f38008o.f14617a;
        AbstractC16544l.m18093f(obj15, "get(...)");
        C5710c c5710c = (C5710c) obj15;
        Object obj16 = this.f38009p.get();
        AbstractC16544l.m18093f(obj16, "get(...)");
        C18095U c18095u = (C18095U) obj16;
        Object obj17 = this.f38010q.get();
        AbstractC16544l.m18093f(obj17, "get(...)");
        C3708d c3708d = (C3708d) obj17;
        Object obj18 = this.f38011r.get();
        AbstractC16544l.m18093f(obj18, "get(...)");
        InterfaceC3721c interfaceC3721c = (InterfaceC3721c) obj18;
        Object obj19 = this.f38012s.get();
        AbstractC16544l.m18093f(obj19, "get(...)");
        C18092Q c18092q = (C18092Q) obj19;
        Object obj20 = this.f38013t.get();
        AbstractC16544l.m18093f(obj20, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj20;
        f37993u.getClass();
        return new InputViewModelImpl(c17600b, c16382j, c13969n2, c16916z, c14459o, c18418a, c7112f, c19864o, c13133k, c9473f, interfaceC13849E, c11082s, c17238a, c19909n, c5710c, c18095u, c3708d, interfaceC3721c, c18092q, interfaceC20904w);
    }
}
