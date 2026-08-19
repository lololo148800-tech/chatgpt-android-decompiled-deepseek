package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C16628b implements LockBasedStorageManager.ExceptionHandlingStrategy {
    @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy
    public final RuntimeException handleException(Throwable th2) {
        if (th2 == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'throwable' of kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1.handleException must not be null");
        }
        throw ExceptionUtilsKt.rethrow(th2);
    }
}
