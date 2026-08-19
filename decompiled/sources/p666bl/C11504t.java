package p666bl;

import kotlin.jvm.internal.AbstractC16544l;
import mm.InterfaceC17302e;
import p049Bm.InterfaceC1440o;
import p409Qk.C6752c;
import p556Wk.C8911Z;
import p582Xk.InterfaceC9524a;
import p754fl.C13696f;
import p792hl.C14526a;

/* JADX INFO: renamed from: bl.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C11504t implements InterfaceC9524a {

    /* JADX INFO: renamed from: b */
    public static final C11504t f34819b = new C11504t(0);

    /* JADX INFO: renamed from: c */
    public static final C11504t f34820c = new C11504t(1);

    /* JADX INFO: renamed from: d */
    public static final C11504t f34821d = new C11504t(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34822a;

    public /* synthetic */ C11504t(int i10) {
        this.f34822a = i10;
    }

    @Override // p582Xk.InterfaceC9524a
    /* JADX INFO: renamed from: a */
    public final void mo9566a(C6752c client, InterfaceC17302e interfaceC17302e) {
        switch (this.f34822a) {
            case 0:
                AbstractC16544l.m18094g(client, "client");
                client.f21672s0.m21471f(C14526a.f45782j, new C8911Z((InterfaceC1440o) interfaceC17302e, null, 3));
                break;
            case 1:
                AbstractC16544l.m18094g(client, "client");
                client.f21674u0.m21471f(C14526a.f45780h, new C8911Z((InterfaceC1440o) interfaceC17302e, null, 4));
                break;
            default:
                AbstractC16544l.m18094g(client, "client");
                client.f21673t0.m21471f(C13696f.f43216n, new C8911Z((InterfaceC1440o) interfaceC17302e, null, 5));
                break;
        }
    }
}
