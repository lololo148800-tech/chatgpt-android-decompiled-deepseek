package p623Zf;

import kotlin.jvm.internal.AbstractC16544l;
import p1149zc.C21837F;

/* JADX INFO: renamed from: Zf.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C10317m extends AbstractC10323s {

    /* JADX INFO: renamed from: a */
    public final C21837F f30630a;

    public C10317m(C21837F credentials) {
        AbstractC16544l.m18094g(credentials, "credentials");
        this.f30630a = credentials;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10317m) && AbstractC16544l.m18089b(this.f30630a, ((C10317m) obj).f30630a);
    }

    public final int hashCode() {
        return this.f30630a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
