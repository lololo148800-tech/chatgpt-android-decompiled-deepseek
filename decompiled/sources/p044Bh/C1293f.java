package p044Bh;

import ao.AbstractC11153a0;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p559Wn.InterfaceC8975g;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Bh.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1293f {
    public static final C1292e Companion = new C1292e();

    /* JADX INFO: renamed from: a */
    public final C1291d f3430a;

    public /* synthetic */ C1293f(int i10, C1291d c1291d) {
        if (1 == (i10 & 1)) {
            this.f3430a = c1291d;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C1288a.f3426a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1293f) && AbstractC16544l.m18089b(this.f3430a, ((C1293f) obj).f3430a);
    }

    public final int hashCode() {
        return this.f3430a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C1293f(Throwable throwable) {
        String string;
        AbstractC16544l.m18094g(throwable, "throwable");
        String message = throwable.getMessage();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        if (stackTrace == null) {
            string = "null";
        } else {
            int length = stackTrace.length;
            StringBuilder sb2 = new StringBuilder(((length > 429496729 ? 429496729 : length) * 5) + 2);
            AbstractC17678l.m19302i(stackTrace, sb2, new ArrayList());
            string = sb2.toString();
        }
        this.f3430a = new C1291d(message, AbstractC21322p.m21709q0(1000, string));
    }
}
