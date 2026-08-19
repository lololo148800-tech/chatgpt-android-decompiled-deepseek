package to;

import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0678l;
import p959q8.C18639a;

/* JADX INFO: renamed from: to.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C20011b {

    /* JADX INFO: renamed from: d */
    public static final C0678l f63330d;

    /* JADX INFO: renamed from: e */
    public static final C0678l f63331e;

    /* JADX INFO: renamed from: f */
    public static final C0678l f63332f;

    /* JADX INFO: renamed from: g */
    public static final C0678l f63333g;

    /* JADX INFO: renamed from: h */
    public static final C0678l f63334h;

    /* JADX INFO: renamed from: i */
    public static final C0678l f63335i;

    /* JADX INFO: renamed from: a */
    public final C0678l f63336a;

    /* JADX INFO: renamed from: b */
    public final C0678l f63337b;

    /* JADX INFO: renamed from: c */
    public final int f63338c;

    static {
        C0678l c0678l = C0678l.f1971p0;
        f63330d = C18639a.m19996n(":");
        f63331e = C18639a.m19996n(":status");
        f63332f = C18639a.m19996n(":method");
        f63333g = C18639a.m19996n(":path");
        f63334h = C18639a.m19996n(":scheme");
        f63335i = C18639a.m19996n(":authority");
    }

    public C20011b(C0678l name, C0678l value) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(value, "value");
        this.f63336a = name;
        this.f63337b = value;
        this.f63338c = value.mo1372d() + name.mo1372d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20011b)) {
            return false;
        }
        C20011b c20011b = (C20011b) obj;
        return AbstractC16544l.m18089b(this.f63336a, c20011b.f63336a) && AbstractC16544l.m18089b(this.f63337b, c20011b.f63337b);
    }

    public final int hashCode() {
        return this.f63337b.hashCode() + (this.f63336a.hashCode() * 31);
    }

    public final String toString() {
        return this.f63336a.m1452r() + ": " + this.f63337b.m1452r();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C20011b(String name, String value) {
        this(C18639a.m19996n(name), C18639a.m19996n(value));
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(value, "value");
        C0678l c0678l = C0678l.f1971p0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C20011b(C0678l name, String value) {
        this(name, C18639a.m19996n(value));
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(value, "value");
        C0678l c0678l = C0678l.f1971p0;
    }
}
