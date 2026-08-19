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

/* JADX INFO: renamed from: u7.f */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC20148f implements Runnable {

    /* JADX INFO: renamed from: p0 */
    public static final long f63824p0 = TimeUnit.MILLISECONDS.toNanos(500);

    /* JADX INFO: renamed from: Y */
    public final File f63825Y;

    /* JADX INFO: renamed from: Z */
    public final C19805c f63826Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC11256c f63827o0;

    public RunnableC20148f(File file, C19805c fileMover, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(fileMover, "fileMover");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f63825Y = file;
        this.f63826Z = fileMover;
        this.f63827o0 = internalLogger;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f63825Y != null) {
            AbstractC1976c.m3149f(f63824p0, this.f63827o0, new C17176b(this, 23));
        } else {
            AbstractC7889G0.m8184b(this.f63827o0, 4, EnumC11255b.f34099Z, C20146d.f63817p0, null, false, 56);
        }
    }
}
