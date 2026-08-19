package p817j$.util.concurrent;

/* JADX INFO: renamed from: j$.util.concurrent.w */
/* JADX INFO: loaded from: classes4.dex */
final class C15704w extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final Object initialValue() {
        return new ThreadLocalRandom(0);
    }
}
