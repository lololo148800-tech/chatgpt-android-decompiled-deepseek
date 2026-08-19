package p722e8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8119j5;
import p677c8.C11691c;

/* JADX INFO: renamed from: e8.i */
/* JADX INFO: loaded from: classes.dex */
public final class C13325i extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final String f42275b;

    /* JADX INFO: renamed from: c */
    public final int f42276c;

    /* JADX INFO: renamed from: d */
    public final C11691c f42277d;

    public C13325i(String str, int i10) {
        C11691c c11691c = new C11691c();
        this.f42275b = str;
        this.f42276c = i10;
        this.f42277d = c11691c;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42277d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13325i)) {
            return false;
        }
        C13325i c13325i = (C13325i) obj;
        return AbstractC16544l.m18089b(this.f42275b, c13325i.f42275b) && this.f42276c == c13325i.f42276c && AbstractC16544l.m18089b(this.f42277d, c13325i.f42277d);
    }

    public final int hashCode() {
        return this.f42277d.hashCode() + (((this.f42275b.hashCode() * 31) + this.f42276c) * 31);
    }

    public final String toString() {
        return "ActionSent(viewId=" + this.f42275b + ", frustrationCount=" + this.f42276c + ", eventTime=" + this.f42277d + Separators.RPAREN;
    }
}
