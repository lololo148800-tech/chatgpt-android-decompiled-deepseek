package p329N3;

import p1016t3.C19773X;

/* JADX INFO: renamed from: N3.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5614d implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f18165Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5633w f18166Z;

    public /* synthetic */ RunnableC5614d(C5615e c5615e, InterfaceC5633w interfaceC5633w, int i10) {
        this.f18165Y = i10;
        this.f18166Z = interfaceC5633w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18165Y) {
            case 0:
                this.f18166Z.getClass();
                break;
            case 1:
                this.f18166Z.mo3669o();
                break;
            default:
                this.f18166Z.onFirstFrameRendered();
                break;
        }
    }

    public /* synthetic */ RunnableC5614d(C5615e c5615e, InterfaceC5633w interfaceC5633w, C19773X c19773x) {
        this.f18165Y = 0;
        this.f18166Z = interfaceC5633w;
    }
}
