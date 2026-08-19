package p033B5;

import ao.C11200y;
import bo.AbstractC11516d;
import bo.C11531s;
import bo.InterfaceC11530r;
import co.AbstractC11828r;
import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.C15085k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ml.AbstractC17288f;
import mm.C17309l;
import mm.C17314q;
import p001A.C0017I0;
import p008A6.C0386f;
import p025An.C0613g0;
import p049Bm.InterfaceC1426a;
import p1076w6.AbstractC20847e;
import p1076w6.C20848f;
import p1113xn.AbstractC21322p;
import p1155zi.C22059t0;
import p160G5.InterfaceC3000f;
import p225Im.InterfaceC3756d;
import p509Uk.C7714g;
import p559Wn.C8969a;
import p559Wn.C8973e;
import p559Wn.C8974f;
import p571X9.AbstractC9393x3;
import p606Yn.C10102c;
import p606Yn.C10109j;
import p606Yn.C10110k;
import p664bc.AbstractC11336c;
import p857kl.C16452T;
import p909nm.AbstractC17680n;
import p909nm.C17690x;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: B5.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0821e implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2289Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f2290Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f2291o0;

    public /* synthetic */ C0821e(Object obj, int i10, Object obj2) {
        this.f2289Y = i10;
        this.f2290Z = obj;
        this.f2291o0 = obj2;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        String strM12924a;
        int i10 = 0;
        Object obj = this.f2291o0;
        Object obj2 = this.f2290Z;
        switch (this.f2289Y) {
            case 0:
                return AbstractC9393x3.m9974d(new C17309l((InterfaceC3000f) obj2, (InterfaceC3756d) obj));
            case 1:
                return (C15085k) AbstractC15070F.m16194v(C0613g0.f1858Y, (InterfaceC18776i) obj2, new C7714g((AbstractC17288f) obj, null), 2).f34001Z;
            case 2:
                return AbstractC11336c.m12774d((String) obj2, C10102c.f29909c, new SerialDescriptor[0], new C8973e((C8974f) obj, i10));
            case 3:
                C8969a c8969a = (C8969a) obj2;
                C11200y c11200y = (C11200y) c8969a.f27403c;
                if (c11200y == null) {
                    Enum[] enumArr = (Enum[]) c8969a.f27402b;
                    c11200y = new C11200y((String) obj, enumArr.length);
                    for (Enum r6 : enumArr) {
                        c11200y.m18453j(r6.name(), false);
                    }
                }
                return c11200y;
            case 4:
                return AbstractC11336c.m12774d((String) obj2, C10110k.f29938e, new SerialDescriptor[0], new C0386f((C8969a) obj, 20));
            case 5:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AbstractC11516d abstractC11516d = (AbstractC11516d) obj;
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
                boolean z6 = abstractC11516d.f34843a.f34882n && AbstractC16544l.m18089b(serialDescriptor.getKind(), C10109j.f29934b);
                C11531s c11531sM13114t = AbstractC11828r.m13114t(abstractC11516d, serialDescriptor);
                int iMo10682e = serialDescriptor.mo10682e();
                for (int i11 = 0; i11 < iMo10682e; i11++) {
                    List listMo10684g = serialDescriptor.mo10684g(i11);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listMo10684g) {
                        if (obj3 instanceof InterfaceC11530r) {
                            arrayList.add(obj3);
                        }
                    }
                    InterfaceC11530r interfaceC11530r = (InterfaceC11530r) AbstractC17680n.m19367q0(arrayList);
                    if (interfaceC11530r != null) {
                        String lowerCase = ((C22059t0) interfaceC11530r).f69753a[0];
                        if (z6) {
                            lowerCase = lowerCase.toLowerCase(Locale.ROOT);
                            AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
                        }
                        AbstractC11828r.m13101g(linkedHashMap, serialDescriptor, lowerCase, i11);
                    }
                    if (z6) {
                        strM12924a = serialDescriptor.mo10683f(i11).toLowerCase(Locale.ROOT);
                        AbstractC16544l.m18093f(strM12924a, "toLowerCase(...)");
                    } else {
                        strM12924a = c11531sM13114t != null ? c11531sM13114t.m12924a(serialDescriptor, serialDescriptor.mo10683f(i11)) : null;
                    }
                    if (strM12924a != null) {
                        AbstractC11828r.m13101g(linkedHashMap, serialDescriptor, strM12924a, i11);
                    }
                }
                return linkedHashMap.isEmpty() ? C17690x.f56481Y : linkedHashMap;
            case 6:
                if (((ArrayList) obj2).isEmpty()) {
                    return "";
                }
                C16452T c16452t = (C16452T) obj;
                int iM21678L = AbstractC21322p.m21678L(c16452t.f51041g, '/', c16452t.f51043i.f51031a.length() + 3, false, 4);
                if (iM21678L == -1) {
                    return "";
                }
                String str = c16452t.f51041g;
                int iM21680N = AbstractC21322p.m21680N(str, new char[]{'?', '#'}, iM21678L, false);
                if (iM21680N == -1) {
                    String strSubstring = str.substring(iM21678L);
                    AbstractC16544l.m18093f(strSubstring, "substring(...)");
                    return strSubstring;
                }
                String strSubstring2 = str.substring(iM21678L, iM21680N);
                AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                return strSubstring2;
            default:
                C0017I0 this$0 = (C0017I0) obj2;
                AbstractC16544l.m18094g(this$0, "this$0");
                UUID mutationId = (UUID) obj;
                AbstractC16544l.m18094g(mutationId, "$mutationId");
                C20848f c20848f = (C20848f) ((C17314q) this$0.f68q0).getValue();
                c20848f.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = c20848f.f66291o0.entrySet().iterator();
                if (!it.hasNext()) {
                    return linkedHashSet;
                }
                ((AbstractC20847e) ((Map.Entry) it.next()).getValue()).getClass();
                throw null;
        }
    }
}
