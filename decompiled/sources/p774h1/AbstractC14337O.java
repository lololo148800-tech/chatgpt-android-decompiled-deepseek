package p774h1;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.AbstractC16544l;
import p759g1.C13803e;
import p985r9.C18903m;

/* JADX INFO: renamed from: h1.O */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14337O extends AbstractC14360p {

    /* JADX INFO: renamed from: a */
    public Shader f44998a;

    /* JADX INFO: renamed from: b */
    public long f44999b = 9205357640488583168L;

    @Override // p774h1.AbstractC14360p
    /* JADX INFO: renamed from: a */
    public final void mo15664a(float f10, long j10, C18903m c18903m) {
        Shader shaderMo14804b = this.f44998a;
        if (shaderMo14804b == null || !C13803e.m15330b(this.f44999b, j10)) {
            if (C13803e.m15334f(j10)) {
                shaderMo14804b = null;
                this.f44998a = null;
                this.f44999b = 9205357640488583168L;
            } else {
                shaderMo14804b = mo14804b(j10);
                this.f44998a = shaderMo14804b;
                this.f44999b = j10;
            }
        }
        long jM15625c = AbstractC14334L.m15625c(((Paint) c18903m.f60268b).getColor());
        long j11 = C14365u.f45052b;
        if (!C14365u.m15775c(jM15625c, j11)) {
            c18903m.m20222f(j11);
        }
        if (!AbstractC16544l.m18089b((Shader) c18903m.f60269c, shaderMo14804b)) {
            c18903m.m20225i(shaderMo14804b);
        }
        if (((Paint) c18903m.f60268b).getAlpha() / 255.0f == f10) {
            return;
        }
        c18903m.m20220d(f10);
    }

    /* JADX INFO: renamed from: b */
    public abstract Shader mo14804b(long j10);
}
