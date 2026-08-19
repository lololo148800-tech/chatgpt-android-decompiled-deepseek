package kotlin.jvm.internal;

import java.util.List;
import p225Im.EnumC3744C;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3778z;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: kotlin.jvm.internal.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C16530G implements InterfaceC3778z {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC3756d f51264Y;

    /* JADX INFO: renamed from: Z */
    public volatile List f51265Z;

    public C16530G(InterfaceC3756d interfaceC3756d) {
        EnumC3744C enumC3744C = EnumC3744C.f11394Y;
        this.f51264Y = interfaceC3756d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16530G) {
            if (AbstractC16544l.m18089b(this.f51264Y, ((C16530G) obj).f51264Y)) {
                return true;
            }
        }
        return false;
    }

    @Override // p225Im.InterfaceC3778z
    public final String getName() {
        return "PluginConfigT";
    }

    @Override // p225Im.InterfaceC3778z
    public final List getUpperBounds() {
        List list = this.f51265Z;
        if (list != null) {
            return list;
        }
        List listM9974d = AbstractC9393x3.m9974d(AbstractC16526C.m18074b(Object.class));
        this.f51265Z = listM9974d;
        return listM9974d;
    }

    public final int hashCode() {
        InterfaceC3756d interfaceC3756d = this.f51264Y;
        return ((interfaceC3756d != null ? interfaceC3756d.hashCode() : 0) * 31) + 749883007;
    }

    public final String toString() {
        EnumC3744C enumC3744C = EnumC3744C.f11394Y;
        return "PluginConfigT";
    }
}
