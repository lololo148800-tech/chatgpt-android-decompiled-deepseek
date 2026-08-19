package p988rc;

import p049Bm.InterfaceC1436k;
import p537W0.C8410b;

/* JADX INFO: renamed from: rc.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C18913a {

    /* JADX INFO: renamed from: a */
    public final boolean f60348a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1436k f60349b;

    /* JADX INFO: renamed from: c */
    public final int f60350c;

    /* JADX INFO: renamed from: d */
    public final C8410b f60351d;

    public C18913a(InterfaceC1436k interfaceC1436k, int i10, C8410b c8410b, int i11) {
        interfaceC1436k = (i11 & 2) != 0 ? null : interfaceC1436k;
        i10 = (i11 & 4) != 0 ? 1 : i10;
        this.f60348a = false;
        this.f60349b = interfaceC1436k;
        this.f60350c = i10;
        this.f60351d = c8410b;
    }
}
