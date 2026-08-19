package p640a6;

import java.util.ArrayList;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: a6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10509d {

    /* JADX INFO: renamed from: a */
    public final ArrayList f31145a;

    /* JADX INFO: renamed from: b */
    public final char f31146b;

    /* JADX INFO: renamed from: c */
    public final double f31147c;

    /* JADX INFO: renamed from: d */
    public final String f31148d;

    /* JADX INFO: renamed from: e */
    public final String f31149e;

    public C10509d(ArrayList arrayList, char c9, double d10, String str, String str2) {
        this.f31145a = arrayList;
        this.f31146b = c9;
        this.f31147c = d10;
        this.f31148d = str;
        this.f31149e = str2;
    }

    /* JADX INFO: renamed from: a */
    public static int m10965a(char c9, String str, String str2) {
        return str2.hashCode() + AbstractC0168G.m527p(c9 * 31, 31, str);
    }

    public final int hashCode() {
        return m10965a(this.f31146b, this.f31149e, this.f31148d);
    }
}
