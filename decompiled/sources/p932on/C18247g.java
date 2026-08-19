package p932on;

import kotlin.reflect.jvm.internal.impl.storage.C16629c;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: on.g */
/* JADX INFO: loaded from: classes2.dex */
public class C18247g extends C16629c implements NotNullLazyValue {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18247g(LockBasedStorageManager lockBasedStorageManager, InterfaceC1426a interfaceC1426a) {
        super(lockBasedStorageManager, interfaceC1426a);
        if (lockBasedStorageManager == null) {
            m19769a(0);
            throw null;
        }
        if (interfaceC1426a != null) {
        } else {
            m19769a(1);
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19769a(int i10) {
        String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 2 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "computable";
        } else if (i10 != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
        } else {
            objArr[1] = "invoke";
        }
        if (i10 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.C16629c, kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue, p049Bm.InterfaceC1426a
    public final Object invoke() {
        Object objInvoke = super.invoke();
        if (objInvoke != null) {
            return objInvoke;
        }
        m19769a(2);
        throw null;
    }
}
