package p354O5;

import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.InterfaceC15088n;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: O5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6135e implements AutoCloseable {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC15088n f19995Y;

    @Override // java.lang.AutoCloseable
    public final void close() {
        AbstractC15070F.m16174b(this.f19995Y);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6135e) {
            return AbstractC16544l.m18089b(this.f19995Y, ((C6135e) obj).f19995Y);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19995Y.hashCode();
    }

    public final String toString() {
        return "KtorNetworkResponseBody(channel=" + this.f19995Y + ')';
    }
}
