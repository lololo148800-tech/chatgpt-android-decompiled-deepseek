package p465T;

import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: T.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7165a {

    /* JADX INFO: renamed from: a */
    public final String f22770a;

    /* JADX INFO: renamed from: b */
    public final String f22771b;

    /* JADX INFO: renamed from: c */
    public final String f22772c;

    /* JADX INFO: renamed from: d */
    public final String f22773d;

    public C7165a(String str, String str2, String str3, String str4) {
        this.f22770a = str;
        this.f22771b = str2;
        this.f22772c = str3;
        this.f22773d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7165a)) {
            return false;
        }
        C7165a c7165a = (C7165a) obj;
        return this.f22770a.equals(c7165a.f22770a) && this.f22771b.equals(c7165a.f22771b) && this.f22772c.equals(c7165a.f22772c) && this.f22773d.equals(c7165a.f22773d);
    }

    public final int hashCode() {
        return ((((((this.f22770a.hashCode() ^ 1000003) * 1000003) ^ this.f22771b.hashCode()) * 1000003) ^ this.f22772c.hashCode()) * 1000003) ^ this.f22773d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb2.append(this.f22770a);
        sb2.append(", eglVersion=");
        sb2.append(this.f22771b);
        sb2.append(", glExtensions=");
        sb2.append(this.f22772c);
        sb2.append(", eglExtensions=");
        return AbstractC9306j0.m9891j(this.f22773d, "}", sb2);
    }
}
