package p637a3;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p776h3.C14393g;
import p799i3.AbstractC14919a;

/* JADX INFO: renamed from: a3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10488e extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C10488e f31071Z = new C10488e(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C10488e f31072o0 = new C10488e(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C10488e f31073p0 = new C10488e(2, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C10488e f31074q0 = new C10488e(2, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C10488e f31075r0 = new C10488e(2, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C10488e f31076s0 = new C10488e(2, 5);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31077Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10488e(int i10, int i11) {
        super(i10);
        this.f31077Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31077Y) {
            case 0:
                String str = (String) obj;
                InterfaceC10496m interfaceC10496m = (InterfaceC10496m) obj2;
                if (str.length() == 0) {
                    return interfaceC10496m.toString();
                }
                return str + ", " + interfaceC10496m;
            case 1:
                ((C10493j) obj).f31091b = (C10484a) obj2;
                return C17296C.f55119a;
            case 2:
                ((C10493j) obj).f31090a = (InterfaceC10497n) obj2;
                return C17296C.f55119a;
            case 3:
                ((C10493j) obj).f31093d = ((C14393g) obj2).f45129a;
                return C17296C.f55119a;
            case 4:
                C10487d c10487d = (C10487d) obj2;
                ((C10493j) obj).f31092c = c10487d != null ? c10487d.f31070a : null;
                return C17296C.f55119a;
            default:
                InterfaceC10496m interfaceC10496m2 = (InterfaceC10496m) obj2;
                return interfaceC10496m2 instanceof AbstractC14919a ? interfaceC10496m2 : obj;
        }
    }
}
