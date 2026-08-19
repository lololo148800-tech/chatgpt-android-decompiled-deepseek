package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import p001A.C0095w0;
import p049Bm.InterfaceC1426a;
import p932on.EnumC18249i;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.c */
/* JADX INFO: loaded from: classes2.dex */
public class C16629c implements NullableLazyValue {

    /* JADX INFO: renamed from: Y */
    public final LockBasedStorageManager f53133Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC1426a f53134Z;

    /* JADX INFO: renamed from: o0 */
    public volatile Object f53135o0;

    public C16629c(LockBasedStorageManager lockBasedStorageManager, InterfaceC1426a interfaceC1426a) {
        if (lockBasedStorageManager == null) {
            m18394a(0);
            throw null;
        }
        if (interfaceC1426a == null) {
            m18394a(1);
            throw null;
        }
        this.f53135o0 = EnumC18249i.f58134Y;
        this.f53133Y = lockBasedStorageManager;
        this.f53134Z = interfaceC1426a;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18394a(int i10) {
        String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "computable";
        } else if (i10 == 2 || i10 == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 2) {
            objArr[1] = "recursionDetected";
        } else if (i10 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i10 != 2 && i10 != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public void mo18395b(Object obj) {
    }

    /* JADX INFO: renamed from: c */
    public C0095w0 mo18396c(boolean z6) {
        C0095w0 c0095w0Mo18393b = this.f53133Y.mo18393b(null, "in a lazy value");
        if (c0095w0Mo18393b != null) {
            return c0095w0Mo18393b;
        }
        m18394a(2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x003c A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:16:0x002c, B:18:0x0037, B:20:0x003c, B:22:0x0045, B:23:0x0048, B:27:0x0057, B:29:0x005d, B:31:0x0061, B:32:0x0067, B:33:0x006f, B:34:0x0070, B:35:0x0076, B:24:0x004a), top: B:38:0x0012, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0045 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:16:0x002c, B:18:0x0037, B:20:0x003c, B:22:0x0045, B:23:0x0048, B:27:0x0057, B:29:0x005d, B:31:0x0061, B:32:0x0067, B:33:0x006f, B:34:0x0070, B:35:0x0076, B:24:0x004a), top: B:38:0x0012, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0048 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:16:0x002c, B:18:0x0037, B:20:0x003c, B:22:0x0045, B:23:0x0048, B:27:0x0057, B:29:0x005d, B:31:0x0061, B:32:0x0067, B:33:0x006f, B:34:0x0070, B:35:0x0076, B:24:0x004a), top: B:38:0x0012, inners: #1 }] */
    @Override // kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue, p049Bm.InterfaceC1426a
    public Object invoke() {
        Object objInvoke;
        C0095w0 c0095w0Mo18396c;
        Object obj = this.f53135o0;
        if (!(obj instanceof EnumC18249i)) {
            return WrappedValues.unescapeThrowable(obj);
        }
        this.f53133Y.f53129a.lock();
        try {
            Object obj2 = this.f53135o0;
            if (obj2 instanceof EnumC18249i) {
                EnumC18249i enumC18249i = EnumC18249i.f58135Z;
                EnumC18249i enumC18249i2 = EnumC18249i.f58136o0;
                if (obj2 == enumC18249i) {
                    this.f53135o0 = enumC18249i2;
                    C0095w0 c0095w0Mo18396c2 = mo18396c(true);
                    if (!c0095w0Mo18396c2.f410Z) {
                        objInvoke = c0095w0Mo18396c2.f411o0;
                    } else if (obj2 == enumC18249i2) {
                        c0095w0Mo18396c = mo18396c(false);
                        if (c0095w0Mo18396c.f410Z) {
                            this.f53135o0 = enumC18249i;
                            try {
                                objInvoke = this.f53134Z.invoke();
                                mo18395b(objInvoke);
                                this.f53135o0 = objInvoke;
                            } catch (Throwable th2) {
                                if (ExceptionUtilsKt.isProcessCanceledException(th2)) {
                                    this.f53135o0 = EnumC18249i.f58134Y;
                                    throw th2;
                                }
                                if (this.f53135o0 == enumC18249i) {
                                    this.f53135o0 = WrappedValues.escapeThrowable(th2);
                                }
                                throw this.f53133Y.f53130b.handleException(th2);
                            }
                        } else {
                            objInvoke = c0095w0Mo18396c.f411o0;
                        }
                    } else {
                        this.f53135o0 = enumC18249i;
                        objInvoke = this.f53134Z.invoke();
                        mo18395b(objInvoke);
                        this.f53135o0 = objInvoke;
                    }
                } else if (obj2 == enumC18249i2) {
                    c0095w0Mo18396c = mo18396c(false);
                    if (c0095w0Mo18396c.f410Z) {
                        objInvoke = c0095w0Mo18396c.f411o0;
                    } else {
                        this.f53135o0 = enumC18249i;
                        objInvoke = this.f53134Z.invoke();
                        mo18395b(objInvoke);
                        this.f53135o0 = objInvoke;
                    }
                } else {
                    this.f53135o0 = enumC18249i;
                    objInvoke = this.f53134Z.invoke();
                    mo18395b(objInvoke);
                    this.f53135o0 = objInvoke;
                }
            } else {
                objInvoke = WrappedValues.unescapeThrowable(obj2);
            }
            this.f53133Y.f53129a.unlock();
            return objInvoke;
        } catch (Throwable th3) {
            this.f53133Y.f53129a.unlock();
            throw th3;
        }
    }

    public final boolean isComputed() {
        return (this.f53135o0 == EnumC18249i.f58134Y || this.f53135o0 == EnumC18249i.f58135Z) ? false : true;
    }
}
