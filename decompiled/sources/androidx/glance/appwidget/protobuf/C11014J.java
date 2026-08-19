package androidx.glance.appwidget.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.J */
/* JADX INFO: loaded from: classes.dex */
public final class C11014J {
    /* JADX INFO: renamed from: a */
    public static void m11873a(Object obj, Object obj2) {
        C11013I c11013i = (C11013I) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        if (c11013i.isEmpty()) {
            return;
        }
        Iterator it = c11013i.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C11013I m11874b(Object obj, Object obj2) {
        C11013I c11013iM11872c = (C11013I) obj;
        C11013I c11013i = (C11013I) obj2;
        if (!c11013i.isEmpty()) {
            if (!c11013iM11872c.f33242Y) {
                c11013iM11872c = c11013iM11872c.m11872c();
            }
            c11013iM11872c.m11871b();
            if (!c11013i.isEmpty()) {
                c11013iM11872c.putAll(c11013i);
            }
        }
        return c11013iM11872c;
    }

    /* JADX INFO: renamed from: c */
    public static void m11875c(Object obj) {
        ((C11013I) obj).f33242Y = false;
    }
}
