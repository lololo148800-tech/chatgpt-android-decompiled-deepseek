package je;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import com.google.protobuf.AbstractC12107L1;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p152Fm.AbstractC2922d;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p467T1.C7199i;
import p478Tc.AbstractC7309m;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8034Z;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17780r;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: je.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C16203b extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C16203b f50280Y = new C16203b(3);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(paddings, "paddings");
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6021p.m6542f(paddings) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC2922d random = (AbstractC2922d) c6021p.m6548k(AbstractC7309m.f23152a);
            c6021p.m6524S(-1883569886);
            Object objM6514H = c6021p.m6514H();
            if (objM6514H == C6013l.f19514a) {
                List list = AbstractC16205d.f50283a;
                AbstractC16544l.m18094g(list, "<this>");
                AbstractC16544l.m18094g(random, "random");
                if (list.isEmpty()) {
                    throw new NoSuchElementException("Collection is empty.");
                }
                List list2 = list;
                final int iMo3723c = random.mo3723c(list.size());
                boolean z6 = list2 instanceof List;
                if (z6) {
                    obj4 = list2.get(iMo3723c);
                } else {
                    InterfaceC1436k interfaceC1436k = new InterfaceC1436k() { // from class: nm.u
                        @Override // p049Bm.InterfaceC1436k
                        public final Object invoke(Object obj5) {
                            ((Integer) obj5).intValue();
                            throw new IndexOutOfBoundsException(AbstractC12107L1.m13826q(new StringBuilder("Collection doesn't contain element at index "), iMo3723c, '.'));
                        }
                    };
                    if (z6) {
                        List list3 = list2;
                        if (iMo3723c < 0 || iMo3723c >= list3.size()) {
                            interfaceC1436k.invoke(Integer.valueOf(iMo3723c));
                            throw null;
                        }
                        obj4 = list3.get(iMo3723c);
                    } else {
                        if (iMo3723c < 0) {
                            interfaceC1436k.invoke(Integer.valueOf(iMo3723c));
                            throw null;
                        }
                        Iterator it = list2.iterator();
                        int i10 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                interfaceC1436k.invoke(Integer.valueOf(iMo3723c));
                                throw null;
                            }
                            Object next = it.next();
                            int i11 = i10 + 1;
                            if (iMo3723c == i10) {
                                obj4 = next;
                                break;
                            }
                            i10 = i11;
                        }
                    }
                }
                objM6514H = (String) obj4;
                c6021p.m6537c0(objM6514H);
            }
            String str = (String) objM6514H;
            c6021p.m6553p(false);
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qMo428M = AbstractC10842a.m11232j(c10456n, paddings).mo428M(AbstractC10844c.f32512c);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qMo428M);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC4124r4.m4769c(AbstractC8034Z.m8391f(str, true), AbstractC10844c.m11244d(AbstractC10842a.m11237o(AbstractC10842a.m11235m(c10456n, AbstractC7313q.f23201f, 0.0f, 2), 0.0f, AbstractC7313q.f23207l, 0.0f, 0.0f, 13), 1.0f), 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12150f, c6021p, 0, 0, 130556);
            c6021p.m6553p(true);
        }
        return C17296C.f55119a;
    }
}
