package p796i0;

import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: i0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C14894a {

    /* JADX INFO: renamed from: b */
    public static final C14894a f46384b = new C14894a("text/*");

    /* JADX INFO: renamed from: c */
    public static final C14894a f46385c = new C14894a("*/*");

    /* JADX INFO: renamed from: a */
    public final String f46386a;

    public C14894a(String str) {
        this.f46386a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14894a)) {
            return false;
        }
        return AbstractC16544l.m18089b(this.f46386a, ((C14894a) obj).f46386a);
    }

    public final int hashCode() {
        return this.f46386a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f46386a, "')", new StringBuilder("MediaType(representation='"));
    }
}
