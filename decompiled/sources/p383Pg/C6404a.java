package p383Pg;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2053b;
import p482Tg.EnumC7465v;
import p817j$.util.Objects;

/* JADX INFO: renamed from: Pg.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6404a implements InterfaceC2053b {

    /* JADX INFO: renamed from: a */
    public final C6408e f20836a;

    /* JADX INFO: renamed from: b */
    public final EnumC7465v f20837b;

    public C6404a(C6408e localeOption, EnumC7465v enumC7465v) {
        AbstractC16544l.m18094g(localeOption, "localeOption");
        this.f20836a = localeOption;
        this.f20837b = enumC7465v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6404a)) {
            return false;
        }
        C6404a c6404a = (C6404a) obj;
        return AbstractC16544l.m18089b(this.f20836a, c6404a.f20836a) && this.f20837b == c6404a.f20837b;
    }

    public final int hashCode() {
        return this.f20837b.hashCode() + (Objects.hashCode(this.f20836a.f20847a) * 31);
    }

    public final String toString() {
        return "█";
    }
}
