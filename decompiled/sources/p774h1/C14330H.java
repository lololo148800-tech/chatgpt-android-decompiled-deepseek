package p774h1;

import kotlin.jvm.internal.AbstractC16544l;
import p759g1.C13801c;

/* JADX INFO: renamed from: h1.H */
/* JADX INFO: loaded from: classes.dex */
public final class C14330H extends AbstractC14332J {

    /* JADX INFO: renamed from: a */
    public final C13801c f44970a;

    public C14330H(C13801c c13801c) {
        this.f44970a = c13801c;
    }

    @Override // p774h1.AbstractC14332J
    /* JADX INFO: renamed from: a */
    public final C13801c mo15611a() {
        return this.f44970a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14330H) {
            return AbstractC16544l.m18089b(this.f44970a, ((C14330H) obj).f44970a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44970a.hashCode();
    }
}
