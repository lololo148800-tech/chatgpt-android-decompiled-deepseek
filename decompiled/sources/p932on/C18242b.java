package p932on;

import kotlin.reflect.jvm.internal.impl.storage.C16629c;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p001A.C0095w0;
import p037B9.MeDP.MpoABj;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p658b5.C11248s;

/* JADX INFO: renamed from: on.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C18242b extends C16629c implements NotNullLazyValue {

    /* JADX INFO: renamed from: p0 */
    public volatile C11248s f58129p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1436k f58130q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1436k f58131r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18242b(LockBasedStorageManager lockBasedStorageManager, InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
        super(lockBasedStorageManager, interfaceC1426a);
        this.f58130q0 = interfaceC1436k;
        this.f58131r0 = interfaceC1436k2;
        if (lockBasedStorageManager == null) {
            m19767e(0);
            throw null;
        }
        if (interfaceC1426a == null) {
            m19767e(1);
            throw null;
        }
        this.f58129p0 = null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19766a(int i10) {
        String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i10 != 2 ? 2 : 3];
        if (i10 != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i10 != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i10 == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m19767e(int i10) {
        String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 2 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "computable";
        } else if (i10 != 2) {
            objArr[0] = MpoABj.MvGOsCfdIpE;
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
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

    @Override // kotlin.reflect.jvm.internal.impl.storage.C16629c
    /* JADX INFO: renamed from: b */
    public final void mo18395b(Object obj) {
        this.f58129p0 = new C11248s(obj);
        try {
            if (obj == null) {
                m19766a(2);
                throw null;
            }
            this.f58131r0.invoke(obj);
            this.f58129p0 = null;
        } catch (Throwable th2) {
            this.f58129p0 = null;
            throw th2;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.C16629c
    /* JADX INFO: renamed from: c */
    public final C0095w0 mo18396c(boolean z6) {
        InterfaceC1436k interfaceC1436k = this.f58130q0;
        return interfaceC1436k == null ? super.mo18396c(z6) : new C0095w0(interfaceC1436k.invoke(Boolean.valueOf(z6)), false, 10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.C16629c, kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue, p049Bm.InterfaceC1426a
    public final Object invoke() {
        Object objInvoke;
        C11248s c11248s = this.f58129p0;
        if (c11248s == null || ((Thread) c11248s.f34082o0) != Thread.currentThread()) {
            objInvoke = super.invoke();
        } else {
            if (((Thread) c11248s.f34082o0) != Thread.currentThread()) {
                throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
            }
            objInvoke = c11248s.f34081Z;
        }
        if (objInvoke != null) {
            return objInvoke;
        }
        m19767e(2);
        throw null;
    }
}
