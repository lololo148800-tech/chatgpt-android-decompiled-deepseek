package p823j3;

import android.content.Context;
import p025An.AbstractC0575H;
import p025An.C0565C;
import p025An.InterfaceC0567D;
import p672c3.C11617m;
import p972qm.AbstractC18768a;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: j3.A */
/* JADX INFO: loaded from: classes.dex */
public final class C16062A extends AbstractC18768a implements InterfaceC0567D {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C16075N f49716Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11617m f49717Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Context f49718o0;

    /* JADX WARN: Illegal instructions before constructor call */
    public C16062A(C16075N c16075n, C11617m c11617m, Context context) {
        C0565C c0565c = C0565C.f1783Y;
        this.f49716Y = c16075n;
        this.f49717Z = c11617m;
        this.f49718o0 = context;
        super(c0565c);
    }

    @Override // p025An.InterfaceC0567D
    public final void handleException(InterfaceC18776i interfaceC18776i, Throwable th2) {
        C11617m c11617m = this.f49717Z;
        Context context = this.f49718o0;
        C16075N c16075n = this.f49716Y;
        AbstractC0575H.m1156D(c16075n, null, null, new C16069H(c11617m, context, th2, c16075n, null), 3);
    }
}
