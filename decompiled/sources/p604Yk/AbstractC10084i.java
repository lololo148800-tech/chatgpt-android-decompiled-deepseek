package p604Yk;

import io.ktor.utils.p815io.InterfaceC15088n;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16527D;
import ml.AbstractC17288f;
import np.AbstractC17712d;
import np.InterfaceC17710b;
import p008A6.C0383c;
import p1111xl.C21296a;
import p115E9.AbstractC2359a;
import p225Im.InterfaceC3756d;
import p571X9.AbstractC9233X;
import p582Xk.C9526c;
import p594Y9.AbstractC9949p4;
import p857kl.C16440G;
import p857kl.C16452T;
import p857kl.C16460h;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17682p;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Yk.i */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10084i {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC17710b f29861a = AbstractC17712d.m19445b().m19898a().mo19435a("io.ktor.client.plugins.contentnegotiation.ContentNegotiation");

    /* JADX INFO: renamed from: b */
    public static final Set f29862b;

    /* JADX INFO: renamed from: c */
    public static final C9526c f29863c;

    static {
        C16527D c16527d = AbstractC16526C.f51263a;
        f29862b = AbstractC17678l.m19293P(new InterfaceC3756d[]{c16527d.mo5693b(byte[].class), c16527d.mo5693b(String.class), c16527d.mo5693b(C16440G.class), c16527d.mo5693b(InterfaceC15088n.class), c16527d.mo5693b(AbstractC17288f.class)});
        f29863c = AbstractC9949p4.m10607a("ContentNegotiation", C10079d.f29836Y, new C0383c(21));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m10677b(Set set, ArrayList arrayList, C16452T c16452t, C21296a c21296a, Object obj, C16460h c16460h, Charset charset, AbstractC19687c abstractC19687c) {
        C10083h c10083h;
        if (abstractC19687c instanceof C10083h) {
            c10083h = (C10083h) abstractC19687c;
            int i10 = c10083h.f29860o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c10083h.f29860o0 = i10 - Integer.MIN_VALUE;
            } else {
                c10083h = new C10083h(abstractC19687c);
            }
        } else {
            c10083h = new C10083h(abstractC19687c);
        }
        Object objM3443b = c10083h.f29859Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c10083h.f29860o0;
        InterfaceC17710b interfaceC17710b = f29861a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM3443b);
            if (!(obj instanceof InterfaceC15088n)) {
                interfaceC17710b.mo19442g("Response body is already transformed. Skipping ContentNegotiation for " + c16452t + '.');
            } else if (set.contains(c21296a.f67700a)) {
                interfaceC17710b.mo19442g("Response body type " + c21296a.f67700a + " is in ignored types. Skipping ContentNegotiation for " + c16452t + '.');
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((C10076a) obj2).f29831c.mo10671r(c16460h)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((C10076a) it.next()).f29829a);
                }
                if (arrayList3.isEmpty()) {
                    arrayList3 = null;
                }
                if (arrayList3 == null) {
                    interfaceC17710b.mo19442g("None of the registered converters match response with Content-Type=" + c16460h + ". Skipping ContentNegotiation for " + c16452t + '.');
                } else {
                    c10083h.f29858Y = c16452t;
                    c10083h.f29860o0 = 1;
                    objM3443b = AbstractC2359a.m3443b(arrayList3, (InterfaceC15088n) obj, c21296a, charset, c10083h);
                    if (objM3443b == enumC19250a) {
                        return enumC19250a;
                    }
                }
            }
            return null;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c16452t = c10083h.f29858Y;
        AbstractC9233X.m9807c(objM3443b);
        if (!(objM3443b instanceof InterfaceC15088n)) {
            interfaceC17710b.mo19442g("Response body was converted to " + AbstractC16526C.f51263a.mo5693b(objM3443b.getClass()) + " for " + c16452t + '.');
        }
        return objM3443b;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01af  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:68:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:77:0x0217  */
    /* JADX WARN: Code duplicated, block: B:78:0x021a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:84:0x0261  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01eb -> B:73:0x01f4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m10676a(java.util.ArrayList r18, java.util.Set r19, p754fl.C13693c r20, java.lang.Object r21, sm.AbstractC19687c r22) {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p604Yk.AbstractC10084i.m10676a(java.util.ArrayList, java.util.Set, fl.c, java.lang.Object, sm.c):java.lang.Object");
    }
}
