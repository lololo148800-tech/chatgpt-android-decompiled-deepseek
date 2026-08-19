package p1027tp;

import android.os.Build;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import p084D4.ExecutorC1912f;

/* JADX INFO: renamed from: tp.H */
/* JADX INFO: loaded from: classes2.dex */
public final class C20043H extends C20044I {
    @Override // p1027tp.C20044I
    /* JADX INFO: renamed from: a */
    public final Executor mo20859a() {
        return new ExecutorC1912f(1);
    }

    @Override // p1027tp.C20044I
    /* JADX INFO: renamed from: b */
    public final Object mo20860b(Method method, Class cls, Object obj, Object... objArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.mo20860b(method, cls, obj, objArr);
        }
        throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
    }
}
