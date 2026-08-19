package io.sentry;

import io.sentry.util.AbstractC15503h;
import java.nio.charset.Charset;
import java.util.UUID;
import p544W9.AbstractC8483G3;
import p658b5.C11248s;

/* JADX INFO: renamed from: io.sentry.M1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15144M1 implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Z */
    public static final C15144M1 f47154Z = new C15144M1(new UUID(0, 0));

    /* JADX INFO: renamed from: Y */
    public final String f47155Y;

    public C15144M1(String str) {
        AbstractC8483G3.m9133c(str, "value is required");
        this.f47155Y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15144M1.class != obj.getClass()) {
            return false;
        }
        return this.f47155Y.equals(((C15144M1) obj).f47155Y);
    }

    public final int hashCode() {
        return this.f47155Y.hashCode();
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        ((C11248s) interfaceC15523y0).m12660D(this.f47155Y);
    }

    public final String toString() {
        return this.f47155Y;
    }

    public C15144M1() {
        this(UUID.randomUUID());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C15144M1(UUID uuid) {
        String string = uuid.toString();
        Charset charset = AbstractC15503h.f48425a;
        this((string.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : string).replace("-", "").substring(0, 16));
    }
}
