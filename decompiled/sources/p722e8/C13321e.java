package p722e8;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p228J.AbstractC3794B0;
import p499U9.C7591u;
import p523V9.AbstractC8119j5;
import p571X9.AbstractC9150J;
import p592Y7.AbstractC9667b;
import p592Y7.EnumC9668c;
import p676c7.C11685d;
import p677c8.C11689a;
import p677c8.C11691c;
import p743f7.InterfaceC13575a;
import p765g7.InterfaceC13823a;
import p804i8.C14945d;
import p888m8.C17198c;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17686t;
import p919o8.C17885C;
import p919o8.EnumC17888D;

/* JADX INFO: renamed from: e8.e */
/* JADX INFO: loaded from: classes.dex */
public final class C13321e implements InterfaceC13303M {

    /* JADX INFO: renamed from: a */
    public final C13315Z f42228a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13823a f42229b;

    /* JADX INFO: renamed from: c */
    public final boolean f42230c;

    /* JADX INFO: renamed from: d */
    public final C7591u f42231d;

    /* JADX INFO: renamed from: e */
    public final boolean f42232e;

    /* JADX INFO: renamed from: f */
    public final float f42233f;

    /* JADX INFO: renamed from: g */
    public final long f42234g;

    /* JADX INFO: renamed from: h */
    public final long f42235h;

    /* JADX INFO: renamed from: i */
    public final long f42236i;

    /* JADX INFO: renamed from: j */
    public final String f42237j;

    /* JADX INFO: renamed from: k */
    public EnumC9668c f42238k;

    /* JADX INFO: renamed from: l */
    public String f42239l;

    /* JADX INFO: renamed from: m */
    public final long f42240m;

    /* JADX INFO: renamed from: n */
    public long f42241n;

    /* JADX INFO: renamed from: o */
    public final C11685d f42242o;

    /* JADX INFO: renamed from: p */
    public final LinkedHashMap f42243p;

    /* JADX INFO: renamed from: q */
    public final ArrayList f42244q;

    /* JADX INFO: renamed from: r */
    public long f42245r;

    /* JADX INFO: renamed from: s */
    public long f42246s;

    /* JADX INFO: renamed from: t */
    public long f42247t;

    /* JADX INFO: renamed from: u */
    public long f42248u;

    /* JADX INFO: renamed from: v */
    public boolean f42249v;

    /* JADX INFO: renamed from: w */
    public boolean f42250w;

    public C13321e(C13315Z c13315z, InterfaceC13823a interfaceC13823a, boolean z6, C11691c c11691c, EnumC9668c enumC9668c, String str, Map map, long j10, C7591u c7591u, boolean z10, float f10) {
        this.f42228a = c13315z;
        this.f42229b = interfaceC13823a;
        this.f42230c = z6;
        this.f42231d = c7591u;
        this.f42232e = z10;
        this.f42233f = f10;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f42234g = timeUnit.toNanos(100L);
        this.f42235h = timeUnit.toNanos(5000L);
        this.f42236i = c11691c.f35476a + j10;
        this.f42237j = AbstractC3794B0.m4498w("randomUUID().toString()");
        this.f42238k = enumC9668c;
        this.f42239l = str;
        long j11 = c11691c.f35477b;
        this.f42240m = j11;
        this.f42241n = j11;
        this.f42242o = interfaceC13823a.mo15450f();
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(map);
        linkedHashMapM19256r.putAll(AbstractC9667b.m10254a(interfaceC13823a).mo10255k());
        this.f42243p = linkedHashMapM19256r;
        this.f42244q = new ArrayList();
    }

    @Override // p722e8.InterfaceC13303M
    /* JADX INFO: renamed from: a */
    public final boolean mo14926a() {
        return !this.f42250w;
    }

