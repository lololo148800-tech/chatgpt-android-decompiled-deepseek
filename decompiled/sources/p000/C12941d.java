package p000;

import p049Bm.InterfaceC1436k;
import p195Hh.C3430e;
import p249Jl.SurfaceHolderCallbackC4482b;
import p349O0.InterfaceC5948E;
import p349O0.InterfaceC5985X;
import p536W.C8408d;

/* JADX INFO: renamed from: d */
/* JADX INFO: loaded from: classes.dex */
public final class C12941d implements InterfaceC5948E {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41107a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC5985X f41108b;

    public /* synthetic */ C12941d(InterfaceC5985X interfaceC5985X, int i10) {
        this.f41107a = i10;
        this.f41108b = interfaceC5985X;
    }

    @Override // p349O0.InterfaceC5948E
    public final void dispose() {
        InterfaceC5985X interfaceC5985X = this.f41108b;
        switch (this.f41107a) {
            case 0:
                C3430e c3430e = AbstractC17714o.f56552b;
                C8408d c8408d = (C8408d) interfaceC5985X.getValue();
                if (c8408d != null) {
                    c8408d.m8961g();
                }
                break;
            case 1:
                SurfaceHolderCallbackC4482b surfaceHolderCallbackC4482b = (SurfaceHolderCallbackC4482b) interfaceC5985X.getValue();
                if (surfaceHolderCallbackC4482b != null) {
                    surfaceHolderCallbackC4482b.f14633w0 = false;
                    surfaceHolderCallbackC4482b.f14627q0.release();
                }
                break;
            default:
                ((InterfaceC1436k) interfaceC5985X.getValue()).invoke(0);
                break;
        }
    }
}
