package p932on;

import kotlin.reflect.jvm.internal.impl.storage.C16630d;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNullableValues;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: on.e */
/* JADX INFO: loaded from: classes2.dex */
public class C18245e extends C16630d implements CacheWithNullableValues {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18245e(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap) {
        super(lockBasedStorageManager, concurrentHashMap, new C18244d());
        if (lockBasedStorageManager == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "storageManager", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction", "<init>"));
        }
    }
}
