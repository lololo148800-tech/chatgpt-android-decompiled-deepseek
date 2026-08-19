package p178H;

import ac.C10539a;
import android.graphics.Bitmap;
import android.javax.sip.C10808o;
import android.media.Image;
import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17334a;
import no.AbstractC17708b;
import p013Ab.C0420b;
import p1048uo.C20407n;
import p1060v9.AbstractC20502t;
import p117Eb.C2392v;
import p571X9.AbstractC9306j0;
import p594Y9.C9907i4;
import p594Y9.C9912j3;
import p594Y9.C9919k4;
import p594Y9.C9924l3;
import p594Y9.EnumC9906i3;
import p594Y9.EnumC9913j4;
import p594Y9.EnumC9960r3;
import p594Y9.EnumC9966s3;
import p594Y9.InterfaceC9776N4;
import p615Z6.C10252z0;
import p658b5.C11242m;
import p658b5.C11248s;
import p661b7.InterfaceC11256c;
import p748fc.C13610b;
import p817j$.util.DesugarCollections;
import p918o7.C17878e;
import p943p7.C18305c;
import p950po.C18528b;
import p950po.C18530d;
import p974qo.C18790f;
import p974qo.C18792h;
import p974qo.C18795k;

/* JADX INFO: renamed from: H.x */
/* JADX INFO: loaded from: classes.dex */
public final class C3179x implements InterfaceC9776N4 {

    /* JADX INFO: renamed from: Y */
    public final long f9586Y;

    /* JADX INFO: renamed from: Z */
    public final Object f9587Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f9588o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f9589p0;

    public /* synthetic */ C3179x(C13610b c13610b, long j10, EnumC9966s3 enumC9966s3, C10539a c10539a) {
        this.f9587Z = c13610b;
        this.f9586Y = j10;
        this.f9588o0 = enumC9966s3;
        this.f9589p0 = c10539a;
    }

    @Override // p594Y9.InterfaceC9776N4
    /* JADX INFO: renamed from: a */
    public C0420b mo364a() {
        int iLimit;
        EnumC9906i3 enumC9906i3;
        C13610b c13610b = (C13610b) this.f9587Z;
        long j10 = this.f9586Y;
        EnumC9966s3 enumC9966s3 = (EnumC9966s3) this.f9588o0;
        C10539a c10539a = (C10539a) this.f9589p0;
        c13610b.getClass();
        C11242m c11242m = new C11242m();
        C2392v c2392v = new C2392v(22, false);
        c2392v.f7436Z = Long.valueOf(j10 & Long.MAX_VALUE);
        c2392v.f7437o0 = enumC9966s3;
        c2392v.f7438p0 = Boolean.valueOf(C13610b.f42992i);
        Boolean bool = Boolean.TRUE;
        c2392v.f7439q0 = bool;
        c2392v.f7440r0 = bool;
        c11242m.f34018Y = new C9924l3(c2392v);
        int i10 = c10539a.f31260g;
        if (i10 == -1) {
            Bitmap bitmap = c10539a.f31254a;
            AbstractC20502t.m21157h(bitmap);
            iLimit = bitmap.getAllocationByteCount();
        } else if (i10 == 17 || i10 == 842094169) {
            ByteBuffer byteBuffer = c10539a.f31255b;
            AbstractC20502t.m21157h(byteBuffer);
            iLimit = byteBuffer.limit();
        } else if (i10 != 35) {
            iLimit = 0;
        } else {
            Image.Plane[] planeArrM10980a = c10539a.m10980a();
            AbstractC20502t.m21157h(planeArrM10980a);
            iLimit = (planeArrM10980a[0].getBuffer().limit() * 3) / 2;
        }
        C11248s c11248s = new C11248s(17, false);
        if (i10 == -1) {
            enumC9906i3 = EnumC9906i3.BITMAP;
        } else if (i10 == 35) {
            enumC9906i3 = EnumC9906i3.YUV_420_888;
        } else if (i10 == 842094169) {
            enumC9906i3 = EnumC9906i3.YV12;
        } else if (i10 != 16) {
            enumC9906i3 = i10 != 17 ? EnumC9906i3.UNKNOWN_FORMAT : EnumC9906i3.NV21;
        } else {
            enumC9906i3 = EnumC9906i3.NV16;
        }
        c11248s.f34081Z = enumC9906i3;
        c11248s.f34082o0 = Integer.valueOf(Integer.MAX_VALUE & iLimit);
        c11242m.f34019Z = new C9912j3(c11248s);
        C10808o c10808o = new C10808o(25, false);
        c13610b.f42996g.getClass();
        c10808o.f32040Z = EnumC9913j4.LATIN;
        c11242m.f34020o0 = new C9919k4(c10808o);
        C9907i4 c9907i4 = new C9907i4(c11242m);
        C10252z0 c10252z0 = new C10252z0();
        c10252z0.f30456o0 = c13610b.f42996g.m15474a() ? EnumC9960r3.TYPE_THICK : EnumC9960r3.TYPE_THIN;
        c10252z0.f30457p0 = c9907i4;
        return new C0420b(c10252z0, 0, (byte) 0);
    }

