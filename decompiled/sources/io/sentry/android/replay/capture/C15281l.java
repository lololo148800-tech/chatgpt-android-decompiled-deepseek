package io.sentry.android.replay.capture;

import io.sentry.C15108A1;
import io.sentry.C15128H0;
import io.sentry.C15516w;
import io.sentry.InterfaceC15124G;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C15281l extends AbstractC15283n {

    /* JADX INFO: renamed from: a */
    public final C15108A1 f47739a;

    /* JADX INFO: renamed from: b */
    public final C15128H0 f47740b;

    public C15281l(C15108A1 c15108a1, C15128H0 c15128h0) {
        this.f47739a = c15108a1;
        this.f47740b = c15128h0;
    }

    /* JADX INFO: renamed from: a */
    public static void m16511a(C15281l c15281l, InterfaceC15124G interfaceC15124G) {
        C15516w c15516w = new C15516w();
        c15281l.getClass();
        if (interfaceC15124G != null) {
            c15516w.f48471f = c15281l.f47740b;
            interfaceC15124G.mo16254w(c15281l.f47739a, c15516w);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15281l)) {
            return false;
        }
        C15281l c15281l = (C15281l) obj;
        return AbstractC16544l.m18089b(this.f47739a, c15281l.f47739a) && AbstractC16544l.m18089b(this.f47740b, c15281l.f47740b);
    }

    public final int hashCode() {
        return this.f47740b.hashCode() + (this.f47739a.hashCode() * 31);
    }

    public final String toString() {
        return "Created(replay=" + this.f47739a + ", recording=" + this.f47740b + ')';
    }
}
