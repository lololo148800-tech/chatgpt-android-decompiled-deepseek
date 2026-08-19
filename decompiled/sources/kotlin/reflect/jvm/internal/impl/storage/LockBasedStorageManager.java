package kotlin.reflect.jvm.internal.impl.storage;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import p001A.C0095w0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p571X9.AbstractC9306j0;
import p817j$.util.concurrent.ConcurrentHashMap;
import p932on.C18241a;
import p932on.C18242b;
import p932on.C18243c;
import p932on.C18245e;
import p932on.C18247g;
import p932on.C18248h;

/* JADX INFO: loaded from: classes2.dex */
public class LockBasedStorageManager implements StorageManager {

    /* JADX INFO: renamed from: a */
    public final SimpleLock f53129a;

    /* JADX INFO: renamed from: b */
    public final ExceptionHandlingStrategy f53130b;

    /* JADX INFO: renamed from: c */
    public final String f53131c;

    /* JADX INFO: renamed from: d */
    public static final String f53128d = AbstractC21322p.m21707o0(LockBasedStorageManager.class.getCanonicalName(), "");
    public static final StorageManager NO_LOCKS = new C16627a("NO_LOCKS", ExceptionHandlingStrategy.THROW, EmptySimpleLock.INSTANCE);

    public interface ExceptionHandlingStrategy {
        public static final ExceptionHandlingStrategy THROW = new C16628b();

        RuntimeException handleException(Throwable th2);
    }

    public LockBasedStorageManager(String str, ExceptionHandlingStrategy exceptionHandlingStrategy, SimpleLock simpleLock) {
        if (str == null) {
            m18391a(4);
            throw null;
        }
        if (exceptionHandlingStrategy == null) {
            m18391a(5);
            throw null;
        }
        if (simpleLock == null) {
            m18391a(6);
            throw null;
        }
        this.f53129a = simpleLock;
        this.f53130b = exceptionHandlingStrategy;
        this.f53131c = str;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18391a(int i10) {
        String str = (i10 == 10 || i10 == 13 || i10 == 20 || i10 == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 10 || i10 == 13 || i10 == 20 || i10 == 37) ? 2 : 3];
        if (i10 == 1 || i10 == 3 || i10 == 5) {
            objArr[0] = "exceptionHandlingStrategy";
        } else if (i10 != 6) {
            switch (i10) {
                case 8:
                    objArr[0] = "exceptionHandlingStrategy";
                    break;
                case 9:
                case 11:
                case 14:
                case 16:
                case 19:
                case 21:
                    objArr[0] = "compute";
                    break;
                case 10:
                case 13:
                case 20:
                case 37:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                    break;
                case 12:
                case 17:
                case 25:
                case 27:
                    objArr[0] = "onRecursiveCall";
                    break;
                case 15:
                case 18:
                case 22:
                    objArr[0] = "map";
                    break;
                case 23:
                case 24:
                case 26:
                case 28:
                case 30:
                case 31:
                case 32:
                case 34:
                    objArr[0] = "computable";
                    break;
                case 29:
                case 33:
                    objArr[0] = "postCompute";
                    break;
                case 35:
                    objArr[0] = "source";
                    break;
                case 36:
                    objArr[0] = "throwable";
                    break;
                default:
                    objArr[0] = "debugText";
                    break;
            }
        } else {
            objArr[0] = "lock";
        }
        if (i10 == 10 || i10 == 13) {
            objArr[1] = "createMemoizedFunction";
        } else if (i10 == 20) {
            objArr[1] = "createMemoizedFunctionWithNullableValues";
        } else if (i10 != 37) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        } else {
            objArr[1] = "sanitizeStackTrace";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "<init>";
                break;
            case 7:
            case 8:
                objArr[2] = "replaceExceptionHandling";
                break;
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createMemoizedFunction";
                break;
            case 10:
            case 13:
            case 20:
            case 37:
                break;
            case 19:
            case 21:
            case 22:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case 23:
            case 24:
            case 25:
                objArr[2] = "createLazyValue";
                break;
            case 26:
            case 27:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case 28:
            case 29:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case 30:
                objArr[2] = "createNullableLazyValue";
                break;
            case 31:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case 32:
            case 33:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 34:
                objArr[2] = "compute";
                break;
            case 35:
                objArr[2] = "recursionDetectedDefault";
                break;
            case 36:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 10 && i10 != 13 && i10 != 20 && i10 != 37) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: c */
    public static void m18392c(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (i10 < length) {
            if (!stackTrace[i10].getClassName().startsWith(f53128d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i10, length);
                assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
            }
            i10++;
        }
        i10 = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i10, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
    }

