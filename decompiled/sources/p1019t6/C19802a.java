package p1019t6;

import java.io.IOException;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p1006s6.C19453c;
import p1006s6.InterfaceC19456f;

/* JADX INFO: renamed from: t6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C19802a implements InterfaceC19456f {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC19456f f62824Y;

    /* JADX INFO: renamed from: Z */
    public final LinkedHashMap f62825Z = new LinkedHashMap();

    public C19802a(InterfaceC19456f interfaceC19456f) {
        this.f62824Y = interfaceC19456f;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: B */
    public final InterfaceC19456f mo20539B(long j10) {
        this.f62824Y.mo20539B(j10);
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: C */
    public final InterfaceC19456f mo20540C(int i10) {
        this.f62824Y.mo20540C(i10);
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: F */
    public final InterfaceC19456f mo20542F(double d10) {
        this.f62824Y.mo20542F(d10);
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: I0 */
    public final InterfaceC19456f mo20543I0() {
        this.f62824Y.mo20543I0();
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: L */
    public final InterfaceC19456f mo20544L(String value) {
        AbstractC16544l.m18094g(value, "value");
        this.f62824Y.mo20544L(value);
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: M0 */
    public final InterfaceC19456f mo20545M0(String name) {
        AbstractC16544l.m18094g(name, "name");
        this.f62824Y.mo20545M0(name);
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: X */
    public final InterfaceC19456f mo20548X(boolean z6) {
        this.f62824Y.mo20548X(z6);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f62824Y.close();
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: j */
    public final InterfaceC19456f mo20551j() {
        this.f62824Y.mo20551j();
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: o */
    public final InterfaceC19456f mo20554o() {
        this.f62824Y.mo20554o();
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: p */
    public final InterfaceC19456f mo20555p() {
        this.f62824Y.mo20555p();
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: q */
    public final InterfaceC19456f mo20556q() {
        this.f62824Y.mo20556q();
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: u0 */
    public final InterfaceC19456f mo20557u0(C19453c value) {
        AbstractC16544l.m18094g(value, "value");
        this.f62824Y.mo20557u0(value);
        return this;
    }
}
