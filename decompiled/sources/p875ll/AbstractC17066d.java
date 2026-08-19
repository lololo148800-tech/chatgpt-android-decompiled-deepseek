package p875ll;

import nl.C17651e;

/* JADX INFO: renamed from: ll.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17066d {

    /* JADX INFO: renamed from: a */
    public final String f54541a;

    public AbstractC17066d(String str) {
        this.f54541a = str;
        if (!AbstractC17067e.f54544c.m21664d(str)) {
            throw new C17651e("Invalid authScheme value: it should be token, but instead it is ".concat(str));
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo18887a();

    public final String toString() {
        return mo18887a();
    }
}