    /* JADX INFO: renamed from: b */
    public C0095w0 mo18393b(Object obj, String str) {
        StringBuilder sb2 = new StringBuilder("Recursion detected ");
        sb2.append(str);
        sb2.append(obj == null ? "" : AbstractC10763a.m11051i(obj, "on input: "));
        sb2.append(" under ");
        sb2.append(this);
        AssertionError assertionError = new AssertionError(sb2.toString());
        m18392c(assertionError);
        throw assertionError;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> T compute(InterfaceC1426a interfaceC1426a) {
        if (interfaceC1426a == null) {
            m18391a(34);
            throw null;
        }
        SimpleLock simpleLock = this.f53129a;
        simpleLock.lock();
        try {
            T t10 = (T) interfaceC1426a.invoke();
            simpleLock.unlock();
            return t10;
        } catch (Throwable th2) {
            try {
                throw this.f53130b.handleException(th2);
            } catch (Throwable th3) {
                simpleLock.unlock();
                throw th3;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> CacheWithNotNullValues<K, V> createCacheWithNotNullValues() {
        return new C18243c(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> CacheWithNullableValues<K, V> createCacheWithNullableValues() {
        return new C18245e(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> NotNullLazyValue<T> createLazyValue(InterfaceC1426a interfaceC1426a) {
        if (interfaceC1426a != null) {
            return new C18247g(this, interfaceC1426a);
        }
        m18391a(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> NotNullLazyValue<T> createLazyValueWithPostCompute(InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
        if (interfaceC1426a == null) {
            m18391a(28);
            throw null;
        }
        if (interfaceC1436k2 != null) {
            return new C18242b(this, interfaceC1426a, interfaceC1436k, interfaceC1436k2);
        }
        m18391a(29);
        throw null;
    }

    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(InterfaceC1436k interfaceC1436k, ConcurrentMap<K, Object> concurrentMap) {
        if (interfaceC1436k == null) {
            m18391a(14);
            throw null;
        }
        if (concurrentMap == null) {
            m18391a(15);
            throw null;
        }
        if (concurrentMap == null) {
            C18248h.m19770a(1);
            throw null;
        }
        if (interfaceC1436k != null) {
            return new C18248h(this, concurrentMap, interfaceC1436k);
        }
        C18248h.m19770a(2);
        throw null;
    }

    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(InterfaceC1436k interfaceC1436k, ConcurrentMap<K, Object> concurrentMap) {
        if (interfaceC1436k == null) {
            m18391a(21);
            throw null;
        }
        if (concurrentMap != null) {
            return new C16630d(this, concurrentMap, interfaceC1436k);
        }
        m18391a(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> NullableLazyValue<T> createNullableLazyValue(InterfaceC1426a interfaceC1426a) {
        if (interfaceC1426a != null) {
            return new C16629c(this, interfaceC1426a);
        }
        m18391a(30);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> NotNullLazyValue<T> createRecursionTolerantLazyValue(InterfaceC1426a interfaceC1426a, T t10) {
        if (interfaceC1426a == null) {
            m18391a(26);
            throw null;
        }
        if (t10 != null) {
            return new C18241a(this, interfaceC1426a, t10);
        }
        m18391a(27);
        throw null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(Separators.f31989AT);
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(" (");
        return AbstractC9306j0.m9891j(this.f53131c, Separators.RPAREN, sb2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(InterfaceC1436k interfaceC1436k) {
        if (interfaceC1436k != null) {
            MemoizedFunctionToNullable<K, V> memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues = createMemoizedFunctionWithNullableValues(interfaceC1436k, new ConcurrentHashMap(3, 1.0f, 2));
            if (memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues != null) {
                return memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues;
            }
            m18391a(20);
            throw null;
        }
        m18391a(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(InterfaceC1436k interfaceC1436k) {
        if (interfaceC1436k != null) {
            MemoizedFunctionToNotNull<K, V> memoizedFunctionToNotNullCreateMemoizedFunction = createMemoizedFunction(interfaceC1436k, new ConcurrentHashMap(3, 1.0f, 2));
            if (memoizedFunctionToNotNullCreateMemoizedFunction != null) {
                return memoizedFunctionToNotNullCreateMemoizedFunction;
            }
            m18391a(10);
            throw null;
        }
        m18391a(9);
        throw null;
    }

    public LockBasedStorageManager(String str) {
        this(str, (Runnable) null, (InterfaceC1436k) null);
    }

    public LockBasedStorageManager(String str, Runnable runnable, InterfaceC1436k interfaceC1436k) {
        this(str, ExceptionHandlingStrategy.THROW, SimpleLock.Companion.simpleLock(runnable, interfaceC1436k));
    }
}
