package io.ktor.client.plugins.auth;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import np.AbstractC17712d;
import np.InterfaceC17710b;
import p059C5.C1601s;
import p1111xl.C21296a;
import p225Im.C3743B;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p432Rh.C6894g;
import p434Rk.C6911c;
import p544W9.AbstractC8443A;
import p571X9.AbstractC9233X;
import p582Xk.C9526c;
import p582Xk.C9531h;
import p594Y9.AbstractC9949p4;
import p754fl.C13693c;
import p817j$.util.concurrent.ConcurrentMap$EL;
import p996rm.EnumC19250a;
import sl.C19666a;
import sm.AbstractC19687c;
import tl.C20001a;
import tl.C20002b;
import tl.C20003c;

/* JADX INFO: renamed from: io.ktor.client.plugins.auth.i */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15064i {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC17710b f46817a = AbstractC17712d.m19445b().m19898a().mo19435a("io.ktor.client.plugins.auth.Auth");

    /* JADX INFO: renamed from: b */
    public static final C19666a f46818b;

    /* JADX INFO: renamed from: c */
    public static final C9526c f46819c;

    /* JADX INFO: renamed from: d */
    public static final C19666a f46820d;

    static {
        InterfaceC3777y interfaceC3777yM18075c;
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
        InterfaceC3777y interfaceC3777yM18076d = null;
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
        } catch (Throwable unused) {
            interfaceC3777yM18075c = null;
        }
        f46818b = new C19666a("auth-request", new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c));
        f46819c = AbstractC9949p4.m10607a("Auth", C15059d.f46788Y, new C15058c(0));
        InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(List.class);
        try {
            C3743B c3743b = C3743B.f11391c;
            interfaceC3777yM18076d = AbstractC16526C.m18076d(List.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(C6894g.class)));
        } catch (Throwable unused2) {
        }
        f46820d = new C19666a("AuthProviders", new C21296a(interfaceC3756dMo5693b2, interfaceC3777yM18076d));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m16171a(C9531h c9531h, C6911c c6911c, C6894g c6894g, C13693c c13693c, AbstractC19687c abstractC19687c) {
        C15062g c15062g;
        C9531h c9531h2;
        C13693c c13693c2;
        if (abstractC19687c instanceof C15062g) {
            c15062g = (C15062g) abstractC19687c;
            int i10 = c15062g.f46810q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c15062g.f46810q0 = i10 - Integer.MIN_VALUE;
            } else {
                c15062g = new C15062g(abstractC19687c);
            }
        } else {
            c15062g = new C15062g(abstractC19687c);
        }
        Object objMo9562a = c15062g.f46809p0;
        Object obj = EnumC19250a.f61036Y;
        int i11 = c15062g.f46810q0;
        if (i11 != 0) {
            if (i11 == 1) {
                c13693c2 = c15062g.f46808o0;
                c6911c = c15062g.f46807Z;
                c9531h2 = c15062g.f46806Y;
                AbstractC9233X.m9807c(objMo9562a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objMo9562a);
            }
            return objMo9562a;
        }
        AbstractC9233X.m9807c(objMo9562a);
        C13693c c13693c3 = new C13693c();
        c13693c3.m15169d(c13693c);
        c15062g.f46806Y = c9531h;
        c15062g.f46807Z = c6911c;
        c15062g.f46808o0 = c13693c3;
        c15062g.f46810q0 = 1;
        if (c6894g.m7288a(c13693c3, c15062g) == obj) {
            return obj;
        }
        c9531h2 = c9531h;
        c13693c2 = c13693c3;
        c13693c2.f43200f.m20652f(f46818b, C17296C.f55119a);
        f46817a.mo19442g("Sending new request to " + c6911c.m7296c().mo7300S());
        c15062g.f46806Y = null;
        c15062g.f46807Z = null;
        c15062g.f46808o0 = null;
        c15062g.f46810q0 = 2;
        objMo9562a = c9531h2.f28682Y.mo9562a(c13693c2, c15062g);
        if (objMo9562a == obj) {
            return obj;
        }
        return objMo9562a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m16172b(C20003c c20003c, C19666a c19666a, C6911c c6911c, C6894g c6894g, C13693c c13693c, AbstractC19687c abstractC19687c) {
        C15063h c15063h;
        C15056a c15056a;
        Map map;
        if (abstractC19687c instanceof C15063h) {
            c15063h = (C15063h) abstractC19687c;
            int i10 = c15063h.f46816r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c15063h.f46816r0 = i10 - Integer.MIN_VALUE;
            } else {
                c15063h = new C15063h(abstractC19687c);
            }
        } else {
            c15063h = new C15063h(abstractC19687c);
        }
        Object obj = c15063h.f46815q0;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c15063h.f46816r0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C15056a c15056a2 = (C15056a) ConcurrentMap$EL.computeIfAbsent(c20003c.f63323Y, c6894g, new C20002b(0, new C20001a(0, new C1601s(20))));
            Map map2 = (Map) c13693c.f43200f.m20647a(c19666a, new C1601s(21));
            Integer num = (Integer) map2.get(c6894g);
            if (num != null && num.intValue() >= c15056a2.atomic) {
                f46817a.mo19442g("Refreshing token for " + c6911c.m7296c().mo7300S());
                c6911c.m7297d();
                c15063h.f46811Y = c6911c;
                c15063h.f46812Z = c6894g;
                c15063h.f46813o0 = c15056a2;
                c15063h.f46814p0 = map2;
                c15063h.f46816r0 = 1;
                c6894g.getClass();
                obj = Boolean.TRUE;
                if (obj == obj2) {
                    return obj2;
                }
                c15056a = c15056a2;
                map = map2;
            }
            return Boolean.TRUE;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        map = c15063h.f46814p0;
        c15056a = c15063h.f46813o0;
        c6894g = c15063h.f46812Z;
        c6911c = c15063h.f46811Y;
        AbstractC9233X.m9807c(obj);
        if (((Boolean) obj).booleanValue()) {
            map.put(c6894g, new Integer(C15056a.f46785a.incrementAndGet(c15056a)));
            return Boolean.TRUE;
        }
        f46817a.mo19442g("Refreshing token failed for " + c6911c.m7296c().mo7300S());
        return Boolean.FALSE;
    }
}
