package com.openai.feature.auth.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p014Ac.AbstractC0424a;
import p046Bk.C1342O;
import p071Ch.C1676g;
import p071Ch.C1692w;
import p092Dc.C1991h;
import p1155zi.EnumC21895B;
import p248Jk.C4471b;
import p248Jk.InterfaceC4473d;
import p708dh.C13166t;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/auth/impl/SwitchAccountViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/auth/impl/SwitchAccountViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SwitchAccountViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: f */
    public static final Companion f37293f = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f37294a;

    /* JADX INFO: renamed from: b */
    public final C4471b f37295b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f37296c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f37297d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f37298e;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/auth/impl/SwitchAccountViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public SwitchAccountViewModelImpl_Factory(InterfaceC17068a accountUserRepository, C4471b auth, InterfaceC17068a playIntegrityService, InterfaceC17068a stringResolver, C1342O c1342o, InterfaceC17068a devicePreferences) {
        AbstractC16544l.m18094g(accountUserRepository, "accountUserRepository");
        AbstractC16544l.m18094g(auth, "auth");
        AbstractC16544l.m18094g(playIntegrityService, "playIntegrityService");
        AbstractC16544l.m18094g(stringResolver, "stringResolver");
        AbstractC16544l.m18094g(devicePreferences, "devicePreferences");
        this.f37294a = accountUserRepository;
        this.f37295b = auth;
        this.f37296c = playIntegrityService;
        this.f37297d = stringResolver;
        this.f37298e = devicePreferences;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f37294a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        C13166t c13166t = (C13166t) obj;
        Object obj2 = this.f37295b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        AbstractC0424a abstractC0424a = (AbstractC0424a) obj2;
        Object obj3 = this.f37296c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C1692w c1692w = (C1692w) obj3;
        Object obj4 = this.f37297d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        C1991h c1991h = (C1991h) obj4;
        EnumC21895B enumC21895B = EnumC21895B.f69419Z;
        Object obj5 = this.f37298e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        C1676g c1676g = (C1676g) obj5;
        f37293f.getClass();
        return new SwitchAccountViewModelImpl(c13166t, abstractC0424a, c1692w, c1991h, enumC21895B, c1676g);
    }
}
