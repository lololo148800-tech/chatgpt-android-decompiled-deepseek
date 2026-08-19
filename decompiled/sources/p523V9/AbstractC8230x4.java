package p523V9;

import cg.C11746r;
import eg.C13392o;
import eg.C13396s;
import kotlin.jvm.internal.AbstractC16544l;
import p009A7.C0392b;
import p1113xn.C21307a;
import p113E7.InterfaceC2353a;
import p364Oh.AbstractC6249w;
import p364Oh.C6222A;
import p556Wk.C8915b0;
import p571X9.AbstractC9233X;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p792hl.AbstractC14527b;
import p909nm.AbstractC17681o;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: V9.x4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8230x4 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m8863a(AbstractC6249w abstractC6249w, AbstractC19687c abstractC19687c) {
        C11746r c11746r;
        C8915b0 c8915b0;
        Object objM14947a;
        if (abstractC19687c instanceof C11746r) {
            c11746r = (C11746r) abstractC19687c;
            int i10 = c11746r.f35627p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11746r.f35627p0 = i10 - Integer.MIN_VALUE;
            } else {
                c11746r = new C11746r(abstractC19687c);
            }
        } else {
            c11746r = new C11746r(abstractC19687c);
        }
        Object obj = c11746r.f35626o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11746r.f35627p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            Throwable th2 = abstractC6249w.f20328a;
            c8915b0 = th2 instanceof C8915b0 ? (C8915b0) th2 : null;
            if (c8915b0 != null) {
                C13392o c13392o = C13396s.Companion;
                c11746r.f35624Y = abstractC6249w;
                c11746r.f35625Z = c8915b0;
                c11746r.f35627p0 = 1;
                objM14947a = c13392o.m14947a(c8915b0, c11746r);
                if (objM14947a == enumC19250a) {
                    return enumC19250a;
                }
            }
            return abstractC6249w;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C8915b0 c8915b1 = c11746r.f35625Z;
        AbstractC6249w abstractC6249w2 = c11746r.f35624Y;
        AbstractC9233X.m9807c(obj);
        c8915b0 = c8915b1;
        abstractC6249w = abstractC6249w2;
        objM14947a = obj;
        C13396s c13396s = (C13396s) objM14947a;
        if (c13396s != null) {
            int i12 = c8915b0.f27285Y.mo7307f().f51013Y;
            AbstractC14527b abstractC14527b = c8915b0.f27285Y;
            AbstractC16544l.m18094g(abstractC14527b, "<this>");
            return new C6222A(c13396s, i12, abstractC14527b.mo7301a().mo7982g("cf-ray"), c13396s.f42448Z, 16);
        }
        return abstractC6249w;
    }

    /* JADX INFO: renamed from: b */
    public static final byte[] m8864b(InterfaceC2353a interfaceC2353a, Object model, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(model, "model");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        try {
            String strMo3437g = interfaceC2353a.mo3437g(model);
            if (strMo3437g == null) {
                return null;
            }
            byte[] bytes = strMo3437g.getBytes(C21307a.f67720a);
            AbstractC16544l.m18093f(bytes, "getBytes(...)");
            return bytes;
        } catch (Throwable th2) {
            AbstractC7889G0.m8185c(internalLogger, 5, AbstractC17681o.m19382k(EnumC11255b.f34098Y, EnumC11255b.f34100o0), new C0392b(model, 1), th2, 48);
            return null;
        }
    }
}
