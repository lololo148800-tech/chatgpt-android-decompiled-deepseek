package io.sentry;

import io.sentry.protocol.C15421A;
import io.sentry.protocol.C15425E;
import io.sentry.protocol.C15447t;
import p593Y8.C9683j;
import p658b5.C11241l;

/* JADX INFO: renamed from: io.sentry.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C15109B implements InterfaceC15124G {

    /* JADX INFO: renamed from: a */
    public static final C15109B f47017a = new C15109B();

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: A */
    public final C15447t mo16234A(C15421A c15421a, C15158R1 c15158r1, C15516w c15516w, C15113C0 c15113c0) {
        return AbstractC15152P0.m16331e().mo16234A(c15421a, c15158r1, c15516w, c15113c0);
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: B */
    public final void mo16235B() {
        AbstractC15152P0.m16331e().mo16235B();
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: C */
    public final void mo16236C() {
        AbstractC15152P0.m16331e().mo16236C();
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: D */
    public final C15447t mo16237D(C11241l c11241l, C15516w c15516w) {
        return AbstractC15152P0.m16331e().mo16237D(c11241l, c15516w);
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: E */
    public final C15447t mo16238E(EnumC15375i1 enumC15375i1) {
        return AbstractC15152P0.m16328b(enumC15375i1);
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: F */
    public final C15447t mo16239F(C15347d1 c15347d1, C15516w c15516w) {
        return AbstractC15152P0.m16331e().mo16239F(c15347d1, c15516w);
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: a */
    public final void mo16240a(String str, String str2) {
        AbstractC15152P0.m16336j(str, str2);
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: d */
    public final void mo16242d(boolean z6) {
        AbstractC15152P0.m16329c();
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: e */
    public final InterfaceC15154Q mo16243e() {
        return AbstractC15152P0.m16331e().mo16243e();
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: f */
    public final C9683j mo16244f() {
        return AbstractC15152P0.m16331e().mo16244f();
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: i */
    public final boolean mo16245i() {
        return AbstractC15152P0.m16331e().mo16245i();
    }

    @Override // io.sentry.InterfaceC15124G
    public final boolean isEnabled() {
        return AbstractC15152P0.m16335i();
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: j */
    public final C15524y1 mo16246j() {
        return AbstractC15152P0.m16331e().mo16246j();
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: k */
    public final void mo16247k(C15425E c15425e) {
        AbstractC15152P0.m16337k(c15425e);
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: l */
    public final void mo16248l(C15345d c15345d) {
        mo16252u(c15345d, new C15516w());
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: r */
    public final void mo16249r(long j10) {
        AbstractC15152P0.m16330d(j10);
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: s */
    public final C15447t mo16250s(Exception exc) {
        return mo16257z(exc, new C15516w());
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: t */
    public final InterfaceC15159S mo16251t(C15161S1 c15161s1, C15164T1 c15164t1) {
        return AbstractC15152P0.m16331e().mo16251t(c15161s1, c15164t1);
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: u */
    public final void mo16252u(C15345d c15345d, C15516w c15516w) {
        AbstractC15152P0.m16331e().mo16252u(c15345d, c15516w);
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: v */
    public final void mo16253v(InterfaceC15137K0 interfaceC15137K0) {
        AbstractC15152P0.m16331e().mo16253v(interfaceC15137K0);
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: w */
    public final C15447t mo16254w(C15108A1 c15108a1, C15516w c15516w) {
        return AbstractC15152P0.m16331e().mo16254w(c15108a1, c15516w);
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: x */
    public final void mo16255x(String str) {
        C15345d c15345d = new C15345d();
        c15345d.f47906o0 = str;
        mo16248l(c15345d);
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: y */
    public final InterfaceC15159S mo16256y() {
        return AbstractC15152P0.m16331e().mo16256y();
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: z */
    public final C15447t mo16257z(Exception exc, C15516w c15516w) {
        return AbstractC15152P0.m16331e().mo16257z(exc, c15516w);
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final InterfaceC15124G m22572clone() {
        return AbstractC15152P0.m16331e().m22572clone();
    }
}
