package p1035u7;

import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import p087D7.AbstractC1976c;
import p1020t7.C19805c;
import p523V9.AbstractC7889G0;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p887m7.C17176b;

/* JADX INFO: renamed from: u7.e */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC20147e implements Runnable {

    /* JADX INFO: renamed from: q0 */
    public static final long f63819q0 = TimeUnit.MILLISECONDS.toNanos(500);

    /* JADX INFO: renamed from: Y */
    public final File f63820Y;

    /* JADX INFO: renamed from: Z */
    public final File f63821Z;

    /* JADX INFO: renamed from: o0 */
    public final C19805c f63822o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC11256c f63823p0;

    public RunnableC20147e(File file, File file2, C19805c c19805c, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f63820Y = file;
        this.f63821Z = file2;
        this.f63822o0 = c19805c;
        this.f63823p0 = internalLogger;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnumC11255b enumC11255b = EnumC11255b.f34099Z;
        if (this.f63820Y == null) {
            AbstractC7889G0.m8184b(this.f63823p0, 4, enumC11255b, C20146d.f63815Z, null, false, 56);
        } else if (this.f63821Z == null) {
            AbstractC7889G0.m8184b(this.f63823p0, 4, enumC11255b, C20146d.f63816o0, null, false, 56);
        } else {
            AbstractC1976c.m3149f(f63819q0, this.f63823p0, new C17176b(this, 22));
        }
    }
}
