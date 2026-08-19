package p456Sg;

import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
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
import p431Rg.C6882a;
import p431Rg.C6883b;
import p431Rg.C6884c;
import p506Ug.C7671f;
import p506Ug.C7674i;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Sg.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C7132c {

    /* JADX INFO: renamed from: a */
    public final C6884c f22692a;

    public C7132c(C6884c c6884c) {
        this.f22692a = c6884c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m7522a(String str, C7671f c7671f, AbstractC19687c abstractC19687c) {
        C7130a c7130a;
        if (abstractC19687c instanceof C7130a) {
            c7130a = (C7130a) abstractC19687c;
            int i10 = c7130a.f22688o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7130a.f22688o0 = i10 - Integer.MIN_VALUE;
            } else {
                c7130a = new C7130a(this, abstractC19687c);
            }
        } else {
            c7130a = new C7130a(this, abstractC19687c);
        }
        Object objM9690b = c7130a.f22686Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c7130a.f22688o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            c7130a.f22688o0 = 1;
            C6884c c6884c = this.f22692a;
            InterfaceC3777y interfaceC3777yM18075c = null;
            C6882a c6882a = new C6882a(str, c7671f, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
            } catch (Throwable unused) {
            }
            objM9690b = AbstractC9144I.m9690b(c6884c.f22077a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c6882a, c7130a);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM9690b);
        }
        return ((AbstractC6224C) objM9690b).m6735b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m7523b(String str, boolean z6, AbstractC19687c abstractC19687c) {
        C7131b c7131b;
        if (abstractC19687c instanceof C7131b) {
            c7131b = (C7131b) abstractC19687c;
            int i10 = c7131b.f22691o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7131b.f22691o0 = i10 - Integer.MIN_VALUE;
            } else {
                c7131b = new C7131b(this, abstractC19687c);
            }
        } else {
            c7131b = new C7131b(this, abstractC19687c);
        }
        Object objM9690b = c7131b.f22689Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c7131b.f22691o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            c7131b.f22691o0 = 1;
            C6884c c6884c = this.f22692a;
            InterfaceC3777y interfaceC3777yM18075c = null;
            C6883b c6883b = new C6883b(str, null, z6);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C7674i.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C7674i.class);
            } catch (Throwable unused) {
            }
            objM9690b = AbstractC9144I.m9690b(c6884c.f22077a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c6883b, c7131b);
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
            return new C21952P1(((C6223B) abstractC6224C).f20258a);
        }
        if (abstractC6224C instanceof C6248v) {
            return C21929J1.f69476a;
        }
        if (!(abstractC6224C instanceof AbstractC6249w)) {
            throw new C0644w();
        }
        abstractC6224C.getClass();
        return AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
    }
}
