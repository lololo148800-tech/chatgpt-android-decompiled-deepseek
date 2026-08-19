package p790hh;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p009A7.FlM.nkFZpTrMPpn;
import p025An.C0644w;
import p1111xl.C21296a;
import p1113xn.AbstractC21322p;
import p1155zi.C22013h2;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p432Rh.C6895h;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: hh.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C14514c {

    /* JADX INFO: renamed from: a */
    public final C6895h f45743a;

    public C14514c(C6895h c6895h) {
        this.f45743a = c6895h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m16006a(AbstractC19687c abstractC19687c) {
        C14512a c14512a;
        InterfaceC3777y interfaceC3777yM18075c;
        if (abstractC19687c instanceof C14512a) {
            c14512a = (C14512a) abstractC19687c;
            int i10 = c14512a.f45740o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c14512a.f45740o0 = i10 - Integer.MIN_VALUE;
            } else {
                c14512a = new C14512a(this, abstractC19687c);
            }
        } else {
            c14512a = new C14512a(this, abstractC19687c);
        }
        Object objM9690b = c14512a.f45738Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c14512a.f45740o0;
        String str = null;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            C14513b c14513b = new C14513b(2, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C14517f.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C14517f.class);
            } catch (Throwable unused) {
                interfaceC3777yM18075c = null;
            }
            C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
            c14512a.f45740o0 = 1;
            objM9690b = AbstractC9144I.m9690b(this.f45743a, c21296a, c14513b, c14512a);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException(nkFZpTrMPpn.BDIKfisKkV);
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
        C14517f c14517f = (C14517f) ((C6223B) abstractC6224C).f20258a;
        AbstractC16544l.m18094g(c14517f, "<this>");
        String str2 = c14517f.f45746b;
        if (str2 != null && !AbstractC21322p.m21681O(str2)) {
            str = str2;
        }
        String str3 = c14517f.f45747c;
        String str4 = c14517f.f45748d;
        return new C6223B(new C22013h2(c14517f.f45750f, c14517f.f45745a, str, str3, str4, c14517f.f45749e));
    }
}
