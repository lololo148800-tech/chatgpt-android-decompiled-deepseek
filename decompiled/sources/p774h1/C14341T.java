package p774h1;

import android.graphics.Shader;
import mm.C17321x;
import p985r9.C18903m;

/* JADX INFO: renamed from: h1.T */
/* JADX INFO: loaded from: classes.dex */
public final class C14341T extends AbstractC14360p {

    /* JADX INFO: renamed from: a */
    public final long f45021a;

    public C14341T(long j10) {
        this.f45021a = j10;
    }

    @Override // p774h1.AbstractC14360p
    /* JADX INFO: renamed from: a */
    public final void mo15664a(float f10, long j10, C18903m c18903m) {
        c18903m.m20220d(1.0f);
        long jM15774b = this.f45021a;
        if (f10 != 1.0f) {
            jM15774b = C14365u.m15774b(C14365u.m15776d(jM15774b) * f10, jM15774b);
        }
        c18903m.m20222f(jM15774b);
        if (((Shader) c18903m.f60269c) != null) {
            c18903m.m20225i(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14341T) {
            return C14365u.m15775c(this.f45021a, ((C14341T) obj).f45021a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = C14365u.f45061k;
        return C17321x.m18981a(this.f45021a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C14365u.m15781i(this.f45021a)) + ')';
    }
}
