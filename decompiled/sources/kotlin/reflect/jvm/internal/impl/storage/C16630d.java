package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.ConcurrentMap;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import p001A.C0095w0;
import p049Bm.InterfaceC1436k;
import p932on.EnumC18249i;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.d */
/* JADX INFO: loaded from: classes2.dex */
public class C16630d implements MemoizedFunctionToNullable {

    /* JADX INFO: renamed from: Y */
    public final LockBasedStorageManager f53136Y;

    /* JADX INFO: renamed from: Z */
    public final ConcurrentMap f53137Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC1436k f53138o0;

    public C16630d(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, InterfaceC1436k interfaceC1436k) {
        if (lockBasedStorageManager == null) {
            m18397a(0);
            throw null;
        }
        if (concurrentMap == null) {
            m18397a(1);
            throw null;
        }
        if (interfaceC1436k == null) {
            m18397a(2);
            throw null;
        }
        this.f53136Y = lockBasedStorageManager;
        this.f53137Z = concurrentMap;
        this.f53138o0 = interfaceC1436k;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18397a(int i10) {
        String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "map";
        } else if (i10 == 2) {
            objArr[0] = "compute";
        } else if (i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 3) {
            objArr[1] = "recursionDetected";
        } else if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i10 != 3 && i10 != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public final AssertionError m18398b(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + EnumC18249i.f58135Z + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.f53136Y);
        LockBasedStorageManager.m18392c(assertionError);
        return assertionError;
    }

    /* JADX INFO: renamed from: c */
    public final AssertionError m18399c(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f53136Y);
        LockBasedStorageManager.m18392c(assertionError);
        return assertionError;
    }

    /* JADX INFO: renamed from: e */
    public final AssertionError m18400e(Object obj, Throwable th2) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + this.f53136Y, th2);
        LockBasedStorageManager.m18392c(assertionError);
        return assertionError;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable, p049Bm.InterfaceC1436k
    public Object invoke(Object obj) {
        ConcurrentMap concurrentMap = this.f53137Z;
        Object obj2 = concurrentMap.get(obj);
        EnumC18249i enumC18249i = EnumC18249i.f58135Z;
        if (obj2 != null && obj2 != enumC18249i) {
            return WrappedValues.unescapeExceptionOrNull(obj2);
        }
        LockBasedStorageManager lockBasedStorageManager = this.f53136Y;
        SimpleLock simpleLock = lockBasedStorageManager.f53129a;
        SimpleLock simpleLock2 = lockBasedStorageManager.f53129a;
        simpleLock.lock();
        try {
            Object obj3 = concurrentMap.get(obj);
            EnumC18249i enumC18249i2 = EnumC18249i.f58136o0;
            AssertionError assertionErrorM18399c = null;
            if (obj3 == enumC18249i) {
                C0095w0 c0095w0Mo18393b = lockBasedStorageManager.mo18393b(obj, "");
                if (c0095w0Mo18393b == null) {
                    m18397a(3);
                    throw null;
                }
                if (!c0095w0Mo18393b.f410Z) {
                    Object obj4 = c0095w0Mo18393b.f411o0;
                    simpleLock2.unlock();
                    return obj4;
                }
                obj3 = enumC18249i2;
            }
            if (obj3 == enumC18249i2) {
                C0095w0 c0095w0Mo18393b2 = lockBasedStorageManager.mo18393b(obj, "");
                if (c0095w0Mo18393b2 == null) {
                    m18397a(3);
                    throw null;
                }
                if (!c0095w0Mo18393b2.f410Z) {
                    Object obj5 = c0095w0Mo18393b2.f411o0;
                    simpleLock2.unlock();
                    return obj5;
                }
            }
            if (obj3 != null) {
                Object objUnescapeExceptionOrNull = WrappedValues.unescapeExceptionOrNull(obj3);
                simpleLock2.unlock();
                return objUnescapeExceptionOrNull;
            }
            try {
                concurrentMap.put(obj, enumC18249i);
                Object objInvoke = this.f53138o0.invoke(obj);
                Object objPut = concurrentMap.put(obj, WrappedValues.escapeNull(objInvoke));
                if (objPut == enumC18249i) {
                    simpleLock2.unlock();
                    return objInvoke;
                }
                assertionErrorM18399c = m18399c(obj, objPut);
                throw assertionErrorM18399c;
            } catch (Throwable th2) {
                if (ExceptionUtilsKt.isProcessCanceledException(th2)) {
                    try {
                        Object objRemove = concurrentMap.remove(obj);
                        if (objRemove != enumC18249i) {
                            throw m18398b(obj, objRemove);
                        }
                        throw th2;
                    } catch (Throwable th3) {
                        throw m18400e(obj, th3);
                    }
                }
                LockBasedStorageManager.ExceptionHandlingStrategy exceptionHandlingStrategy = lockBasedStorageManager.f53130b;
                if (th2 != assertionErrorM18399c) {
                    Object objPut2 = concurrentMap.put(obj, WrappedValues.escapeThrowable(th2));
                    if (objPut2 != enumC18249i) {
                        throw m18399c(obj, objPut2);
                    }
                    throw exceptionHandlingStrategy.handleException(th2);
                }
                try {
                    concurrentMap.remove(obj);
                    throw exceptionHandlingStrategy.handleException(th2);
                } catch (Throwable th4) {
                    throw m18400e(obj, th4);
                }
            }
            simpleLock2.unlock();
            throw th;
        } catch (Throwable th5) {
            simpleLock2.unlock();
            throw th5;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable
    public final boolean isComputed(Object obj) {
        Object obj2 = this.f53137Z.get(obj);
        return (obj2 == null || obj2 == EnumC18249i.f58135Z) ? false : true;
    }
}
