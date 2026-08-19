package p1005s5;

import java.io.File;
import p1075w5.C20835m;

/* JADX INFO: renamed from: s5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C19448a implements InterfaceC19449b {

    /* JADX INFO: renamed from: a */
    public final boolean f61708a;

    public C19448a(boolean z6) {
        this.f61708a = z6;
    }

    @Override // p1005s5.InterfaceC19449b
    /* JADX INFO: renamed from: a */
    public final String mo20538a(Object obj, C20835m c20835m) {
        File file = (File) obj;
        if (!this.f61708a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
