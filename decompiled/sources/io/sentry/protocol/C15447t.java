package io.sentry.protocol;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import io.sentry.util.AbstractC15503h;
import java.nio.charset.Charset;
import java.util.UUID;
import p658b5.C11248s;

/* JADX INFO: renamed from: io.sentry.protocol.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C15447t implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Z */
    public static final C15447t f48216Z = new C15447t(new UUID(0, 0));

    /* JADX INFO: renamed from: Y */
    public final UUID f48217Y;

    public C15447t(UUID uuid) {
        this.f48217Y = uuid == null ? UUID.randomUUID() : uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C15447t.class == obj.getClass() && this.f48217Y.compareTo(((C15447t) obj).f48217Y) == 0;
    }

    public final int hashCode() {
        return this.f48217Y.hashCode();
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        ((C11248s) interfaceC15523y0).m12660D(toString());
    }

    public final String toString() {
        String string = this.f48217Y.toString();
        Charset charset = AbstractC15503h.f48425a;
        if (string.equals("0000-0000")) {
            string = "00000000-0000-0000-0000-000000000000";
        }
        return string.replace("-", "");
    }

    public C15447t(String str) {
        Charset charset = AbstractC15503h.f48425a;
        str = str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
        str = str.length() == 32 ? new StringBuilder(str).insert(8, "-").insert(13, "-").insert(18, "-").insert(23, "-").toString() : str;
        if (str.length() == 36) {
            this.f48217Y = UUID.fromString(str);
            return;
        }
        throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
    }
}
