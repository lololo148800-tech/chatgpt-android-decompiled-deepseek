package p480Te;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p109E3.C2292p;
import p1111xl.C21296a;
import p1113xn.AbstractC21322p;
import p1155zi.C21929J1;
import p1155zi.C21941M1;
import p1155zi.C21952P1;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p432Rh.C6889b;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p991rh.C18998g;
import p991rh.C18999h;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Te.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C7395t {

    /* JADX INFO: renamed from: a */
    public final C6889b f23432a;

    public C7395t(C6889b c6889b) {
        this.f23432a = c6889b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m7794a(String str, String str2, String str3, AbstractC19687c abstractC19687c) {
        C7393r c7393r;
        if (abstractC19687c instanceof C7393r) {
            c7393r = (C7393r) abstractC19687c;
            int i10 = c7393r.f23426o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7393r.f23426o0 = i10 - Integer.MIN_VALUE;
            } else {
                c7393r = new C7393r(this, abstractC19687c);
            }
        } else {
            c7393r = new C7393r(this, abstractC19687c);
        }
        Object objM9690b = c7393r.f23424Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c7393r.f23426o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            InterfaceC3777y interfaceC3777yM18075c = null;
            C7394s c7394s = new C7394s(str2, str3, str, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C7378c.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C7378c.class);
            } catch (Throwable unused) {
            }
            C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
            c7393r.f23426o0 = 1;
            objM9690b = AbstractC9144I.m9690b(this.f23432a, c21296a, c7394s, c7393r);
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
        C6223B c6223b = (C6223B) abstractC6224C;
        boolean zM18089b = AbstractC16544l.m18089b(((C7378c) c6223b.f20258a).f23376a, "error");
        Object obj = c6223b.f20258a;
        if (!zM18089b) {
            return new C21952P1(((C7378c) obj).f23377b);
        }
        C7378c c7378c = (C7378c) obj;
        String str4 = c7378c.f23378c;
        if (str4 != null && AbstractC21322p.m21667A(str4, "expired", true)) {
            return new C21941M1(new C18998g());
        }
        String str5 = c7378c.f23378c;
        if (str5 != null && AbstractC21322p.m21667A(str5, "unavailable", true)) {
            return new C21941M1(new C18999h());
        }
        String str6 = c7378c.f23379d;
        return new C21941M1(new C2292p());
    }
}
