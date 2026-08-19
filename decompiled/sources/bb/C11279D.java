package bb;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: bb.D */
/* JADX INFO: loaded from: classes.dex */
public final class C11279D {

    /* JADX INFO: renamed from: a */
    public final Object f34163a;

    /* JADX INFO: renamed from: b */
    public final Object f34164b;

    /* JADX INFO: renamed from: c */
    public final Object f34165c;

    public C11279D(Object obj, Object obj2, Object obj3) {
        this.f34163a = obj;
        this.f34164b = obj2;
        this.f34165c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m12700a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f34163a;
        sb2.append(obj);
        sb2.append(Separators.EQUALS);
        sb2.append(this.f34164b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append(Separators.EQUALS);
        sb2.append(this.f34165c);
        return new IllegalArgumentException(sb2.toString());
    }
}
