package p1117y1;

import p523V9.AbstractC8005U5;
import p523V9.AbstractC8111i5;

/* JADX INFO: renamed from: y1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21361a extends AbstractC8005U5 {

    /* JADX INFO: renamed from: b */
    public InterfaceC21366f f67834b;

    @Override // p523V9.AbstractC8005U5
    /* JADX INFO: renamed from: b */
    public final boolean mo8311b(C21368h c21368h) {
        return c21368h == this.f67834b.getKey();
    }

    @Override // p523V9.AbstractC8005U5
    /* JADX INFO: renamed from: c */
    public final Object mo8312c(C21368h c21368h) {
        if (c21368h == this.f67834b.getKey()) {
            return this.f67834b.getValue();
        }
        AbstractC8111i5.m8592c("Check failed.");
        throw null;
    }
}
