package p926of;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: of.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C18146I implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final List f57888a;

    /* JADX INFO: renamed from: b */
    public final int f57889b;

    /* JADX INFO: renamed from: c */
    public final boolean f57890c;

    /* JADX INFO: renamed from: d */
    public final boolean f57891d;

    public C18146I(List list, int i10, int i11) {
        i10 = (i11 & 2) != 0 ? 0 : i10;
        boolean z6 = (i11 & 4) != 0;
        boolean z10 = (i11 & 8) != 0;
        this.f57888a = list;
        this.f57889b = i10;
        this.f57890c = z6;
        this.f57891d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18146I)) {
            return false;
        }
        C18146I c18146i = (C18146I) obj;
        return AbstractC16544l.m18089b(this.f57888a, c18146i.f57888a) && this.f57889b == c18146i.f57889b && this.f57890c == c18146i.f57890c && this.f57891d == c18146i.f57891d;
    }

    public final int hashCode() {
        return (((((this.f57888a.hashCode() * 31) + this.f57889b) * 31) + (this.f57890c ? 1231 : 1237)) * 31) + (this.f57891d ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
