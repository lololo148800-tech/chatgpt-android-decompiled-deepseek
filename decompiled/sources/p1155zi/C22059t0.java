package p1155zi;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import bo.InterfaceC11530r;
import java.util.Arrays;

/* JADX INFO: renamed from: zi.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22059t0 implements InterfaceC11530r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String[] f69753a;

    public C22059t0(String[] strArr) {
        this.f69753a = strArr;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return InterfaceC11530r.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC11530r) {
            return Arrays.equals(this.f69753a, ((C22059t0) ((InterfaceC11530r) obj)).f69753a);
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return Arrays.hashCode(this.f69753a) ^ 397397176;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return AbstractC10763a.m11054l("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(this.f69753a), Separators.RPAREN);
    }
}
