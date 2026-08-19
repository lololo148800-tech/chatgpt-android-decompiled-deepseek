package p571X9;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p437Rn.C6952j;
import p437Rn.C6953k;
import p437Rn.C6954l;
import p437Rn.C6955m;
import p437Rn.C6956n;
import p437Rn.C6957o;
import p437Rn.C6960r;
import p437Rn.InterfaceC6945c;
import p437Rn.InterfaceC6958p;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17685s;

/* JADX INFO: renamed from: X9.k3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9315k3 {
    /* JADX WARN: Type inference failed for: r12v16, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: a */
    public static InterfaceC6945c m9908a(C6960r c6960r, String input, InterfaceC6945c initialContainer) throws C6953k {
        String string;
        AbstractC16544l.m18094g(input, "input");
        AbstractC16544l.m18094g(initialContainer, "initialContainer");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListM19384m = AbstractC17681o.m19384m(new C6954l(initialContainer, c6960r, 0));
        while (true) {
            C6954l c6954l = (C6954l) (arrayListM19384m.isEmpty() ? null : arrayListM19384m.remove(AbstractC17681o.m19381j(arrayListM19384m)));
            if (c6954l != null) {
                InterfaceC6945c interfaceC6945c = (InterfaceC6945c) c6954l.f22249a.mo6257a();
                C6960r c6960r2 = c6954l.f22250b;
                int size = c6960r2.f22259a.size();
                int iIntValue = c6954l.f22251c;
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        List list = c6960r2.f22260b;
                        if (!list.isEmpty()) {
                            int size2 = list.size() - 1;
                            if (size2 < 0) {
                                break;
                            }
                            while (true) {
                                int i11 = size2 - 1;
                                arrayListM19384m.add(new C6954l(interfaceC6945c, (C6960r) list.get(size2), iIntValue));
                                if (i11 < 0) {
                                    break;
                                }
                                size2 = i11;
                            }
                        } else {
                            if (iIntValue != input.length()) {
                                arrayList.add(new C6952j(iIntValue, C6956n.f22253Y));
                                break;
                            }
                            return interfaceC6945c;
                        }
                    } else {
                        Object objMo7330a = ((InterfaceC6958p) c6960r2.f22259a.get(i10)).mo7330a(interfaceC6945c, input, iIntValue);
                        if (!(objMo7330a instanceof Integer)) {
                            if (objMo7330a instanceof C6952j) {
                                arrayList.add((C6952j) objMo7330a);
                                break;
                            }
                            throw new IllegalStateException(("Unexpected parse result: " + objMo7330a).toString());
                        }
                        iIntValue = ((Number) objMo7330a).intValue();
                        i10++;
                    }
                }
            } else {
                if (arrayList.size() > 1) {
                    AbstractC17685s.m19392u(arrayList, new C6955m(0));
                }
                if (arrayList.size() == 1) {
                    string = "Position " + ((C6952j) arrayList.get(0)).f22247a + ": " + ((String) ((C6952j) arrayList.get(0)).f22248b.invoke());
                } else {
                    StringBuilder sb2 = new StringBuilder(arrayList.size() * 33);
                    AbstractC17680n.m19347W(arrayList, sb2, ", ", (124 & 4) != 0 ? "" : "Errors: ", (124 & 8) != 0 ? "" : null, -1, "...", (124 & 64) != 0 ? null : C6957o.f22254Y);
                    string = sb2.toString();
                    AbstractC16544l.m18093f(string, "toString(...)");
                }
                throw new C6953k(string);
            }
        }
    }
}
