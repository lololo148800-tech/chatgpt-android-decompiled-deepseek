package p813ij;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: ij.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C15022f {

    /* JADX INFO: renamed from: a */
    public final ArrayList f46719a;

    /* JADX INFO: renamed from: b */
    public final Object f46720b;

    /* JADX INFO: renamed from: c */
    public final List f46721c;

    public C15022f(Object bottom, List rest) {
        AbstractC16544l.m18094g(bottom, "bottom");
        AbstractC16544l.m18094g(rest, "rest");
        ArrayList arrayListM19361k0 = AbstractC17680n.m19361k0(rest, AbstractC9393x3.m9974d(bottom));
        this.f46719a = arrayListM19361k0;
        this.f46720b = AbstractC17680n.m19351a0(arrayListM19361k0);
        this.f46721c = arrayListM19361k0.subList(0, arrayListM19361k0.size() - 1);
    }

    public final boolean equals(Object obj) {
        C15022f c15022f = obj instanceof C15022f ? (C15022f) obj : null;
        return AbstractC16544l.m18089b(c15022f != null ? c15022f.f46719a : null, this.f46719a);
    }

    public final int hashCode() {
        return this.f46719a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) C15022f.class.getSimpleName());
        sb2.append('(');
        sb2.append(this.f46719a);
        sb2.append(')');
        return sb2.toString();
    }
}
