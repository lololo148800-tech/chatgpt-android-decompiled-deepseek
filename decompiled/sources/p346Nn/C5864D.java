package p346Nn;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p389Pn.AbstractC6525j;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Nn.D */
/* JADX INFO: loaded from: classes2.dex */
public final class C5864D extends AbstractC6525j {

    /* JADX INFO: renamed from: e */
    public static final List f19168e = AbstractC17681o.m19382k(0, 0, 0, 0, 0, 0, 0, 0, 0);

    /* JADX INFO: renamed from: f */
    public static final List f19169f = AbstractC17681o.m19382k(2, 1, 0, 2, 1, 0, 2, 1, 0);

    /* JADX INFO: renamed from: c */
    public final int f19170c;

    /* JADX INFO: renamed from: d */
    public final int f19171d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5864D() {
        List zerosToAdd = f19168e;
        AbstractC16544l.m18094g(zerosToAdd, "zerosToAdd");
        super(AbstractC5915o0.f19282d, zerosToAdd);
        this.f19170c = 1;
        this.f19171d = 9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5864D) {
            C5864D c5864d = (C5864D) obj;
            if (this.f19170c == c5864d.f19170c && this.f19171d == c5864d.f19171d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f19170c * 31) + this.f19171d;
    }
}
