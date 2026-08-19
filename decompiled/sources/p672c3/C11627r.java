package p672c3;

import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p492U1.C7542g;
import p523V9.AbstractC8078e4;
import p637a3.C10484a;
import p637a3.C10486c;
import p637a3.C10487d;
import p637a3.C10493j;
import p637a3.C10495l;
import p637a3.InterfaceC10492i;
import p637a3.InterfaceC10496m;
import p637a3.InterfaceC10497n;
import p656b3.C11223b;
import p776h3.C14394h;
import p776h3.C14398l;
import p776h3.C14404r;
import p884m3.C17146e;

/* JADX INFO: renamed from: c3.r */
/* JADX INFO: loaded from: classes.dex */
public final class C11627r extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C11627r f35233Z = new C11627r(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C11627r f35234o0 = new C11627r(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C11627r f35235p0 = new C11627r(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C11627r f35236q0 = new C11627r(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C11627r f35237r0 = new C11627r(1, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C11627r f35238s0 = new C11627r(1, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C11627r f35239t0 = new C11627r(1, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C11627r f35240u0 = new C11627r(1, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C11627r f35241v0 = new C11627r(1, 8);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f35242Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11627r(int i10, int i11) {
        super(i10);
        this.f35242Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C10493j c10493j;
        C10493j c10493j2;
        switch (this.f35242Y) {
            case 0:
                long j10 = ((C7542g) obj).f23896a;
                return Float.valueOf(C7542g.m7876a(j10) * C7542g.m7877b(j10));
            case 1:
                return Float.valueOf(C7542g.m7877b(((C7542g) obj).f23896a));
            case 2:
                return Boolean.TRUE;
            case 3:
                return Boolean.valueOf(((InterfaceC10496m) obj) instanceof C11223b);
            case 4:
                InterfaceC10496m interfaceC10496m = (InterfaceC10496m) obj;
                return Boolean.valueOf((interfaceC10496m instanceof C14404r) || (interfaceC10496m instanceof C14398l) || (interfaceC10496m instanceof C11643z));
            case 5:
                InterfaceC10492i interfaceC10492i = (InterfaceC10492i) obj;
                if ((interfaceC10492i instanceof C11566C) || !interfaceC10492i.mo10956b().mo10951a(new C11627r(1, 9))) {
                    return interfaceC10492i;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                InterfaceC10497n interfaceC10497nMo10956b = interfaceC10492i.mo10956b();
                boolean zMo10951a = interfaceC10497nMo10956b.mo10951a(f35239t0);
                C10495l c10495l = C10495l.f31097a;
                C17309l c17309l = zMo10951a ? (C17309l) interfaceC10497nMo10956b.mo10954j(new C17309l(null, c10495l), C11612j0.f35130C0) : new C17309l(null, interfaceC10497nMo10956b);
                C10486c c10486c = (C10486c) c17309l.f55136Y;
                InterfaceC10497n interfaceC10497n = (InterfaceC10497n) c17309l.f55137Z;
                C17146e c17146e = C17146e.f54816a;
                if (c10486c == null || !(c10486c instanceof C10486c)) {
                    c10493j = null;
                } else {
                    c10493j = new C10493j();
                    c10493j.f31090a = new C14404r(c17146e).mo10952b(new C14398l(c17146e));
                    c10493j.f31091b = c10486c.f31067a;
                    c10493j.f31093d = c10486c.f31068b;
                    C10487d c10487d = c10486c.f31069c;
                    c10493j.f31092c = c10487d != null ? c10487d.f31070a : null;
                }
                if (((Number) interfaceC10497n.mo10954j(0, C11612j0.f35132E0)).intValue() > 1) {
                    AbstractC15256t.m16482t("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
                }
                C17309l c17309l2 = interfaceC10497n.mo10951a(f35240u0) ? (C17309l) interfaceC10497n.mo10954j(new C17309l(null, c10495l), C11612j0.f35131D0) : new C17309l(null, interfaceC10497n);
                C11223b c11223b = (C11223b) c17309l2.f55136Y;
                InterfaceC10497n interfaceC10497n2 = (InterfaceC10497n) c17309l2.f55137Z;
                arrayList.add(c11223b);
                if (c11223b != null) {
                    int i10 = c11223b.f33980b;
                    C10484a c10484a = i10 != 0 ? new C10484a(i10) : new C10484a(R.drawable.glance_ripple);
                    c10493j2 = new C10493j();
                    c10493j2.f31090a = new C14404r(c17146e).mo10952b(new C14398l(c17146e));
                    c10493j2.f31091b = c10484a;
                } else {
                    c10493j2 = null;
                }
                C11570E c11570e = interfaceC10497n2.mo10951a(f35237r0) ? (C11570E) interfaceC10497n2.mo10954j(new C11570E((InterfaceC10497n) null, 3), C11612j0.f35149x0) : new C11570E(interfaceC10497n2, 1);
                arrayList.add(c11570e.f34971a);
                arrayList2.add(c11570e.f34972b.mo10952b(new C14404r(c17146e)).mo10952b(new C14398l(c17146e)));
                C14394h c14394h = new C14394h();
                c14394h.f45130d = AbstractC8078e4.m8495b(arrayList);
                interfaceC10492i.mo10957c(AbstractC8078e4.m8495b(arrayList2));
                ArrayList arrayList3 = c14394h.f31096c;
                if (c10493j != null) {
                    arrayList3.add(c10493j);
                }
                arrayList3.add(interfaceC10492i);
                if (c10493j2 != null) {
                    arrayList3.add(c10493j2);
                }
                return c14394h;
            case 6:
                return Boolean.valueOf(((InterfaceC10496m) obj) instanceof C10486c);
            case 7:
                return Boolean.valueOf(((InterfaceC10496m) obj) instanceof C11223b);
            case 8:
                return Boolean.FALSE;
            default:
                InterfaceC10496m interfaceC10496m2 = (InterfaceC10496m) obj;
                return Boolean.valueOf((interfaceC10496m2 instanceof C10486c) || (interfaceC10496m2 instanceof C11223b));
        }
    }
}
