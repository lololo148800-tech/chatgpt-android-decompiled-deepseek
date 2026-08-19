package p817j$.util.concurrent;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import p817j$.util.stream.AbstractC16012y0;
import p817j$.util.stream.C15757C;
import p817j$.util.stream.C15949m0;

/* JADX INFO: loaded from: classes4.dex */
public class ThreadLocalRandom extends Random {
    private static final long serialVersionUID = -5851777807851030925L;

    /* JADX INFO: renamed from: a */
    long f48901a;

    /* JADX INFO: renamed from: b */
    int f48902b;

    /* JADX INFO: renamed from: c */
    boolean f48903c;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};

    /* JADX INFO: renamed from: d */
    private static final ThreadLocal f48897d = new ThreadLocal();

    /* JADX INFO: renamed from: e */
    private static final AtomicInteger f48898e = new AtomicInteger();

    /* JADX INFO: renamed from: f */
    private static final ThreadLocal f48899f = new C15704w();

    /* JADX INFO: renamed from: g */
    private static final AtomicLong f48900g = new AtomicLong(m17316h(System.currentTimeMillis()) ^ m17316h(System.nanoTime()));

    /* synthetic */ ThreadLocalRandom(int i10) {
        this();
    }

    /* JADX INFO: renamed from: g */
    private static int m17315g(long j10) {
        long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
        return (int) (((j11 ^ (j11 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    /* JADX INFO: renamed from: h */
    private static long m17316h(long j10) {
        long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
        long j12 = (j11 ^ (j11 >>> 33)) * (-4265267296055464877L);
        return j12 ^ (j12 >>> 33);
    }

    private ThreadLocalRandom() {
        this.f48903c = true;
    }

    /* JADX INFO: renamed from: f */
    static final void m17314f() {
        int iAddAndGet = f48898e.addAndGet(-1640531527);
        if (iAddAndGet == 0) {
            iAddAndGet = 1;
        }
        long jM17316h = m17316h(f48900g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f48899f.get();
        threadLocalRandom.f48901a = jM17316h;
        threadLocalRandom.f48902b = iAddAndGet;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f48899f.get();
        if (threadLocalRandom.f48902b == 0) {
            m17314f();
        }
        return threadLocalRandom;
    }

    @Override // java.util.Random
    public final void setSeed(long j10) {
        if (this.f48903c) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: i */
    final long m17320i() {
        long j10 = this.f48901a - 7046029254386353131L;
        this.f48901a = j10;
        return j10;
    }

    @Override // java.util.Random
    protected final int next(int i10) {
        return nextInt() >>> (32 - i10);
    }

    /* JADX INFO: renamed from: e */
    final long m17319e(long j10, long j11) {
        long jM17316h = m17316h(m17320i());
        if (j10 >= j11) {
            return jM17316h;
        }
        long j12 = j11 - j10;
        long j13 = j12 - 1;
        if ((j12 & j13) == 0) {
            return (jM17316h & j13) + j10;
        }
        if (j12 > 0) {
            while (true) {
                long j14 = jM17316h >>> 1;
                long j15 = j14 + j13;
                long j16 = j14 % j12;
                if (j15 - j16 >= 0) {
                    return j16 + j10;
                }
                jM17316h = m17316h(m17320i());
            }
        } else {
            while (true) {
                if (jM17316h >= j10 && jM17316h < j11) {
                    return jM17316h;
                }
                jM17316h = m17316h(m17320i());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    final int m17318d(int i10, int i11) {
        int i12;
        int iM17315g = m17315g(m17320i());
        if (i10 >= i11) {
            return iM17315g;
        }
        int i13 = i11 - i10;
        int i14 = i13 - 1;
        if ((i13 & i14) == 0) {
            i12 = iM17315g & i14;
        } else if (i13 > 0) {
            int iM17315g2 = iM17315g >>> 1;
            while (true) {
                int i15 = iM17315g2 + i14;
                i12 = iM17315g2 % i13;
                if (i15 - i12 >= 0) {
                    break;
                }
                iM17315g2 = m17315g(m17320i()) >>> 1;
            }
        } else {
            while (true) {
                if (iM17315g >= i10 && iM17315g < i11) {
                    return iM17315g;
                }
                iM17315g = m17315g(m17320i());
            }
        }
        return i12 + i10;
    }

    /* JADX INFO: renamed from: c */
    final double m17317c(double d10, double d11) {
        double dNextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d10 >= d11) {
            return dNextLong;
        }
        double d12 = ((d11 - d10) * dNextLong) + d10;
        return d12 >= d11 ? Double.longBitsToDouble(Double.doubleToLongBits(d11) - 1) : d12;
    }

    @Override // java.util.Random
    public final int nextInt() {
        return m17315g(m17320i());
    }

    @Override // java.util.Random
    public final int nextInt(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int iM17315g = m17315g(m17320i());
        int i11 = i10 - 1;
        if ((i10 & i11) == 0) {
            return iM17315g & i11;
        }
        while (true) {
            int i12 = iM17315g >>> 1;
            int i13 = i12 + i11;
            int i14 = i12 % i10;
            if (i13 - i14 >= 0) {
                return i14;
            }
            iM17315g = m17315g(m17320i());
        }
    }

    public final int nextInt(int i10, int i11) {
        if (i10 >= i11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return m17318d(i10, i11);
    }

    @Override // java.util.Random
    public final long nextLong() {
        return m17316h(m17320i());
    }

    public final long nextLong(long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        long jM17316h = m17316h(m17320i());
        long j11 = j10 - 1;
        if ((j10 & j11) == 0) {
            return jM17316h & j11;
        }
        while (true) {
            long j12 = jM17316h >>> 1;
            long j13 = j12 + j11;
            long j14 = j12 % j10;
            if (j13 - j14 >= 0) {
                return j14;
            }
            jM17316h = m17316h(m17320i());
        }
    }

    public long nextLong(long j10, long j11) {
        if (j10 >= j11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return m17319e(j10, j11);
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (m17316h(m17320i()) >>> 11) * 1.1102230246251565E-16d;
    }

    public final double nextDouble(double d10) {
        if (d10 <= 0.0d) {
            throw new IllegalArgumentException("bound must be positive");
        }
        double dM17316h = (m17316h(m17320i()) >>> 11) * 1.1102230246251565E-16d * d10;
        return dM17316h < d10 ? dM17316h : Double.longBitsToDouble(Double.doubleToLongBits(d10) - 1);
    }

    public final double nextDouble(double d10, double d11) {
        if (d10 >= d11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return m17317c(d10, d11);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return m17315g(m17320i()) < 0;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (m17315g(m17320i()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = f48897d;
        Double d10 = (Double) threadLocal.get();
        if (d10 != null) {
            threadLocal.set(null);
            return d10.doubleValue();
        }
        while (true) {
            double dNextDouble = (nextDouble() * 2.0d) - 1.0d;
            double dNextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d11 = (dNextDouble2 * dNextDouble2) + (dNextDouble * dNextDouble);
            if (d11 < 1.0d && d11 != 0.0d) {
                double dSqrt = StrictMath.sqrt((StrictMath.log(d11) * (-2.0d)) / d11);
                threadLocal.set(Double.valueOf(dNextDouble2 * dSqrt));
                return dNextDouble * dSqrt;
            }
        }
    }

    @Override // java.util.Random
    public final IntStream ints(long j10) {
        if (j10 >= 0) {
            return j$.util.stream.IntStream.Wrapper.convert(AbstractC16012y0.m17542T(new C15707z(0L, j10, Integer.MAX_VALUE, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final IntStream ints() {
        return j$.util.stream.IntStream.Wrapper.convert(AbstractC16012y0.m17542T(new C15707z(0L, Long.MAX_VALUE, Integer.MAX_VALUE, 0)));
    }

    @Override // java.util.Random
    public final IntStream ints(long j10, int i10, int i11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (i10 < i11) {
            return j$.util.stream.IntStream.Wrapper.convert(AbstractC16012y0.m17542T(new C15707z(0L, j10, i10, i11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final IntStream ints(int i10, int i11) {
        if (i10 < i11) {
            return j$.util.stream.IntStream.Wrapper.convert(AbstractC16012y0.m17542T(new C15707z(0L, Long.MAX_VALUE, i10, i11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs(long j10) {
        if (j10 >= 0) {
            return C15949m0.m17500j(AbstractC16012y0.m17544V(new C15681A(0L, j10, Long.MAX_VALUE, 0L)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs() {
        return C15949m0.m17500j(AbstractC16012y0.m17544V(new C15681A(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L)));
    }

    @Override // java.util.Random
    public final LongStream longs(long j10, long j11, long j12) {
        if (j10 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (j11 < j12) {
            return C15949m0.m17500j(AbstractC16012y0.m17544V(new C15681A(0L, j10, j11, j12)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs(long j10, long j11) {
        if (j10 < j11) {
            return C15949m0.m17500j(AbstractC16012y0.m17544V(new C15681A(0L, Long.MAX_VALUE, j10, j11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j10) {
        if (j10 >= 0) {
            return C15757C.m17368j(AbstractC16012y0.m17533K(new C15706y(0L, j10, Double.MAX_VALUE, 0.0d)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        return C15757C.m17368j(AbstractC16012y0.m17533K(new C15706y(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d)));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j10, double d10, double d11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (d10 < d11) {
            return C15757C.m17368j(AbstractC16012y0.m17533K(new C15706y(0L, j10, d10, d11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d10, double d11) {
        if (d10 < d11) {
            return C15757C.m17368j(AbstractC16012y0.m17533K(new C15706y(0L, Long.MAX_VALUE, d10, d11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    /* JADX INFO: renamed from: b */
    static final int m17313b() {
        return ((ThreadLocalRandom) f48899f.get()).f48902b;
    }

    /* JADX INFO: renamed from: a */
    static final int m17312a(int i10) {
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >>> 17);
        int i13 = i12 ^ (i12 << 5);
        ((ThreadLocalRandom) f48899f.get()).f48902b = i13;
        return i13;
    }

    static {
        if (((Boolean) AccessController.doPrivileged(new C15705x())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j10 = ((long) seed[0]) & 255;
            for (int i10 = 1; i10 < 8; i10++) {
                j10 = (j10 << 8) | (((long) seed[i10]) & 255);
            }
            f48900g.set(j10);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("rnd", this.f48901a);
        putFieldPutFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    private Object readResolve() {
        return current();
    }
}
