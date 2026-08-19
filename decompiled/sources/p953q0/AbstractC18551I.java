package p953q0;

import androidx.compose.foundation.lazy.layout.C10847b;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import mm.C17296C;
import p006A4.C0350k;
import p013Ab.C0420b;
import p042Bf.C1276r;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p080D0.C1834v;
import p1095x1.AbstractC21067V;
import p1139z0.C21585H;
import p200Hm.C3508g;
import p321Mk.C5466d;
import p349O0.AbstractC6012k0;
import p349O0.C5975S;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p382Pf.C6401d;
import p392Q0.C6546d;
import p492U1.EnumC7546k;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p562X0.AbstractC9018m;
import p562X0.AbstractC9020o;
import p562X0.InterfaceC9009d;
import p562X0.InterfaceC9016k;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9567s;
import p594Y9.AbstractC9834X3;
import p635a1.InterfaceC10459q;
import p784hb.C14438g;
import p858ko.C16482A;
import p860l0.EnumC16673F0;
import p887m7.C17176b;
import p909nm.C17689w;
import ph.C18416d;

/* JADX INFO: renamed from: q0.I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18551I {

    /* JADX INFO: renamed from: a */
    public static final C18546D[] f59111a = new C18546D[0];

    /* JADX INFO: renamed from: a */
    public static final void m19920a(InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, C18566Y c18566y, InterfaceC1439n interfaceC1439n, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(2002163445);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1426a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(c18566y) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1439n) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            m19923d(AbstractC8411c.m8969c(-1488997347, c6021p, new C10847b(c18566y, interfaceC10459q, interfaceC1439n, C5997d.m6435V(interfaceC1426a, c6021p))), c6021p, 6);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18557O(i10, 1, interfaceC1426a, interfaceC10459q, c18566y, interfaceC1439n);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19921b(C5466d c5466d, InterfaceC10459q interfaceC10459q, C18566Y c18566y, C0350k c0350k, C6021p c6021p, int i10) {
        int i11;
        C18566Y c18566y2;
        c6021p.m6526U(852831187);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c5466d) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6545h(c0350k) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            c18566y2 = c18566y;
        } else {
            boolean z6 = (i12 & 14) == 4;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C17176b(c5466d, 8);
                c6021p.m6537c0(objM6514H);
            }
            m19920a((InterfaceC1426a) objM6514H, interfaceC10459q, null, c0350k, c6021p, i12 & 8176);
            c18566y2 = null;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18557O(i10, 0, c5466d, interfaceC10459q, c18566y2, c0350k);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m19922c(Object obj, int i10, C18563V c18563v, C8410b c8410b, C6021p c6021p, int i11) {
        int i12;
        c6021p.m6526U(-2079116560);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6545h(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c6021p.m6538d(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c6021p.m6545h(c18563v) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c6021p.m6545h(c8410b) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            boolean zM6542f = c6021p.m6542f(obj) | c6021p.m6542f(c18563v);
            Object objM6514H = c6021p.m6514H();
            Object obj2 = C6013l.f19514a;
            if (zM6542f || objM6514H == obj2) {
                objM6514H = new C18562U(obj, c18563v);
                c6021p.m6537c0(objM6514H);
            }
            C18562U c18562u = (C18562U) objM6514H;
            C5996c0 c5996c0 = c18562u.f59137c;
            C6002f0 c6002f0 = c18562u.f59139e;
            C6002f0 c6002f1 = c18562u.f59140f;
            c5996c0.m6413h(i10);
            AbstractC6012k0 abstractC6012k0 = AbstractC21067V.f66979a;
            C18562U c18562u2 = (C18562U) c6021p.m6548k(abstractC6012k0);
            AbstractC9556h abstractC9556hM10108d = AbstractC9567s.m10108d();
            InterfaceC1436k interfaceC1436kMo10046f = abstractC9556hM10108d != null ? abstractC9556hM10108d.mo10046f() : null;
            AbstractC9556h abstractC9556hM10109e = AbstractC9567s.m10109e(abstractC9556hM10108d);
            try {
                if (c18562u2 != ((C18562U) c6002f1.getValue())) {
                    c6002f1.setValue(c18562u2);
                    if (c18562u.f59138d.m6412g() > 0) {
                        C18562U c18562u3 = (C18562U) c6002f0.getValue();
                        if (c18562u3 != null) {
                            c18562u3.m19941b();
                        }
                        if (c18562u2 != null) {
                            c18562u2.m19940a();
                        } else {
                            c18562u2 = null;
                        }
                        c6002f0.setValue(c18562u2);
                    }
                }
                AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
                boolean zM6542f2 = c6021p.m6542f(c18562u);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6542f2 || objM6514H2 == obj2) {
                    objM6514H2 = new C16482A(c18562u, 18);
                    c6021p.m6537c0(objM6514H2);
                }
                C5997d.m6444c(c18562u, (InterfaceC1436k) objM6514H2, c6021p);
                C5997d.m6440a(abstractC6012k0.mo6405a(c18562u), c8410b, c6021p, ((i12 >> 6) & 112) | 8);
            } catch (Throwable th2) {
                AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
                throw th2;
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1276r(obj, i10, c18563v, c8410b, i11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m19923d(C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        int i12 = 3;
        c6021p.m6526U(674185128);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c8410b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC6012k0 abstractC6012k0 = AbstractC9018m.f27517a;
            InterfaceC9016k interfaceC9016k = (InterfaceC9016k) c6021p.m6548k(abstractC6012k0);
            Object[] objArr = {interfaceC9016k};
            C18581g0 c18581g0 = C18581g0.f59185Y;
            C18579f0 c18579f0 = new C18579f0(interfaceC9016k, 1);
            C21585H c21585h = AbstractC9020o.f27518a;
            C21585H c21585h2 = new C21585H(c18581g0, 10, c18579f0);
            boolean zM6545h = c6021p.m6545h(interfaceC9016k);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new C17176b(interfaceC9016k, 9);
                c6021p.m6537c0(objM6514H);
            }
            Object obj = (C18583h0) AbstractC9834X3.m10481d(objArr, c21585h2, null, (InterfaceC1426a) objM6514H, c6021p, 0, 4);
            C5997d.m6440a(abstractC6012k0.mo6405a(obj), AbstractC8411c.m8969c(1863926504, c6021p, new C18416d(obj, i12, c8410b)), c6021p, 56);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1834v(c8410b, i10, 7);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m19924e(InterfaceC18554L interfaceC18554L, Object obj, int i10, Object obj2, C6021p c6021p, int i11) {
        int i12;
        c6021p.m6526U(1439843069);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6542f(interfaceC18554L) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c6021p.m6542f(obj) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c6021p.m6538d(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c6021p.m6542f(obj2) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            ((InterfaceC9009d) obj).mo9594c(obj2, AbstractC8411c.m8969c(980966366, c6021p, new C6401d(i10, obj2, interfaceC18554L)), c6021p, 48);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1276r(interfaceC18554L, obj, i10, obj2, i11, 16);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final int m19925f(int i10, C6546d c6546d) {
        int i11 = c6546d.f21184o0 - 1;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = ((i11 - i12) / 2) + i12;
            Object[] objArr = c6546d.f21182Y;
            int i14 = ((C18580g) objArr[i13]).f59182a;
            if (i14 != i10) {
                if (i14 < i10) {
                    i12 = i13 + 1;
                    if (i10 < ((C18580g) objArr[i12]).f59182a) {
                    }
                } else {
                    i11 = i13 - 1;
                }
            }
            return i13;
        }
        return i12;
    }

    /* JADX INFO: renamed from: g */
    public static final List m19926g(InterfaceC18554L interfaceC18554L, C18563V c18563v, C14438g c14438g) {
        C3508g c3508g;
        if (!((C6546d) c14438g.f45414Y).m7109n() && c18563v.f59141Y.isEmpty()) {
            return C17689w.f56480Y;
        }
        ArrayList arrayList = new ArrayList();
        C6546d c6546d = (C6546d) c14438g.f45414Y;
        if (!c6546d.m7109n()) {
            c3508g = C3508g.f10598p0;
        } else {
            if (c6546d.m7108m()) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = c6546d.f21182Y;
            int i10 = ((C18593n) objArr[0]).f59233a;
            int i11 = c6546d.f21184o0;
            if (i11 > 0) {
                int i12 = 0;
                do {
                    int i13 = ((C18593n) objArr[i12]).f59233a;
                    if (i13 < i10) {
                        i10 = i13;
                    }
                    i12++;
                } while (i12 < i11);
            }
            if (i10 < 0) {
                throw new IllegalArgumentException("negative minIndex");
            }
            if (c6546d.m7108m()) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = c6546d.f21182Y;
            int i14 = ((C18593n) objArr2[0]).f59234b;
            int i15 = c6546d.f21184o0;
            if (i15 > 0) {
                int i16 = 0;
                do {
                    int i17 = ((C18593n) objArr2[i16]).f59234b;
                    if (i17 > i14) {
                        i14 = i17;
                    }
                    i16++;
                } while (i16 < i15);
            }
            c3508g = new C3508g(i10, Math.min(i14, interfaceC18554L.mo5911b() - 1), 1);
        }
        int size = c18563v.f59141Y.size();
        for (int i18 = 0; i18 < size; i18++) {
            C18562U c18562u = (C18562U) c18563v.get(i18);
            int iM19928i = m19928i(c18562u.f59137c.m6412g(), c18562u.f59135a, interfaceC18554L);
            int i19 = c3508g.f10591Y;
            if ((iM19928i > c3508g.f10592Z || i19 > iM19928i) && iM19928i >= 0 && iM19928i < interfaceC18554L.mo5911b()) {
                arrayList.add(Integer.valueOf(iM19928i));
            }
        }
        int i20 = c3508g.f10591Y;
        int i21 = c3508g.f10592Z;
        if (i20 <= i21) {
            while (true) {
                arrayList.add(Integer.valueOf(i20));
                if (i20 == i21) {
                    break;
                }
                i20++;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC5985X m19927h() {
        return C5997d.m6430Q(C17296C.f55119a, C5975S.f19445o0);
    }

    /* JADX INFO: renamed from: i */
    public static final int m19928i(int i10, Object obj, InterfaceC18554L interfaceC18554L) {
        int iMo5910a;
        return (obj == null || interfaceC18554L.mo5911b() == 0 || (i10 < interfaceC18554L.mo5911b() && obj.equals(interfaceC18554L.mo5912c(i10))) || (iMo5910a = interfaceC18554L.mo5910a(obj)) == -1) ? i10 : iMo5910a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m19929m(InterfaceC5985X interfaceC5985X) {
        interfaceC5985X.setValue(C17296C.f55119a);
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC10459q m19930n(InterfaceC10459q interfaceC10459q, InterfaceC18597r interfaceC18597r, C14438g c14438g, boolean z6, EnumC7546k enumC7546k, EnumC16673F0 enumC16673F0, boolean z10, C6021p c6021p, int i10) {
        if (!z10) {
            c6021p.m6524S(-1890658823);
            c6021p.m6553p(false);
            return interfaceC10459q;
        }
        c6021p.m6524S(-1890632411);
        boolean z11 = true;
        boolean z12 = ((((i10 & 112) ^ 48) > 32 && c6021p.m6542f(interfaceC18597r)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && c6021p.m6542f(c14438g)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && c6021p.m6544g(z6)) || (i10 & 3072) == 2048) | ((((57344 & i10) ^ 24576) > 16384 && c6021p.m6542f(enumC7546k)) || (i10 & 24576) == 16384);
        if ((((458752 & i10) ^ 196608) <= 131072 || !c6021p.m6542f(enumC16673F0)) && (i10 & 196608) != 131072) {
            z11 = false;
        }
        boolean z13 = z12 | z11;
        Object objM6514H = c6021p.m6514H();
        if (z13 || objM6514H == C6013l.f19514a) {
            objM6514H = new C18596q(interfaceC18597r, c14438g, z6, enumC7546k, enumC16673F0);
            c6021p.m6537c0(objM6514H);
        }
        InterfaceC10459q interfaceC10459qMo428M = interfaceC10459q.mo428M((C18596q) objM6514H);
        c6021p.m6553p(false);
        return interfaceC10459qMo428M;
    }

    /* JADX INFO: renamed from: j */
    public Object m19931j(int i10) {
        C18580g c18580gM1062r = mo19801k().m1062r(i10);
        return ((InterfaceC18599t) c18580gM1062r.f59184c).getType().invoke(Integer.valueOf(i10 - c18580gM1062r.f59182a));
    }

    /* JADX INFO: renamed from: k */
    public abstract C0420b mo19801k();

    /* JADX INFO: renamed from: l */
    public Object m19932l(int i10) {
        Object objInvoke;
        C18580g c18580gM1062r = mo19801k().m1062r(i10);
        int i11 = i10 - c18580gM1062r.f59182a;
        InterfaceC1436k key = ((InterfaceC18599t) c18580gM1062r.f59184c).getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i11))) == null) ? new C18576e(i10) : objInvoke;
    }
}
