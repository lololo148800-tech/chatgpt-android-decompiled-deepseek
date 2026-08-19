package p817j$.time.zone;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p817j$.util.Objects;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.zone.i */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15649i {

    /* JADX INFO: renamed from: a */
    private static final CopyOnWriteArrayList f48836a;

    /* JADX INFO: renamed from: b */
    private static final ConcurrentHashMap f48837b;

    /* JADX INFO: renamed from: c */
    private static volatile Set f48838c;

    /* JADX INFO: renamed from: c */
    protected abstract ZoneRules mo17225c(String str);

    /* JADX INFO: renamed from: d */
    protected abstract Set mo17226d();

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f48836a = copyOnWriteArrayList;
        f48837b = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new C15647g(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static Set m17227a() {
        return f48838c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static ZoneRules m17228b(String str, boolean z6) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = f48837b;
        AbstractC15649i abstractC15649i = (AbstractC15649i) concurrentHashMap.get(str);
        if (abstractC15649i != null) {
            return abstractC15649i.mo17225c(str);
        }
        if (concurrentHashMap.isEmpty()) {
            throw new C15646f("No time-zone data files registered");
        }
        throw new C15646f("Unknown time-zone ID: " + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static void m17229e(AbstractC15649i abstractC15649i) {
        Objects.requireNonNull(abstractC15649i, "provider");
        synchronized (AbstractC15649i.class) {
            try {
                for (String str : abstractC15649i.mo17226d()) {
                    Objects.requireNonNull(str, "zoneId");
                    if (((AbstractC15649i) f48837b.putIfAbsent(str, abstractC15649i)) != null) {
                        throw new C15646f("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + abstractC15649i);
                    }
                }
                f48838c = Collections.unmodifiableSet(new HashSet(f48837b.keySet()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f48836a.add(abstractC15649i);
    }
}
