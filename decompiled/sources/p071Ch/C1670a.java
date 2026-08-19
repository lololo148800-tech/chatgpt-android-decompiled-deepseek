package p071Ch;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import bh.C11431e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import ml.AbstractC17288f;
import mm.C17296C;
import mm.C17309l;
import np.InterfaceC17710b;
import om.C18235b;
import p003A1.C0254h0;
import p030B2.C0742X;
import p049Bm.InterfaceC1440o;
import p072Ci.C1699d;
import p072Ci.C1705j;
import p072Ci.EnumC1702g;
import p1089wl.AbstractC21011e;
import p1155zi.C21897B1;
import p1155zi.C22038o;
import p1155zi.InterfaceC21925I1;
import p460Sk.C7145b;
import p480Te.C7390o;
import p523V9.AbstractC8142m4;
import p544W9.AbstractC8657j4;
import p544W9.AbstractC8663k4;
import p544W9.AbstractC8681n4;
import p544W9.AbstractC8699q4;
import p556Wk.AbstractC8918d;
import p556Wk.AbstractC8927i;
import p556Wk.C8922f;
import p556Wk.C8924g;
import p556Wk.C8926h;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9393x3;
import p604Yk.C10077b;
import p624Zg.C10365e0;
import p708dh.C13139Q;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p857kl.AbstractC16435B;
import p857kl.C16445L;
import p857kl.C16447N;
import p857kl.C16450Q;
import p857kl.C16452T;
import p857kl.C16477y;
import p857kl.C16478z;
import p857kl.InterfaceC16437D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17691y;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sl.C19666a;
import sl.C19675j;
import sm.AbstractC19694j;
import tm.C20007b;

