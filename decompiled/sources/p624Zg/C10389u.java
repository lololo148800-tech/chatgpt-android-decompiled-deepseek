package p624Zg;

import kotlin.jvm.internal.AbstractC16544l;
import p165G9.AbstractC3021g;

/* JADX INFO: renamed from: Zg.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C10389u extends AbstractC3021g {

    /* JADX INFO: renamed from: c */
    public final String f30790c;

    public C10389u(String str) {
        this.f30790c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10389u) {
            return AbstractC16544l.m18089b(this.f30790c, ((C10389u) obj).f30790c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30790c.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
