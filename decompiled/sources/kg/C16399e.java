package kg;

import kotlin.jvm.internal.AbstractC16544l;
import p872lg.C16946f;

/* JADX INFO: renamed from: kg.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C16399e implements InterfaceC16403i {

    /* JADX INFO: renamed from: a */
    public final C16946f f50912a;

    public C16399e(C16946f country) {
        AbstractC16544l.m18094g(country, "country");
        this.f50912a = country;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16399e) && AbstractC16544l.m18089b(this.f50912a, ((C16399e) obj).f50912a);
    }

    public final int hashCode() {
        return this.f50912a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
