package p152Fm;

import java.util.Random;

/* JADX INFO: renamed from: Fm.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2919a extends AbstractC2922d {
    @Override // p152Fm.AbstractC2922d
    /* JADX INFO: renamed from: a */
    public final int mo3721a(int i10) {
        return ((-i10) >> 31) & (mo3725f().nextInt() >>> (32 - i10));
    }

    @Override // p152Fm.AbstractC2922d
    /* JADX INFO: renamed from: b */
    public final int mo3722b() {
        return mo3725f().nextInt();
    }

    @Override // p152Fm.AbstractC2922d
    /* JADX INFO: renamed from: c */
    public final int mo3723c(int i10) {
        return mo3725f().nextInt(i10);
    }

    @Override // p152Fm.AbstractC2922d
    /* JADX INFO: renamed from: d */
    public final long mo3724d() {
        return mo3725f().nextLong();
    }

    /* JADX INFO: renamed from: f */
    public abstract Random mo3725f();
}
