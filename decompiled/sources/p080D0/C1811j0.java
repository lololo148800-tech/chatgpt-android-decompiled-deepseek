package p080D0;

import bf.C11386n;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1071w0.InterfaceC20744d0;
import p156G1.AbstractC2973t;
import p156G1.C2959f;
import p156G1.C2963j;
import p156G1.C2971r;
import p156G1.C2974u;
import p200Hm.C3505d;
import p225Im.InterfaceC3776x;
import p759g1.C13800b;
import td.C19844g;

/* JADX INFO: renamed from: D0.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1811j0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5216Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f5217Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1811j0(int i10, InterfaceC1426a interfaceC1426a) {
        super(1);
        this.f5216Y = i10;
        this.f5217Z = interfaceC1426a;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C19844g c19844g = C19844g.f62932a;
        C17296C c17296c = C17296C.f55119a;
        InterfaceC1426a interfaceC1426a = this.f5217Z;
        switch (this.f5216Y) {
            case 0:
                return new C13800b(((C13800b) interfaceC1426a.invoke()).f43584a);
            case 1:
                return new C13800b(((C13800b) interfaceC1426a.invoke()).f43584a);
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    interfaceC1426a.invoke();
                }
                return c17296c;
            case 3:
                interfaceC1426a.invoke();
                return c17296c;
            case 4:
                interfaceC1426a.invoke();
                return c17296c;
            case 5:
                long j10 = ((C13800b) obj).f43584a;
                interfaceC1426a.invoke();
                return c17296c;
            case 6:
                C2959f c2959f = new C2959f(((Number) interfaceC1426a.invoke()).floatValue(), new C3505d(0.0f, 1.0f));
                InterfaceC3776x[] interfaceC3776xArr = AbstractC2973t.f8942a;
                C2974u c2974u = C2971r.f8917c;
                InterfaceC3776x interfaceC3776x = AbstractC2973t.f8942a[1];
                c2974u.m3814a((C2963j) obj, c2959f);
                return c17296c;
            case 7:
                C2959f c2959f2 = new C2959f(((Number) interfaceC1426a.invoke()).floatValue(), new C3505d(0.0f, 1.0f));
                InterfaceC3776x[] interfaceC3776xArr2 = AbstractC2973t.f8942a;
                C2974u c2974u2 = C2971r.f8917c;
                InterfaceC3776x interfaceC3776x2 = AbstractC2973t.f8942a[1];
                c2974u2.m3814a((C2963j) obj, c2959f2);
                return c17296c;
            case 8:
                interfaceC1426a.invoke();
                return c17296c;
            case 9:
                interfaceC1426a.invoke();
                return c17296c;
            case 10:
                InterfaceC20744d0 $receiver = (InterfaceC20744d0) obj;
                AbstractC16544l.m18094g($receiver, "$this$$receiver");
                interfaceC1426a.invoke();
                return c17296c;
            case 11:
                InterfaceC20744d0 $receiver2 = (InterfaceC20744d0) obj;
                AbstractC16544l.m18094g($receiver2, "$this$$receiver");
                interfaceC1426a.invoke();
                return c17296c;
            case 12:
                InterfaceC20744d0 $receiver3 = (InterfaceC20744d0) obj;
                AbstractC16544l.m18094g($receiver3, "$this$$receiver");
                interfaceC1426a.invoke();
                return c17296c;
            case 13:
                C11386n it = (C11386n) obj;
                AbstractC16544l.m18094g(it, "it");
                interfaceC1426a.invoke();
                return c17296c;
            case 14:
                ((Boolean) obj).booleanValue();
                interfaceC1426a.invoke();
                return c17296c;
            case 15:
                InterfaceC20744d0 $receiver4 = (InterfaceC20744d0) obj;
                AbstractC16544l.m18094g($receiver4, "$this$$receiver");
                interfaceC1426a.invoke();
                return c17296c;
            case 16:
                C19844g effect = (C19844g) obj;
                AbstractC16544l.m18094g(effect, "effect");
                if (effect.equals(c19844g)) {
                    interfaceC1426a.invoke();
                }
                return c17296c;
            default:
                C19844g effect2 = (C19844g) obj;
                AbstractC16544l.m18094g(effect2, "effect");
                if (effect2.equals(c19844g)) {
                    interfaceC1426a.invoke();
                }
                return c17296c;
        }
    }
}
