package p349O0;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: O0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5995c {

    /* JADX INFO: renamed from: a */
    public int f19473a;

    public C5995c(int i10) {
        this.f19473a = i10;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6411a() {
        return this.f19473a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{ location = ");
        return AbstractC10763a.m11056n(sb2, this.f19473a, " }");
    }
}
