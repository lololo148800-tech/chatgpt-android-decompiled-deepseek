package p370P0;

import kotlin.jvm.internal.AbstractC16526C;
import p038Ba.AbstractC0865o;
import p045Bj.C1313k;
import p349O0.C5947D0;

/* JADX INFO: renamed from: P0.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6276C {

    /* JADX INFO: renamed from: a */
    public final int f20379a;

    /* JADX INFO: renamed from: b */
    public final int f20380b;

    public AbstractC6276C(int i10, int i11) {
        this.f20379a = i10;
        this.f20380b = i11;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo6757a(C6277D c6277d, AbstractC0865o abstractC0865o, C5947D0 c5947d0, C1313k c1313k);

    /* JADX INFO: renamed from: b */
    public String mo6758b(int i10) {
        return "IntParameter(" + i10 + ')';
    }

    /* JADX INFO: renamed from: c */
    public String mo6759c(int i10) {
        return "ObjectParameter(" + i10 + ')';
    }

    public final String toString() {
        String strMo4448c = AbstractC16526C.f51263a.mo5693b(getClass()).mo4448c();
        return strMo4448c == null ? "" : strMo4448c;
    }

    public /* synthetic */ AbstractC6276C(int i10, int i11, int i12) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
