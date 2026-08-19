package p817j$.util.concurrent;

import java.util.Map;

/* JADX INFO: renamed from: j$.util.concurrent.l */
/* JADX INFO: loaded from: classes4.dex */
class C15693l implements Map.Entry {

    /* JADX INFO: renamed from: a */
    final int f48916a;

    /* JADX INFO: renamed from: b */
    final Object f48917b;

    /* JADX INFO: renamed from: c */
    volatile Object f48918c;

    /* JADX INFO: renamed from: d */
    volatile C15693l f48919d;

    C15693l(int i10, Object obj, Object obj2) {
        this.f48916a = i10;
        this.f48917b = obj;
        this.f48918c = obj2;
    }

    C15693l(int i10, Object obj, Object obj2, C15693l c15693l) {
        this(i10, obj, obj2);
        this.f48919d = c15693l;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f48917b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f48918c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f48917b.hashCode() ^ this.f48918c.hashCode();
    }

    public final String toString() {
        return AbstractC15702u.m17333b(this.f48917b, this.f48918c);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f48917b) || key.equals(obj2)) && (value == (obj3 = this.f48918c) || value.equals(obj3));
    }

    /* JADX INFO: renamed from: a */
    C15693l mo17321a(int i10, Object obj) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        C15693l c15693l = this;
        do {
            if (c15693l.f48916a == i10 && ((obj2 = c15693l.f48917b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return c15693l;
            }
            c15693l = c15693l.f48919d;
        } while (c15693l != null);
        return null;
    }
}
