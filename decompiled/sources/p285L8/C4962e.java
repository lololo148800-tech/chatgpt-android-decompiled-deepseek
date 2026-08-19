package p285L8;

import android.os.Build;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicLong;
import p117Eb.C2385o;
import p544W9.AbstractC8608b3;

/* JADX INFO: renamed from: L8.e */
/* JADX INFO: loaded from: classes.dex */
public final class C4962e extends AbstractC8608b3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16190a;

    /* JADX INFO: renamed from: b */
    public final Serializable f16191b;

    public C4962e(int i10) {
        SecureRandom instanceStrong;
        this.f16190a = i10;
        switch (i10) {
            case 1:
                this.f16191b = new AtomicLong(0L);
                return;
            default:
                try {
                    switch ((Build.VERSION.SDK_INT >= 26 ? new C2385o(15) : new C2385o(16)).f7413Y) {
                        case 15:
                            instanceStrong = SecureRandom.getInstanceStrong();
                            break;
                        default:
                            instanceStrong = new SecureRandom();
                            break;
                    }
                    this.f16191b = instanceStrong;
                    return;
                } catch (Throwable th2) {
                    throw new ExceptionInInitializerError(th2);
                }
        }
    }

    @Override // p544W9.AbstractC8608b3
    /* JADX INFO: renamed from: a */
    public AbstractC4960c mo5608a() {
        switch (this.f16190a) {
            case 1:
                return C4959b.m5606b(((AtomicLong) this.f16191b).incrementAndGet());
            default:
                return super.mo5608a();
        }
    }

    @Override // p544W9.AbstractC8608b3
    /* JADX INFO: renamed from: b */
    public final long mo5607b() {
        switch (this.f16190a) {
            case 0:
                SecureRandom secureRandom = (SecureRandom) this.f16191b;
                long jNextLong = secureRandom.nextLong();
                while (true) {
                    long j10 = jNextLong & Long.MAX_VALUE;
                    if (j10 != 0) {
                        return j10;
                    }
                    jNextLong = secureRandom.nextLong();
                }
                break;
            default:
                return ((AtomicLong) this.f16191b).incrementAndGet();
        }
    }
}
