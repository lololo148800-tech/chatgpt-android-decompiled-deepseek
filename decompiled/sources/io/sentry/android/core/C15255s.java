package io.sentry.android.core;

import io.sentry.hints.InterfaceC15362a;
import io.sentry.hints.InterfaceC15372k;
import p628Zk.GwZB.tpXhEMGxfXFVSh;

/* JADX INFO: renamed from: io.sentry.android.core.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C15255s implements InterfaceC15362a, InterfaceC15372k {

    /* JADX INFO: renamed from: Y */
    public final boolean f47624Y;

    public C15255s(boolean z6) {
        this.f47624Y = z6;
    }

    @Override // io.sentry.hints.InterfaceC15362a
    /* JADX INFO: renamed from: b */
    public final Long mo16460b() {
        return null;
    }

    @Override // io.sentry.hints.InterfaceC15362a
    /* JADX INFO: renamed from: c */
    public final boolean mo16461c() {
        return true;
    }

    @Override // io.sentry.hints.InterfaceC15362a
    /* JADX INFO: renamed from: e */
    public final String mo16462e() {
        return this.f47624Y ? tpXhEMGxfXFVSh.iufvknBbxYFgkMn : "anr_foreground";
    }
}
