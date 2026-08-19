package p1143z4;

import android.os.Bundle;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: z4.s */
/* JADX INFO: loaded from: classes.dex */
public final class C21789s implements Comparable {

    /* JADX INFO: renamed from: Y */
    public final AbstractC21790t f69123Y;

    /* JADX INFO: renamed from: Z */
    public final Bundle f69124Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f69125o0;

    /* JADX INFO: renamed from: p0 */
    public final int f69126p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f69127q0;

    /* JADX INFO: renamed from: r0 */
    public final int f69128r0;

    public C21789s(AbstractC21790t destination, Bundle bundle, boolean z6, int i10, boolean z10, int i11) {
        AbstractC16544l.m18094g(destination, "destination");
        this.f69123Y = destination;
        this.f69124Z = bundle;
        this.f69125o0 = z6;
        this.f69126p0 = i10;
        this.f69127q0 = z10;
        this.f69128r0 = i11;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C21789s other) {
        AbstractC16544l.m18094g(other, "other");
        boolean z6 = other.f69125o0;
        boolean z10 = this.f69125o0;
        if (z10 && !z6) {
            return 1;
        }
        if (!z10 && z6) {
            return -1;
        }
        int i10 = this.f69126p0 - other.f69126p0;
        if (i10 > 0) {
            return 1;
        }
        if (i10 < 0) {
            return -1;
        }
        Bundle bundle = other.f69124Z;
        Bundle bundle2 = this.f69124Z;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            AbstractC16544l.m18091d(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z11 = other.f69127q0;
        boolean z12 = this.f69127q0;
        if (z12 && !z11) {
            return 1;
        }
        if (z12 || !z11) {
            return this.f69128r0 - other.f69128r0;
        }
        return -1;
    }
}
