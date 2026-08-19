package p499U9;

import android.gov.nist.core.Separators;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: U9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7575e {

    /* JADX INFO: renamed from: a */
    public final Object f23982a;

    /* JADX INFO: renamed from: b */
    public final Object f23983b;

    /* JADX INFO: renamed from: c */
    public final Object f23984c;

    public C7575e(Object obj, Object obj2, Object obj3) {
        this.f23982a = obj;
        this.f23983b = obj2;
        this.f23984c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m7924a() {
        Object obj = this.f23982a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f23983b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f23984c);
        StringBuilder sbM9896o = AbstractC9306j0.m9896o("Multiple entries with same key: ", strValueOf, Separators.EQUALS, strValueOf2, " and ");
        sbM9896o.append(strValueOf3);
        sbM9896o.append(Separators.EQUALS);
        sbM9896o.append(strValueOf4);
        return new IllegalArgumentException(sbM9896o.toString());
    }
}
