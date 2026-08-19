package al;

import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.C15085k;
import io.ktor.utils.p815io.InterfaceC15088n;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import p025An.AbstractC0593T;
import p025An.C0613g0;
import p548Wd.p549VF.zakks;
import p658b5.C11234e;

/* JADX INFO: renamed from: al.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C10746d {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31933b = AtomicReferenceFieldUpdater.newUpdater(C10746d.class, Object.class, zakks.qswVU);

    /* JADX INFO: renamed from: a */
    public final InterfaceC15088n f31934a;
    private volatile /* synthetic */ Object content;

    public C10746d(InterfaceC15088n origin) {
        AbstractC16544l.m18094g(origin, "origin");
        this.f31934a = origin;
        this.content = null;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC15088n m11037a() throws Throwable {
        if (this.f31934a.mo1137a() != null) {
            Throwable thMo1137a = this.f31934a.mo1137a();
            AbstractC16544l.m18091d(thMo1137a);
            throw thMo1137a;
        }
        C16525B c16525b = new C16525B();
        Object obj = this.content;
        c16525b.f51262Y = obj;
        C0613g0 c0613g0 = C0613g0.f1858Y;
        if (obj == null) {
            C10744b c10744b = new C10744b(this);
            c16525b.f51262Y = c10744b;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31933b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c10744b)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    c16525b.f51262Y = this.content;
                }
            }
            C10744b c10744b2 = (C10744b) c16525b.f51262Y;
            c10744b2.getClass();
            C11234e c11234eM16194v = AbstractC15070F.m16194v(c0613g0, AbstractC0593T.f1825b, new C10743a(c10744b2.f31929c, c10744b2, null), 2);
            c10744b2.f31928b = c11234eM16194v;
            return (C15085k) c11234eM16194v.f34001Z;
        }
        return (C15085k) AbstractC15070F.m16194v(c0613g0, null, new C10745c(c16525b, null), 3).f34001Z;
    }
}
