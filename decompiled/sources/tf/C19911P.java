package tf;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.C17689w;

/* JADX INFO: renamed from: tf.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C19911P {

    /* JADX INFO: renamed from: a */
    public final List f63109a;

    /* JADX INFO: renamed from: b */
    public final int f63110b;

    /* JADX INFO: renamed from: c */
    public final boolean f63111c;

    /* JADX INFO: renamed from: d */
    public final boolean f63112d;

    /* JADX INFO: renamed from: e */
    public final boolean f63113e;

    public C19911P(List imageSelections, int i10, boolean z6, boolean z10, boolean z11) {
        AbstractC16544l.m18094g(imageSelections, "imageSelections");
        this.f63109a = imageSelections;
        this.f63110b = i10;
        this.f63111c = z6;
        this.f63112d = z10;
        this.f63113e = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19911P)) {
            return false;
        }
        C19911P c19911p = (C19911P) obj;
        return AbstractC16544l.m18089b(this.f63109a, c19911p.f63109a) && this.f63110b == c19911p.f63110b && this.f63111c == c19911p.f63111c && this.f63112d == c19911p.f63112d && this.f63113e == c19911p.f63113e;
    }

    public final int hashCode() {
        return (((((((this.f63109a.hashCode() * 31) + this.f63110b) * 31) + (this.f63111c ? 1231 : 1237)) * 31) + (this.f63112d ? 1231 : 1237)) * 31) + (this.f63113e ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C19911P() {
        this(C17689w.f56480Y, 0, false, true, true);
    }
}
