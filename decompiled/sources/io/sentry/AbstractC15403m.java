package io.sentry;

import java.io.File;

/* JADX INFO: renamed from: io.sentry.m */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15403m {

    /* JADX INFO: renamed from: a */
    public final C15109B f48019a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC15127H f48020b;

    /* JADX INFO: renamed from: c */
    public final long f48021c;

    /* JADX INFO: renamed from: d */
    public final C15153P1 f48022d;

    public AbstractC15403m(C15109B c15109b, InterfaceC15127H interfaceC15127H, long j10, int i10) {
        this.f48019a = c15109b;
        this.f48020b = interfaceC15127H;
        this.f48021c = j10;
        this.f48022d = new C15153P1(new C15353f(i10));
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo16650a(String str);

    /* JADX INFO: renamed from: b */
    public abstract void mo16651b(File file, C15516w c15516w);
}
