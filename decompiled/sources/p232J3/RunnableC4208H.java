package p232J3;

/* JADX INFO: renamed from: J3.H */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC4208H implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f13678Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4213M f13679Z;

    public /* synthetic */ RunnableC4208H(C4213M c4213m, int i10) {
        this.f13678Y = i10;
        this.f13679Z = c4213m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13678Y) {
            case 0:
                this.f13679Z.f13719S0 = true;
                break;
            case 1:
                this.f13679Z.m4953v();
                break;
            default:
                C4213M c4213m = this.f13679Z;
                if (!c4213m.f13726Y0) {
                    InterfaceC4250v interfaceC4250v = c4213m.f13703C0;
                    interfaceC4250v.getClass();
                    interfaceC4250v.mo2307h(c4213m);
                }
                break;
        }
    }
}
