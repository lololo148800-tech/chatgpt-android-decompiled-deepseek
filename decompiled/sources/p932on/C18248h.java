package p932on;

import kotlin.reflect.jvm.internal.impl.storage.C16630d;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;

/* JADX INFO: renamed from: on.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C18248h extends C16630d implements MemoizedFunctionToNotNull {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19770a(int i10) {
        String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 3 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "map";
        } else if (i10 == 2) {
            objArr[0] = "compute";
        } else if (i10 != 3) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
        }
        if (i10 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
        } else {
            objArr[1] = "invoke";
        }
        if (i10 != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 3) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.C16630d, kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable, p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Object objInvoke = super.invoke(obj);
        if (objInvoke != null) {
            return objInvoke;
        }
        m19770a(3);
        throw null;
    }
}
