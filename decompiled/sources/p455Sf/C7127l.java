package p455Sf;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2053b;
import p1155zi.EnumC22060t1;

/* JADX INFO: renamed from: Sf.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C7127l implements InterfaceC2053b {

    /* JADX INFO: renamed from: a */
    public final EnumC22060t1 f22679a;

    /* JADX INFO: renamed from: b */
    public final boolean f22680b;

    public C7127l(EnumC22060t1 channel, boolean z6) {
        AbstractC16544l.m18094g(channel, "channel");
        this.f22679a = channel;
        this.f22680b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7127l)) {
            return false;
        }
        C7127l c7127l = (C7127l) obj;
        return this.f22679a == c7127l.f22679a && this.f22680b == c7127l.f22680b;
    }

    public final int hashCode() {
        return (this.f22679a.hashCode() * 31) + (this.f22680b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
