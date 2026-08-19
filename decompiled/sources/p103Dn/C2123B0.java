package p103Dn;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0624m;
import p025An.InterfaceC0595V;

/* JADX INFO: renamed from: Dn.B0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2123B0 implements InterfaceC0595V {

    /* JADX INFO: renamed from: Y */
    public final C2127D0 f6490Y;

    /* JADX INFO: renamed from: Z */
    public final long f6491Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f6492o0;

    /* JADX INFO: renamed from: p0 */
    public final C0624m f6493p0;

    public C2123B0(C2127D0 c2127d0, long j10, Object obj, C0624m c0624m) {
        this.f6490Y = c2127d0;
        this.f6491Z = j10;
        this.f6492o0 = obj;
        this.f6493p0 = c0624m;
    }

    @Override // p025An.InterfaceC0595V
    public final void dispose() {
        C2127D0 c2127d0 = this.f6490Y;
        synchronized (c2127d0) {
            if (this.f6491Z < c2127d0.m3239q()) {
                return;
            }
            Object[] objArr = c2127d0.f6512t0;
            AbstractC16544l.m18091d(objArr);
            long j10 = this.f6491Z;
            if (objArr[((int) j10) & (objArr.length - 1)] != this) {
                return;
            }
            AbstractC2124C.m3207f(objArr, j10, AbstractC2124C.f6496c);
            c2127d0.m3235l();
        }
    }
}
