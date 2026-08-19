package com.openai.feature.conversations.impl.conversation;

import androidx.lifecycle.C11082S;
import be.C11345b;
import bh.C11434h;
import com.openai.feature.rootviewmodel.RootViewModel;
import gd.C13969n2;
import gd.C13993t2;
import gd.InterfaceC13849E;
import ge.C14018B0;
import ge.C14053T0;
import id.C14968g;
import ke.C16382j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import ne.C17600b;
import ni.C17627a;
import p1025te.C19864O;
import p1081wc.InterfaceC20904w;
import p1128yg.C21539c;
import p1149zc.AbstractC21864z;
import p148Fi.C2790T0;
import p193Hf.C3332T;
import p217Ie.C3708d;
import p220Ih.InterfaceC3721c;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p268Kf.C4666u;
import p361Oe.C6183j;
import p456Sg.C7132c;
import p576Xe.C9473F;
import p577Xf.C9504c;
import p708dh.C13132J;
import p708dh.C13133K;
import p708dh.C13141T;
import p787he.C14459O;
import p811ih.C15000g;
import p876lm.InterfaceC17068a;
import p925oe.C18089N;
import p925oe.C18092Q;
import p948pi.C18418a;
import pg.C18412b;
import ve.C20592p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/conversation/ConversationViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/conversations/impl/conversation/ConversationViewModelImpl;", "Companion", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ConversationViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: K */
    public static final Companion f37819K = new Companion(0);

    /* JADX INFO: renamed from: A */
    public final InterfaceC17068a f37820A;

    /* JADX INFO: renamed from: B */
    public final InterfaceC17068a f37821B;

    /* JADX INFO: renamed from: C */
    public final InterfaceC17068a f37822C;

    /* JADX INFO: renamed from: D */
    public final InterfaceC17068a f37823D;

    /* JADX INFO: renamed from: E */
    public final InterfaceC17068a f37824E;

    /* JADX INFO: renamed from: F */
    public final C4474e f37825F;

    /* JADX INFO: renamed from: G */
    public final C4471b f37826G;

    /* JADX INFO: renamed from: H */
    public final InterfaceC17068a f37827H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC17068a f37828I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC17068a f37829J;

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f37830a;

    /* JADX INFO: renamed from: b */
    public final C4474e f37831b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f37832c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f37833d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f37834e;

    /* JADX INFO: renamed from: f */
    public final C4474e f37835f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC17068a f37836g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC17068a f37837h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC17068a f37838i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC17068a f37839j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC17068a f37840k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC17068a f37841l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC17068a f37842m;

    /* JADX INFO: renamed from: n */
    public final C4471b f37843n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC17068a f37844o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC17068a f37845p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC17068a f37846q;

    /* JADX INFO: renamed from: r */
    public final C4474e f37847r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC17068a f37848s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC17068a f37849t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC17068a f37850u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC17068a f37851v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC17068a f37852w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC17068a f37853x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC17068a f37854y;

    /* JADX INFO: renamed from: z */
    public final C4471b f37855z;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/conversation/ConversationViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public ConversationViewModelImpl_Factory(InterfaceC17068a accountUserProvider, C4474e c4474e, InterfaceC17068a experimentManager, InterfaceC17068a layerManager, InterfaceC17068a configurationManager, C4474e c4474e2, InterfaceC17068a customizationsRepository, InterfaceC17068a suggestionsCoordinator, InterfaceC17068a conversationModelProvider, InterfaceC17068a conversationGizmoProvider, InterfaceC17068a oauthDeepLinkHandler, InterfaceC17068a modelsRepository, InterfaceC17068a promptsService, C4471b conversationCoordinator, InterfaceC17068a initConversationRepository, InterfaceC17068a remoteUserSettingsRepository, InterfaceC17068a userAnnouncementsRepository, C4474e accountUserCoroutineScope, InterfaceC17068a rootEffectEmitter, InterfaceC17068a settingsRepository, InterfaceC17068a inputStateFlow, InterfaceC17068a gizmoOperations, InterfaceC17068a voiceSessionObserver, InterfaceC17068a anonymousPromptRepository, InterfaceC17068a analyticsService, C4471b auth, InterfaceC17068a subscriptionNavigationService, InterfaceC17068a screenshotObserver, InterfaceC17068a searchModeRepository, InterfaceC17068a clientActionsCoordinator, InterfaceC17068a conversationIdsProvider, C4474e accountSession, C4471b editMessageRepository, InterfaceC17068a memoryRepository, InterfaceC17068a canmoreRepository, InterfaceC17068a santaExperimentManager) {
        AbstractC16544l.m18094g(accountUserProvider, "accountUserProvider");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(layerManager, "layerManager");
        AbstractC16544l.m18094g(configurationManager, "configurationManager");
        AbstractC16544l.m18094g(customizationsRepository, "customizationsRepository");
        AbstractC16544l.m18094g(suggestionsCoordinator, "suggestionsCoordinator");
        AbstractC16544l.m18094g(conversationModelProvider, "conversationModelProvider");
        AbstractC16544l.m18094g(conversationGizmoProvider, "conversationGizmoProvider");
        AbstractC16544l.m18094g(oauthDeepLinkHandler, "oauthDeepLinkHandler");
        AbstractC16544l.m18094g(modelsRepository, "modelsRepository");
        AbstractC16544l.m18094g(promptsService, "promptsService");
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        AbstractC16544l.m18094g(initConversationRepository, "initConversationRepository");
        AbstractC16544l.m18094g(remoteUserSettingsRepository, "remoteUserSettingsRepository");
        AbstractC16544l.m18094g(userAnnouncementsRepository, "userAnnouncementsRepository");
        AbstractC16544l.m18094g(accountUserCoroutineScope, "accountUserCoroutineScope");
        AbstractC16544l.m18094g(rootEffectEmitter, "rootEffectEmitter");
        AbstractC16544l.m18094g(settingsRepository, "settingsRepository");
        AbstractC16544l.m18094g(inputStateFlow, "inputStateFlow");
        AbstractC16544l.m18094g(gizmoOperations, "gizmoOperations");
        AbstractC16544l.m18094g(voiceSessionObserver, "voiceSessionObserver");
        AbstractC16544l.m18094g(anonymousPromptRepository, "anonymousPromptRepository");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        AbstractC16544l.m18094g(auth, "auth");
        AbstractC16544l.m18094g(subscriptionNavigationService, "subscriptionNavigationService");
        AbstractC16544l.m18094g(screenshotObserver, "screenshotObserver");
        AbstractC16544l.m18094g(searchModeRepository, "searchModeRepository");
        AbstractC16544l.m18094g(clientActionsCoordinator, "clientActionsCoordinator");
        AbstractC16544l.m18094g(conversationIdsProvider, "conversationIdsProvider");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        AbstractC16544l.m18094g(editMessageRepository, "editMessageRepository");
        AbstractC16544l.m18094g(memoryRepository, "memoryRepository");
        AbstractC16544l.m18094g(canmoreRepository, "canmoreRepository");
        AbstractC16544l.m18094g(santaExperimentManager, "santaExperimentManager");
        this.f37830a = accountUserProvider;
        this.f37831b = c4474e;
        this.f37832c = experimentManager;
        this.f37833d = layerManager;
        this.f37834e = configurationManager;
        this.f37835f = c4474e2;
        this.f37836g = customizationsRepository;
        this.f37837h = suggestionsCoordinator;
        this.f37838i = conversationModelProvider;
        this.f37839j = conversationGizmoProvider;
        this.f37840k = oauthDeepLinkHandler;
        this.f37841l = modelsRepository;
        this.f37842m = promptsService;
        this.f37843n = conversationCoordinator;
        this.f37844o = initConversationRepository;
        this.f37845p = remoteUserSettingsRepository;
        this.f37846q = userAnnouncementsRepository;
        this.f37847r = accountUserCoroutineScope;
        this.f37848s = rootEffectEmitter;
        this.f37849t = settingsRepository;
        this.f37850u = inputStateFlow;
        this.f37851v = gizmoOperations;
        this.f37852w = voiceSessionObserver;
        this.f37853x = anonymousPromptRepository;
        this.f37854y = analyticsService;
        this.f37855z = auth;
        this.f37820A = subscriptionNavigationService;
        this.f37821B = screenshotObserver;
        this.f37822C = searchModeRepository;
        this.f37823D = clientActionsCoordinator;
        this.f37824E = conversationIdsProvider;
        this.f37825F = accountSession;
        this.f37826G = editMessageRepository;
        this.f37827H = memoryRepository;
        this.f37828I = canmoreRepository;
        this.f37829J = santaExperimentManager;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f37830a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        C15000g c15000g = (C15000g) obj;
        Object obj2 = this.f37831b.f14617a;
        AbstractC16544l.m18093f(obj2, "get(...)");
        C11082S c11082s = (C11082S) obj2;
        Object obj3 = this.f37832c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj3;
        Object obj4 = this.f37833d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        C13993t2 c13993t2 = (C13993t2) obj4;
        Object obj5 = this.f37834e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        C13969n2 c13969n2 = (C13969n2) obj5;
        Object obj6 = this.f37835f.f14617a;
        AbstractC16544l.m18093f(obj6, "get(...)");
        C14018B0 c14018b0 = (C14018B0) obj6;
        Object obj7 = this.f37836g.get();
        AbstractC16544l.m18093f(obj7, "get(...)");
        C20592p c20592p = (C20592p) obj7;
        Object obj8 = this.f37837h.get();
        AbstractC16544l.m18093f(obj8, "get(...)");
        C6183j c6183j = (C6183j) obj8;
        Object obj9 = this.f37838i.get();
        AbstractC16544l.m18093f(obj9, "get(...)");
        C17600b c17600b = (C17600b) obj9;
        Object obj10 = this.f37839j.get();
        AbstractC16544l.m18093f(obj10, "get(...)");
        C16382j c16382j = (C16382j) obj10;
        Object obj11 = this.f37840k.get();
        AbstractC16544l.m18093f(obj11, "get(...)");
        C9504c c9504c = (C9504c) obj11;
        Object obj12 = this.f37841l.get();
        AbstractC16544l.m18093f(obj12, "get(...)");
        InterfaceC3721c interfaceC3721c = (InterfaceC3721c) obj12;
        Object obj13 = this.f37842m.get();
        AbstractC16544l.m18093f(obj13, "get(...)");
        C18412b c18412b = (C18412b) obj13;
        Object obj14 = this.f37843n.get();
        AbstractC16544l.m18093f(obj14, "get(...)");
        C14459O c14459o = (C14459O) obj14;
        Object obj15 = this.f37844o.get();
        AbstractC16544l.m18093f(obj15, "get(...)");
        C18089N c18089n = (C18089N) obj15;
        Object obj16 = this.f37845p.get();
        AbstractC16544l.m18093f(obj16, "get(...)");
        C13132J c13132j = (C13132J) obj16;
        Object obj17 = this.f37846q.get();
        AbstractC16544l.m18093f(obj17, "get(...)");
        C13141T c13141t = (C13141T) obj17;
        Object obj18 = this.f37847r.f14617a;
        AbstractC16544l.m18093f(obj18, "get(...)");
        C17627a c17627a = (C17627a) obj18;
        Object obj19 = this.f37848s.get();
        AbstractC16544l.m18093f(obj19, "get(...)");
        RootViewModel rootViewModel = (RootViewModel) obj19;
        Object obj20 = this.f37849t.get();
        AbstractC16544l.m18093f(obj20, "get(...)");
        C13133K c13133k = (C13133K) obj20;
        Object obj21 = this.f37850u.get();
        AbstractC16544l.m18093f(obj21, "get(...)");
        C19864O c19864o = (C19864O) obj21;
        Object obj22 = this.f37851v.get();
        AbstractC16544l.m18093f(obj22, "get(...)");
        C9473F c9473f = (C9473F) obj22;
        Object obj23 = this.f37852w.get();
        AbstractC16544l.m18093f(obj23, "get(...)");
        C2790T0 c2790t0 = (C2790T0) obj23;
        Object obj24 = this.f37853x.get();
        AbstractC16544l.m18093f(obj24, "get(...)");
        C14968g c14968g = (C14968g) obj24;
        Object obj25 = this.f37854y.get();
        AbstractC16544l.m18093f(obj25, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj25;
        Object obj26 = this.f37855z.get();
        AbstractC16544l.m18093f(obj26, "get(...)");
        AbstractC21864z abstractC21864z = (AbstractC21864z) obj26;
        Object obj27 = this.f37820A.get();
        AbstractC16544l.m18093f(obj27, "get(...)");
        C11434h c11434h = (C11434h) obj27;
        Object obj28 = this.f37821B.get();
        AbstractC16544l.m18093f(obj28, "get(...)");
        C21539c c21539c = (C21539c) obj28;
        Object obj29 = this.f37822C.get();
        AbstractC16544l.m18093f(obj29, "get(...)");
        C18092Q c18092q = (C18092Q) obj29;
        Object obj30 = this.f37823D.get();
        AbstractC16544l.m18093f(obj30, "get(...)");
        C4666u c4666u = (C4666u) obj30;
        Object obj31 = this.f37824E.get();
        AbstractC16544l.m18093f(obj31, "get(...)");
        C11345b c11345b = (C11345b) obj31;
        Object obj32 = this.f37825F.f14617a;
        AbstractC16544l.m18093f(obj32, "get(...)");
        C18418a c18418a = (C18418a) obj32;
        Object obj33 = this.f37826G.get();
        AbstractC16544l.m18093f(obj33, "get(...)");
        C3708d c3708d = (C3708d) obj33;
        Object obj34 = this.f37827H.get();
        AbstractC16544l.m18093f(obj34, "get(...)");
        C7132c c7132c = (C7132c) obj34;
        Object obj35 = this.f37828I.get();
        AbstractC16544l.m18093f(obj35, "get(...)");
        C3332T c3332t = (C3332T) obj35;
        Object obj36 = this.f37829J.get();
        AbstractC16544l.m18093f(obj36, "get(...)");
        C14053T0 c14053t0 = (C14053T0) obj36;
        f37819K.getClass();
        return new ConversationViewModelImpl(c15000g, c11082s, interfaceC13849E, c13993t2, c13969n2, c14018b0, c20592p, c6183j, c17600b, c16382j, c9504c, interfaceC3721c, c18412b, c14459o, c18089n, c13132j, c13141t, c17627a, rootViewModel, c13133k, c19864o, c9473f, c2790t0, c14968g, interfaceC20904w, abstractC21864z, c11434h, c21539c, c18092q, c4666u, c11345b, c18418a, c3708d, c7132c, c3332t, c14053t0);
    }
}
