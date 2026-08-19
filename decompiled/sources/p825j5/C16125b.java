package p825j5;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p233J4.C4262h;

/* JADX INFO: renamed from: j5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C16125b implements InterfaceC16130g {

    /* JADX INFO: renamed from: Y */
    public final C4262h f50036Y;

    public C16125b(C4262h statement) {
        AbstractC16544l.m18094g(statement, "statement");
        this.f50036Y = statement;
    }

    @Override // p825j5.InterfaceC16130g
    /* JADX INFO: renamed from: a */
    public final long mo17680a() {
        return this.f50036Y.m5034e();
    }

    @Override // p825j5.InterfaceC16130g
    /* JADX INFO: renamed from: b */
    public final Object mo17681b(InterfaceC1436k interfaceC1436k) {
        throw new UnsupportedOperationException();
    }

    @Override // p825j5.InterfaceC16130g
    /* JADX INFO: renamed from: c */
    public final void mo17682c(int i10, String str) {
        C4262h c4262h = this.f50036Y;
        int i11 = i10 + 1;
        if (str == null) {
            c4262h.mo3426s0(i11);
        } else {
            c4262h.mo3422c(i11, str);
        }
    }

    @Override // p825j5.InterfaceC16130g
    public final void close() throws IOException {
        this.f50036Y.close();
    }
}
