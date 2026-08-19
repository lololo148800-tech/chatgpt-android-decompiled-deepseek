package p025An;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1440o;

/* JADX INFO: renamed from: An.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C0640u {

    /* JADX INFO: renamed from: a */
    public final Object f1892a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0618j f1893b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1440o f1894c;

    /* JADX INFO: renamed from: d */
    public final Object f1895d;

    /* JADX INFO: renamed from: e */
    public final Throwable f1896e;

    public C0640u(Object obj, InterfaceC0618j interfaceC0618j, InterfaceC1440o interfaceC1440o, Object obj2, Throwable th2) {
        this.f1892a = obj;
        this.f1893b = interfaceC0618j;
        this.f1894c = interfaceC1440o;
        this.f1895d = obj2;
        this.f1896e = th2;
    }

    /* JADX INFO: renamed from: a */
    public static C0640u m1286a(C0640u c0640u, InterfaceC0618j interfaceC0618j, CancellationException cancellationException, int i10) {
        Object obj = c0640u.f1892a;
        if ((i10 & 2) != 0) {
            interfaceC0618j = c0640u.f1893b;
        }
        InterfaceC0618j interfaceC0618j2 = interfaceC0618j;
        InterfaceC1440o interfaceC1440o = c0640u.f1894c;
        Object obj2 = c0640u.f1895d;
        Throwable th2 = cancellationException;
        if ((i10 & 16) != 0) {
            th2 = c0640u.f1896e;
        }
        c0640u.getClass();
        return new C0640u(obj, interfaceC0618j2, interfaceC1440o, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0640u)) {
            return false;
        }
        C0640u c0640u = (C0640u) obj;
        return AbstractC16544l.m18089b(this.f1892a, c0640u.f1892a) && AbstractC16544l.m18089b(this.f1893b, c0640u.f1893b) && AbstractC16544l.m18089b(this.f1894c, c0640u.f1894c) && AbstractC16544l.m18089b(this.f1895d, c0640u.f1895d) && AbstractC16544l.m18089b(this.f1896e, c0640u.f1896e);
    }

    public final int hashCode() {
        Object obj = this.f1892a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC0618j interfaceC0618j = this.f1893b;
        int iHashCode2 = (iHashCode + (interfaceC0618j == null ? 0 : interfaceC0618j.hashCode())) * 31;
        InterfaceC1440o interfaceC1440o = this.f1894c;
        int iHashCode3 = (iHashCode2 + (interfaceC1440o == null ? 0 : interfaceC1440o.hashCode())) * 31;
        Object obj2 = this.f1895d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f1896e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f1892a + ", cancelHandler=" + this.f1893b + ", onCancellation=" + this.f1894c + ", idempotentResume=" + this.f1895d + ", cancelCause=" + this.f1896e + ')';
    }

    public /* synthetic */ C0640u(Object obj, InterfaceC0618j interfaceC0618j, InterfaceC1440o interfaceC1440o, CancellationException cancellationException, int i10) {
        this(obj, (i10 & 2) != 0 ? null : interfaceC0618j, (i10 & 4) != 0 ? null : interfaceC1440o, (Object) null, (i10 & 16) != 0 ? null : cancellationException);
    }
}
