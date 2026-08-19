package io.sentry;

import io.sentry.exception.C15351a;
import io.sentry.protocol.C15425E;
import io.sentry.protocol.C15430c;
import io.sentry.protocol.C15431d;
import io.sentry.protocol.C15441n;
import io.sentry.protocol.C15445r;
import io.sentry.protocol.C15447t;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: io.sentry.S0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15160S0 {

    /* JADX INFO: renamed from: A0 */
    public AbstractMap f47193A0;

    /* JADX INFO: renamed from: Y */
    public C15447t f47194Y;

    /* JADX INFO: renamed from: Z */
    public final C15430c f47195Z;

    /* JADX INFO: renamed from: o0 */
    public C15445r f47196o0;

    /* JADX INFO: renamed from: p0 */
    public C15441n f47197p0;

    /* JADX INFO: renamed from: q0 */
    public AbstractMap f47198q0;

    /* JADX INFO: renamed from: r0 */
    public String f47199r0;

    /* JADX INFO: renamed from: s0 */
    public String f47200s0;

    /* JADX INFO: renamed from: t0 */
    public String f47201t0;

    /* JADX INFO: renamed from: u0 */
    public C15425E f47202u0;

    /* JADX INFO: renamed from: v0 */
    public transient Exception f47203v0;

    /* JADX INFO: renamed from: w0 */
    public String f47204w0;

    /* JADX INFO: renamed from: x0 */
    public String f47205x0;

    /* JADX INFO: renamed from: y0 */
    public List f47206y0;

    /* JADX INFO: renamed from: z0 */
    public C15431d f47207z0;

    public AbstractC15160S0(C15447t c15447t) {
        this.f47195Z = new C15430c();
        this.f47194Y = c15447t;
    }

    /* JADX INFO: renamed from: a */
    public final Throwable m16339a() {
        Exception exc = this.f47203v0;
        return exc instanceof C15351a ? ((C15351a) exc).f47931Z : exc;
    }

    /* JADX INFO: renamed from: b */
    public final void m16340b(Object obj, String str) {
        if (this.f47193A0 == null) {
            this.f47193A0 = new HashMap();
        }
        this.f47193A0.put(str, obj);
    }

    /* JADX INFO: renamed from: c */
    public final void m16341c(String str, String str2) {
        if (this.f47198q0 == null) {
            this.f47198q0 = new HashMap();
        }
        this.f47198q0.put(str, str2);
    }

    public AbstractC15160S0() {
        this(new C15447t((UUID) null));
    }
}
