package p917o6;

import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9172M3;

/* JADX INFO: renamed from: o6.L */
/* JADX INFO: loaded from: classes.dex */
public final class C17844L extends AbstractC9172M3 {

    /* JADX INFO: renamed from: a */
    public final Object f56901a;

    public C17844L(Object obj) {
        this.f56901a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17844L) && AbstractC16544l.m18089b(this.f56901a, ((C17844L) obj).f56901a);
    }

    public final int hashCode() {
        Object obj = this.f56901a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Present(value=" + this.f56901a + ')';
    }
}
