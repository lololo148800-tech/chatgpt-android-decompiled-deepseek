package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p349O0.C6013l;
import p349O0.C6021p;

/* JADX INFO: renamed from: J0.S3 */
/* JADX INFO: loaded from: classes.dex */
public final class C3981S3 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12480Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3934J3 f12481Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3981S3(C3934J3 c3934j3, int i10) {
        super(2);
        this.f12480Y = i10;
        this.f12481Z = c3934j3;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12480Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f12481Z.f12112a.mo4639a(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C3934J3 c3934j3 = this.f12481Z;
                    boolean zM6542f = c6021p2.m6542f(c3934j3);
                    Object objM6514H = c6021p2.m6514H();
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        objM6514H = new C3904E3(c3934j3, 2);
                        c6021p2.m6537c0(objM6514H);
                    }
                    AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H, null, false, null, null, AbstractC4019a1.f12609a, c6021p2, 196608, 30);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
