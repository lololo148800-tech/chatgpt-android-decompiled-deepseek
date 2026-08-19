package p232J3;

import java.io.IOException;

/* JADX INFO: renamed from: J3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C4233e extends IOException {
    public C4233e(int i10) {
        super("Illegal clipping: ".concat(i10 != 0 ? i10 != 1 ? i10 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
    }
}
