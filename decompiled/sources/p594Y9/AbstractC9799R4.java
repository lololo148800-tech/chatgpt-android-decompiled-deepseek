package p594Y9;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p1113xn.AbstractC21329w;
import p499U9.C7588r;
import p530Vi.C8305a;
import p530Vi.C8312h;
import p602Yi.AbstractC10067c;
import p602Yi.C10065a;
import p602Yi.InterfaceC10066b;
import p775h2.AbstractC14376f;
import p942p6.C18299c;

/* JADX INFO: renamed from: Y9.R4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9799R4 {

    /* JADX INFO: renamed from: a */
    public static C7588r f29317a;

    /* JADX INFO: renamed from: a */
    public static final void m10419a(C8305a c8305a, String message, int i10) {
        AbstractC16544l.m18094g(c8305a, "<this>");
        AbstractC16544l.m18094g(message, "message");
        AbstractC14376f.m15825D(i10, "kind");
        InterfaceC10066b interfaceC10066b = C8312h.f25901t0;
        C10065a c10065a = new C10065a(i10, message);
        if (AbstractC10067c.f29812a[AbstractC0010F.m24h(i10)] != 1) {
            interfaceC10066b.mo8900r(c10065a);
        } else if (C8312h.f25900s0) {
            interfaceC10066b.mo8900r(c10065a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m10420b(ArrayList arrayList) {
        Object next;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC21329w.m21726m(((C18299c) next).f58411a, SIPHeaderNames.CONTENT_TYPE));
        C18299c c18299c = (C18299c) next;
        if (c18299c != null) {
            return c18299c.f58412b;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized C9788P4 m10421c(C9764L4 c9764l4) {
        try {
            if (f29317a == null) {
                f29317a = new C7588r(4);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (C9788P4) f29317a.m4539y(c9764l4);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized C9788P4 m10422d(String str) {
        byte b = (byte) (((byte) 1) | 2);
        try {
            if (b != 3) {
                StringBuilder sb2 = new StringBuilder();
                if ((b & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return m10421c(new C9764L4(str));
    }
}
