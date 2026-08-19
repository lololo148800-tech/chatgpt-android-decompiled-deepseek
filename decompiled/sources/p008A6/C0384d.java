package p008A6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import np.AbstractC17713e;
import p025An.InterfaceC0568D0;
import p025An.InterfaceC0646x;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p051Bo.AbstractC1456b;
import p1057v6.C20465e;
import p153Fn.C2945w;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p251Jn.C4485a;
import p594Y9.AbstractC9816U3;
import p594Y9.AbstractC9961r4;
import p733eo.AbstractC13456d;
import p917o6.C17857j;
import p917o6.C17870w;
import p917o6.InterfaceC17833A;
import p917o6.InterfaceC17835C;
import p972qm.C18769b;
import p972qm.C18771d;
import p972qm.C18777j;
import p972qm.InterfaceC18772e;
import p972qm.InterfaceC18774g;
import p972qm.InterfaceC18776i;
import p975qp.InterfaceC18797a;

/* JADX INFO: renamed from: A6.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0384d implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1292Y;

    public /* synthetic */ C0384d(int i10) {
        this.f1292Y = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C18769b c18769b;
        switch (this.f1292Y) {
            case 0:
                String key_ = (String) obj;
                String record = (String) obj2;
                AbstractC16544l.m18094g(key_, "key_");
                AbstractC16544l.m18094g(record, "record");
                return new C0390j(key_, record);
            case 1:
                String key_2 = (String) obj;
                String record2 = (String) obj2;
                AbstractC16544l.m18094g(key_2, "key_");
                AbstractC16544l.m18094g(record2, "record");
                return new C0389i(key_2, record2);
            case 2:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || (((InterfaceC18774g) obj2) instanceof InterfaceC0646x));
            case 3:
                InterfaceC18776i interfaceC18776i = (InterfaceC18776i) obj;
                InterfaceC18774g interfaceC18774g = (InterfaceC18774g) obj2;
                if (!(interfaceC18774g instanceof InterfaceC0646x)) {
                    return interfaceC18776i.plus(interfaceC18774g);
                }
                ((InterfaceC0646x) interfaceC18774g).m1315r0();
                return interfaceC18776i.plus(null);
            case 4:
                return Boolean.valueOf(AbstractC16544l.m18089b(obj, obj2));
            case 5:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 6:
                InterfaceC18774g interfaceC18774g2 = (InterfaceC18774g) obj2;
                if (!(interfaceC18774g2 instanceof InterfaceC0568D0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? interfaceC18774g2 : Integer.valueOf(iIntValue + 1);
            case 7:
                InterfaceC0568D0 interfaceC0568D0 = (InterfaceC0568D0) obj;
                InterfaceC18774g interfaceC18774g3 = (InterfaceC18774g) obj2;
                if (interfaceC0568D0 != null) {
                    return interfaceC0568D0;
                }
                if (interfaceC18774g3 instanceof InterfaceC0568D0) {
                    return (InterfaceC0568D0) interfaceC18774g3;
                }
                return null;
            case 8:
                C2945w c2945w = (C2945w) obj;
                InterfaceC18774g interfaceC18774g4 = (InterfaceC18774g) obj2;
                if (interfaceC18774g4 instanceof InterfaceC0568D0) {
                    InterfaceC0568D0 interfaceC0568D1 = (InterfaceC0568D0) interfaceC18774g4;
                    InterfaceC18776i interfaceC18776i2 = c2945w.f8811a;
                    C4485a c4485a = (C4485a) interfaceC0568D1;
                    c4485a.getClass();
                    InterfaceC18797a interfaceC18797a = AbstractC17713e.f56550a;
                    if (interfaceC18797a == null) {
                        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
                    }
                    Map mapMo16558n = interfaceC18797a.mo16558n();
                    C4485a.m5212V0(c4485a.f14637Y);
                    int i10 = c2945w.f8814d;
                    c2945w.f8812b[i10] = mapMo16558n;
                    c2945w.f8814d = i10 + 1;
                    AbstractC16544l.m18092e(interfaceC0568D1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                    c2945w.f8813c[i10] = interfaceC0568D1;
                }
                return c2945w;
            case 9:
                InterfaceC3756d clazz = (InterfaceC3756d) obj;
                final List types = (List) obj2;
                AbstractC16544l.m18094g(clazz, "clazz");
                AbstractC16544l.m18094g(types, "types");
                ArrayList arrayListM10455f = AbstractC9816U3.m10455f(AbstractC13456d.f42591a, types, true);
                AbstractC16544l.m18091d(arrayListM10455f);
                final int i11 = 0;
                return AbstractC9816U3.m10452c(clazz, arrayListM10455f, new InterfaceC1426a() { // from class: Wn.i
                    @Override // p049Bm.InterfaceC1426a
                    public final Object invoke() {
                        switch (i11) {
                            case 0:
                                break;
                        }
                        return ((InterfaceC3777y) types.get(0)).getClassifier();
                    }
                });
            case 10:
                InterfaceC3756d clazz2 = (InterfaceC3756d) obj;
                final List types2 = (List) obj2;
                AbstractC16544l.m18094g(clazz2, "clazz");
                AbstractC16544l.m18094g(types2, "types");
                ArrayList arrayListM10455f2 = AbstractC9816U3.m10455f(AbstractC13456d.f42591a, types2, true);
                AbstractC16544l.m18091d(arrayListM10455f2);
                final int i12 = 1;
                KSerializer kSerializerM10452c = AbstractC9816U3.m10452c(clazz2, arrayListM10455f2, new InterfaceC1426a() { // from class: Wn.i
                    @Override // p049Bm.InterfaceC1426a
                    public final Object invoke() {
                        switch (i12) {
                            case 0:
                                break;
                        }
                        return ((InterfaceC3777y) types2.get(0)).getClassifier();
                    }
                });
                if (kSerializerM10452c != null) {
                    return AbstractC9961r4.m10615b(kSerializerM10452c);
                }
                return null;
            case 11:
                InterfaceC17835C acc = (InterfaceC17835C) obj;
                InterfaceC17833A element = (InterfaceC17833A) obj2;
                AbstractC16544l.m18094g(acc, "acc");
                AbstractC16544l.m18094g(element, "element");
                InterfaceC17835C interfaceC17835CMo4138a = acc.mo4138a(element.getKey());
                return interfaceC17835CMo4138a == C17870w.f56967a ? element : new C17857j(interfaceC17835CMo4138a, element);
            case 12:
                String acc2 = (String) obj;
                InterfaceC18774g element2 = (InterfaceC18774g) obj2;
                AbstractC16544l.m18094g(acc2, "acc");
                AbstractC16544l.m18094g(element2, "element");
                if (acc2.length() == 0) {
                    return element2.toString();
                }
                return acc2 + ", " + element2;
            case 13:
                InterfaceC18776i acc3 = (InterfaceC18776i) obj;
                InterfaceC18774g element3 = (InterfaceC18774g) obj2;
                AbstractC16544l.m18094g(acc3, "acc");
                AbstractC16544l.m18094g(element3, "element");
                InterfaceC18776i interfaceC18776iMinusKey = acc3.minusKey(element3.getKey());
                C18777j c18777j = C18777j.f59682Y;
                if (interfaceC18776iMinusKey == c18777j) {
                    return element3;
                }
                C18771d c18771d = C18771d.f59681Y;
                InterfaceC18772e interfaceC18772e = (InterfaceC18772e) interfaceC18776iMinusKey.get(c18771d);
                if (interfaceC18772e == null) {
                    c18769b = new C18769b(element3, interfaceC18776iMinusKey);
                } else {
                    InterfaceC18776i interfaceC18776iMinusKey2 = interfaceC18776iMinusKey.minusKey(c18771d);
                    if (interfaceC18776iMinusKey2 == c18777j) {
                        return new C18769b(interfaceC18772e, element3);
                    }
                    c18769b = new C18769b(interfaceC18772e, new C18769b(element3, interfaceC18776iMinusKey2));
                }
                return c18769b;
            default:
                String key = (String) obj;
                C20465e c20465e = (C20465e) obj2;
                AbstractC16544l.m18094g(key, "key");
                return Integer.valueOf(AbstractC1456b.m2063c(key).length + (c20465e != null ? c20465e.f64966d : 0));
        }
    }
}
