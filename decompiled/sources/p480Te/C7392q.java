package p480Te;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import gd.C13903W0;
import gd.C14005w2;
import gd.InterfaceC13849E;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p109E3.C2292p;
import p1111xl.C21296a;
import p1113xn.AbstractC21322p;
import p195Hh.C3430e;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p364Oh.C6251y;
import p409Qk.C6752c;
import p432Rh.C6895h;
import p509Uk.C7708a;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9183O2;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p991rh.C18994c;
import p991rh.C18997f;
import p991rh.C18998g;
import p991rh.C18999h;
import p991rh.C19003l;
import p991rh.EnumC18986A;
import p991rh.EnumC18991F;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Te.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C7392q {

    /* JADX INFO: renamed from: a */
    public final C6895h f23420a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13849E f23421b;

    /* JADX INFO: renamed from: c */
    public final C3430e f23422c = AbstractC8168p6.m8749b("FileServiceApi", null);

    /* JADX INFO: renamed from: d */
    public final C6752c f23423d = AbstractC9183O2.m9738a(C7708a.f24285a, new C7387l(this, 1));

    public C7392q(C6895h c6895h, InterfaceC13849E interfaceC13849E) {
        this.f23420a = c6895h;
        this.f23421b = interfaceC13849E;
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC6224C m7790d(AbstractC6224C abstractC6224C) {
        if (!(abstractC6224C instanceof C6223B)) {
            return abstractC6224C;
        }
        C6223B c6223b = (C6223B) abstractC6224C;
        C19003l c19003l = (C19003l) c6223b.f20258a;
        if (c19003l.f60581a != EnumC18986A.f60559o0) {
            return abstractC6224C;
        }
        if (AbstractC16544l.m18089b(c19003l.f60583c, "file_expired")) {
            return new C6251y(new C18998g());
        }
        Object obj = c6223b.f20258a;
        String str = ((C19003l) obj).f60583c;
        if (str != null && AbstractC21322p.m21667A(str, "unavailable", true)) {
            return new C6251y(new C18999h());
        }
        String str2 = ((C19003l) obj).f60584d;
        return new C6251y(new C2292p());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m7791a(String str, String str2, AbstractC19687c abstractC19687c) {
        C7380e c7380e;
        C7392q c7392q;
        if (abstractC19687c instanceof C7380e) {
            c7380e = (C7380e) abstractC19687c;
            int i10 = c7380e.f23384p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7380e.f23384p0 = i10 - Integer.MIN_VALUE;
            } else {
                c7380e = new C7380e(this, abstractC19687c);
            }
        } else {
            c7380e = new C7380e(this, abstractC19687c);
        }
        Object objM9690b = c7380e.f23382Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c7380e.f23384p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            InterfaceC3777y interfaceC3777yM18075c = null;
            C7381f c7381f = new C7381f(str2, str, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C19003l.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C19003l.class);
            } catch (Throwable unused) {
            }
            C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
            c7380e.f23381Y = this;
            c7380e.f23384p0 = 1;
            objM9690b = AbstractC9144I.m9690b(this.f23420a, c21296a, c7381f, c7380e);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
            c7392q = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7392q = c7380e.f23381Y;
            AbstractC9233X.m9807c(objM9690b);
        }
        c7392q.getClass();
        return m7790d((AbstractC6224C) objM9690b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m7792b(String str, AbstractC19687c abstractC19687c) {
        C7382g c7382g;
        C7392q c7392q;
        InterfaceC3777y interfaceC3777yM18075c;
        C7392q c7392q2;
        if (abstractC19687c instanceof C7382g) {
            c7382g = (C7382g) abstractC19687c;
            int i10 = c7382g.f23393q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7382g.f23393q0 = i10 - Integer.MIN_VALUE;
            } else {
                c7382g = new C7382g(this, abstractC19687c);
            }
        } else {
            c7382g = new C7382g(this, abstractC19687c);
        }
        Object objM15482b = c7382g.f23391o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c7382g.f23393q0;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    str = c7382g.f23390Z;
                    c7392q = c7382g.f23389Y;
                    AbstractC9233X.m9807c(objM15482b);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c7392q2 = c7382g.f23389Y;
                    AbstractC9233X.m9807c(objM15482b);
                }
                c7392q2.getClass();
                return m7790d((AbstractC6224C) objM15482b);
            }
            AbstractC9233X.m9807c(objM15482b);
            C13903W0 c13903w0 = C13903W0.f43953c;
            c7382g.f23389Y = this;
            c7382g.f23390Z = str;
            c7382g.f23393q0 = 1;
            objM15482b = ((C14005w2) this.f23421b).m15482b(c13903w0, c7382g);
            if (objM15482b == enumC19250a) {
                return enumC19250a;
            }
            c7392q = this;
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C19003l.class);
        } catch (Throwable unused) {
            interfaceC3777yM18075c = null;
        }
        String strM9889h = ((Boolean) objM15482b).booleanValue() ? AbstractC9306j0.m9889h("files/download/", str) : AbstractC10763a.m11054l("files/", str, "/download");
        C6895h c6895h = c7392q.f23420a;
        C7383h c7383h = new C7383h(strM9889h, null);
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C19003l.class);
        C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
        c7382g.f23389Y = c7392q;
        c7382g.f23390Z = null;
        c7382g.f23393q0 = 2;
        objM15482b = AbstractC9144I.m9690b(c6895h, c21296a, c7383h, c7382g);
        if (objM15482b == enumC19250a) {
            return enumC19250a;
        }
        c7392q2 = c7392q;
        c7392q2.getClass();
        return m7790d((AbstractC6224C) objM15482b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m7793c(String str, int i10, EnumC18991F enumC18991F, AbstractC19687c abstractC19687c) {
        C7385j c7385j;
        if (abstractC19687c instanceof C7385j) {
            c7385j = (C7385j) abstractC19687c;
            int i11 = c7385j.f23402o0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c7385j.f23402o0 = i11 - Integer.MIN_VALUE;
            } else {
                c7385j = new C7385j(this, abstractC19687c);
            }
        } else {
            c7385j = new C7385j(this, abstractC19687c);
        }
        Object objM9690b = c7385j.f23400Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c7385j.f23402o0;
        if (i12 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            InterfaceC3777y interfaceC3777yM18075c = null;
            C7386k c7386k = new C7386k(str, i10, enumC18991F, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C18994c.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C18994c.class);
            } catch (Throwable unused) {
            }
            C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
            c7385j.f23402o0 = 1;
            objM9690b = AbstractC9144I.m9690b(this.f23420a, c21296a, c7386k, c7385j);
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
        if ((abstractC6224C instanceof AbstractC6249w) || (abstractC6224C instanceof C6248v)) {
            return abstractC6224C;
        }
        if (!(abstractC6224C instanceof C6223B)) {
            throw new C0644w();
        }
        C6223B c6223b = (C6223B) abstractC6224C;
        int i13 = AbstractC7379d.f23380a[((C18994c) c6223b.f20258a).f60571a.ordinal()];
        Object obj = c6223b.f20258a;
        if (i13 != 1) {
            String str2 = ((C18994c) obj).f60574d;
            return new C6251y(new C2292p());
        }
        C18994c c18994c = (C18994c) obj;
        String str3 = c18994c.f60572b;
        if (str3 == null) {
            throw new IllegalStateException("uploadUrl is null");
        }
        String str4 = c18994c.f60573c;
        if (str4 != null) {
            return new C6223B(new C18997f(str3, str4));
        }
        throw new IllegalStateException("fileId is null");
    }
}
