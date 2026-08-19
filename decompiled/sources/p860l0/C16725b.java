package p860l0;

import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1014t1.AbstractC19736m;
import p1014t1.C19738o;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.InterfaceC6008i0;
import p537W0.C8414f;
import p759g1.C13800b;

/* JADX INFO: renamed from: l0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C16725b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C16725b f53595Z = new C16725b(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C16725b f53596o0 = new C16725b(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C16725b f53597p0 = new C16725b(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C16725b f53598q0 = new C16725b(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C16725b f53599r0 = new C16725b(1, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C16725b f53600s0 = new C16725b(1, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C16725b f53601t0 = new C16725b(1, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C16725b f53602u0 = new C16725b(1, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C16725b f53603v0 = new C16725b(1, 8);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f53604Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16725b(int i10, int i11) {
        super(i10);
        this.f53604Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f53604Y) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return Boolean.TRUE;
            case 2:
                C5984W0 c5984w0 = AndroidCompositionLocals_androidKt.f32825b;
                C8414f c8414f = (C8414f) ((InterfaceC6008i0) obj);
                c8414f.getClass();
                if (((Context) C5997d.m6433T(c8414f, c5984w0)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC16657A.f53356b;
                }
                InterfaceC16794y.f53901a.getClass();
                return C16791x.f53892c;
            case 3:
                long j10 = ((C13800b) obj).f43584a;
                return C17296C.f55119a;
            case 4:
                long j11 = ((C13800b) obj).f43584a;
                return C17296C.f55119a;
            case 5:
                long j12 = ((C13800b) obj).f43584a;
                return C17296C.f55119a;
            case 6:
                return Boolean.TRUE;
            case 7:
                return Boolean.valueOf(!AbstractC19736m.m20683e(((C19738o) obj).f62486i, 2));
            default:
                ((Number) obj).floatValue();
                return C17296C.f55119a;
        }
    }
}
