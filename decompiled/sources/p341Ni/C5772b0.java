package p341Ni;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mm.C17296C;
import p003A1.C0298w;
import p049Bm.InterfaceC1440o;
import p077Cn.EnumC1733a;
import p086D6.C1970n;
import p094De.C2025h;
import p103Dn.AbstractC2124C;
import p103Dn.AbstractC2173c0;
import p103Dn.C2146N;
import p103Dn.C2176e;
import p103Dn.C2182h;
import p103Dn.C2217y0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p124Ei.C2499c1;
import p344Nl.C5819A;
import p387Pl.AbstractC6468O;
import p387Pl.AbstractC6470Q;
import p387Pl.C6497q;
import p387Pl.C6501u;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9873d3;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5772b0 extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f18796Y;

    /* JADX INFO: renamed from: Z */
    public int f18797Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ InterfaceC2186j f18798o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f18799p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5772b0(int i10, InterfaceC18770c interfaceC18770c, int i11) {
        super(i10, interfaceC18770c);
        this.f18796Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC2186j interfaceC2186j = (InterfaceC2186j) obj;
        InterfaceC18770c interfaceC18770c = (InterfaceC18770c) obj3;
        switch (this.f18796Y) {
            case 0:
                C5772b0 c5772b0 = new C5772b0(3, interfaceC18770c, 0);
                c5772b0.f18798o0 = interfaceC2186j;
                c5772b0.f18799p0 = obj2;
                return c5772b0.invokeSuspend(C17296C.f55119a);
            case 1:
                C5772b0 c5772b1 = new C5772b0(3, interfaceC18770c, 1);
                c5772b1.f18798o0 = interfaceC2186j;
                c5772b1.f18799p0 = obj2;
                return c5772b1.invokeSuspend(C17296C.f55119a);
            case 2:
                C5772b0 c5772b2 = new C5772b0(3, interfaceC18770c, 2);
                c5772b2.f18798o0 = interfaceC2186j;
                c5772b2.f18799p0 = obj2;
                return c5772b2.invokeSuspend(C17296C.f55119a);
            default:
                C5772b0 c5772b3 = new C5772b0(3, interfaceC18770c, 3);
                c5772b3.f18798o0 = interfaceC2186j;
                c5772b3.f18799p0 = obj2;
                return c5772b3.invokeSuspend(C17296C.f55119a);
        }
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C2217y0 c2217y0;
        C2217y0 c2217y1;
        InterfaceC2184i c5819a;
        int i10 = 2;
        InterfaceC2184i c2499c1 = C2182h.f6683Y;
        C17296C c17296c = C17296C.f55119a;
        int i11 = 1;
        switch (this.f18796Y) {
            case 0:
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i12 = this.f18797Z;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj);
                InterfaceC2186j interfaceC2186j = this.f18798o0;
                C5788j0 c5788j0 = (C5788j0) this.f18799p0;
                if (c5788j0 != null && (c2217y0 = c5788j0.f18909m) != null) {
                    c2499c1 = c2217y0;
                }
                this.f18797Z = 1;
                return AbstractC2124C.m3217p(interfaceC2186j, c2499c1, this) == enumC19250a ? enumC19250a : c17296c;
            case 1:
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i13 = this.f18797Z;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj);
                InterfaceC2186j interfaceC2186j2 = this.f18798o0;
                C5788j0 c5788j1 = (C5788j0) this.f18799p0;
                if (c5788j1 != null && (c2217y1 = c5788j1.f18911o) != null) {
                    c2499c1 = new C2499c1(c2217y1, i10);
                }
                this.f18797Z = 1;
                return AbstractC2124C.m3217p(interfaceC2186j2, c2499c1, this) == enumC19250a2 ? enumC19250a2 : c17296c;
            case 2:
                EnumC19250a enumC19250a3 = EnumC19250a.f61036Y;
                int i14 = this.f18797Z;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj);
                InterfaceC2186j interfaceC2186j3 = this.f18798o0;
                List list = (List) this.f18799p0;
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC6468O abstractC6468OM7055c = ((C6497q) it.next()).m7055c();
                    C6501u c6501u = abstractC6468OM7055c instanceof C6501u ? (C6501u) abstractC6468OM7055c : null;
                    arrayList.add(c6501u == null ? c2499c1 : new C2146N(new C2499c1(AbstractC9873d3.m10529c(new C0298w(0, 4, C6501u.class, c6501u, "options", "getOptions()Lio/livekit/android/room/track/LocalVideoTrackOptions;")), i11), 2));
                }
                int i15 = AbstractC2173c0.f6659a;
                C2176e c2176e = new C2176e(arrayList, C18777j.f59682Y, -2, EnumC1733a.f4961Y);
                this.f18797Z = 1;
                return AbstractC2124C.m3217p(interfaceC2186j3, c2176e, this) == enumC19250a3 ? enumC19250a3 : c17296c;
            default:
                EnumC19250a enumC19250a4 = EnumC19250a.f61036Y;
                int i16 = this.f18797Z;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj);
                InterfaceC2186j interfaceC2186j4 = this.f18798o0;
                Map map = (Map) this.f18799p0;
                if (map.isEmpty()) {
                    c5819a = new C2025h(C17689w.f56480Y, 3);
                } else {
                    Collection<AbstractC6470Q> collectionValues = map.values();
                    ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(collectionValues, 10));
                    for (AbstractC6470Q abstractC6470Q : collectionValues) {
                        arrayList2.add(new C1970n(AbstractC9873d3.m10529c(new C0298w(0, 5, AbstractC6470Q.class, abstractC6470Q, "track", "getTrack()Lio/livekit/android/room/track/Track;")), 13, abstractC6470Q));
                    }
                    Object[] array = AbstractC17680n.m19322C0(arrayList2).toArray(new InterfaceC2184i[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    c5819a = new C5819A((InterfaceC2184i[]) array, 0);
                }
                this.f18797Z = 1;
                return AbstractC2124C.m3217p(interfaceC2186j4, c5819a, this) == enumC19250a4 ? enumC19250a4 : c17296c;
        }
    }
}
