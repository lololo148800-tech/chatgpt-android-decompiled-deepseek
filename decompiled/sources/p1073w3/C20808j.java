package p1073w3;

import p001A.C0095w0;

/* JADX INFO: renamed from: w3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C20808j {

    /* JADX INFO: renamed from: a */
    public final Object f66079a;

    /* JADX INFO: renamed from: b */
    public C0095w0 f66080b = new C0095w0(12);

    /* JADX INFO: renamed from: c */
    public boolean f66081c;

    /* JADX INFO: renamed from: d */
    public boolean f66082d;

    public C20808j(Object obj) {
        this.f66079a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20808j.class != obj.getClass()) {
            return false;
        }
        return this.f66079a.equals(((C20808j) obj).f66079a);
    }

    public final int hashCode() {
        return this.f66079a.hashCode();
    }
}
