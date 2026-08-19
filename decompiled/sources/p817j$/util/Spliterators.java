package p817j$.util;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class Spliterators {

    /* JADX INFO: renamed from: a */
    private static final Spliterator f48859a = new C15738o0();

    /* JADX INFO: renamed from: b */
    private static final InterfaceC15672X f48860b = new C15734m0();

    /* JADX INFO: renamed from: c */
    private static final InterfaceC15676a0 f48861c = new C15736n0();

    /* JADX INFO: renamed from: d */
    private static final InterfaceC15669U f48862d = new C15732l0();

    /* JADX INFO: renamed from: e */
    public static Spliterator m17277e() {
        return f48859a;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC15672X m17275c() {
        return f48860b;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC15676a0 m17276d() {
        return f48861c;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC15669U m17274b() {
        return f48862d;
    }

    /* JADX INFO: renamed from: m */
    public static Spliterator m17285m(Object[] objArr, int i10, int i11) {
        m17273a(((Object[]) Objects.requireNonNull(objArr)).length, i10, i11);
        return new C15728j0(objArr, i10, i11, 1040);
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC15672X m17283k(int[] iArr, int i10, int i11) {
        m17273a(((int[]) Objects.requireNonNull(iArr)).length, i10, i11);
        return new C15740p0(iArr, i10, i11, 1040);
    }

    /* JADX INFO: renamed from: l */
    public static InterfaceC15676a0 m17284l(long[] jArr, int i10, int i11) {
        m17273a(((long[]) Objects.requireNonNull(jArr)).length, i10, i11);
        return new C15744r0(jArr, i10, i11, 1040);
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceC15669U m17282j(double[] dArr, int i10, int i11) {
        m17273a(((double[]) Objects.requireNonNull(dArr)).length, i10, i11);
        return new C15730k0(dArr, i10, i11, 1040);
    }

    /* JADX INFO: renamed from: a */
    private static void m17273a(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException(i11);
            }
            if (i12 > i10) {
                throw new ArrayIndexOutOfBoundsException(i12);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i11 + ") > fence(" + i12 + Separators.RPAREN);
    }

    public static <T> Spliterator<T> spliterator(Collection<? extends T> collection, int i10) {
        return new C15742q0((Collection) Objects.requireNonNull(collection), i10);
    }

    /* JADX INFO: renamed from: n */
    public static Spliterator m17286n(Iterator it) {
        return new C15742q0((Iterator) Objects.requireNonNull(it));
    }

    /* JADX INFO: renamed from: i */
    public static Iterator m17281i(Spliterator spliterator) {
        Objects.requireNonNull(spliterator);
        return new C15713f0(spliterator);
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC15659J m17279g(InterfaceC15672X interfaceC15672X) {
        Objects.requireNonNull(interfaceC15672X);
        return new C15722g0(interfaceC15672X);
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC15663N m17280h(InterfaceC15676a0 interfaceC15676a0) {
        Objects.requireNonNull(interfaceC15676a0);
        return new C15724h0(interfaceC15676a0);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC15655F m17278f(InterfaceC15669U interfaceC15669U) {
        Objects.requireNonNull(interfaceC15669U);
        return new C15726i0(interfaceC15669U);
    }
}
