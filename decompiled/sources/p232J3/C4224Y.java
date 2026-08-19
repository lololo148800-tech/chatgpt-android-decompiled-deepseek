package p232J3;

import io.sentry.internal.debugmeta.C15384c;
import p031B3.C0803g;

/* JADX INFO: renamed from: J3.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C4224Y implements InterfaceC4220U {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC4220U f13802Y;

    /* JADX INFO: renamed from: Z */
    public final long f13803Z;

    public C4224Y(InterfaceC4220U interfaceC4220U, long j10) {
        this.f13802Y = interfaceC4220U;
        this.f13803Z = j10;
    }

    @Override // p232J3.InterfaceC4220U
    /* JADX INFO: renamed from: a */
    public final boolean mo4941a() {
        return this.f13802Y.mo4941a();
    }

    @Override // p232J3.InterfaceC4220U
    /* JADX INFO: renamed from: b */
    public final void mo4942b() {
        this.f13802Y.mo4942b();
    }

    @Override // p232J3.InterfaceC4220U
    /* JADX INFO: renamed from: c */
    public final int mo4943c(long j10) {
        return this.f13802Y.mo4943c(j10 - this.f13803Z);
    }

    @Override // p232J3.InterfaceC4220U
    /* JADX INFO: renamed from: d */
    public final int mo4944d(C15384c c15384c, C0803g c0803g, int i10) {
        int iMo4944d = this.f13802Y.mo4944d(c15384c, c0803g, i10);
        if (iMo4944d == -4) {
            c0803g.f2228s0 += this.f13803Z;
        }
        return iMo4944d;
    }
}
