package p1075w5;

import kotlin.jvm.internal.AbstractC16544l;
import p1098x5.EnumC21125d;
import p1098x5.EnumC21128g;
import p1098x5.InterfaceC21130i;
import p1144z5.InterfaceC21801e;

/* JADX INFO: renamed from: w5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C20826d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21130i f66176a;

    /* JADX INFO: renamed from: b */
    public final EnumC21128g f66177b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC21801e f66178c;

    /* JADX INFO: renamed from: d */
    public final EnumC21125d f66179d;

    public C20826d(InterfaceC21130i interfaceC21130i, EnumC21128g enumC21128g, InterfaceC21801e interfaceC21801e, EnumC21125d enumC21125d) {
        this.f66176a = interfaceC21130i;
        this.f66177b = enumC21128g;
        this.f66178c = interfaceC21801e;
        this.f66179d = enumC21125d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20826d) {
            C20826d c20826d = (C20826d) obj;
            c20826d.getClass();
            if (AbstractC16544l.m18089b(null, null) && AbstractC16544l.m18089b(this.f66176a, c20826d.f66176a) && this.f66177b == c20826d.f66177b && AbstractC16544l.m18089b(null, null) && AbstractC16544l.m18089b(null, null) && AbstractC16544l.m18089b(null, null) && AbstractC16544l.m18089b(null, null) && AbstractC16544l.m18089b(this.f66178c, c20826d.f66178c) && this.f66179d == c20826d.f66179d && AbstractC16544l.m18089b(null, null) && AbstractC16544l.m18089b(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        InterfaceC21130i interfaceC21130i = this.f66176a;
        int iHashCode = (interfaceC21130i != null ? interfaceC21130i.hashCode() : 0) * 31;
        EnumC21128g enumC21128g = this.f66177b;
        int iHashCode2 = (iHashCode + (enumC21128g != null ? enumC21128g.hashCode() : 0)) * 28629151;
        InterfaceC21801e interfaceC21801e = this.f66178c;
        int iHashCode3 = (iHashCode2 + (interfaceC21801e != null ? interfaceC21801e.hashCode() : 0)) * 31;
        EnumC21125d enumC21125d = this.f66179d;
        return (iHashCode3 + (enumC21125d != null ? enumC21125d.hashCode() : 0)) * 887503681;
    }
}