/* JADX INFO: renamed from: Ch.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C1670a extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4733Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f4734Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f4735o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1670a(int i10, InterfaceC18770c interfaceC18770c, int i11) {
        super(i10, interfaceC18770c);
        this.f4733Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f4733Y) {
            case 0:
                C1670a c1670a = new C1670a((C1671b) this.f4735o0, (InterfaceC18770c) obj3, 0);
                c1670a.f4734Z = (AbstractC21011e) obj;
                C17296C c17296c = C17296C.f55119a;
                c1670a.invokeSuspend(c17296c);
                return c17296c;
            case 1:
                C1670a c1670a2 = new C1670a(3, (InterfaceC18770c) obj3, 1);
                c1670a2.f4734Z = (C17309l) obj;
                c1670a2.f4735o0 = obj2;
                return c1670a2.invokeSuspend(C17296C.f55119a);
            case 2:
                C1670a c1670a3 = new C1670a(3, (InterfaceC18770c) obj3, 2);
                c1670a3.f4734Z = (C13693c) obj;
                c1670a3.f4735o0 = (AbstractC17288f) obj2;
                return c1670a3.invokeSuspend(C17296C.f55119a);
            case 3:
                C1670a c1670a4 = new C1670a((C8926h) this.f4735o0, (InterfaceC18770c) obj3, 3);
                c1670a4.f4734Z = (AbstractC21011e) obj;
                C17296C c17296c2 = C17296C.f55119a;
                c1670a4.invokeSuspend(c17296c2);
                return c17296c2;
            case 4:
                C1670a c1670a5 = new C1670a(3, (InterfaceC18770c) obj3, 4);
                c1670a5.f4734Z = (C21897B1) obj;
                c1670a5.f4735o0 = (C21897B1) obj2;
                return c1670a5.invokeSuspend(C17296C.f55119a);
            case 5:
                C1670a c1670a6 = new C1670a((C11431e) this.f4735o0, (InterfaceC18770c) obj3, 5);
                c1670a6.f4734Z = (InterfaceC21925I1) obj2;
                return c1670a6.invokeSuspend(C17296C.f55119a);
            case 6:
                C1670a c1670a7 = new C1670a(3, (InterfaceC18770c) obj3, 6);
                c1670a7.f4734Z = (C1699d) obj;
                c1670a7.f4735o0 = (C1705j) obj2;
                return c1670a7.invokeSuspend(C17296C.f55119a);
            default:
                C1670a c1670a8 = new C1670a(3, (InterfaceC18770c) obj3, 7);
                c1670a8.f4734Z = (List) obj;
                c1670a8.f4735o0 = (List) obj2;
                return c1670a8.invokeSuspend(C17296C.f55119a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v25, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f4733Y) {
            case 0:
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                AbstractC21011e abstractC21011e = (AbstractC21011e) this.f4734Z;
                C1671b c1671b = (C1671b) this.f4735o0;
                if (((Boolean) c1671b.f4737b.f20276h.invoke(((C13693c) abstractC21011e.f66872Y).f43195a.f51018a)).booleanValue()) {
                    AbstractC13695e.m15171a((InterfaceC16437D) abstractC21011e.f66872Y, new C0254h0(c1671b, 13));
                }
                return c17296c;
            case 1:
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                C17309l c17309l = (C17309l) this.f4734Z;
                return new C17309l(c17309l != null ? c17309l.f55137Z : null, this.f4735o0);
            case 2:
                EnumC19250a enumC19250a3 = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                C13693c c13693c = (C13693c) this.f4734Z;
                AbstractC17288f abstractC17288f = (AbstractC17288f) this.f4735o0;
                C7390o c7390o = (C7390o) c13693c.f43200f.m20651e(AbstractC8918d.f27287a);
                if (c7390o == null) {
                    return null;
                }
                return new C7145b(abstractC17288f, c13693c.f43199e, c7390o);
            case 3:
                EnumC19250a enumC19250a4 = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                AbstractC21011e abstractC21011e2 = (AbstractC21011e) this.f4734Z;
                String string = ((C13693c) abstractC21011e2.f66872Y).f43195a.toString();
                C8922f c8922f = new C8922f();
                C13693c c13693c2 = (C13693c) abstractC21011e2.f66872Y;
                C16477y c16477y = c13693c2.f43197c;
                C16477y c16477y2 = c8922f.f27292a;
                AbstractC8142m4.m8673a(c16477y2, c16477y);
                C16478z c16478zM18047Q = c16477y2.m18047Q();
                ((C8926h) this.f4735o0).f27299a.invoke(c8922f);
                for (Map.Entry entry : c16478zM18047Q.mo7977a()) {
                    String str = (String) entry.getKey();
                    Object obj2 = (List) entry.getValue();
                    List listMo4528d = c16477y2.mo4528d(str);
                    if (listMo4528d == null) {
                        c16477y2.mo4533m(str, (Iterable) obj2);
                    } else if (!listMo4528d.equals(obj2)) {
                        List list = AbstractC16435B.f50983a;
                        if (!str.equals("Cookie")) {
                            Map map = (Map) c16477y2.f11539Z;
                            map.remove(str);
                            c16477y2.mo4533m(str, (Iterable) obj2);
                            List list2 = listMo4528d;
                            List list3 = (List) map.get(str);
                            Set setM19328G0 = list3 != null ? AbstractC17680n.m19328G0(list3) : C17691y.f56482Y;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : list2) {
                                if (!setM19328G0.contains((String) obj3)) {
                                    arrayList.add(obj3);
                                }
                            }
                            c16477y2.mo4533m(str, arrayList);
                        }
                    }
                }
                C16452T c16452tM18021b = c8922f.f27293b.m18021b();
                C8924g c8924g = C8926h.f27297b;
                C16447N c16447n = c13693c2.f43195a;
                C16450Q c16450q = c16447n.f51021d;
                C16450Q c16450q2 = c16452tM18021b.f51042h;
                if (c16450q == null) {
                    c16447n.f51021d = c16450q2;
                }
                if (c16447n.f51018a.length() <= 0) {
                    C16447N c16447n2 = new C16447N();
                    c16447n2.f51021d = c16450q2;
                    String str2 = c16452tM18021b.f51035a;
                    AbstractC16544l.m18094g(str2, "<set-?>");
                    c16447n2.f51018a = str2;
                    int i10 = c16452tM18021b.f51036b;
                    Integer numValueOf = i10 != 0 ? Integer.valueOf(i10) : null;
                    c16447n2.m18024e(numValueOf != null ? numValueOf.intValue() : c16452tM18021b.f51043i.f51032b);
                    AbstractC8681n4.m9377f(c16447n2, (String) c16452tM18021b.f51044j.getValue());
                    c16447n2.f51022e = (String) c16452tM18021b.f51046l.getValue();
                    c16447n2.f51023f = (String) c16452tM18021b.f51047m.getValue();
                    C16445L c16445lM9346b = AbstractC8657j4.m9346b();
                    c16445lM9346b.m4530h(AbstractC8663k4.m9356b((String) c16452tM18021b.f51045k.getValue()));
                    c16447n2.f51026i = c16445lM9346b;
                    c16447n2.f51027j = new C10077b(c16445lM9346b);
                    String str3 = (String) c16452tM18021b.f51048n.getValue();
                    AbstractC16544l.m18094g(str3, "<set-?>");
                    c16447n2.f51024g = str3;
                    c16447n2.f51019b = c16452tM18021b.f51040f;
                    c16447n2.f51021d = c16447n.f51021d;
                    int i11 = c16447n.f51020c;
                    if (i11 != 0) {
                        c16447n2.m18024e(i11);
                    }
                    List listM9971a = c16447n2.f51025h;
                    List list4 = c16447n.f51025h;
                    if (!list4.isEmpty()) {
                        if (listM9971a.isEmpty() || ((CharSequence) AbstractC17680n.m19341Q(list4)).length() == 0) {
                            listM9971a = list4;
                        } else {
                            C18235b c18235b = new C18235b((list4.size() + listM9971a.size()) - 1);
                            int size = listM9971a.size() - 1;
                            for (int i12 = 0; i12 < size; i12++) {
                                c18235b.add(listM9971a.get(i12));
                            }
                            c18235b.addAll(list4);
                            listM9971a = AbstractC9393x3.m9971a(c18235b);
                        }
                    }
                    AbstractC16544l.m18094g(listM9971a, "<set-?>");
                    c16447n2.f51025h = listM9971a;
                    if (c16447n.f51024g.length() > 0) {
                        String str4 = c16447n.f51024g;
                        AbstractC16544l.m18094g(str4, "<set-?>");
                        c16447n2.f51024g = str4;
                    }
                    C16445L c16445lM9346b2 = AbstractC8657j4.m9346b();
                    AbstractC8142m4.m8673a(c16445lM9346b2, c16447n2.f51026i);
                    C16445L value = c16447n.f51026i;
                    AbstractC16544l.m18094g(value, "value");
                    c16447n2.f51026i = value;
                    c16447n2.f51027j = new C10077b(value);
                    for (Map.Entry entry2 : c16445lM9346b2.mo4526a()) {
                        String name = (String) entry2.getKey();
                        List list5 = (List) entry2.getValue();
                        C16445L c16445l = c16447n2.f51026i;
                        c16445l.getClass();
                        AbstractC16544l.m18094g(name, "name");
                        if (!((Map) c16445l.f11539Z).containsKey(name)) {
                            c16447n2.f51026i.mo4533m(name, list5);
                        }
                    }
                    AbstractC8699q4.m9404d(c16447n, c16447n2);
                }
                C19675j c19675j = c8922f.f27294c;
                for (C19666a c19666a : AbstractC17680n.m19322C0(c19675j.m20650d().keySet())) {
                    if (!c13693c2.f43200f.m20648b(c19666a)) {
                        c13693c2.f43200f.m20652f(c19666a, c19675j.m20649c(c19666a));
                    }
                }
                c13693c2.f43197c.m4532k();
                c13693c2.f43197c.m4530h(c16477y2.m18047Q());
                InterfaceC17710b interfaceC17710b = AbstractC8927i.f27300a;
                StringBuilder sbM11058p = AbstractC10763a.m11058p("Applied DefaultRequest to ", string, ". New url: ");
                sbM11058p.append(c13693c2.f43195a);
                interfaceC17710b.mo19442g(sbM11058p.toString());
                return c17296c;
            case 4:
                EnumC19250a enumC19250a5 = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                C21897B1 c21897b1 = (C21897B1) this.f4734Z;
                return c21897b1.f69431a.isEmpty() ? (C21897B1) this.f4735o0 : c21897b1;
            case 5:
                EnumC19250a enumC19250a6 = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                InterfaceC21925I1 interfaceC21925I1 = (InterfaceC21925I1) this.f4734Z;
                C22038o c22038o = ((C11431e) this.f4735o0).f34531Z.f58774b.f69415a;
                return new C10365e0(c22038o, c22038o != null ? c22038o.m22344a() : null, interfaceC21925I1);
            case 6:
                EnumC19250a enumC19250a7 = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                C1699d c1699d = (C1699d) this.f4734Z;
                C1705j c1705j = (C1705j) this.f4735o0;
                C20007b c20007b = EnumC1702g.f4862x0;
                int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(c20007b, 10));
                if (iM19257b < 16) {
                    iM19257b = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
                C0742X c0742x = new C0742X(c20007b, 8);
                while (c0742x.hasNext()) {
                    Object next = c0742x.next();
                    EnumC1702g enumC1702g = (EnumC1702g) next;
                    linkedHashMap.put(next, new C13139Q(c1699d.f4836j.contains(enumC1702g.f4863Y), c1699d.f4835i.contains(enumC1702g.f4863Y), ((Boolean) enumC1702g.f4864Z.invoke(c1705j)).booleanValue()));
                }
                return linkedHashMap;
            default:
                EnumC19250a enumC19250a8 = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                return new C17309l((List) this.f4734Z, (List) this.f4735o0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1670a(Object obj, InterfaceC18770c interfaceC18770c, int i10) {
        super(3, interfaceC18770c);
        this.f4733Y = i10;
        this.f4735o0 = obj;
    }
}
