package p594Y9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17632f;
import p001A.AbstractC0010F;
import p092Dc.C1998o;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2149O0;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p507Uh.C7689o;
import p507Uh.C7691q;
import p507Uh.InterfaceC7690p;
import p571X9.AbstractC9112C3;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p909nm.C17690x;
import p919o8.AbstractC17962d;
import p919o8.C18002q0;
import p919o8.EnumC18026y0;

/* JADX INFO: renamed from: Y9.c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9863c0 {
    /* JADX INFO: renamed from: b */
    public static final C7689o m10518b(C6021p c6021p) {
        Object next;
        Object objM19235b;
        c6021p.m6524S(715692249);
        c6021p.m6524S(617413469);
        Iterator it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof InterfaceC7690p));
        if (next != null) {
            objM19235b = (InterfaceC7690p) next;
            c6021p.m6553p(false);
        } else {
            objM19235b = C17632f.f56419a.m19235b(InterfaceC7690p.class);
            c6021p.m6553p(false);
        }
        InterfaceC7690p interfaceC7690p = (InterfaceC7690p) objM19235b;
        C7691q c7691q = interfaceC7690p != null ? (C7691q) ((C1998o) interfaceC7690p).f6063p0.get() : null;
        c6021p.m6524S(1894356184);
        boolean zM6542f = c6021p.m6542f(c7691q);
        Object objM6514H = c6021p.m6514H();
        Object obj = C6013l.f19514a;
        if (zM6542f || objM6514H == obj) {
            objM6514H = c7691q == null ? AbstractC2124C.m3204c(C17690x.f56481Y) : c7691q.f24229b;
            c6021p.m6537c0(objM6514H);
        }
        c6021p.m6553p(false);
        InterfaceC5985X interfaceC5985XM9642d = AbstractC9112C3.m9642d((InterfaceC2149O0) objM6514H, c6021p);
        Object obj2 = (Map) interfaceC5985XM9642d.getValue();
        c6021p.m6524S(1894364429);
        boolean zM6542f2 = c6021p.m6542f(obj2) | c6021p.m6542f(c7691q);
        Object objM6514H2 = c6021p.m6514H();
        if (zM6542f2 || objM6514H2 == obj) {
            objM6514H2 = new C7689o(interfaceC5985XM9642d, c7691q);
            c6021p.m6537c0(objM6514H2);
        }
        C7689o c7689o = (C7689o) objM6514H2;
        c6021p.m6553p(false);
        c6021p.m6553p(false);
        return c7689o;
    }

    /* JADX INFO: renamed from: a */
    public static C18002q0 m10517a(C3676s c3676s) {
        ArrayList arrayList;
        String strMo4384r;
        EnumC18026y0 enumC18026y0;
        try {
            String strMo4384r2 = c3676s.m4395w("status").mo4384r();
            AbstractC16544l.m18093f(strMo4384r2, "jsonObject.get(\"status\").asString");
            int i10 = 0;
            for (int i11 : AbstractC0010F.m27k(3)) {
                if (AbstractC17962d.m19657r(i11).equals(strMo4384r2)) {
                    AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("interfaces");
                    if (abstractC3673pM4395w != null) {
                        ArrayList arrayList2 = abstractC3673pM4395w.m4389j().f11172Y;
                        arrayList = new ArrayList(arrayList2.size());
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            String strMo4384r3 = ((AbstractC3673p) it.next()).mo4384r();
                            AbstractC16544l.m18093f(strMo4384r3, "it.asString");
                            EnumC18026y0[] enumC18026y0ArrValues = EnumC18026y0.values();
                            int length = enumC18026y0ArrValues.length;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= length) {
                                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                                }
                                enumC18026y0 = enumC18026y0ArrValues[i12];
                                if (enumC18026y0.f57543Y.equals(strMo4384r3)) {
                                    break;
                                }
                                i12++;
                            }
                            arrayList.add(enumC18026y0);
                        }
                    } else {
                        arrayList = null;
                    }
                    AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("effective_type");
                    if (abstractC3673pM4395w2 != null && (strMo4384r = abstractC3673pM4395w2.mo4384r()) != null) {
                        int[] iArrM27k = AbstractC0010F.m27k(4);
                        int length2 = iArrM27k.length;
                        while (true) {
                            if (i10 >= length2) {
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            }
                            int i13 = iArrM27k[i10];
                            if (AbstractC17962d.m19653n(i13).equals(strMo4384r)) {
                                i10 = i13;
                                break;
                            }
                            i10++;
                        }
                    }
                    AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w(MMVKXkcLpuHFDi.oFh);
                    return new C18002q0(i11, arrayList, i10, abstractC3673pM4395w3 != null ? AbstractC9836Y.m10483b(abstractC3673pM4395w3.m4390m()) : null);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Connectivity", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Connectivity", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Connectivity", e12);
        }
    }
}
