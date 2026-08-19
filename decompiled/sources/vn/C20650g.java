package vn;

/* JADX INFO: renamed from: vn.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C20650g {

    /* JADX INFO: renamed from: a */
    public final Throwable f65528a;

    public C20650g(Throwable th2) {
        if (th2 != null) {
            this.f65528a = th2;
        } else {
            m21200a(0);
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m21200a(int i10) {
        String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 1 ? 3 : 2];
        if (i10 != 1) {
            objArr[0] = "throwable";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
        }
        if (i10 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
        } else {
            objArr[1] = "getThrowable";
        }
        if (i10 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    public final String toString() {
        return this.f65528a.toString();
    }
}
