package p950po;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: po.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC18527a {

    /* JADX INFO: renamed from: a */
    public final String f59027a;

    /* JADX INFO: renamed from: b */
    public final boolean f59028b;

    /* JADX INFO: renamed from: c */
    public C18529c f59029c;

    /* JADX INFO: renamed from: d */
    public long f59030d;

    public AbstractC18527a(String name, boolean z6) {
        AbstractC16544l.m18094g(name, "name");
        this.f59027a = name;
        this.f59028b = z6;
        this.f59030d = -1L;
    }

    /* JADX INFO: renamed from: a */
    public abstract long mo19887a();

    public final String toString() {
        return this.f59027a;
    }
}
