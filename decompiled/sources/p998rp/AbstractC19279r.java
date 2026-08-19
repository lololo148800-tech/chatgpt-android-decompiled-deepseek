package p998rp;

import java.lang.reflect.Field;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kp.RunnableC16647b;
import p413Qo.AbstractC6765c;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: rp.r */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC19279r {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f61085a;

    static {
        Object obj = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(cls);
            e = null;
            obj = obj2;
        } catch (ClassNotFoundException e10) {
            e = e10;
        } catch (IllegalAccessException e11) {
            e = e11;
        } catch (IllegalArgumentException e12) {
            e = e12;
        } catch (NoSuchFieldException e13) {
            e = e13;
        } catch (SecurityException e14) {
            e = e14;
        }
        Unsafe unsafe = (Unsafe) obj;
        f61085a = unsafe;
        if (unsafe == null) {
            throw new Error("Could not obtain access to sun.misc.Unsafe", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m20343a(long j10, long j11, long j12, C19265d c19265d, C19265d c19265d2) {
        if (j10 < 0 || j10 >= c19265d.f61077Z) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
        }
        if (j11 < 0 || j11 >= c19265d2.f61077Z) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (j12 < 0) {
            throw new IllegalArgumentException("length < 0");
        }
        if (c19265d2.f61079p0) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        int iM7197e = (int) AbstractC6765c.m7197e(j12, AbstractC19264c.f61066c);
        if (iM7197e < 2 || j12 < AbstractC19264c.f61067d) {
            long j13 = j10;
            long j14 = j11;
            while (j13 < j10 + j12) {
                c19265d2.m20341c(c19265d.m20340b(j13), j14);
                j13++;
                j14++;
            }
            return;
        }
        long j15 = j12 / ((long) iM7197e);
        Future[] futureArr = new Future[iM7197e];
        int i10 = 0;
        while (i10 < iM7197e) {
            long j16 = ((long) i10) * j15;
            int i11 = i10;
            Future[] futureArr2 = futureArr;
            futureArr2[i11] = AbstractC19264c.m20338c(new RunnableC16647b(j16, i10 == iM7197e + (-1) ? j12 : j16 + j15, j11, j10, c19265d2, c19265d));
            i10 = i11 + 1;
            futureArr = futureArr2;
        }
        try {
            AbstractC19264c.m20339d(futureArr);
        } catch (InterruptedException unused) {
            long j17 = j10;
            long j18 = j11;
            while (j17 < j10 + j12) {
                c19265d2.m20341c(c19265d.m20340b(j17), j18);
                j17++;
                j18++;
            }
        } catch (ExecutionException unused2) {
            long j19 = j10;
            long j20 = j11;
            while (j19 < j10 + j12) {
                c19265d2.m20341c(c19265d.m20340b(j19), j20);
                j19++;
                j20++;
            }
        }
    }
}
