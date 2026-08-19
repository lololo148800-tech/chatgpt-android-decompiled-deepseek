package p932on;

import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: on.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C18243c extends C18245e implements CacheWithNotNullValues {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19768a(int i10) {
        String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 3 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "map";
        } else if (i10 == 2) {
            objArr[0] = "computation";
        } else if (i10 != 3) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        }
        if (i10 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        } else {
            objArr[1] = "computeIfAbsent";
        }
        if (i10 == 2) {
            objArr[2] = "computeIfAbsent";
        } else if (i10 != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 3) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues
    public final Object computeIfAbsent(Object obj, InterfaceC1426a interfaceC1426a) {
        if (interfaceC1426a == null) {
            m19768a(2);
            throw null;
        }
        Object objInvoke = invoke(new C18246f(obj, interfaceC1426a));
        if (objInvoke != null) {
            return objInvoke;
        }
        m19768a(3);
        throw null;
    }
}
