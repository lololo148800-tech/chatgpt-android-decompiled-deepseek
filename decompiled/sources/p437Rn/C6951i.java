package p437Rn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16558z;
import p211I8.lPE.sRXLFOsOgS;
import p273Kl.C4714D;
import p369On.AbstractC6273b;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Rn.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C6951i implements InterfaceC6958p {

    /* JADX INFO: renamed from: a */
    public final List f22244a;

    /* JADX INFO: renamed from: b */
    public final int f22245b;

    /* JADX INFO: renamed from: c */
    public final boolean f22246c;

    public C6951i(List list) {
        boolean z6;
        boolean z10;
        int i10;
        this.f22244a = list;
        Iterator it = list.iterator();
        int i11 = 0;
        while (true) {
            int iIntValue = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer num = ((AbstractC6946d) it.next()).f22234a;
            if (num != null) {
                iIntValue = num.intValue();
            }
            i11 += iIntValue;
        }
        this.f22245b = i11;
        List list2 = this.f22244a;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((AbstractC6946d) it2.next()).f22234a == null) {
                        z6 = true;
                        break;
                    }
                } else {
                    z6 = false;
                    break;
                }
            }
        } else {
            z6 = false;
            break;
        }
        this.f22246c = z6;
        List list3 = this.f22244a;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z10 = true;
                    break;
                }
                Integer num2 = ((AbstractC6946d) it3.next()).f22234a;
                if (!((num2 != null ? num2.intValue() : Integer.MAX_VALUE) > 0)) {
                    z10 = false;
                    break;
                }
            }
        } else {
            z10 = true;
            break;
        }
        if (!z10) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        List list4 = this.f22244a;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            i10 = 0;
        } else {
            Iterator it4 = list4.iterator();
            i10 = 0;
            while (it4.hasNext()) {
                if ((((AbstractC6946d) it4.next()).f22234a == null) && (i10 = i10 + 1) < 0) {
                    AbstractC17681o.m19387p();
                    throw null;
                }
            }
        }
        if (i10 <= 1) {
            return;
        }
        List list5 = this.f22244a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list5) {
            if (((AbstractC6946d) obj).f22234a == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((AbstractC6946d) it5.next()).f22235b);
        }
        throw new IllegalArgumentException(("At most one variable-length numeric field in a row is allowed, but got several: " + arrayList2 + ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.").toString());
    }

    @Override // p437Rn.InterfaceC6958p
    /* JADX INFO: renamed from: a */
    public final Object mo7330a(InterfaceC6945c interfaceC6945c, String input, int i10) {
        AbstractC16544l.m18094g(input, "input");
        int i11 = this.f22245b;
        if (i10 + i11 > input.length()) {
            return new C6952j(i10, new C6949g(this, 0));
        }
        C16558z c16558z = new C16558z();
        while (c16558z.f51287Y + i10 < input.length() && AbstractC6273b.m6754a(input.charAt(c16558z.f51287Y + i10))) {
            c16558z.f51287Y++;
        }
        if (c16558z.f51287Y < i11) {
            return new C6952j(i10, new C4714D(c16558z, 20, this));
        }
        List list = this.f22244a;
        int size = list.size();
        int i12 = 0;
        while (i12 < size) {
            Integer num = ((AbstractC6946d) list.get(i12)).f22234a;
            int iIntValue = (num != null ? num.intValue() : (c16558z.f51287Y - i11) + 1) + i10;
            InterfaceC6948f interfaceC6948fMo7328a = ((AbstractC6946d) list.get(i12)).mo7328a(interfaceC6945c, input, i10, iIntValue);
            if (interfaceC6948fMo7328a != null) {
                return new C6952j(i10, new C6950h(input.subSequence(i10, iIntValue).toString(), this, i12, interfaceC6948fMo7328a));
            }
            i12++;
            i10 = iIntValue;
        }
        return Integer.valueOf(i10);
    }

    public final String toString() {
        return m7331b();
    }

    /* JADX INFO: renamed from: b */
    public final String m7331b() {
        List<AbstractC6946d> list = this.f22244a;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        for (AbstractC6946d abstractC6946d : list) {
            StringBuilder sb2 = new StringBuilder();
            Integer num = abstractC6946d.f22234a;
            sb2.append(num == null ? "at least one digit" : num + " digits");
            sb2.append(" for ");
            sb2.append(abstractC6946d.f22235b);
            arrayList.add(sb2.toString());
        }
        boolean z6 = this.f22246c;
        int i10 = this.f22245b;
        if (z6) {
            return sRXLFOsOgS.pUOlAc + i10 + " digits: " + arrayList;
        }
        return "a number with exactly " + i10 + " digits: " + arrayList;
    }
}
