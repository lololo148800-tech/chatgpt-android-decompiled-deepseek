package p429Re;

import kotlin.jvm.internal.AbstractC16544l;
import p204I1.C3590f;
import p467T1.C7199i;

/* JADX INFO: renamed from: Re.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C6875i {

    /* JADX INFO: renamed from: a */
    public final C3590f f22045a;

    /* JADX INFO: renamed from: b */
    public final int f22046b;

    /* JADX INFO: renamed from: c */
    public final boolean f22047c;

    public C6875i(C3590f text, int i10, boolean z6, int i11) {
        i10 = (i11 & 2) != 0 ? 5 : i10;
        z6 = (i11 & 4) != 0 ? false : z6;
        AbstractC16544l.m18094g(text, "text");
        this.f22045a = text;
        this.f22046b = i10;
        this.f22047c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6875i)) {
            return false;
        }
        C6875i c6875i = (C6875i) obj;
        return AbstractC16544l.m18089b(this.f22045a, c6875i.f22045a) && C7199i.m7596a(this.f22046b, c6875i.f22046b) && this.f22047c == c6875i.f22047c;
    }

    public final int hashCode() {
        return (((this.f22045a.hashCode() * 31) + this.f22046b) * 31) + (this.f22047c ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