    /* JADX INFO: renamed from: b */
    public boolean m4024b(C17334a c17334a, C18792h call, List list, boolean z6) {
        AbstractC16544l.m18094g(call, "call");
        Iterator it = ((ConcurrentLinkedQueue) this.f9589p0).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            C18795k connection = (C18795k) it.next();
            AbstractC16544l.m18093f(connection, "connection");
            synchronized (connection) {
                if (z6) {
                    if (!(connection.f59744g != null)) {
                        continue;
                    }
                }
                if (connection.m20077i(c17334a, list)) {
                    call.m20060b(connection);
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public int m4025c(C18795k c18795k, long j10) {
        byte[] bArr = AbstractC17708b.f56536a;
        ArrayList arrayList = c18795k.f59753p;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                String str = "A connection to " + c18795k.f59739b.f55191a.f55209i + " was leaked. Did you forget to close a response body?";
                C20407n c20407n = C20407n.f64525a;
                C20407n.f64525a.mo21058k(((C18790f) reference).f59716a, str);
                arrayList.remove(i10);
                c18795k.f59747j = true;
                if (arrayList.isEmpty()) {
                    c18795k.f59754q = j10 - this.f9586Y;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    /* JADX INFO: renamed from: d */
    public void m4026d(boolean z6) {
        long jNanoTime = System.nanoTime() - this.f9586Y;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("execution_time", Long.valueOf(jNanoTime));
        linkedHashMap.put("operation_name", (String) this.f9588o0);
        linkedHashMap.put("caller_class", (String) this.f9589p0);
        linkedHashMap.put("is_successful", Boolean.valueOf(z6));
        linkedHashMap.put("metric_type", "method called");
        ((C17878e) ((InterfaceC11256c) this.f9587Z)).m19604c(C18305c.f58431p0, linkedHashMap, 100.0f);
    }

    public C3179x(InterfaceC11256c internalLogger, String str, String str2) {
        long jNanoTime = System.nanoTime();
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f9587Z = internalLogger;
        this.f9588o0 = str;
        this.f9589p0 = str2;
        this.f9586Y = jNanoTime;
    }

    public C3179x(C18530d taskRunner, TimeUnit timeUnit) {
        AbstractC16544l.m18094g(taskRunner, "taskRunner");
        this.f9586Y = timeUnit.toNanos(5L);
        this.f9587Z = taskRunner.m19897e();
        this.f9588o0 = new C18528b(this, AbstractC9306j0.m9891j(AbstractC17708b.f56542g, " ConnectionPool", new StringBuilder()));
        this.f9589p0 = new ConcurrentLinkedQueue();
    }

    public C3179x(C3179x c3179x) {
        this.f9587Z = DesugarCollections.unmodifiableList((ArrayList) c3179x.f9587Z);
        this.f9588o0 = DesugarCollections.unmodifiableList((ArrayList) c3179x.f9588o0);
        this.f9589p0 = DesugarCollections.unmodifiableList((ArrayList) c3179x.f9589p0);
        this.f9586Y = c3179x.f9586Y;
    }

    public C3179x(C3134a0 c3134a0) {
        ArrayList arrayList = new ArrayList();
        this.f9587Z = arrayList;
        this.f9588o0 = new ArrayList();
        this.f9589p0 = new ArrayList();
        this.f9586Y = 5000L;
        arrayList.add(c3134a0);
    }
}
