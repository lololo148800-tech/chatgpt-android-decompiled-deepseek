package p176Gm;

import java.util.Random;
import kotlin.jvm.internal.AbstractC16544l;
import p152Fm.AbstractC2919a;
import p817j$.util.concurrent.ThreadLocalRandom;

/* JADX INFO: renamed from: Gm.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3106a extends AbstractC2919a {
    @Override // p152Fm.AbstractC2922d
    /* JADX INFO: renamed from: e */
    public final long mo3726e(long j10, long j11) {
        return ThreadLocalRandom.current().nextLong(j10, j11);
    }

    @Override // p152Fm.AbstractC2919a
    /* JADX INFO: renamed from: f */
    public final Random mo3725f() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC16544l.m18093f(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
