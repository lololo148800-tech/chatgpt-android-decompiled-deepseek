package p537W0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;

/* JADX INFO: renamed from: W0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8411c {

    /* JADX INFO: renamed from: a */
    public static final Object f26156a = new Object();

    /* JADX INFO: renamed from: b */
    public static final C8415g f26157b = new C8415g(0, new long[0], new Object[0]);

    /* JADX INFO: renamed from: a */
    public static final int m8967a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    /* JADX INFO: renamed from: b */
    public static final C8410b m8968b(int i10, C6021p c6021p, AbstractC16546n abstractC16546n) {
        C8410b c8410b;
        c6021p.m6521P(Integer.rotateLeft(i10, 1), f26156a);
        Object objM6514H = c6021p.m6514H();
        if (objM6514H == C6013l.f19514a) {
            c8410b = new C8410b(abstractC16546n, true, i10);
            c6021p.m6537c0(c8410b);
        } else {
            AbstractC16544l.m18092e(objM6514H, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            c8410b = (C8410b) objM6514H;
            c8410b.m8966f(abstractC16546n);
        }
        c6021p.m6553p(false);
        return c8410b;
    }

    /* JADX INFO: renamed from: c */
    public static final C8410b m8969c(int i10, C6021p c6021p, AbstractC16546n abstractC16546n) {
        Object objM6514H = c6021p.m6514H();
        if (objM6514H == C6013l.f19514a) {
            objM6514H = new C8410b(abstractC16546n, true, i10);
            c6021p.m6537c0(objM6514H);
        }
        C8410b c8410b = (C8410b) objM6514H;
        c8410b.m8966f(abstractC16546n);
        return c8410b;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m8970d(C6018n0 c6018n0, C6018n0 c6018n1) {
        return c6018n0 == null || ((c6018n0 instanceof C6018n0) && (!c6018n0.m6500b() || c6018n0.equals(c6018n1) || AbstractC16544l.m18089b(c6018n0.f19535c, c6018n1.f19535c)));
    }
}
