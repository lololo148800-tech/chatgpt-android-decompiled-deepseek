package p262K8;

import hm.InterfaceC14536a;
import hm.InterfaceC14537b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import p211I8.C3652b;

/* JADX INFO: renamed from: K8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4550a {

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal f14872e = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final LinkedList f14873a = new LinkedList();

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f14874b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public final int f14875c;

    /* JADX INFO: renamed from: d */
    public final C3652b f14876d;

    public C4550a(int i10, C3652b c3652b) {
        this.f14875c = i10;
        this.f14876d = c3652b;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC14536a m5317a() {
        synchronized (this.f14873a) {
            Iterator it = this.f14873a.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
        }
        return (InterfaceC14536a) f14872e.get();
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC14537b m5318b() {
        synchronized (this.f14873a) {
            Iterator it = this.f14873a.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
        }
        InterfaceC4552c interfaceC4552c = (InterfaceC4552c) f14872e.get();
        if (interfaceC4552c == null) {
            return null;
        }
        return interfaceC4552c.mo5320q0();
    }
}
