package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C15516w {

    /* JADX INFO: renamed from: g */
    public static final HashMap f48465g;

    /* JADX INFO: renamed from: a */
    public final HashMap f48466a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final ArrayList f48467b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public C15180a f48468c = null;

    /* JADX INFO: renamed from: d */
    public C15180a f48469d = null;

    /* JADX INFO: renamed from: e */
    public C15180a f48470e = null;

    /* JADX INFO: renamed from: f */
    public C15128H0 f48471f = null;

    static {
        HashMap map = new HashMap();
        f48465g = map;
        map.put("boolean", Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put("long", Long.class);
        map.put("float", Float.class);
        map.put("double", Double.class);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m16727a() {
        try {
            Iterator it = this.f48466a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() == null || !((String) entry.getKey()).startsWith("sentry:")) {
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Object m16728b(Class cls, String str) {
        Object obj = this.f48466a.get(str);
        if (cls.isInstance(obj)) {
            return obj;
        }
        Class cls2 = (Class) f48465g.get(cls.getCanonicalName());
        if (obj == null || !cls.isPrimitive() || cls2 == null || !cls2.isInstance(obj)) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m16729c(String str, Object obj) {
        this.f48466a.put(str, obj);
    }
}
