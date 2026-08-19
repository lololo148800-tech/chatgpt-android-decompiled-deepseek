package io.ktor.utils.p815io;

import java.io.IOException;
import p488Tn.C7518a;
import p488Tn.InterfaceC7526i;
import p544W9.AbstractC8694q;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: io.ktor.utils.io.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C15073I implements InterfaceC15088n {

    /* JADX INFO: renamed from: b */
    public final C7518a f46836b;
    private volatile C15071G closed;

    public C15073I(C7518a c7518a) {
        this.f46836b = c7518a;
    }

    @Override // io.ktor.utils.p815io.InterfaceC15088n
    /* JADX INFO: renamed from: a */
    public final Throwable mo1137a() {
        C15071G c15071g = this.closed;
        if (c15071g != null) {
            return c15071g.m16195a();
        }
        return null;
    }

    @Override // io.ktor.utils.p815io.InterfaceC15088n
    /* JADX INFO: renamed from: b */
    public final void mo1138b(Throwable th2) {
        if (this.closed != null) {
            return;
        }
        String message = th2.getMessage();
        if (message == null) {
            message = "Channel was cancelled";
        }
        this.closed = new C15071G(new IOException(message, th2));
    }

    @Override // io.ktor.utils.p815io.InterfaceC15088n
    /* JADX INFO: renamed from: c */
    public final InterfaceC7526i mo1139c() throws Throwable {
        Throwable thMo1137a = mo1137a();
        if (thMo1137a == null) {
            return this.f46836b;
        }
        throw thMo1137a;
    }

    @Override // io.ktor.utils.p815io.InterfaceC15088n
    /* JADX INFO: renamed from: d */
    public final Object mo1140d(int i10, AbstractC19687c abstractC19687c) throws Throwable {
        Throwable thMo1137a = mo1137a();
        if (thMo1137a == null) {
            return Boolean.valueOf(AbstractC8694q.m9397d(this.f46836b) >= ((long) i10));
        }
        throw thMo1137a;
    }

    @Override // io.ktor.utils.p815io.InterfaceC15088n
    /* JADX INFO: renamed from: e */
    public final boolean mo1141e() {
        return this.f46836b.mo7821g();
    }
}
