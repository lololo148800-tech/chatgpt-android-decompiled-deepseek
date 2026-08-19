package p946pc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17321x;
import p204I1.C3582M;
import p492U1.C7548m;
import p774h1.C14365u;

/* JADX INFO: renamed from: pc.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C18333S {

    /* JADX INFO: renamed from: e */
    public static final C18333S f58519e = new C18333S(null, null, null, null);

    /* JADX INFO: renamed from: a */
    public final C3582M f58520a;

    /* JADX INFO: renamed from: b */
    public final C7548m f58521b;

    /* JADX INFO: renamed from: c */
    public final C14365u f58522c;

    /* JADX INFO: renamed from: d */
    public final Float f58523d;

    public C18333S(C3582M c3582m, C7548m c7548m, C14365u c14365u, Float f10) {
        this.f58520a = c3582m;
        this.f58521b = c7548m;
        this.f58522c = c14365u;
        this.f58523d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18333S)) {
            return false;
        }
        C18333S c18333s = (C18333S) obj;
        return AbstractC16544l.m18089b(this.f58520a, c18333s.f58520a) && AbstractC16544l.m18089b(this.f58521b, c18333s.f58521b) && AbstractC16544l.m18089b(this.f58522c, c18333s.f58522c) && AbstractC16544l.m18089b(this.f58523d, c18333s.f58523d);
    }

    public final int hashCode() {
        C3582M c3582m = this.f58520a;
        int iHashCode = (c3582m == null ? 0 : c3582m.hashCode()) * 31;
        C7548m c7548m = this.f58521b;
        int iM7896d = (iHashCode + (c7548m == null ? 0 : C7548m.m7896d(c7548m.f23910a))) * 31;
        C14365u c14365u = this.f58522c;
        int iM18981a = (iM7896d + (c14365u == null ? 0 : C17321x.m18981a(c14365u.f45062a))) * 31;
        Float f10 = this.f58523d;
        return iM18981a + (f10 != null ? f10.hashCode() : 0);
    }

    public final String toString() {
        return "TableStyle(headerTextStyle=" + this.f58520a + ", cellPadding=" + this.f58521b + ", borderColor=" + this.f58522c + ", borderStrokeWidth=" + this.f58523d + Separators.RPAREN;
    }
}
