package p1143z4;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: z4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C21776f {

    /* JADX INFO: renamed from: a */
    public final AbstractC21767I f69067a;

    /* JADX INFO: renamed from: b */
    public final boolean f69068b;

    /* JADX INFO: renamed from: c */
    public final boolean f69069c;

    /* JADX INFO: renamed from: d */
    public final Object f69070d;

    public C21776f(AbstractC21767I abstractC21767I, boolean z6, Object obj, boolean z10) {
        if (!abstractC21767I.f69050a && z6) {
            throw new IllegalArgumentException(abstractC21767I.mo5894b().concat(" does not allow nullable values").toString());
        }
        if (!z6 && z10 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + abstractC21767I.mo5894b() + " has null value but is not nullable.").toString());
        }
        this.f69067a = abstractC21767I;
        this.f69068b = z6;
        this.f69070d = obj;
        this.f69069c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C21776f.class.equals(obj.getClass())) {
            return false;
        }
        C21776f c21776f = (C21776f) obj;
        if (this.f69068b != c21776f.f69068b || this.f69069c != c21776f.f69069c || !this.f69067a.equals(c21776f.f69067a)) {
            return false;
        }
        Object obj2 = c21776f.f69070d;
        Object obj3 = this.f69070d;
        if (obj3 != null) {
            return obj3.equals(obj2);
        }
        return obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f69067a.hashCode() * 31) + (this.f69068b ? 1 : 0)) * 31) + (this.f69069c ? 1 : 0)) * 31;
        Object obj = this.f69070d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C21776f.class.getSimpleName());
        sb2.append(" Type: " + this.f69067a);
        sb2.append(" Nullable: " + this.f69068b);
        if (this.f69069c) {
            sb2.append(" DefaultValue: " + this.f69070d);
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "sb.toString()");
        return string;
    }
}
