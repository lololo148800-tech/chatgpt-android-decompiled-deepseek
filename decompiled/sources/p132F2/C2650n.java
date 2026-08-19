package p132F2;

import java.util.List;

/* JADX INFO: renamed from: F2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2650n {

    /* JADX INFO: renamed from: a */
    public final List f8164a;

    public C2650n(List list) {
        this.f8164a = list;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("credentialOptions should not be empty");
        }
    }
}
