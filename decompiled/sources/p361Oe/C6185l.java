package p361Oe;

import kotlin.jvm.internal.AbstractC16526C;
import p025An.C0644w;
import p041Be.C1219L;
import p041Be.C1254z;
import p1111xl.C21296a;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p119Ed.C2403c;
import p119Ed.C2406f;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Oe.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C6185l {

    /* JADX INFO: renamed from: a */
    public final C1219L f20143a;

    public C6185l(C1219L c1219l) {
        this.f20143a = c1219l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m6723a(String str, String str2, String str3, int i10, AbstractC19687c abstractC19687c) {
        C6184k c6184k;
        if (abstractC19687c instanceof C6184k) {
            c6184k = (C6184k) abstractC19687c;
            int i11 = c6184k.f20142o0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6184k.f20142o0 = i11 - Integer.MIN_VALUE;
            } else {
                c6184k = new C6184k(this, abstractC19687c);
            }
        } else {
            c6184k = new C6184k(this, abstractC19687c);
        }
        Object objM9690b = c6184k.f20140Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c6184k.f20142o0;
        if (i12 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            c6184k.f20142o0 = 1;
            C1219L c1219l = this.f20143a;
            C2403c c2403c = new C2403c(i10, str2, str3);
            InterfaceC3777y interfaceC3777yM18075c = null;
            C1254z c1254z = new C1254z(c2403c, str, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C2406f.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C2406f.class);
            } catch (Throwable unused) {
            }
            objM9690b = AbstractC9144I.m9690b(c1219l.f3217b, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c1254z, c6184k);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM9690b);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            return new C21952P1(((C2406f) ((C6223B) abstractC6224C).f20258a).f7474a);
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
