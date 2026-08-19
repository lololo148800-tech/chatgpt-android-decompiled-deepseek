package p885m4;

import io.sentry.util.C15504i;
import java.util.List;
import p031B3.AbstractC0804h;
import p158G3.C2983b;
import p898n4.AbstractC17483h;

/* JADX INFO: renamed from: m4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C17156f extends AbstractC0804h implements InterfaceC17157g {

    /* JADX INFO: renamed from: q0 */
    public InterfaceC17157g f54827q0;

    /* JADX INFO: renamed from: r0 */
    public long f54828r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f54829s0 = 1;

    /* JADX INFO: renamed from: t0 */
    public Object f54830t0;

    public /* synthetic */ C17156f() {
    }

    @Override // p885m4.InterfaceC17157g
    /* JADX INFO: renamed from: e */
    public final int mo10555e(long j10) {
        InterfaceC17157g interfaceC17157g = this.f54827q0;
        interfaceC17157g.getClass();
        return interfaceC17157g.mo10555e(j10 - this.f54828r0);
    }

    @Override // p885m4.InterfaceC17157g
    /* JADX INFO: renamed from: h */
    public final long mo10557h(int i10) {
        InterfaceC17157g interfaceC17157g = this.f54827q0;
        interfaceC17157g.getClass();
        return interfaceC17157g.mo10557h(i10) + this.f54828r0;
    }

    @Override // p885m4.InterfaceC17157g
    /* JADX INFO: renamed from: k */
    public final List mo10558k(long j10) {
        InterfaceC17157g interfaceC17157g = this.f54827q0;
        interfaceC17157g.getClass();
        return interfaceC17157g.mo10558k(j10 - this.f54828r0);
    }

    @Override // p031B3.AbstractC0804h
    /* JADX INFO: renamed from: n */
    public final void mo1838n() {
        super.mo1838n();
        this.f54827q0 = null;
    }

    @Override // p031B3.AbstractC0804h
    /* JADX INFO: renamed from: o */
    public final void mo1839o() {
        switch (this.f54829s0) {
            case 0:
                ((C2983b) this.f54830t0).m3822l(this);
                break;
            default:
                C15504i c15504i = (C15504i) this.f54830t0;
                c15504i.getClass();
                AbstractC17483h abstractC17483h = (AbstractC17483h) c15504i.f48428Z;
                abstractC17483h.getClass();
                mo1838n();
                abstractC17483h.f55934b.add(this);
                break;
        }
    }

    @Override // p885m4.InterfaceC17157g
    /* JADX INFO: renamed from: p */
    public final int mo10560p() {
        InterfaceC17157g interfaceC17157g = this.f54827q0;
        interfaceC17157g.getClass();
        return interfaceC17157g.mo10560p();
    }

    public C17156f(C2983b c2983b) {
        this.f54830t0 = c2983b;
    }
}
