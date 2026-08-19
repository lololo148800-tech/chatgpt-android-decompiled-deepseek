package p578Xg;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Xg.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C9513a {

    /* JADX INFO: renamed from: a */
    public final List f28635a;

    /* JADX INFO: renamed from: b */
    public final List f28636b;

    public C9513a(List list) {
        this.f28635a = list;
        this.f28636b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9513a) && AbstractC16544l.m18089b(this.f28636b, ((C9513a) obj).f28636b);
    }

    public final int hashCode() {
        return this.f28636b.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
