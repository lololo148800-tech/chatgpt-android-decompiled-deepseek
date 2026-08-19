package p437Rn;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Rn.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C6960r {

    /* JADX INFO: renamed from: a */
    public final List f22259a;

    /* JADX INFO: renamed from: b */
    public final List f22260b;

    public C6960r(List operations, List followedBy) {
        AbstractC16544l.m18094g(operations, "operations");
        AbstractC16544l.m18094g(followedBy, "followedBy");
        this.f22259a = operations;
        this.f22260b = followedBy;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC17680n.m19349Y(this.f22259a, ", ", null, null, 0, null, null, 62));
        sb2.append('(');
        return AbstractC9306j0.m9892k(sb2, AbstractC17680n.m19349Y(this.f22260b, Separators.SEMICOLON, null, null, 0, null, null, 62), ')');
    }
}
