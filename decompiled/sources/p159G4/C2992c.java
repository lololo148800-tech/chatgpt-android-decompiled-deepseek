package p159G4;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: G4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2992c implements Comparable {

    /* JADX INFO: renamed from: Y */
    public final int f9004Y;

    /* JADX INFO: renamed from: Z */
    public final int f9005Z;

    /* JADX INFO: renamed from: o0 */
    public final String f9006o0;

    /* JADX INFO: renamed from: p0 */
    public final String f9007p0;

    public C2992c(String str, int i10, int i11, String str2) {
        this.f9004Y = i10;
        this.f9005Z = i11;
        this.f9006o0 = str;
        this.f9007p0 = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2992c other = (C2992c) obj;
        AbstractC16544l.m18094g(other, "other");
        int i10 = this.f9004Y - other.f9004Y;
        return i10 == 0 ? this.f9005Z - other.f9005Z : i10;
    }
}
