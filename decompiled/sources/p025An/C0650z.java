package p025An;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17309l;
import p049Bm.InterfaceC1439n;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p200Hm.C3508g;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18774g;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: An.z */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0650z implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1904Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f1905Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f1906o0;

    public /* synthetic */ C0650z(Object obj, boolean z6, int i10) {
        this.f1904Y = i10;
        this.f1906o0 = obj;
        this.f1905Z = z6;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0093 A[LOOP:0: B:21:0x005d->B:32:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d1 A[LOOP:2: B:37:0x009d->B:48:0x00d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3 A[SYNTHETIC] */
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        String str;
        C17309l c17309l;
        String str2;
        Object next2;
        String str3;
        String str4;
        switch (this.f1904Y) {
            case 0:
                InterfaceC18776i interfaceC18776i = (InterfaceC18776i) obj;
                InterfaceC18774g interfaceC18774g = (InterfaceC18774g) obj2;
                if (!(interfaceC18774g instanceof InterfaceC0646x)) {
                    return interfaceC18776i.plus(interfaceC18774g);
                }
                C16525B c16525b = (C16525B) this.f1906o0;
                if (((InterfaceC18776i) c16525b.f51262Y).get(interfaceC18774g.getKey()) != null) {
                    c16525b.f51262Y = ((InterfaceC18776i) c16525b.f51262Y).minusKey(interfaceC18774g.getKey());
                    return interfaceC18776i.plus(((InterfaceC0646x) interfaceC18774g).m1314N0());
                }
                InterfaceC0646x interfaceC0646x = (InterfaceC0646x) interfaceC18774g;
                if (this.f1905Z) {
                    interfaceC0646x.m1315r0();
                    interfaceC0646x = null;
                }
                return interfaceC18776i.plus(interfaceC0646x);
            case 1:
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                AbstractC16544l.m18094g(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int iM21680N = AbstractC21322p.m21680N(DelimitedRangesSequence, (char[]) this.f1906o0, iIntValue, this.f1905Z);
                if (iM21680N < 0) {
                    return null;
                }
                return new C17309l(Integer.valueOf(iM21680N), 1);
            default:
                CharSequence DelimitedRangesSequence2 = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                AbstractC16544l.m18094g(DelimitedRangesSequence2, "$this$DelimitedRangesSequence");
                List list = (List) this.f1906o0;
                boolean z6 = this.f1905Z;
                if (z6 || list.size() != 1) {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    C3508g c3508g = new C3508g(iIntValue2, DelimitedRangesSequence2.length(), 1);
                    boolean z10 = DelimitedRangesSequence2 instanceof String;
                    int i10 = c3508g.f10593o0;
                    int i11 = c3508g.f10592Z;
                    if (z10) {
                        if ((i10 <= 0 || iIntValue2 > i11) && (i10 >= 0 || i11 > iIntValue2)) {
                            c17309l = null;
                        } else {
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        c17309l = new C17309l(Integer.valueOf(iIntValue2), str3);
                                    } else if (iIntValue2 != i11) {
                                        iIntValue2 += i10;
                                    } else {
                                        c17309l = null;
                                    }
                                } while (!AbstractC21329w.m21728o(0, iIntValue2, str4.length(), str4, (String) DelimitedRangesSequence2, z6));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    c17309l = new C17309l(Integer.valueOf(iIntValue2), str3);
                                } else if (iIntValue2 != i11) {
                                    iIntValue2 += i10;
                                } else {
                                    c17309l = null;
                                }
                            }
                        }
                    } else if ((i10 <= 0 || iIntValue2 > i11) && (i10 >= 0 || i11 > iIntValue2)) {
                        c17309l = null;
                    } else {
                        while (true) {
                            Iterator it2 = list.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    c17309l = new C17309l(Integer.valueOf(iIntValue2), str);
                                } else if (iIntValue2 != i11) {
                                    iIntValue2 += i10;
                                } else {
                                    c17309l = null;
                                }
                            } while (!AbstractC21322p.m21687U(str2, 0, DelimitedRangesSequence2, iIntValue2, str2.length(), z6));
                            str = (String) next;
                            if (str != null) {
                                c17309l = new C17309l(Integer.valueOf(iIntValue2), str);
                            } else if (iIntValue2 != i11) {
                                iIntValue2 += i10;
                            } else {
                                c17309l = null;
                            }
                        }
                    }
                } else {
                    String str5 = (String) AbstractC17680n.m19364n0(list);
                    int iM21679M = AbstractC21322p.m21679M(DelimitedRangesSequence2, str5, iIntValue2, false, 4);
                    if (iM21679M < 0) {
                        c17309l = null;
                    } else {
                        c17309l = new C17309l(Integer.valueOf(iM21679M), str5);
                    }
                }
                if (c17309l == null) {
                    return null;
                }
                return new C17309l(c17309l.f55136Y, Integer.valueOf(((String) c17309l.f55137Z).length()));
        }
    }
}
