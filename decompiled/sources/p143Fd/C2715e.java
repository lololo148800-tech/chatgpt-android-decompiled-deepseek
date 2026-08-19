package p143Fd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import mm.C17309l;
import p040Bd.C1056c;
import p040Bd.C1091h;
import p1113xn.AbstractC21322p;
import p1155zi.C21920H0;
import p1155zi.C21965U0;
import p403Qd.EnumC6606L;
import p479Td.AbstractC7343b0;
import p479Td.C7315A;
import p479Td.C7320F;
import p479Td.C7323I;
import p479Td.C7326L;
import p479Td.C7329O;
import p479Td.C7351f0;
import p479Td.C7352g;
import p479Td.C7356i;
import p479Td.C7373x;
import p479Td.EnumC7355h0;
import p479Td.EnumC7359j0;
import p523V9.AbstractC8042a0;
import p571X9.AbstractC9280e4;
import p575Xd.C9444c;
import p658b5.C11241l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p909nm.C17689w;

/* JADX INFO: renamed from: Fd.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C2715e extends C11241l {

    /* JADX INFO: renamed from: p0 */
    public static final C17309l f8357p0 = new C17309l(1729, 1024);

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f8358o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2715e(int i10) {
        super(4);
        this.f8358o0 = i10;
    }

    @Override // p658b5.C11241l
    /* JADX INFO: renamed from: D */
    public EnumC6606L mo3705D() {
        switch (this.f8358o0) {
            case 2:
                return AbstractC8042a0.m8417e((C7351f0) AbstractC17680n.m19351a0((ArrayList) this.f34016Y));
            case 3:
            default:
                return super.mo3705D();
            case 4:
                EnumC6606L enumC6606LM8415c = AbstractC8042a0.m8415c((ArrayList) this.f34016Y);
                return (enumC6606LM8415c == EnumC6606L.f21328Z && mo3706H() == null) ? EnumC6606L.f21327Y : enumC6606LM8415c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0164  */
    /* JADX WARN: Code duplicated, block: B:72:0x0176  */
    /* JADX WARN: Code duplicated, block: B:74:0x017a  */
    /* JADX WARN: Code duplicated, block: B:75:0x018c  */
    /* JADX WARN: Code duplicated, block: B:99:0x01dd  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v30 java.lang.Object, still in use, count: 2, list:
          (r0v30 java.lang.Object) from 0x0156: PHI (r0 I:??) = (r0v23 java.lang.Object), (r0v30 java.lang.Object) binds: [B:65:0x0155, B:130:0x0156] A[DONT_GENERATE, DONT_INLINE]
          (r0v30 java.lang.Object) from 0x014c: CHECK_CAST (Td.f0) (r0v30 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // p658b5.C11241l
    /* JADX INFO: renamed from: E */
    public final p403Qd.AbstractC6653q0 mo3703E(p092Dc.C1991h r15) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p143Fd.C2715e.mo3703E(Dc.h):Qd.q0");
    }

    @Override // p658b5.C11241l
    /* JADX INFO: renamed from: H */
    public AbstractC7343b0 mo3706H() {
        Object next;
        Object objPrevious;
        List list;
        Object c7320f;
        List list2;
        switch (this.f8358o0) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f34016Y;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    C7351f0 c7351f0 = (C7351f0) obj;
                    if (c7351f0.f23290e == EnumC7359j0.f23347r0 && c7351f0.f23280P) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj2 : arrayList3) {
                            if (obj2 instanceof C7373x) {
                                arrayList4.add(obj2);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                C7351f0 c7351f1 = (C7351f0) next;
                                if (c7351f1.f23290e == EnumC7359j0.f23344o0) {
                                    if (c7351f1.f23293h == EnumC7355h0.f23320Z) {
                                    }
                                }
                            } else {
                                next = null;
                            }
                        }
                        C7351f0 c7351f2 = (C7351f0) next;
                        List listM19383l = AbstractC17681o.m19383l(c7351f2 != null ? c7351f2.f23291f : null);
                        if (listM19383l.isEmpty()) {
                            return null;
                        }
                        return new C7323I(AbstractC17680n.m19361k0(listM19383l, arrayList4));
                    }
                    AbstractC7343b0 abstractC7343b0 = ((C7351f0) it.next()).f23291f;
                    if (!(abstractC7343b0 instanceof C7323I)) {
                        abstractC7343b0 = null;
                    }
                    C7323I c7323i = (C7323I) abstractC7343b0;
                    List list3 = c7323i != null ? c7323i.f23229c : null;
                    if (list3 == null) {
                        list3 = C17689w.f56480Y;
                    }
                    AbstractC17686t.m19398v(list3, arrayList3);
                }
                break;
            case 1:
            case 2:
            default:
                return super.mo3706H();
            case 3:
                ArrayList arrayList5 = (ArrayList) this.f34016Y;
                ListIterator listIterator = arrayList5.listIterator(arrayList5.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        C7351f0 c7351f3 = (C7351f0) objPrevious;
                        if (!c7351f3.f23280P || c7351f3.f23270F == null) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                C7351f0 c7351f4 = (C7351f0) objPrevious;
                if (c7351f4 == null) {
                    return null;
                }
                List list4 = c7351f4.f23268D;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : list4) {
                    if (obj3 instanceof C1091h) {
                        arrayList6.add(obj3);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj4 : list4) {
                    if (obj4 instanceof C1056c) {
                        arrayList7.add(obj4);
                    }
                }
                ArrayList<C17309l> arrayList8 = new ArrayList(AbstractC17682p.m19389r(arrayList7, 10));
                Iterator it3 = arrayList7.iterator();
                int i10 = 0;
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    C9444c c9444c = c7351f4.f23270F;
                    if (!zHasNext) {
                        if (c9444c == null || (list = c9444c.f28447b) == null || !arrayList8.isEmpty()) {
                            list = null;
                        }
                        String str = c9444c != null ? c9444c.f28446a : null;
                        if (str == null || AbstractC21322p.m21681O(str) || ((AbstractC7343b0) this.f34017Z) == null || !((C7351f0) AbstractC17680n.m19351a0(arrayList5)).f23280P) {
                            c7320f = (AbstractC7343b0) this.f34017Z;
                        } else {
                            AbstractC7343b0 abstractC7343b1 = (AbstractC7343b0) this.f34017Z;
                            String strM9852d = abstractC7343b1 != null ? AbstractC9280e4.m9852d(abstractC7343b1) : null;
                            if (strM9852d == null) {
                                strM9852d = "";
                            }
                            c7320f = new C7320F(14, strM9852d.concat(" [❶](code://python)"), null, false, false);
                        }
                        ArrayList arrayList9 = new ArrayList();
                        Integer numValueOf = list != null ? Integer.valueOf(list.size()) : null;
                        if (numValueOf != null && numValueOf.intValue() != 0) {
                            if (numValueOf.intValue() == 1) {
                                arrayList9.add(new C7373x((C21965U0) AbstractC17680n.m19341Q(list)));
                            } else {
                                arrayList9.add(new C7315A(list));
                            }
                        }
                        if (c7320f instanceof C7326L ? true : c7320f instanceof C7320F) {
                            arrayList9.add(c7320f);
                        } else if (c7320f instanceof C7323I) {
                            arrayList9.addAll(((C7323I) c7320f).f23229c);
                        }
                        ArrayList arrayList10 = new ArrayList();
                        Iterator it4 = arrayList6.iterator();
                        while (it4.hasNext()) {
                            String str2 = ((C1091h) it4.next()).f2986b;
                            C21920H0 c21920h0 = str2 != null ? new C21920H0(str2) : null;
                            if (c21920h0 != null) {
                                arrayList10.add(c21920h0);
                            }
                        }
                        ArrayList arrayList11 = new ArrayList(AbstractC17682p.m19389r(arrayList10, 10));
                        Iterator it5 = arrayList10.iterator();
                        while (it5.hasNext()) {
                            arrayList11.add(new C7329O(((C21920H0) it5.next()).f69471a));
                        }
                        arrayList9.addAll(arrayList11);
                        if (!arrayList8.isEmpty()) {
                            ArrayList arrayList12 = new ArrayList();
                            for (C17309l c17309l : arrayList8) {
                                C1056c c1056c = (C1056c) c17309l.f55136Y;
                                String str3 = c1056c.f2890c;
                                C21965U0 c21965u0 = (C21965U0) c17309l.f55137Z;
                                C7352g c7352g = c21965u0 == null ? null : new C7352g(str3, c1056c.f2889b, c21965u0);
                                if (c7352g != null) {
                                    arrayList12.add(c7352g);
                                }
                            }
                            arrayList9.add(new C7356i(arrayList12));
                        }
                        if (arrayList9.isEmpty()) {
                            return null;
                        }
                        return new C7323I(arrayList9);
                    }
                    Object next2 = it3.next();
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC17681o.m19388q();
                        throw null;
                    }
                    arrayList8.add(new C17309l((C1056c) next2, (c9444c == null || (list2 = c9444c.f28447b) == null) ? null : (C21965U0) AbstractC17680n.m19344T(i10, list2)));
                    i10 = i11;
                }
                break;
            case 4:
                AbstractC7343b0 abstractC7343b2 = (AbstractC7343b0) this.f34017Z;
                if ((abstractC7343b2 instanceof C7320F) && abstractC7343b2.mo7777a()) {
                    return null;
                }
                return abstractC7343b2;
        }
    }
}
