package cd;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.InterfaceC5985X;
import p870le.C16886i0;

/* JADX INFO: renamed from: cd.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C11709i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1426a f35520a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5985X f35521b;

    public C11709i(C16886i0 c16886i0, int i10) {
        InterfaceC1426a onDismiss = c16886i0;
        onDismiss = (i10 & 1) != 0 ? C11708h.f35519Y : onDismiss;
        C6002f0 c6002f0M6430Q = C5997d.m6430Q(new C11705e(false, 0L), C5975S.f19448r0);
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        this.f35520a = onDismiss;
        this.f35521b = c6002f0M6430Q;
    }

    /* JADX INFO: renamed from: a */
    public final void m13031a() {
        InterfaceC5985X interfaceC5985X = this.f35521b;
        interfaceC5985X.setValue(new C11705e(false, ((C11705e) interfaceC5985X.getValue()).f35514b));
        this.f35520a.invoke();
    }

    /* JADX INFO: renamed from: b */
    public final void m13032b(long j10) {
        this.f35521b.setValue(new C11705e(true, j10));
    }
}
