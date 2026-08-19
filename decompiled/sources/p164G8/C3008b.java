package p164G8;

import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import hm.InterfaceC14538c;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import p1021t8.C19813d;
import p187H8.AbstractC3263a;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: G8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3008b implements InterfaceC14538c {

    /* JADX INFO: renamed from: p */
    public static final Map f9037p = Collections.emptyMap();

    /* JADX INFO: renamed from: a */
    public final C19813d f9038a;

    /* JADX INFO: renamed from: b */
    public final C3013g f9039b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f9040c;

    /* JADX INFO: renamed from: d */
    public final BigInteger f9041d;

    /* JADX INFO: renamed from: e */
    public final C3014h f9042e;

    /* JADX INFO: renamed from: f */
    public final BigInteger f9043f;

    /* JADX INFO: renamed from: g */
    public final ConcurrentHashMap f9044g;

    /* JADX INFO: renamed from: h */
    public volatile String f9045h;

    /* JADX INFO: renamed from: i */
    public volatile String f9046i;

    /* JADX INFO: renamed from: j */
    public volatile String f9047j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f9048k;

    /* JADX INFO: renamed from: l */
    public boolean f9049l;

    /* JADX INFO: renamed from: m */
    public final String f9050m;

    /* JADX INFO: renamed from: n */
    public final AtomicReference f9051n;

    /* JADX INFO: renamed from: o */
    public final Map f9052o;

    public C3008b(BigInteger bigInteger, C3014h c3014h, BigInteger bigInteger2, String str, String str2, int i10, String str3, Map map, LinkedHashMap linkedHashMap, C3013g c3013g, C19813d c19813d, Map map2) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f9044g = concurrentHashMap;
        this.f9049l = false;
        this.f9051n = new AtomicReference();
        String name = Thread.currentThread().getName();
        long id2 = Thread.currentThread().getId();
        this.f9038a = c19813d;
        this.f9039b = c3013g;
        this.f9041d = bigInteger;
        this.f9042e = c3014h;
        this.f9043f = bigInteger2;
        if (map == null) {
            this.f9040c = new ConcurrentHashMap(0);
        } else {
            this.f9040c = new ConcurrentHashMap(map);
        }
        if (linkedHashMap != null) {
            concurrentHashMap.putAll(linkedHashMap);
        }
        this.f9052o = map2;
        m3844g(str);
        this.f9047j = str2;
        this.f9046i = null;
        this.f9048k = false;
        this.f9050m = str3;
        if (i10 != Integer.MIN_VALUE) {
            m3843f(i10);
        }
        if (str3 != null) {
            concurrentHashMap.put("_dd.origin", str3);
        }
        concurrentHashMap.put("thread.name", name);
        concurrentHashMap.put("thread.id", Long.valueOf(id2));
    }

    @Override // hm.InterfaceC14538c
    /* JADX INFO: renamed from: a */
    public final String mo3838a() {
        return this.f9042e.toString();
    }

    /* JADX INFO: renamed from: b */
    public final Map m3839b() {
        Map map = (Map) this.f9051n.get();
        return map == null ? f9037p : map;
    }

    /* JADX INFO: renamed from: c */
    public final int m3840c() {
        C3008b c3008b;
        C3007a c3007aM3858p = this.f9039b.m3858p();
        if (c3007aM3858p != null && (c3008b = c3007aM3858p.f9032a) != this) {
            return c3008b.m3840c();
        }
        Number number = (Number) m3839b().get("_sampling_priority_v1");
        if (number == null) {
            return Integer.MIN_VALUE;
        }
        return number.intValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3841d() {
        boolean z6;
        C3008b c3008b;
        C3007a c3007aM3858p = this.f9039b.m3858p();
        if (c3007aM3858p != null && (c3008b = c3007aM3858p.f9032a) != this) {
            return c3008b.m3841d();
        }
        synchronized (this) {
            try {
                if (m3839b().get("_sampling_priority_v1") != null && !this.f9049l) {
                    this.f9049l = true;
                }
                z6 = this.f9049l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z6;
    }

    /* JADX INFO: renamed from: e */
    public final void m3842e(Number number, String str) {
        AtomicReference atomicReference = this.f9051n;
        if (atomicReference.get() == null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            while (!atomicReference.compareAndSet(null, concurrentHashMap) && atomicReference.get() == null) {
            }
        }
        if (number instanceof Float) {
            ((Map) atomicReference.get()).put(str, Double.valueOf(number.doubleValue()));
        } else {
            ((Map) atomicReference.get()).put(str, number);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3843f(int i10) {
        C3007a c3007aM3858p;
        C3008b c3008b;
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        C3013g c3013g = this.f9039b;
        if (c3013g != null && (c3007aM3858p = c3013g.m3858p()) != null && (c3008b = c3007aM3858p.f9032a) != this) {
            return c3008b.m3843f(i10);
        }
        synchronized (this) {
            try {
                if (this.f9049l) {
                    return false;
                }
                m3842e(Integer.valueOf(i10), "_sampling_priority_v1");
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3844g(String str) {
        if (this.f9052o.containsKey(str)) {
            this.f9045h = (String) this.f9052o.get(str);
        } else {
            this.f9045h = str;
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m3845h(String str, Serializable serializable) {
        if (serializable != null) {
            try {
                if (!(serializable instanceof String) || !((String) serializable).isEmpty()) {
                    List list = (List) this.f9038a.f9073v0.get(str);
                    boolean zMo4147a = true;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            zMo4147a &= ((AbstractC3263a) it.next()).mo4147a(this, serializable);
                        }
                    }
                    if (zMo4147a) {
                        this.f9044g.put(str, serializable);
                    }
                    return;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f9044g.remove(str);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DDSpan [ t_id=");
        sb2.append(this.f9041d);
        sb2.append(", s_id=");
        sb2.append(this.f9042e);
        sb2.append(", p_id=");
        sb2.append(this.f9043f);
        sb2.append("] trace=");
        sb2.append(this.f9045h);
        String str = lZYtIbClQJm.XDGMsnLkBpxb;
        sb2.append(str);
        sb2.append(this.f9047j);
        sb2.append(str);
        sb2.append((this.f9046i == null || this.f9046i.isEmpty()) ? this.f9047j : this.f9046i);
        sb2.append(" metrics=");
        sb2.append(new TreeMap(m3839b()));
        if (this.f9048k) {
            sb2.append(" *errored*");
        }
        sb2.append(" tags=");
        sb2.append(new TreeMap(this.f9044g));
        return sb2.toString();
    }
}
