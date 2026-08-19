package io.sentry;

/* JADX INFO: renamed from: io.sentry.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C15174X implements InterfaceC15142M {

    /* JADX INFO: renamed from: a */
    public final Runtime f47238a = Runtime.getRuntime();

    @Override // io.sentry.InterfaceC15142M
    /* JADX INFO: renamed from: a */
    public final void mo16318a(C15107A0 c15107a0) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Runtime runtime = this.f47238a;
        c15107a0.f47004a = new C15411n0(jCurrentTimeMillis, runtime.totalMemory() - runtime.freeMemory(), -1L);
    }

    @Override // io.sentry.InterfaceC15142M
    /* JADX INFO: renamed from: c */
    public final void mo16319c() {
    }
}
