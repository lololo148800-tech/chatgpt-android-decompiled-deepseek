package p015Ad;

import gd.C13969n2;
import gd.InterfaceC13849E;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p092Dc.C1991h;
import p117Eb.C2392v;
import p143Fd.C2713c;
import p143Fd.C2715e;
import p143Fd.C2718h;
import p143Fd.InterfaceC2719i;
import p191Hd.C3288a;
import p403Qd.C6597C;
import p403Qd.EnumC6606L;
import p479Td.C7351f0;
import p479Td.EnumC7355h0;
import p479Td.EnumC7359j0;
import p658b5.C11241l;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Ad.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C0431f {

    /* JADX INFO: renamed from: a */
    public final C13969n2 f1408a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13849E f1409b;

    /* JADX INFO: renamed from: c */
    public final C1991h f1410c;

    /* JADX INFO: renamed from: d */
    public final Map f1411d = AbstractC17660E.m19258c(new C17309l(EnumC7359j0.f23336A0, C0430e.f1407Y));

    public C0431f(C13969n2 c13969n2, InterfaceC13849E interfaceC13849E, C1991h c1991h) {
        this.f1408a = c13969n2;
        this.f1409b = interfaceC13849E;
        this.f1410c = c1991h;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2719i m1087a(C7351f0 c7351f0, ArrayList arrayList) {
        InterfaceC2719i c2715e;
        int i10 = AbstractC0429d.f1406a[c7351f0.f23293h.ordinal()];
        InterfaceC13849E interfaceC13849E = this.f1409b;
        switch (i10) {
            case 1:
                c2715e = new C2715e(2);
                break;
            case 2:
                c2715e = new C2715e(2);
                break;
            case 3:
                c2715e = new C2715e(0);
                break;
            case 4:
                c2715e = new C11241l(4);
                break;
            case 5:
                c2715e = new C2715e(4);
                break;
            case 6:
                c2715e = new C11241l(4);
                break;
            case 7:
                c2715e = new C2392v(this.f1408a);
                break;
            case 8:
                c2715e = new C2715e(3);
                break;
            case 9:
                c2715e = new C2715e(1);
                break;
            case 10:
                c2715e = new C3288a(interfaceC13849E);
                break;
            case 11:
                c2715e = new C2713c(interfaceC13849E);
                break;
            case 12:
                c2715e = new C2713c(interfaceC13849E);
                break;
            case 13:
                c2715e = new C2713c(interfaceC13849E);
                break;
            case 14:
                c2715e = new C2713c(interfaceC13849E);
                break;
            case 15:
            case 16:
                c2715e = null;
                break;
            default:
                throw new C0644w();
        }
        if (c2715e == null) {
            InterfaceC1426a interfaceC1426a = (InterfaceC1426a) this.f1411d.get(c7351f0.f23290e);
            c2715e = interfaceC1426a != null ? (C2718h) interfaceC1426a.invoke() : null;
        }
        C2713c c2713c = (C2713c) (c2715e instanceof C2713c ? c2715e : null);
        if (c2713c != null) {
            c2713c.f8355p0 = AbstractC17680n.m19322C0(arrayList);
        }
        return c2715e;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final ArrayList m1088b(List messages) {
        C1991h c1991h;
        List listMo3550g;
        EnumC7359j0 enumC7359j0;
        AbstractC16544l.m18094g(messages, "messages");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = messages.iterator();
        InterfaceC2719i interfaceC2719iM1087a = null;
        EnumC7355h0 enumC7355h0 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            c1991h = this.f1410c;
            if (!zHasNext) {
                break;
            }
            C7351f0 c7351f0 = (C7351f0) it.next();
            if (interfaceC2719iM1087a == null || (enumC7359j0 = c7351f0.f23290e) == EnumC7359j0.f23343Z) {
                if (interfaceC2719iM1087a == null || c7351f0.f23290e != EnumC7359j0.f23343Z) {
                    InterfaceC2719i interfaceC2719iM1087a2 = m1087a(c7351f0, arrayList2);
                    if (interfaceC2719iM1087a2 == null) {
                        arrayList.add(new C6597C(c7351f0));
                    } else {
                        interfaceC2719iM1087a2.mo3551h(c7351f0);
                        enumC7355h0 = c7351f0.f23293h;
                        interfaceC2719iM1087a = interfaceC2719iM1087a2;
                    }
                } else {
                    arrayList.addAll(interfaceC2719iM1087a.mo3550g(c1991h, EnumC6606L.f21329o0));
                    arrayList.add(new C6597C(c7351f0));
                    interfaceC2719iM1087a = null;
                }
            } else if (enumC7359j0 == EnumC7359j0.f23344o0) {
                EnumC7355h0 enumC7355h1 = EnumC7355h0.f23320Z;
                EnumC7355h0 enumC7355h2 = c7351f0.f23293h;
                if (enumC7355h2 != enumC7355h1 && enumC7355h0 != enumC7355h2) {
                    interfaceC2719iM1087a.mo3551h(c7351f0);
                    arrayList.addAll(interfaceC2719iM1087a.mo3550g(c1991h, EnumC6606L.f21328Z));
                    interfaceC2719iM1087a = m1087a(c7351f0, arrayList2);
                    if (interfaceC2719iM1087a != null) {
                        interfaceC2719iM1087a.mo3551h(c7351f0);
                    }
                    enumC7355h0 = enumC7355h2;
                } else if (interfaceC2719iM1087a.mo3551h(c7351f0)) {
                    arrayList.addAll(interfaceC2719iM1087a.mo3550g(c1991h, EnumC6606L.f21327Y));
                    interfaceC2719iM1087a = null;
                }
            } else if (interfaceC2719iM1087a.mo3551h(c7351f0)) {
                arrayList.addAll(interfaceC2719iM1087a.mo3550g(c1991h, EnumC6606L.f21327Y));
                interfaceC2719iM1087a = null;
            }
            arrayList2.add(c7351f0);
        }
        if (interfaceC2719iM1087a != null && (listMo3550g = interfaceC2719iM1087a.mo3550g(c1991h, EnumC6606L.f21327Y)) != null) {
            arrayList.addAll(listMo3550g);
        }
        return arrayList;
    }
}
