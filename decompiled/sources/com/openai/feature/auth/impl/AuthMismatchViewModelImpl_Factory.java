package com.openai.feature.auth.impl;

import com.statsig.androidsdk.StatsigLoggerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1149zc.C21854p;
import p1155zi.C21988b1;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p571X9.AbstractC9233X;
import p708dh.C13158l;
import p876lm.InterfaceC17068a;
import p905nd.C17570C;
import p948pi.C18418a;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/auth/impl/AuthMismatchViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/auth/impl/AuthMismatchViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AuthMismatchViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: d */
    public static final Companion f37259d = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4474e f37260a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f37261b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f37262c;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/auth/impl/AuthMismatchViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public AuthMismatchViewModelImpl_Factory(C4474e accountSession, InterfaceC17068a accountStatusRepository, InterfaceC17068a mismatchAuthService) {
        AbstractC16544l.m18094g(accountSession, "accountSession");
        AbstractC16544l.m18094g(accountStatusRepository, "accountStatusRepository");
        AbstractC16544l.m18094g(mismatchAuthService, "mismatchAuthService");
        this.f37260a = accountSession;
        this.f37261b = accountStatusRepository;
        this.f37262c = mismatchAuthService;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f37260a.f14617a;
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f37261b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        Object obj3 = this.f37262c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        f37259d.getClass();
        AuthMismatchViewModelImpl authMismatchViewModelImpl = new AuthMismatchViewModelImpl(C21854p.f69322a);
        final C2153Q0 c2153q0 = ((C17570C) obj3).f56215b;
        authMismatchViewModelImpl.m14396l(new AuthMismatchViewModelImpl.C122232((C18418a) obj), AbstractC2124C.m3227z(new AuthMismatchViewModelImpl.C122221((C13158l) obj2, null), new InterfaceC2184i() { // from class: com.openai.feature.auth.impl.AuthMismatchViewModelImpl$special$$inlined$filterIsInstance$1

            /* JADX INFO: renamed from: com.openai.feature.auth.impl.AuthMismatchViewModelImpl$special$$inlined$filterIsInstance$1$2 */
            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public final class C122242<T> implements InterfaceC2186j {

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ InterfaceC2186j f37255Y;

                /* JADX INFO: renamed from: com.openai.feature.auth.impl.AuthMismatchViewModelImpl$special$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                @InterfaceC19689e(m20655c = "com.openai.feature.auth.impl.AuthMismatchViewModelImpl$special$$inlined$filterIsInstance$1$2", m20656f = "AuthMismatchViewModelImpl.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class AnonymousClass1 extends AbstractC19687c {

                    /* JADX INFO: renamed from: Y */
                    public /* synthetic */ Object f37256Y;

                    /* JADX INFO: renamed from: Z */
                    public int f37257Z;

                    public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                        super(interfaceC18770c);
                    }

                    @Override // sm.AbstractC19685a
                    public final Object invokeSuspend(Object obj) {
                        this.f37256Y = obj;
                        this.f37257Z |= Integer.MIN_VALUE;
                        return C122242.this.mo395a(null, this);
                    }
                }

                public C122242(InterfaceC2186j interfaceC2186j) {
                    this.f37255Y = interfaceC2186j;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p103Dn.InterfaceC2186j
                /* JADX INFO: renamed from: a */
                public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC18770c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                        int i10 = anonymousClass1.f37257Z;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f37257Z = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                    }
                    Object obj2 = anonymousClass1.f37256Y;
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    int i11 = anonymousClass1.f37257Z;
                    if (i11 == 0) {
                        AbstractC9233X.m9807c(obj2);
                        if (obj instanceof C21988b1) {
                            anonymousClass1.f37257Z = 1;
                            if (this.f37255Y.mo395a(obj, anonymousClass1) == enumC19250a) {
                                return enumC19250a;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj2);
                    }
                    return C17296C.f55119a;
                }
            }

            @Override // p103Dn.InterfaceC2184i
            /* JADX INFO: renamed from: d */
            public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
                Object objMo3141d = c2153q0.mo3141d(new C122242(interfaceC2186j), interfaceC18770c);
                return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
            }
        }));
        return authMismatchViewModelImpl;
    }
}
