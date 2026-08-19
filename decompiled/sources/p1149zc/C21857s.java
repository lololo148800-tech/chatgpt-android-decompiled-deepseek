package p1149zc;

import com.auth0.android.result.Credentials;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: zc.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C21857s implements InterfaceC21862x {

    /* JADX INFO: renamed from: a */
    public final Credentials f69327a;

    public C21857s(Credentials credentials) {
        AbstractC16544l.m18094g(credentials, "credentials");
        this.f69327a = credentials;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21857s) && AbstractC16544l.m18089b(this.f69327a, ((C21857s) obj).f69327a);
    }

    public final int hashCode() {
        return this.f69327a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
