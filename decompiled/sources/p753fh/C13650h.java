package p753fh;

import kotlin.jvm.internal.AbstractC16526C;
import p025An.C0644w;
import p1111xl.C21296a;
import p195Hh.C3430e;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p432Rh.C6895h;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: fh.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C13650h {

    /* JADX INFO: renamed from: a */
    public final C6895h f43114a;

    /* JADX INFO: renamed from: b */
    public final C3430e f43115b = AbstractC8168p6.m8749b("AccountApiImpl", null);

    public C13650h(C6895h c6895h) {
        this.f43114a = c6895h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m15154a(AbstractC19687c abstractC19687c) {
        C13646d c13646d;
        if (abstractC19687c instanceof C13646d) {
            c13646d = (C13646d) abstractC19687c;
            int i10 = c13646d.f43105o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13646d.f43105o0 = i10 - Integer.MIN_VALUE;
            } else {
                c13646d = new C13646d(this, abstractC19687c);
            }
        } else {
            c13646d = new C13646d(this, abstractC19687c);
        }
        Object objM9690b = c13646d.f43103Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c13646d.f43105o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            InterfaceC3777y interfaceC3777yM18075c = null;
            C13647e c13647e = new C13647e(2, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C13653k.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C13653k.class);
            } catch (Throwable unused) {
            }
            C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
            c13646d.f43105o0 = 1;
            objM9690b = AbstractC9144I.m9690b(this.f43114a, c21296a, c13647e, c13646d);
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
        if (abstractC6224C instanceof C6223B) {
            return new C6223B(((C13653k) ((C6223B) abstractC6224C).f20258a).m15156a());
        }
        if ((abstractC6224C instanceof C6248v) || (abstractC6224C instanceof AbstractC6249w)) {
            return abstractC6224C;
        }
        throw new C0644w();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m15155b(boolean z6, AbstractC19687c abstractC19687c) {
        C13648f c13648f;
        if (abstractC19687c instanceof C13648f) {
            c13648f = (C13648f) abstractC19687c;
            int i10 = c13648f.f43110o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13648f.f43110o0 = i10 - Integer.MIN_VALUE;
            } else {
                c13648f = new C13648f(this, abstractC19687c);
            }
        } else {
            c13648f = new C13648f(this, abstractC19687c);
        }
        Object objM9690b = c13648f.f43108Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c13648f.f43110o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            InterfaceC3777y interfaceC3777yM18075c = null;
            if (z6) {
                AbstractC8160o6.m8728c(this.f43115b, "Requesting account purchase status for sandbox", null, null, 6);
            }
            C13649g c13649g = new C13649g(z6, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C13653k.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C13653k.class);
            } catch (Throwable unused) {
            }
            C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
            c13648f.f43110o0 = 1;
            objM9690b = AbstractC9144I.m9690b(this.f43114a, c21296a, c13649g, c13648f);
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
        if (abstractC6224C instanceof C6223B) {
            return new C6223B(((C13653k) ((C6223B) abstractC6224C).f20258a).m15156a());
        }
        if ((abstractC6224C instanceof C6248v) || (abstractC6224C instanceof AbstractC6249w)) {
            return abstractC6224C;
        }
        throw new C0644w();
    }
}