    @Override // p722e8.InterfaceC13303M
    /* JADX INFO: renamed from: b */
    public final InterfaceC13303M mo14927b(AbstractC8119j5 event, InterfaceC13575a writer) {
        Object next;
        Object next2;
        AbstractC16544l.m18094g(event, "event");
        AbstractC16544l.m18094g(writer, "writer");
        long j10 = event.mo8622a().f35477b;
        boolean z6 = false;
        boolean z10 = j10 - this.f42241n > this.f42234g;
        boolean z11 = j10 - this.f42240m > this.f42235h;
        ArrayList arrayList = this.f42244q;
        AbstractC17686t.m19393A(arrayList, C13318b.f42211Y);
        if (this.f42230c && !this.f42250w) {
            z6 = true;
        }
        if (z10 && arrayList.isEmpty() && !z6) {
            m14936c(this.f42241n, writer);
        } else if (z11) {
            m14936c(j10, writer);
        } else if (event instanceof C13339w) {
            m14936c(this.f42241n, writer);
        } else if ((event instanceof C13291A) || (event instanceof C13295E)) {
            arrayList.clear();
            m14936c(j10, writer);
        } else if (event instanceof C13292B) {
            C13292B c13292b = (C13292B) event;
            EnumC9668c enumC9668c = c13292b.f42011b;
            if (enumC9668c != null) {
                this.f42238k = enumC9668c;
            }
            this.f42239l = "";
            this.f42243p.putAll(c13292b.f42012c);
            this.f42250w = true;
            this.f42241n = j10;
        } else if (event instanceof C13342z) {
            this.f42241n = j10;
            this.f42245r++;
            arrayList.add(new WeakReference(((C13342z) event).f42323b));
        } else if (event instanceof C13293C) {
            C13293C c13293c = (C13293C) event;
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!AbstractC16544l.m18089b(((WeakReference) next2).get(), c13293c.f42014b));
            WeakReference weakReference = (WeakReference) next2;
            if (weakReference != null) {
                arrayList.remove(weakReference);
                this.f42241n = j10;
            }
        } else if (event instanceof C13326j) {
            this.f42241n = j10;
            this.f42246s++;
            if (((C13326j) event).f42282f) {
                this.f42247t++;
                m14936c(j10, writer);
            }
        } else if (event instanceof C13294D) {
            C13294D c13294d = (C13294D) event;
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!AbstractC16544l.m18089b(((WeakReference) next).get(), c13294d.f42020b));
            WeakReference weakReference2 = (WeakReference) next;
            if (weakReference2 != null) {
                arrayList.remove(weakReference2);
                this.f42241n = j10;
                this.f42245r--;
                this.f42246s++;
            }
        } else if (event instanceof C13328l) {
            this.f42241n = j10;
            this.f42248u++;
        }
        if (this.f42249v) {
            return null;
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final void m14936c(long j10, InterfaceC13575a interfaceC13575a) {
        String str;
        if (this.f42249v) {
            return;
        }
        EnumC9668c enumC9668c = this.f42238k;
        LinkedHashMap linkedHashMap = this.f42243p;
        InterfaceC13823a interfaceC13823a = this.f42229b;
        linkedHashMap.putAll(AbstractC9667b.m10254a(interfaceC13823a).mo10255k());
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(linkedHashMap);
        C11689a c11689aM14932d = this.f42228a.m14932d();
        String str2 = this.f42239l;
        long j11 = this.f42246s;
        long j12 = this.f42247t;
        long j13 = this.f42248u;
        long j14 = this.f42245r;
        String str3 = c11689aM14932d.f35464h;
        C17885C c17885c = (str3 == null || AbstractC21322p.m21681O(str3) || (str = c11689aM14932d.f35465i) == null || AbstractC21322p.m21681O(str)) ? null : new C17885C(str3, str, null);
        int i10 = c17885c == null ? 1 : 2;
        ArrayList arrayList = new ArrayList();
        if (this.f42232e && j11 > 0 && enumC9668c == EnumC9668c.f29148Y) {
            arrayList.add(EnumC17888D.ERROR_TAP);
        }
        C17198c c17198cM9697b = AbstractC9150J.m9697b(interfaceC13823a, interfaceC13575a, 1, new C13319c(this, c11689aM14932d, enumC9668c, str2, j11, j12, j13, j14, j10, arrayList, i10, linkedHashMapM19256r, c17885c));
        C14945d c14945d = new C14945d(arrayList.size());
        c17198cM9697b.f54904e = new C13320d(c11689aM14932d, c14945d, 0);
        c17198cM9697b.f54905f = new C13320d(c11689aM14932d, c14945d, 1);
        c17198cM9697b.m18940m();
        this.f42249v = true;
    }
}
