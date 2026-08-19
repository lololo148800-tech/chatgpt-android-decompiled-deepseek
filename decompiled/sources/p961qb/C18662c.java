package p961qb;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: qb.c */
/* JADX INFO: loaded from: classes.dex */
public final class C18662c {

    /* JADX INFO: renamed from: a */
    public final String f59417a;

    /* JADX INFO: renamed from: b */
    public final Map f59418b;

    public C18662c(String str, Map map) {
        this.f59417a = str;
        this.f59418b = map;
    }

    /* JADX INFO: renamed from: b */
    public static C18662c m20036b(String str) {
        return new C18662c(str, Collections.emptyMap());
    }

    /* JADX INFO: renamed from: a */
    public final Annotation m20037a(Class cls) {
        return (Annotation) this.f59418b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18662c)) {
            return false;
        }
        C18662c c18662c = (C18662c) obj;
        return this.f59417a.equals(c18662c.f59417a) && this.f59418b.equals(c18662c.f59418b);
    }

    public final int hashCode() {
        return this.f59418b.hashCode() + (this.f59417a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f59417a + ", properties=" + this.f59418b.values() + "}";
    }
}
