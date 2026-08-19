package p003A1;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1140z1.C21658D;
import p156G1.C2963j;
import p156G1.C2971r;

/* JADX INFO: renamed from: A1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0280q extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C0280q f1024Z = new C0280q(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C0280q f1025o0 = new C0280q(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C0280q f1026p0 = new C0280q(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C0280q f1027q0 = new C0280q(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C0280q f1028r0 = new C0280q(1, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C0280q f1029s0 = new C0280q(1, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C0280q f1030t0 = new C0280q(1, 6);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1031Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0280q(int i10, int i11) {
        super(i10);
        this.f1031Y = i11;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        boolean z6;
        switch (this.f1031Y) {
            case 0:
                return C17296C.f55119a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                C2963j c2963jM22056q = ((C21658D) obj).m22056q();
                if (c2963jM22056q != null) {
                    if (c2963jM22056q.f8881Z) {
                        z6 = c2963jM22056q.f8880Y.containsKey(C2971r.f8938x);
                    }
                }
                return Boolean.valueOf(z6);
            case 4:
                return Boolean.valueOf(AbstractC0240d0.m792c(obj));
            case 5:
                return null;
            default:
                if (obj == null) {
                    return C17296C.f55119a;
                }
                throw new ClassCastException();
        }
    }
}
