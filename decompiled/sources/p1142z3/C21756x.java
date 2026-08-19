package p1142z3;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: z3.x */
/* JADX INFO: loaded from: classes.dex */
public final class C21756x implements InterfaceC21740h {

    /* JADX INFO: renamed from: Y */
    public static final C21756x f69015Y = new C21756x();

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: a */
    public final long mo926a(C21743k c21743k) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // p1142z3.InterfaceC21740h
    public final Uri getUri() {
        return null;
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: h */
    public final Map mo929h() {
        return Collections.emptyMap();
    }

    @Override // p1016t3.InterfaceC19782i
    public final int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // p1142z3.InterfaceC21740h
    public final void close() {
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: c */
    public final void mo927c(InterfaceC21730C interfaceC21730C) {
    }
}
