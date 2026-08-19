package p607Yo;

import java.util.ArrayList;
import java.util.List;
import p509Uk.lpqL.SfpOlmlMATQ;
import p690cp.C12912C;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: Yo.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C10116e {

    /* JADX INFO: renamed from: a */
    public final ArrayList f29956a;

    /* JADX INFO: renamed from: b */
    public final char f29957b;

    /* JADX INFO: renamed from: c */
    public final int f29958c;

    /* JADX INFO: renamed from: d */
    public final boolean f29959d;

    /* JADX INFO: renamed from: e */
    public final boolean f29960e;

    /* JADX INFO: renamed from: f */
    public C10116e f29961f;

    /* JADX INFO: renamed from: g */
    public C10116e f29962g;

    public C10116e(ArrayList arrayList, char c9, boolean z6, boolean z10, C10116e c10116e) {
        this.f29956a = arrayList;
        this.f29957b = c9;
        this.f29959d = z6;
        this.f29960e = z10;
        this.f29961f = c10116e;
        this.f29958c = arrayList.size();
    }

    /* JADX INFO: renamed from: a */
    public final List m10696a(int i10) {
        ArrayList arrayList = this.f29956a;
        if (i10 < 1 || i10 > arrayList.size()) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("length must be between 1 and ", arrayList.size(), i10, ", was "));
        }
        return arrayList.subList(0, i10);
    }

    /* JADX INFO: renamed from: b */
    public final C12912C m10697b() {
        return (C12912C) AbstractC17792x.m19532o(1, this.f29956a);
    }

    /* JADX INFO: renamed from: c */
    public final List m10698c(int i10) {
        ArrayList arrayList = this.f29956a;
        if (i10 < 1 || i10 > arrayList.size()) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("length must be between 1 and ", arrayList.size(), i10, SfpOlmlMATQ.ehnOeHr));
        }
        return arrayList.subList(arrayList.size() - i10, arrayList.size());
    }
}
