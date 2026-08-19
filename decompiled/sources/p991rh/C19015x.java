package p991rh;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: rh.x */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C19015x {
    public static final C19014w Companion = new C19014w();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f60592d = {null, null, EnumC18991F.Companion.serializer()};

    /* JADX INFO: renamed from: a */
    public final String f60593a;

    /* JADX INFO: renamed from: b */
    public final Integer f60594b;

    /* JADX INFO: renamed from: c */
    public final EnumC18991F f60595c;

    public /* synthetic */ C19015x(int i10, String str, Integer num, EnumC18991F enumC18991F) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C19013v.f60591a.getDescriptor());
            throw null;
        }
        this.f60593a = str;
        this.f60594b = num;
        this.f60595c = enumC18991F;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19015x)) {
            return false;
        }
        C19015x c19015x = (C19015x) obj;
        return AbstractC16544l.m18089b(this.f60593a, c19015x.f60593a) && AbstractC16544l.m18089b(this.f60594b, c19015x.f60594b) && this.f60595c == c19015x.f60595c;
    }

    public final int hashCode() {
        int iHashCode = this.f60593a.hashCode() * 31;
        Integer num = this.f60594b;
        return this.f60595c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C19015x(String fileName, Integer num, EnumC18991F useCase) {
        AbstractC16544l.m18094g(fileName, "fileName");
        AbstractC16544l.m18094g(useCase, "useCase");
        this.f60593a = fileName;
        this.f60594b = num;
        this.f60595c = useCase;
    }
}
