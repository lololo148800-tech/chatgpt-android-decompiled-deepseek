package il;

import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.C15085k;
import io.ktor.utils.p815io.InterfaceC15088n;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0613g0;
import p1061vb.C20513d;
import p480Te.C7390o;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: il.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15037b {

    /* JADX INFO: renamed from: a */
    public static final C20513d f46752a = new C20513d();

    /* JADX INFO: renamed from: b */
    public static final C20513d f46753b = new C20513d();

    /* JADX INFO: renamed from: c */
    public static final C20513d f46754c = new C20513d();

    /* JADX INFO: renamed from: d */
    public static final C20513d f46755d = new C20513d();

    /* JADX INFO: renamed from: e */
    public static final C20513d f46756e = new C20513d();

    /* JADX INFO: renamed from: a */
    public static final InterfaceC15088n m16169a(InterfaceC15088n interfaceC15088n, InterfaceC18776i context, Long l4, C7390o c7390o) {
        AbstractC16544l.m18094g(interfaceC15088n, "<this>");
        AbstractC16544l.m18094g(context, "context");
        return (C15085k) AbstractC15070F.m16193u(C0613g0.f1858Y, context, new C15036a(interfaceC15088n, c7390o, l4, null)).f34001Z;
    }

    /* JADX INFO: renamed from: b */
    public static final Throwable m16170b(Throwable th2) {
        AbstractC16544l.m18094g(th2, "<this>");
        Throwable cause = th2;
        while (cause instanceof CancellationException) {
            CancellationException cancellationException = (CancellationException) cause;
            if (AbstractC16544l.m18089b(cause, cancellationException.getCause())) {
                return th2;
            }
            cause = cancellationException.getCause();
        }
        return cause == null ? th2 : cause;
    }
}
