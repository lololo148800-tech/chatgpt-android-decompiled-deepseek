package p523V9;

import gd.AbstractC13881O1;
import gd.AbstractC13887Q1;
import gd.C14005w2;
import gd.InterfaceC13849E;
import gd.InterfaceC13858H;
import gd.InterfaceC13918b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17632f;
import p092Dc.C1998o;
import p1113xn.AbstractC21329w;
import p195Hh.InterfaceC3426a;
import p349O0.C6013l;
import p349O0.C6021p;
import p909nm.C17690x;

/* JADX INFO: renamed from: V9.o6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8160o6 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8726a(InterfaceC3426a interfaceC3426a, String str, Throwable th2, int i10) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        interfaceC3426a.mo4189d(str, th2, C17690x.f56481Y);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m8727b(InterfaceC3426a interfaceC3426a, String str, Throwable th2, int i10) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        interfaceC3426a.mo4187b(str, th2, C17690x.f56481Y);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m8728c(InterfaceC3426a interfaceC3426a, String str, Throwable th2, Map map, int i10) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        if ((i10 & 4) != 0) {
            map = C17690x.f56481Y;
        }
        interfaceC3426a.mo4188c(str, th2, map);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m8729d(AbstractC13881O1 key, C6021p c6021p) {
        InterfaceC13849E interfaceC13849E;
        Object next;
        Object objM19235b;
        Object next2;
        Object objM19235b2;
        AbstractC16544l.m18094g(key, "key");
        c6021p.m6524S(1304735264);
        Boolean bool = (Boolean) ((Map) c6021p.m6548k(AbstractC13887Q1.f43935a)).get(key);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            c6021p.m6553p(false);
            return zBooleanValue;
        }
        c6021p.m6524S(617413469);
        Iterator it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
        do {
            interfaceC13849E = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof InterfaceC13858H));
        if (next != null) {
            objM19235b = (InterfaceC13858H) next;
            c6021p.m6553p(false);
        } else {
            objM19235b = C17632f.f56419a.m19235b(InterfaceC13858H.class);
            c6021p.m6553p(false);
        }
        InterfaceC13858H interfaceC13858H = (InterfaceC13858H) objM19235b;
        InterfaceC13849E interfaceC13849EMo3166d = interfaceC13858H != null ? interfaceC13858H.mo3166d() : null;
        c6021p.m6524S(-143671170);
        if (interfaceC13849EMo3166d == null) {
            c6021p.m6524S(617413469);
            Iterator it2 = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!(next2 instanceof InterfaceC13918b));
            if (next2 != null) {
                objM19235b2 = (InterfaceC13918b) next2;
                c6021p.m6553p(false);
            } else {
                objM19235b2 = C17632f.f56419a.m19235b(InterfaceC13918b.class);
                c6021p.m6553p(false);
            }
            InterfaceC13918b interfaceC13918b = (InterfaceC13918b) objM19235b2;
            if (interfaceC13918b != null) {
                interfaceC13849E = (InterfaceC13849E) ((C1998o) interfaceC13918b).f6016N.get();
            }
        } else {
            interfaceC13849E = interfaceC13849EMo3166d;
        }
        c6021p.m6553p(false);
        if (interfaceC13849E == null) {
            c6021p.m6553p(false);
            return false;
        }
        c6021p.m6524S(-143664258);
        boolean zM6542f = c6021p.m6542f(key);
        Object objM6514H = c6021p.m6514H();
        if (zM6542f || objM6514H == C6013l.f19514a) {
            objM6514H = Boolean.valueOf(((C14005w2) interfaceC13849E).m15481a(key));
            c6021p.m6537c0(objM6514H);
        }
        boolean zBooleanValue2 = ((Boolean) objM6514H).booleanValue();
        c6021p.m6553p(false);
        c6021p.m6553p(false);
        return zBooleanValue2;
    }

    /* JADX INFO: renamed from: e */
    public static final String m8730e(int i10, String str, String str2, String str3) {
        if (i10 <= 0) {
            return str;
        }
        return m8730e(i10 - 1, AbstractC21329w.m21732s(str, str2, str3), str2, str3);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m8731f(InterfaceC3426a interfaceC3426a, String str, Throwable th2, LinkedHashMap linkedHashMap, int i10) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        Map map = linkedHashMap;
        if ((i10 & 4) != 0) {
            map = C17690x.f56481Y;
        }
        interfaceC3426a.mo4186a(str, th2, map);
    }
}
