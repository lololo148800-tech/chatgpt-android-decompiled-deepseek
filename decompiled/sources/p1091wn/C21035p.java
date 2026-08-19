package p1091wn;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p491U0.C7535c;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: wn.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C21035p implements InterfaceC21029j, InterfaceC21024e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21029j f66914a;

    /* JADX INFO: renamed from: b */
    public final int f66915b;

    /* JADX INFO: renamed from: c */
    public final int f66916c;

    public C21035p(InterfaceC21029j sequence, int i10, int i11) {
        AbstractC16544l.m18094g(sequence, "sequence");
        this.f66914a = sequence;
        this.f66915b = i10;
        this.f66916c = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "startIndex should be non-negative, but is ").toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "endIndex should be non-negative, but is ").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("endIndex should be not less than startIndex, but was ", i11, i10, " < ").toString());
        }
    }

    @Override // p1091wn.InterfaceC21024e
    /* JADX INFO: renamed from: a */
    public final InterfaceC21029j mo21475a(int i10) {
        int i11 = this.f66916c;
        int i12 = this.f66915b;
        if (i10 >= i11 - i12) {
            return this;
        }
        return new C21035p(this.f66914a, i12, i10 + i12);
    }

    @Override // p1091wn.InterfaceC21024e
    /* JADX INFO: renamed from: b */
    public final InterfaceC21029j mo21476b(int i10) {
        int i11 = this.f66916c;
        int i12 = this.f66915b;
        if (i10 >= i11 - i12) {
            return C21026g.f66901a;
        }
        return new C21035p(this.f66914a, i12 + i10, i11);
    }

    @Override // p1091wn.InterfaceC21029j
    public final Iterator iterator() {
        return new C7535c(this);
    }
}
