package p109E3;

import p105E.C2224c;

/* JADX INFO: renamed from: E3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2288l {

    /* JADX INFO: renamed from: d */
    public static final C2288l f7073d = new C2224c().m3264a();

    /* JADX INFO: renamed from: a */
    public final boolean f7074a;

    /* JADX INFO: renamed from: b */
    public final boolean f7075b;

    /* JADX INFO: renamed from: c */
    public final boolean f7076c;

    public C2288l(C2224c c2224c) {
        this.f7074a = c2224c.f6808a;
        this.f7075b = c2224c.f6809b;
        this.f7076c = c2224c.f6810c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2288l.class != obj.getClass()) {
            return false;
        }
        C2288l c2288l = (C2288l) obj;
        return this.f7074a == c2288l.f7074a && this.f7075b == c2288l.f7075b && this.f7076c == c2288l.f7076c;
    }

    public final int hashCode() {
        return ((this.f7074a ? 1 : 0) << 2) + ((this.f7075b ? 1 : 0) << 1) + (this.f7076c ? 1 : 0);
    }
}
