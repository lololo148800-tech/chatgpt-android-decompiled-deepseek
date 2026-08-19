package p430Rf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p1111xl.C21296a;
import p1155zi.C22020j1;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p245Jh.C4348f;
import p245Jh.C4354l;
import p245Jh.C4357o;
import p245Jh.C4360r;
import p269Kh.C4673B;
import p269Kh.C4684k;
import p269Kh.C4688o;
import p269Kh.EnumC4672A;
import p269Kh.EnumC4682i;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p432Rh.C6889b;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p909nm.C17691y;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Rf.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6881c {

    /* JADX INFO: renamed from: a */
    public final C6889b f22068a;

    public C6881c(C6889b c6889b) {
        this.f22068a = c6889b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public final Object m7284a(AbstractC19687c abstractC19687c) {
        C6879a c6879a;
        InterfaceC3777y interfaceC3777yM18075c;
        String str;
        ArrayList arrayList;
        if (abstractC19687c instanceof C6879a) {
            c6879a = (C6879a) abstractC19687c;
            int i10 = c6879a.f22065o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6879a.f22065o0 = i10 - Integer.MIN_VALUE;
            } else {
                c6879a = new C6879a(this, abstractC19687c);
            }
        } else {
            c6879a = new C6879a(this, abstractC19687c);
        }
        Object objM9690b = c6879a.f22063Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6879a.f22065o0;
        ArrayList arrayList2 = null;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            C6880b c6880b = new C6880b(2, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C4348f.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C4348f.class);
            } catch (Throwable unused) {
                interfaceC3777yM18075c = null;
            }
            C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
            c6879a.f22065o0 = 1;
            objM9690b = AbstractC9144I.m9690b(this.f22068a, c21296a, c6880b, c6879a);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM9690b);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (!(abstractC6224C instanceof C6223B)) {
            if ((abstractC6224C instanceof C6248v) || (abstractC6224C instanceof AbstractC6249w)) {
                return abstractC6224C;
            }
            throw new C0644w();
        }
        C4348f c4348f = (C4348f) ((C6223B) abstractC6224C).f20258a;
        List categories = c4348f.f14144a;
        List<C4354l> list = categories;
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(list, 10));
        for (C4354l c4354l : list) {
            String str2 = c4354l.f14159d;
            EnumC4672A enumC4672A = AbstractC16544l.m18089b(str2, "free") ? EnumC4672A.f15213Y : AbstractC16544l.m18089b(str2, "plus") ? EnumC4672A.f15214Z : EnumC4672A.f15215o0;
            List list2 = c4354l.f14168m;
            if (list2 != null) {
                arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    Object obj = AbstractC16544l.m18089b((String) it.next(), "custom_instructions") ? EnumC4682i.f15233Y : arrayList2;
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = arrayList2;
            }
            arrayList3.add(new C4684k(c4354l.f14156a, c4354l.f14157b, c4354l.f14158c, c4354l.f14166k, enumC4672A, c4354l.f14160e, c4354l.f14161f, c4354l.f14162g, c4354l.f14163h, c4354l.f14164i, c4354l.f14165j, c4354l.f14167l, false, arrayList == null ? C17689w.f56480Y : arrayList, 4096));
            arrayList2 = null;
        }
        List<C4357o> list3 = c4348f.f14145b;
        ArrayList arrayList4 = new ArrayList(AbstractC17682p.m19389r(list3, 10));
        for (C4357o c4357o : list3) {
            c4357o.getClass();
            AbstractC16544l.m18094g(categories, "categories");
            Iterator it2 = categories.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    str = null;
                    break;
                }
                C4354l c4354l2 = (C4354l) it2.next();
                C22020j1 c22020j1 = new C22020j1(c4354l2.f14160e);
                String str3 = c4354l2.f14161f;
                C22020j1 c22020j2 = str3 != null ? new C22020j1(str3) : null;
                String str4 = c4354l2.f14162g;
                C22020j1 c22020j3 = str4 != null ? new C22020j1(str4) : null;
                String str5 = c4354l2.f14163h;
                C22020j1 c22020j4 = str5 != null ? new C22020j1(str5) : null;
                String str6 = c4354l2.f14164i;
                C22020j1 c22020j5 = str6 != null ? new C22020j1(str6) : null;
                String str7 = c4354l2.f14165j;
                if (AbstractC17678l.m19293P(new C22020j1[]{c22020j1, c22020j2, c22020j3, c22020j4, c22020j5, str7 != null ? new C22020j1(str7) : null}).contains(new C22020j1(c4357o.f14171a))) {
                    str = c4354l2.f14156a;
                    break;
                }
            }
            if (str == null) {
                str = "";
            }
            String str8 = str;
            List list4 = c4357o.f14176f;
            Set setM19328G0 = list4 != null ? AbstractC17680n.m19328G0(list4) : null;
            if (setM19328G0 == null) {
                setM19328G0 = C17691y.f56482Y;
            }
            Set set = setM19328G0;
            C4360r c4360r = c4357o.f14177g;
            arrayList4.add(new C4688o(str8, c4357o.f14171a, c4357o.f14172b, c4357o.f14173c, c4357o.f14174d, c4357o.f14175e, set, c4360r != null ? c4360r.m5167a() : null));
        }
        return new C6223B(new C4673B(arrayList3, arrayList4, c4348f.f14146c, c4348f.f14147d));
    }
}
