package p305M3;

import java.io.IOException;

/* JADX INFO: renamed from: M3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C5291k extends IOException {
    public C5291k(Throwable th2) {
        String str;
        StringBuilder sb2 = new StringBuilder("Unexpected ");
        sb2.append(th2.getClass().getSimpleName());
        if (th2.getMessage() != null) {
            str = ": " + th2.getMessage();
        } else {
            str = "";
        }
        sb2.append(str);
        super(sb2.toString(), th2);
    }
}
