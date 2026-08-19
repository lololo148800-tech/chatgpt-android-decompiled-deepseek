package p349O0;

import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2153Q0;
import p415R0.InterfaceC6787e;
import p466T0.C7176c;
import p466T0.C7187n;
import p491U0.C7533a;
import p491U0.C7534b;
import p515V0.C7736b;
import p972qm.InterfaceC18775h;

/* JADX INFO: renamed from: O0.S */
/* JADX INFO: loaded from: classes.dex */
public final class C5975S implements InterfaceC18775h, InterfaceC5959J0 {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ C5975S f19444Z = new C5975S(0);

    /* JADX INFO: renamed from: o0 */
    public static final C5975S f19445o0 = new C5975S(1);

    /* JADX INFO: renamed from: p0 */
    public static final C5975S f19446p0 = new C5975S(2);

    /* JADX INFO: renamed from: q0 */
    public static final C5975S f19447q0 = new C5975S(3);

    /* JADX INFO: renamed from: r0 */
    public static final C5975S f19448r0 = new C5975S(4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f19449Y;

    public /* synthetic */ C5975S(int i10) {
        this.f19449Y = i10;
    }

    /* JADX INFO: renamed from: b */
    public static final void m6403b(C5975S c5975s) {
        C2153Q0 c2153q0;
        InterfaceC6787e interfaceC6787e;
        C7534b c7534b;
        C2153Q0 c2153q1 = C6032u0.f19643w;
        do {
            c2153q0 = C6032u0.f19643w;
            interfaceC6787e = (InterfaceC6787e) c2153q0.getValue();
            c7534b = (C7534b) interfaceC6787e;
            C7176c c7176cM7555b = c7534b.f23883o0;
            C7533a c7533a = (C7533a) c7176cM7555b.get(c5975s);
            if (c7533a != null) {
                int iHashCode = c5975s != null ? c5975s.hashCode() : 0;
                C7187n c7187n = c7176cM7555b.f22811Y;
                C7187n c7187nM7583v = c7187n.m7583v(iHashCode, c5975s, 0);
                if (c7187n != c7187nM7583v) {
                    c7176cM7555b = c7187nM7583v == null ? C7176c.f22810o0 : new C7176c(c7187nM7583v, c7176cM7555b.f22812Z - 1);
                }
                C7736b c7736b = C7736b.f24402a;
                Object obj = c7533a.f23878a;
                boolean z6 = obj != c7736b;
                Object obj2 = c7533a.f23879b;
                if (z6) {
                    Object obj3 = c7176cM7555b.get(obj);
                    AbstractC16544l.m18091d(obj3);
                    c7176cM7555b = c7176cM7555b.m7555b(obj, new C7533a(((C7533a) obj3).f23878a, obj2));
                }
                if (obj2 != c7736b) {
                    Object obj4 = c7176cM7555b.get(obj2);
                    AbstractC16544l.m18091d(obj4);
                    c7176cM7555b = c7176cM7555b.m7555b(obj2, new C7533a(obj, ((C7533a) obj4).f23879b));
                }
                Object obj5 = obj != c7736b ? c7534b.f23881Y : obj2;
                if (obj2 != c7736b) {
                    obj = c7534b.f23882Z;
                }
                c7534b = new C7534b(obj5, obj, c7176cM7555b);
            }
            if (interfaceC6787e == c7534b) {
                return;
            }
        } while (!c2153q0.m3250k(interfaceC6787e, c7534b));
    }

    @Override // p349O0.InterfaceC5959J0
    /* JADX INFO: renamed from: a */
    public boolean mo6393a(Object obj, Object obj2) {
        switch (this.f19449Y) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return AbstractC16544l.m18089b(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f19449Y) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case 5:
                return "Empty";
        }
    }
}
