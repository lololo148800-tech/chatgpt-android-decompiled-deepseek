package p537W0;

import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC7966P5;

/* JADX INFO: renamed from: W0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8412d {

    /* JADX INFO: renamed from: a */
    public int f26158a;

    public C8412d(int i10) {
        this.f26158a = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRef(element = ");
        sb2.append(this.f26158a);
        sb2.append(")@");
        int iHashCode = hashCode();
        AbstractC7966P5.m8254b(16);
        String string = Integer.toString(iHashCode, 16);
        AbstractC16544l.m18093f(string, "toString(this, checkRadix(radix))");
        sb2.append(string);
        return sb2.toString();
    }
}
