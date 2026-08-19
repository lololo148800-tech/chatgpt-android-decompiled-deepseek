package p467T1;

import java.util.ArrayList;
import p571X9.AbstractC9306j0;
import p594Y9.AbstractC9918k3;

/* JADX INFO: renamed from: T1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C7200j {

    /* JADX INFO: renamed from: b */
    public static final C7200j f22863b = new C7200j(0);

    /* JADX INFO: renamed from: c */
    public static final C7200j f22864c = new C7200j(1);

    /* JADX INFO: renamed from: d */
    public static final C7200j f22865d = new C7200j(2);

    /* JADX INFO: renamed from: a */
    public final int f22866a;

    public C7200j(int i10) {
        this.f22866a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7200j) {
            return this.f22866a == ((C7200j) obj).f22866a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22866a;
    }

    public final String toString() {
        int i10 = this.f22866a;
        if (i10 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return AbstractC9306j0.m9892k(new StringBuilder("TextDecoration["), AbstractC9918k3.m10573a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
