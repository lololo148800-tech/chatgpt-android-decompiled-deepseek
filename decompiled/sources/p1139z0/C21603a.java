package p1139z0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p350O1.C6064m;

/* JADX INFO: renamed from: z0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21603a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C21603a f68418Z = new C21603a(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C21603a f68419o0 = new C21603a(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C21603a f68420p0 = new C21603a(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C21603a f68421q0 = new C21603a(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C21603a f68422r0 = new C21603a(1, 4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f68423Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21603a(int i10, int i11) {
        super(i10);
        this.f68423Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f68423Y) {
            case 0:
                ((Number) obj).longValue();
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                int i10 = ((C6064m) obj).f19754a;
                break;
            default:
                ((C21577C) obj).m21854b();
                break;
        }
        return C17296C.f55119a;
    }
}
