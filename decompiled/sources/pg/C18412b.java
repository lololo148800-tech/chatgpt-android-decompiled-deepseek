package pg;

import gd.C13969n2;
import gd.C14002w;
import gd.C14006x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p1111xl.C21296a;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17682p;
import p966qg.C18705c;
import p966qg.C18708f;
import p966qg.C18709g;
import p966qg.C18710h;
import p990rg.C18982i;
import p990rg.C18983j;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: pg.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18412b {

    /* JADX INFO: renamed from: a */
    public final C13969n2 f58746a;

    /* JADX INFO: renamed from: b */
    public final C18710h f58747b;

    /* JADX INFO: renamed from: c */
    public final Locale f58748c;

    public C18412b(C13969n2 c13969n2, C18710h c18710h, Locale locale) {
        this.f58746a = c13969n2;
        this.f58747b = c18710h;
        this.f58748c = locale;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m19870a(String str, boolean z6, AbstractC19687c abstractC19687c) {
        C18411a c18411a;
        if (abstractC19687c instanceof C18411a) {
            c18411a = (C18411a) abstractC19687c;
            int i10 = c18411a.f58745o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18411a.f58745o0 = i10 - Integer.MIN_VALUE;
            } else {
                c18411a = new C18411a(this, abstractC19687c);
            }
        } else {
            c18411a = new C18411a(this, abstractC19687c);
        }
        Object objM9690b = c18411a.f58743Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18411a.f58745o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            C13969n2 c13969n2 = this.f58746a;
            int iIntValue = z6 ? ((Number) c13969n2.m15477a(C14006x.f44088d)).intValue() : ((Number) c13969n2.m15477a(C14002w.f44079d)).intValue();
            c18411a.f58745o0 = 1;
            C18710h c18710h = this.f58747b;
            InterfaceC3777y interfaceC3777yM18075c = null;
            C18709g c18709g = new C18709g(iIntValue, z6, str, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C18708f.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C18708f.class);
            } catch (Throwable unused) {
            }
            objM9690b = AbstractC9144I.m9690b(c18710h.f59544a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c18709g, c18411a);
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
            if (abstractC6224C instanceof C6248v) {
                return C21929J1.f69476a;
            }
            if (!(abstractC6224C instanceof AbstractC6249w)) {
                throw new C0644w();
            }
            abstractC6224C.getClass();
            return AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
        }
        C18708f c18708f = (C18708f) ((C6223B) abstractC6224C).f20258a;
        AbstractC16544l.m18094g(c18708f, "<this>");
        List<C18705c> list = c18708f.f59538a;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        for (C18705c c18705c : list) {
            AbstractC16544l.m18094g(c18705c, "<this>");
            arrayList.add(new C18982i(c18705c.f59530a, c18705c.f59531b, c18705c.f59532c, c18705c.f59533d, c18705c.f59534e, c18705c.f59535f));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            String str2 = ((C18982i) obj).f60547f;
            Object arrayList2 = linkedHashMap.get(str2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str2, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        return new C21952P1(new C18983j(arrayList, linkedHashMap));
    }
}
