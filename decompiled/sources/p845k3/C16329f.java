package p845k3;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2184i;
import p275Kn.AbstractC4817d;
import p275Kn.C4816c;
import p275Kn.InterfaceC4814a;
import p351O2.InterfaceC6094h;
import p571X9.AbstractC9233X;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p672c3.C11604f0;
import p672c3.C11618m0;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: k3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C16329f implements InterfaceC16324a {

    /* JADX INFO: renamed from: a */
    public static final C16329f f50659a = new C16329f();

    /* JADX INFO: renamed from: b */
    public static final C4816c f50660b = AbstractC4817d.m5451a();

    /* JADX INFO: renamed from: c */
    public static final LinkedHashMap f50661c = new LinkedHashMap();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m17919a(Context context, C16331h c16331h, String str, AbstractC19687c abstractC19687c) {
        C16325b c16325b;
        C4816c c4816c;
        InterfaceC4814a interfaceC4814a;
        InterfaceC16330g interfaceC16330g;
        if (abstractC19687c instanceof C16325b) {
            c16325b = (C16325b) abstractC19687c;
            int i10 = c16325b.f50644s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16325b.f50644s0 = i10 - Integer.MIN_VALUE;
            } else {
                c16325b = new C16325b(this, abstractC19687c);
            }
        } else {
            c16325b = new C16325b(this, abstractC19687c);
        }
        Object obj = c16325b.f50642q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16325b.f50644s0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c16325b.f50638Y = context;
            c16325b.f50639Z = c16331h;
            c16325b.f50640o0 = str;
            c4816c = f50660b;
            c16325b.f50641p0 = c4816c;
            c16325b.f50644s0 = 1;
            if (c4816c.m5448e(null, c16325b) == enumC19250a) {
                interfaceC16330g = c16331h;
                interfaceC4814a = c4816c;
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC4814a interfaceC4814a2 = c16325b.f50641p0;
            str = c16325b.f50640o0;
            InterfaceC16330g interfaceC16330g2 = c16325b.f50639Z;
            Context context2 = c16325b.f50638Y;
            AbstractC9233X.m9807c(obj);
            interfaceC4814a = interfaceC4814a2;
            context = context2;
            interfaceC16330g = interfaceC16330g2;
        }
        try {
            interfaceC16330g = c16331h;
            interfaceC4814a = c4816c;
            f50661c.remove(str);
            interfaceC16330g.mo12996a(context, str).delete();
            return C17296C.f55119a;
        } finally {
            ((C4816c) interfaceC4814a).m5450g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m17921c(Context context, InterfaceC16330g interfaceC16330g, String str, AbstractC19687c abstractC19687c) throws Throwable {
        C16327d c16327d;
        if (abstractC19687c instanceof C16327d) {
            c16327d = (C16327d) abstractC19687c;
            int i10 = c16327d.f50654o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16327d.f50654o0 = i10 - Integer.MIN_VALUE;
            } else {
                c16327d = new C16327d(this, abstractC19687c);
            }
        } else {
            c16327d = new C16327d(this, abstractC19687c);
        }
        Object objM17920b = c16327d.f50652Y;
        Object obj = EnumC19250a.f61036Y;
        int i11 = c16327d.f50654o0;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC9233X.m9807c(objM17920b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM17920b);
            }
        }
        AbstractC9233X.m9807c(objM17920b);
        c16327d.f50654o0 = 1;
        objM17920b = m17920b(context, interfaceC16330g, str, c16327d);
        if (objM17920b == obj) {
            return obj;
        }
        InterfaceC2184i interfaceC2184iMo6650a = ((InterfaceC6094h) objM17920b).mo6650a();
        c16327d.f50654o0 = 2;
        objM17920b = AbstractC2124C.m3221t(interfaceC2184iMo6650a, c16327d);
        return objM17920b == obj ? obj : objM17920b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m17922d(Context context, C11618m0 c11618m0, String str, C11604f0 c11604f0, AbstractC19687c abstractC19687c) {
        C16328e c16328e;
        InterfaceC1439n interfaceC1439n;
        if (abstractC19687c instanceof C16328e) {
            c16328e = (C16328e) abstractC19687c;
            int i10 = c16328e.f50658p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16328e.f50658p0 = i10 - Integer.MIN_VALUE;
            } else {
                c16328e = new C16328e(this, abstractC19687c);
            }
        } else {
            c16328e = new C16328e(this, abstractC19687c);
        }
        Object objM17920b = c16328e.f50656Z;
        Object obj = EnumC19250a.f61036Y;
        int i11 = c16328e.f50658p0;
        if (i11 != 0) {
            if (i11 == 1) {
                InterfaceC1439n interfaceC1439n2 = c16328e.f50655Y;
                AbstractC9233X.m9807c(objM17920b);
                interfaceC1439n = interfaceC1439n2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM17920b);
            }
        }
        AbstractC9233X.m9807c(objM17920b);
        c16328e.f50655Y = c11604f0;
        c16328e.f50658p0 = 1;
        objM17920b = m17920b(context, c11618m0, str, c16328e);
        if (objM17920b == obj) {
            interfaceC1439n = c11604f0;
            return obj;
        }
        interfaceC1439n = c11604f0;
        c16328e.f50655Y = null;
        c16328e.f50658p0 = 2;
        objM17920b = ((InterfaceC6094h) objM17920b).mo6651b(interfaceC1439n, c16328e);
        return objM17920b == obj ? obj : objM17920b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m17920b(Context context, InterfaceC16330g interfaceC16330g, String str, AbstractC19687c abstractC19687c) throws Throwable {
        C16326c c16326c;
        C4816c c4816c;
        InterfaceC4814a interfaceC4814a;
        InterfaceC4814a interfaceC4814a2;
        Object obj;
        InterfaceC4814a interfaceC4814a3;
        Map map;
        if (abstractC19687c instanceof C16326c) {
            c16326c = (C16326c) abstractC19687c;
            int i10 = c16326c.f50651s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16326c.f50651s0 = i10 - Integer.MIN_VALUE;
            } else {
                c16326c = new C16326c(this, abstractC19687c);
            }
        } else {
            c16326c = new C16326c(this, abstractC19687c);
        }
        Object obj2 = c16326c.f50649q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16326c.f50651s0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(obj2);
                c16326c.f50645Y = context;
                c16326c.f50646Z = interfaceC16330g;
                c16326c.f50647o0 = str;
                c4816c = f50660b;
                c16326c.f50648p0 = c4816c;
                c16326c.f50651s0 = 1;
                if (c4816c.m5448e(null, c16326c) == enumC19250a) {
                    interfaceC4814a = c4816c;
                    return enumC19250a;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = (Map) c16326c.f50647o0;
                    interfaceC4814a2 = (InterfaceC4814a) c16326c.f50646Z;
                    str = (String) c16326c.f50645Y;
                    try {
                        AbstractC9233X.m9807c(obj2);
                        interfaceC4814a3 = interfaceC4814a2;
                        obj = (InterfaceC6094h) obj2;
                        map.put(str, obj);
                        interfaceC4814a2 = interfaceC4814a3;
                        AbstractC16544l.m18092e(obj, tpXhEMGxfXFVSh.zbLGDsNwQwySDTz);
                        InterfaceC6094h interfaceC6094h = (InterfaceC6094h) obj;
                        ((C4816c) interfaceC4814a2).m5450g(null);
                        return interfaceC6094h;
                    } catch (Throwable th2) {
                        th = th2;
                        ((C4816c) interfaceC4814a2).m5450g(null);
                        throw th;
                    }
                }
                InterfaceC4814a interfaceC4814a4 = c16326c.f50648p0;
                str = (String) c16326c.f50647o0;
                interfaceC16330g = (InterfaceC16330g) c16326c.f50646Z;
                Context context2 = (Context) c16326c.f50645Y;
                AbstractC9233X.m9807c(obj2);
                interfaceC4814a = interfaceC4814a4;
                context = context2;
            }
            interfaceC4814a = c4816c;
            LinkedHashMap linkedHashMap = f50661c;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                c16326c.f50645Y = str;
                c16326c.f50646Z = interfaceC4814a;
                c16326c.f50647o0 = linkedHashMap;
                c16326c.f50648p0 = null;
                c16326c.f50651s0 = 2;
                Object objMo12997b = interfaceC16330g.mo12997b(context, str);
                if (objMo12997b == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC4814a3 = interfaceC4814a;
                obj2 = objMo12997b;
                map = linkedHashMap;
                obj = (InterfaceC6094h) obj2;
                map.put(str, obj);
                interfaceC4814a2 = interfaceC4814a3;
            } else {
                interfaceC4814a2 = interfaceC4814a;
            }
            AbstractC16544l.m18092e(obj, tpXhEMGxfXFVSh.zbLGDsNwQwySDTz);
            InterfaceC6094h interfaceC6094h2 = (InterfaceC6094h) obj;
            ((C4816c) interfaceC4814a2).m5450g(null);
            return interfaceC6094h2;
        } catch (Throwable th3) {
            th = th3;
            interfaceC4814a2 = interfaceC4814a;
            ((C4816c) interfaceC4814a2).m5450g(null);
            throw th;
        }
    }
}
