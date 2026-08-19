package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1441p;
import p547Wc.C8805o;
import p571X9.AbstractC9233X;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13758e;
import p759g1.C13800b;
import p773h0.EnumC14284g0;
import p773h0.InterfaceC14300o0;
import p860l0.C16670E0;
import p860l0.C16700O0;
import p860l0.C16702P0;
import p860l0.C16704Q0;
import p860l0.C16705R0;
import p860l0.C16707S0;
import p860l0.C16722a;
import p860l0.C16728c;
import p860l0.C16731d;
import p860l0.C16734e;
import p860l0.C16737f;
import p860l0.C16746i;
import p860l0.C16757l1;
import p860l0.C16779t;
import p860l0.C16782u;
import p860l0.EnumC16673F0;
import p860l0.InterfaceC16661B0;
import p860l0.InterfaceC16736e1;
import p860l0.InterfaceC16794y;
import p881m0.C17133j;
import p894n0.InterfaceC17406l;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10840a {

    /* JADX INFO: renamed from: a */
    public static final C16702P0 f32468a = new C16702P0();

    /* JADX INFO: renamed from: b */
    public static final C16700O0 f32469b = new C16700O0();

    /* JADX INFO: renamed from: c */
    public static final C16704Q0 f32470c = new C16704Q0();

    /* JADX INFO: renamed from: a */
    public static final Object m11215a(C16782u c16782u, float f10, C16779t c16779t, C16670E0 c16670e0, Object obj, AbstractC19694j abstractC19694j) {
        float fM18495e = c16670e0.m18495e(obj);
        C16557y c16557y = new C16557y();
        c16557y.f51286Y = Float.isNaN(c16782u.f53868j.m6409g()) ? 0.0f : c16782u.f53868j.m6409g();
        if (!Float.isNaN(fM18495e)) {
            float f11 = c16557y.f51286Y;
            if (f11 != fM18495e) {
                Object objM15238c = AbstractC13758e.m15238c(f11, fM18495e, f10, c16782u.f53861c, new C8805o(c16779t, 17, c16557y), abstractC19694j);
                if (objM15238c == EnumC19250a.f61036Y) {
                    return objM15238c;
                }
            }
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m11216b(InterfaceC1426a interfaceC1426a, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        C16737f c16737f;
        if (abstractC19687c instanceof C16737f) {
            c16737f = (C16737f) abstractC19687c;
            int i10 = c16737f.f53671Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16737f.f53671Z = i10 - Integer.MIN_VALUE;
            } else {
                c16737f = new C16737f(abstractC19687c);
            }
        } else {
            c16737f = new C16737f(abstractC19687c);
        }
        Object obj = c16737f.f53670Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16737f.f53671Z;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(obj);
                C16746i c16746i = new C16746i(interfaceC1426a, interfaceC1439n, null);
                c16737f.f53671Z = 1;
                if (AbstractC0575H.m1183l(c16746i, c16737f) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
        } catch (C16722a unused) {
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m11217c(C16757l1 c16757l1, long j10, AbstractC19687c abstractC19687c) {
        C16705R0 c16705r0;
        C16557y c16557y;
        if (abstractC19687c instanceof C16705R0) {
            c16705r0 = (C16705R0) abstractC19687c;
            int i10 = c16705r0.f53519p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16705r0.f53519p0 = i10 - Integer.MIN_VALUE;
            } else {
                c16705r0 = new C16705R0(abstractC19687c);
            }
        } else {
            c16705r0 = new C16705R0(abstractC19687c);
        }
        Object obj = c16705r0.f53518o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16705r0.f53519p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c16557y = new C16557y();
            EnumC14284g0 enumC14284g0 = EnumC14284g0.f44821Y;
            C16707S0 c16707s0 = new C16707S0(c16757l1, j10, c16557y, null);
            c16705r0.f53516Y = c16757l1;
            c16705r0.f53517Z = c16557y;
            c16705r0.f53519p0 = 1;
            if (c16757l1.m18535e(enumC14284g0, c16707s0, c16705r0) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16557y c16557y2 = c16705r0.f53517Z;
            C16757l1 c16757l2 = c16705r0.f53516Y;
            AbstractC9233X.m9807c(obj);
            c16557y = c16557y2;
            c16757l1 = c16757l2;
        }
        return new C13800b(c16757l1.m18537g(c16557y.f51286Y));
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC10459q m11218d(InterfaceC10459q interfaceC10459q, C16782u c16782u, EnumC16673F0 enumC16673F0) {
        return interfaceC10459q.mo428M(new AnchoredDraggableElement(c16782u, enumC16673F0, true, null, c16782u.f53870l.getValue() != null, null));
    }

    /* JADX INFO: renamed from: e */
    public static final Object m11219e(C16782u c16782u, Object obj, AbstractC19694j abstractC19694j) {
        Object objM18547a = c16782u.m18547a(obj, EnumC14284g0.f44821Y, new C16728c(c16782u, null), abstractC19694j);
        return objM18547a == EnumC19250a.f61036Y ? objM18547a : C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static final Object m11220f(C16782u c16782u, Object obj, float f10, AbstractC19687c abstractC19687c) {
        C16731d c16731d;
        C16557y c16557y;
        if (abstractC19687c instanceof C16731d) {
            c16731d = (C16731d) abstractC19687c;
            int i10 = c16731d.f53642p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16731d.f53642p0 = i10 - Integer.MIN_VALUE;
            } else {
                c16731d = new C16731d(abstractC19687c);
            }
        } else {
            c16731d = new C16731d(abstractC19687c);
        }
        Object obj2 = c16731d.f53641o0;
        Object obj3 = EnumC19250a.f61036Y;
        int i11 = c16731d.f53642p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj2);
            C16557y c16557y2 = new C16557y();
            c16557y2.f51286Y = f10;
            InterfaceC1441p c16734e = new C16734e(c16782u, f10, c16557y2, null);
            c16731d.f53640Z = c16557y2;
            c16731d.f53639Y = f10;
            c16731d.f53642p0 = 1;
            if (c16782u.m18547a(obj, EnumC14284g0.f44821Y, c16734e, c16731d) == obj3) {
                return obj3;
            }
            c16557y = c16557y2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f10 = c16731d.f53639Y;
            c16557y = c16731d.f53640Z;
            AbstractC9233X.m9807c(obj2);
        }
        return new Float(f10 - c16557y.f51286Y);
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC10459q m11221g(InterfaceC10459q interfaceC10459q, InterfaceC16736e1 interfaceC16736e1, EnumC16673F0 enumC16673F0, InterfaceC14300o0 interfaceC14300o0, boolean z6, boolean z10, InterfaceC16661B0 interfaceC16661B0, InterfaceC17406l interfaceC17406l, InterfaceC16794y interfaceC16794y) {
        return interfaceC10459q.mo428M(new ScrollableElement(interfaceC14300o0, interfaceC16794y, interfaceC16661B0, enumC16673F0, interfaceC16736e1, interfaceC17406l, z6, z10));
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC10459q m11222h(InterfaceC10459q interfaceC10459q, InterfaceC16736e1 interfaceC16736e1, EnumC16673F0 enumC16673F0, boolean z6, boolean z10, C17133j c17133j, InterfaceC17406l interfaceC17406l, int i10) {
        return m11221g(interfaceC10459q, interfaceC16736e1, enumC16673F0, null, (i10 & 4) != 0 ? true : z6, z10, (i10 & 16) != 0 ? null : c17133j, (i10 & 32) != 0 ? null : interfaceC17406l, null);
    }
}
