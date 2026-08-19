package kotlin.jvm.internal;

import android.gov.nist.core.Separators;
import java.util.List;
import p008A6.C0386f;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3757e;
import p225Im.InterfaceC3777y;
import p523V9.AbstractC8138m0;
import p571X9.AbstractC9306j0;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: kotlin.jvm.internal.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C16532I implements InterfaceC3777y {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC3757e f51267Y;

    /* JADX INFO: renamed from: Z */
    public final List f51268Z;

    /* JADX INFO: renamed from: o0 */
    public final int f51269o0;

    public C16532I(InterfaceC3757e classifier, List arguments, int i10) {
        AbstractC16544l.m18094g(classifier, "classifier");
        AbstractC16544l.m18094g(arguments, "arguments");
        this.f51267Y = classifier;
        this.f51268Z = arguments;
        this.f51269o0 = i10;
    }

    @Override // p225Im.InterfaceC3777y
    /* JADX INFO: renamed from: b */
    public final boolean mo4452b() {
        return (this.f51269o0 & 1) != 0;
    }

    /* JADX INFO: renamed from: d */
    public final String m18085d(boolean z6) {
        String name;
        InterfaceC3757e interfaceC3757e = this.f51267Y;
        InterfaceC3756d interfaceC3756d = interfaceC3757e instanceof InterfaceC3756d ? (InterfaceC3756d) interfaceC3757e : null;
        Class clsM8667b = interfaceC3756d != null ? AbstractC8138m0.m8667b(interfaceC3756d) : null;
        if (clsM8667b == null) {
            name = interfaceC3757e.toString();
        } else if ((this.f51269o0 & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsM8667b.isArray()) {
            if (clsM8667b.equals(boolean[].class)) {
                name = "kotlin.BooleanArray";
            } else if (clsM8667b.equals(char[].class)) {
                name = "kotlin.CharArray";
            } else if (clsM8667b.equals(byte[].class)) {
                name = "kotlin.ByteArray";
            } else if (clsM8667b.equals(short[].class)) {
                name = "kotlin.ShortArray";
            } else if (clsM8667b.equals(int[].class)) {
                name = "kotlin.IntArray";
            } else if (clsM8667b.equals(float[].class)) {
                name = "kotlin.FloatArray";
            } else if (clsM8667b.equals(long[].class)) {
                name = "kotlin.LongArray";
            } else {
                name = clsM8667b.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
            }
        } else if (z6 && clsM8667b.isPrimitive()) {
            AbstractC16544l.m18092e(interfaceC3757e, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = AbstractC8138m0.m8668c((InterfaceC3756d) interfaceC3757e).getName();
        } else {
            name = clsM8667b.getName();
        }
        List list = this.f51268Z;
        return AbstractC9306j0.m9890i(name, list.isEmpty() ? "" : AbstractC17680n.m19349Y(list, ", ", Separators.LESS_THAN, Separators.GREATER_THAN, 0, null, new C0386f(this, 27), 24), mo4452b() ? Separators.QUESTION : "");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16532I) {
            C16532I c16532i = (C16532I) obj;
            if (AbstractC16544l.m18089b(this.f51267Y, c16532i.f51267Y) && AbstractC16544l.m18089b(this.f51268Z, c16532i.f51268Z) && AbstractC16544l.m18089b(null, null) && this.f51269o0 == c16532i.f51269o0) {
                return true;
            }
        }
        return false;
    }

    @Override // p225Im.InterfaceC3777y
    public final List getArguments() {
        return this.f51268Z;
    }

    @Override // p225Im.InterfaceC3777y
    public final InterfaceC3757e getClassifier() {
        return this.f51267Y;
    }

    public final int hashCode() {
        return AbstractC14376f.m15858x(this.f51268Z, this.f51267Y.hashCode() * 31, 31) + this.f51269o0;
    }

    public final String toString() {
        return m18085d(false) + " (Kotlin reflection is not available)";
    }
}
