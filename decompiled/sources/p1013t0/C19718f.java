package p1013t0;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0624m;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p1140z1.AbstractC21678Y;
import p200Hm.C3508g;
import p392Q0.C6546d;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p758g0.C13775m0;
import p759g1.C13801c;
import p784hb.C14437f;
import p860l0.C16660B;
import p860l0.C16672F;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: t0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C19718f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f62420Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19721i f62421Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC21678Y f62422o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC16546n f62423p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19718f(C19721i c19721i, AbstractC21678Y abstractC21678Y, InterfaceC1426a interfaceC1426a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f62421Z = c19721i;
        this.f62422o0 = abstractC21678Y;
        this.f62423p0 = (AbstractC16546n) interfaceC1426a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19718f(this.f62421Z, this.f62422o0, this.f62423p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19718f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
    /* JADX WARN: Type inference failed for: r6v0, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objM1261q;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f62420Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19721i c19721i = this.f62421Z;
            C16672F c16672f = c19721i.f62434z0;
            C19717e c19717e = new C19717e(c19721i, this.f62422o0, this.f62423p0);
            this.f62420Y = 1;
            c16672f.getClass();
            C13801c c13801c = (C13801c) c19717e.invoke();
            if (c13801c == null || c16672f.m18498M0(c16672f.f53398H0, c13801c)) {
                objM1261q = c17296c;
            } else {
                C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(this));
                c0624m.m1262r();
                C16660B c16660b = new C16660B(c19717e, c0624m);
                C14437f c14437f = c16672f.f53394D0;
                c14437f.getClass();
                C13801c c13801c2 = (C13801c) c19717e.invoke();
                if (c13801c2 == null) {
                    c0624m.resumeWith(c17296c);
                } else {
                    c0624m.m1264u(new C13775m0(c14437f, 19, c16660b));
                    C6546d c6546d = (C6546d) c14437f.f45413Y;
                    int i11 = new C3508g(0, c6546d.f21184o0 - 1, 1).f10592Z;
                    if (i11 < 0) {
                        c6546d.m7098a(0, c16660b);
                        break;
                    }
                    while (true) {
                        C13801c c13801c3 = (C13801c) ((C16660B) c6546d.f21182Y[i11]).f53358a.invoke();
                        if (c13801c3 != null) {
                            C13801c c13801cM15322i = c13801c2.m15322i(c13801c3);
                            if (!c13801cM15322i.equals(c13801c2)) {
                                if (!c13801cM15322i.equals(c13801c3)) {
                                    CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                    int i12 = c6546d.f21184o0 - 1;
                                    if (i12 <= i11) {
                                        while (true) {
                                            ((C16660B) c6546d.f21182Y[i11]).f53359b.mo1244b(cancellationException);
                                            if (i12 == i11) {
                                                break;
                                            }
                                            i12++;
                                        }
                                    }
                                }
                            } else {
                                c6546d.m7098a(i11 + 1, c16660b);
                                break;
                            }
                        }
                        if (i11 == 0) {
                            c6546d.m7098a(0, c16660b);
                            break;
                        }
                        i11--;
                    }
                    if (!c16672f.f53399I0) {
                        c16672f.m18499N0();
                    }
                }
                objM1261q = c0624m.m1261q();
                if (objM1261q != EnumC19250a.f61036Y) {
                    objM1261q = c17296c;
                }
            }
            if (objM1261q == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
