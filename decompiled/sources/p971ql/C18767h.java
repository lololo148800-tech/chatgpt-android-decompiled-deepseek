package p971ql;

import bo.AbstractC11516d;
import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.InterfaceC15088n;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import ml.AbstractC17288f;
import ml.C17293k;
import p094De.C2025h;
import p103Dn.AbstractC2124C;
import p1111xl.C21296a;
import p185H6.C3254j;
import p295Lj.AbstractC5103c;
import p488Tn.InterfaceC7526i;
import p544W9.AbstractC8627e4;
import p544W9.AbstractC8694q;
import p544W9.AbstractC8700r;
import p559Wn.C8976h;
import p559Wn.InterfaceC8980l;
import p571X9.AbstractC9233X;
import p857kl.C16460h;
import p995rl.C19243c;
import p995rl.C19249i;
import p996rm.EnumC19250a;
import pl.C18509d;
import pl.C18512g;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ql.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C18767h {

    /* JADX INFO: renamed from: a */
    public final AbstractC11516d f59677a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f59678b;

    public C18767h(AbstractC11516d format) {
        AbstractC16544l.m18094g(format, "format");
        this.f59677a = format;
        List list = AbstractC18760a.f59650a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C19243c) it.next()).getClass();
            AbstractC16544l.m18094g(format, "format");
            C19249i c19249i = !(format instanceof AbstractC11516d) ? null : new C19249i(format);
            if (c19249i != null) {
                arrayList.add(c19249i);
            }
        }
        this.f59678b = arrayList;
        if (this.f59677a instanceof InterfaceC8980l) {
            return;
        }
        throw new IllegalArgumentException(("Only binary and string formats are supported, " + this.f59677a + " is not supported.").toString());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bf A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:32:0x00b9, B:34:0x00bf, B:38:0x00ca, B:39:0x00e9), top: B:42:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ca A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:32:0x00b9, B:34:0x00bf, B:38:0x00ca, B:39:0x00e9), top: B:42:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00ca, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public final Object m20047a(Charset charset, C21296a c21296a, InterfaceC15088n interfaceC15088n, AbstractC19687c abstractC19687c) throws Throwable {
        C18762c c18762c;
        Charset charset2;
        C21296a c21296a2;
        C18767h c18767h;
        C18767h c18767h2;
        KSerializer kSerializer;
        InterfaceC7526i interfaceC7526i;
        AbstractC11516d abstractC11516d;
        InterfaceC15088n interfaceC15088n2 = interfaceC15088n;
        if (abstractC19687c instanceof C18762c) {
            c18762c = (C18762c) abstractC19687c;
            int i10 = c18762c.f59661s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18762c.f59661s0 = i10 - Integer.MIN_VALUE;
            } else {
                c18762c = new C18762c(this, abstractC19687c);
            }
        } else {
            c18762c = new C18762c(this, abstractC19687c);
        }
        C18762c c18762c2 = c18762c;
        Object objM3222u = c18762c2.f59659q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18762c2.f59661s0;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC15088n2 = c18762c2.f59658p0;
                C21296a c21296a3 = (C21296a) c18762c2.f59657o0;
                Charset charset3 = c18762c2.f59656Z;
                c18767h = c18762c2.f59655Y;
                AbstractC9233X.m9807c(objM3222u);
                c21296a2 = c21296a3;
                charset2 = charset3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kSerializer = (KSerializer) c18762c2.f59657o0;
                charset2 = c18762c2.f59656Z;
                c18767h2 = c18762c2.f59655Y;
                AbstractC9233X.m9807c(objM3222u);
            }
            interfaceC7526i = (InterfaceC7526i) objM3222u;
            try {
                abstractC11516d = c18767h2.f59677a;
                if (abstractC11516d instanceof InterfaceC8980l) {
                    return abstractC11516d.m12903b(AbstractC8700r.m9407c(interfaceC7526i, charset2, 2), kSerializer);
                }
                AbstractC8694q.m9396c(interfaceC7526i, Long.MAX_VALUE);
                throw new IllegalStateException(("Unsupported format " + c18767h2.f59677a).toString());
            } catch (Throwable th2) {
                throw new C18512g("Illegal input: " + th2.getMessage(), th2);
            }
        }
        AbstractC9233X.m9807c(objM3222u);
        C18509d c18509d = new C18509d(new C2025h(this.f59678b), charset, c21296a, interfaceC15088n, 1);
        C18763d c18763d = new C18763d(interfaceC15088n2, null);
        c18762c2.f59655Y = this;
        charset2 = charset;
        c18762c2.f59656Z = charset2;
        c21296a2 = c21296a;
        c18762c2.f59657o0 = c21296a2;
        c18762c2.f59658p0 = interfaceC15088n2;
        c18762c2.f59661s0 = 1;
        objM3222u = AbstractC2124C.m3222u(c18509d, c18763d, c18762c2);
        if (objM3222u == enumC19250a) {
            return enumC19250a;
        }
        c18767h = this;
        if (!c18767h.f59678b.isEmpty() && (objM3222u != null || interfaceC15088n2.mo1141e())) {
            return objM3222u;
        }
        KSerializer kSerializerM5671g = AbstractC5103c.m5671g(c18767h.f59677a.f34844b, c21296a2);
        c18762c2.f59655Y = c18767h;
        c18762c2.f59656Z = charset2;
        c18762c2.f59657o0 = kSerializerM5671g;
        c18762c2.f59658p0 = null;
        c18762c2.f59661s0 = 2;
        Object objM16186n = AbstractC15070F.m16186n(interfaceC15088n2, c18762c2);
        if (objM16186n == enumC19250a) {
            return enumC19250a;
        }
        c18767h2 = c18767h;
        objM3222u = objM16186n;
        kSerializer = kSerializerM5671g;
        interfaceC7526i = (InterfaceC7526i) objM3222u;
        abstractC11516d = c18767h2.f59677a;
        if (abstractC11516d instanceof InterfaceC8980l) {
            return abstractC11516d.m12903b(AbstractC8700r.m9407c(interfaceC7526i, charset2, 2), kSerializer);
        }
        AbstractC8694q.m9396c(interfaceC7526i, Long.MAX_VALUE);
        throw new IllegalStateException(("Unsupported format " + c18767h2.f59677a).toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: b */
    public final Object m20048b(C16460h c16460h, Charset charset, C21296a c21296a, Object obj, AbstractC19687c abstractC19687c) {
        C18765f c18765f;
        C16460h c16460h2;
        C18767h c18767h;
        Charset charset2;
        C21296a c21296a2;
        Object obj2;
        KSerializer kSerializerM5670f;
        if (abstractC19687c instanceof C18765f) {
            c18765f = (C18765f) abstractC19687c;
            int i10 = c18765f.f59675t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18765f.f59675t0 = i10 - Integer.MIN_VALUE;
            } else {
                c18765f = new C18765f(this, abstractC19687c);
            }
        } else {
            c18765f = new C18765f(this, abstractC19687c);
        }
        Object objM3222u = c18765f.f59673r0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18765f.f59675t0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM3222u);
            C3254j c3254j = new C3254j(new C2025h(this.f59678b), c16460h, charset, c21296a, obj, 1);
            C18766g c18766g = new C18766g(2, null);
            c18765f.f59668Y = this;
            c16460h2 = c16460h;
            c18765f.f59669Z = c16460h2;
            c18765f.f59670o0 = charset;
            c18765f.f59671p0 = c21296a;
            c18765f.f59672q0 = obj;
            c18765f.f59675t0 = 1;
            objM3222u = AbstractC2124C.m3222u(c3254j, c18766g, c18765f);
            if (objM3222u == enumC19250a) {
                return enumC19250a;
            }
            c18767h = this;
            charset2 = charset;
            c21296a2 = c21296a;
            obj2 = obj;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = c18765f.f59672q0;
            c21296a2 = c18765f.f59671p0;
            charset2 = c18765f.f59670o0;
            c16460h2 = c18765f.f59669Z;
            c18767h = c18765f.f59668Y;
            AbstractC9233X.m9807c(objM3222u);
        }
        AbstractC17288f abstractC17288f = (AbstractC17288f) objM3222u;
        if (abstractC17288f != null) {
            return abstractC17288f;
        }
        try {
            kSerializerM5670f = AbstractC5103c.m5671g(c18767h.f59677a.f34844b, c21296a2);
        } catch (C8976h unused) {
            kSerializerM5670f = AbstractC5103c.m5670f(obj2, c18767h.f59677a.f34844b);
        }
        AbstractC11516d abstractC11516d = c18767h.f59677a;
        if (abstractC11516d instanceof InterfaceC8980l) {
            return new C17293k(abstractC11516d.m12905d(kSerializerM5670f, obj2), AbstractC8627e4.m9278e(c16460h2, charset2));
        }
        throw new IllegalStateException(("Unsupported format " + abstractC11516d).toString());
    }
}
