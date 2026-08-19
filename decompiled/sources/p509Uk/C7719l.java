package p509Uk;

import io.ktor.utils.p815io.InterfaceC15088n;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC16544l;
import mo.AbstractC17325B;
import mo.C17352s;
import p023Al.C0556b;
import p026Ao.AbstractC0668b;
import p026Ao.C0671e;
import p026Ao.InterfaceC0676j;
import p049Bm.InterfaceC1426a;
import p571X9.AbstractC9221V;

/* JADX INFO: renamed from: Uk.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C7719l extends AbstractC17325B {

    /* JADX INFO: renamed from: a */
    public final Long f24326a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1426a f24327b;

    public C7719l(Long l4, InterfaceC1426a interfaceC1426a) {
        this.f24326a = l4;
        this.f24327b = interfaceC1426a;
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: a */
    public final long mo4142a() {
        Long l4 = this.f24326a;
        if (l4 != null) {
            return l4.longValue();
        }
        return -1L;
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: b */
    public final C17352s mo4143b() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: d */
    public final void mo4145d(InterfaceC0676j interfaceC0676j) throws IOException {
        ?? r6;
        try {
            InterfaceC15088n interfaceC15088n = (InterfaceC15088n) this.f24327b.invoke();
            AbstractC16544l.m18094g(interfaceC15088n, "<this>");
            C0671e c0671eM1410j = AbstractC0668b.m1410j(new C0556b(interfaceC15088n, 0));
            Long th2 = null;
            try {
                Long lValueOf = Long.valueOf(interfaceC0676j.mo1339u(c0671eM1410j));
                try {
                    c0671eM1410j.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
                Long l4 = th2;
                th2 = lValueOf;
                r6 = l4;
            } catch (Throwable th4) {
                try {
                    c0671eM1410j.close();
                    r6 = th4;
                } catch (Throwable th5) {
                    AbstractC9221V.m9789a(th4, th5);
                    r6 = th4;
                }
            }
            if (r6 != 0) {
                throw r6;
            }
            th2.getClass();
        } catch (IOException e10) {
            throw e10;
        } catch (Throwable th6) {
            throw new C7718k(th6);
        }
    }
}
