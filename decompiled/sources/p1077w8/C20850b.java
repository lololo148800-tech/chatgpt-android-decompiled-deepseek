package p1077w8;

import io.sentry.C15358g1;
import java.util.ArrayList;
import p001A.C0095w0;
import p138F8.InterfaceC2677a;
import p523V9.AbstractC7933L4;
import p604Yk.C10077b;
import p661b7.InterfaceC11256c;
import p765g7.InterfaceC13823a;
import p849k7.C16360m;
import ph.C18416d;

/* JADX INFO: renamed from: w8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C20850b implements InterfaceC2677a {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC13823a f66292Y;

    /* JADX INFO: renamed from: Z */
    public final C0095w0 f66293Z;

    /* JADX INFO: renamed from: o0 */
    public final C10077b f66294o0;

    /* JADX INFO: renamed from: p0 */
    public final C15358g1 f66295p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC11256c f66296q0;

    public C20850b(InterfaceC13823a interfaceC13823a, C0095w0 c0095w0, C10077b c10077b, C15358g1 c15358g1, InterfaceC11256c interfaceC11256c) {
        this.f66292Y = interfaceC13823a;
        this.f66293Z = c0095w0;
        this.f66294o0 = c10077b;
        this.f66295p0 = c15358g1;
        this.f66296q0 = interfaceC11256c;
    }

    @Override // p138F8.InterfaceC2677a
    /* JADX INFO: renamed from: P0 */
    public final void mo3654P0(ArrayList arrayList) {
        C16360m c16360mMo15458n = this.f66292Y.mo15458n("tracing");
        if (c16360mMo15458n != null) {
            AbstractC7933L4.m8226d(c16360mMo15458n, new C18416d(arrayList, 11, this));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
